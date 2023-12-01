[![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/kohlschutter/jacline/codeql-analysis.yml?cacheSeconds=60)](https://github.com/kohlschutter/jacline/actions/workflows/codeql-analysis.yml) [![Last commit on main](https://img.shields.io/github/last-commit/kohlschutter/jacline/main)](https://github.com/kohlschutter/jacline/commits/main) [![Maven Central version](https://img.shields.io/maven-central/v/com.kohlschutter.jacline/jacline)](https://search.maven.org/artifact/com.kohlschutter.jacline/jacline) [![Apache 2.0 Licensed](https://img.shields.io/github/license/kohlschutter/jacline)](https://github.com/kohlschutter/jacline/blob/main/NOTICE)

# jacline

jacline is a Java-to-Javascript transpiler, using a forked version of j2cl in combination with Google Closure Compiler, plus other libraries providing APIs combining the Java SDK and the Browser world.

## When JAva-to-CLosure Is Not Enough

[j2cl](https://github.com/google/j2cl) is great technology, encumbered with Google-specific layers
of process (read: complexity) that, in my opinion, prevents the wide-scale adoption by the Java
community.

jacline builds its foundation on a fork of j2cl that is "un[bazel](https://bazel.build)ed" and
"[Maven](https://maven.apache.org)ized", furthermore incorporating a few changes that didn't yet
make it into mainline j2cl.

Particularly, jacline sports the following highlights:

- Provides a Maven plugin to simplify developing from the command line and IDEs like Eclipse
- Can be referenced as dependencies by Maven, Gradle, etc.
- Can be built from source with Maven and especially without "bazel"/"bazelisk"
- Follows semantic versioning that is consistent for the entire codebase
- Embeds/reuses transpiled JavaScript into a META-INF folder included in regular Java libraries
- Replaces "Super-Sourcing" with "Common-Sourcing", i.e., having the same Java source definitions
  for JavaScript/JVM targets along with the occasional native JavaScript file that replaces the
  vanilla Java implementation for the JavaScript context.
- Enables "Closeable" support (e.g. in try-with-resources) for native JavaScript class implementations.
- Provides a simplified Service Provider Interface implementation via ServiceLoader
- Improves the interaction with outside JavaScript code using custom annotations, such as:
  - `@JsImport`: Declares that the annotated interface has an implementation that is supplied by some
  external JavaScript code.
  - `@JsExport`: Declares that the class or class method should be accessible by some external
  JavaScript code. This prevents too eager obfuscation and code removal.
  - `@JsEntryPoint`: Enables the definition of entry points in Java, calling all static initializers
  upon application start, even for library dependencies.
  - `@JsIgnoreType`: Declares that a type should be ignored entirely for transpilation purposes.
  - `@JsImplementationProvidedSeparately`: Declares that a method of a type that is marked with
  `@JsType(isNative=true)` is being provided with a default implementation for vanilla Java, whereas
  the JavaScript-specific implementation is provided separately in some JavaScript file
  ("Common-Sourcing").
  - `@JsServiceProvider`: Registers a class as an implementation for one or more interfaces, which
  can then later be used via `java.util.ServiceLoader`.
- Provides all required and recommended JavaScript library dependencies in the same repository as
  the rest of the code (some required code from
  [closure-library](https://github.com/google/closure-library) as well as j2cl's jre.js,
[jsinterop-base](https://github.com/google/jsinterop-base),
[elemental2](https://github.com/google/elemental2))
- Provides optional library code utilizing jacline's additional features, such as JSON-based
  class encoding/decoding that works both in vanilla Java/JVM and JavaScript.
- Allows for a simple integration with [Dumbo](https://github.com/kohlschuetter/dumbo).

## Limitations

- Compared to j2cl, jacline narrows the focus towards JavaScript compilation; other targets like
  Kotlin, Wasm, etc. are not supported.
- jacline is less configurable than j2cl, with the focus on just doing the right thing.
- jacline is still work in progress, but fully functional.

## Examples

### helloworld

Very much like the original j2cl helloworld sample, try our [helloworld sample for
jacline](samples/helloworld/):

```
  cd samples/helloworld
  mvn clean install
  cat target/classes/jacline-generated.js
```

The source code is in [src/main](samples/helloworld/src/main) for both Java (under `java/`) and
JavaScript code (under `jacline/`).  The transpilation is configured and triggered via the Maven
[pom.xml](samples/helloworld/pom.xml).

Now try to modify the source code for
[HelloWorld.java](samples/helloworld/src/main/java/com/kohlschutter/jacline/samples/helloworld/HelloWorld.java),
enabling the two `@JsExport` statements, then run `mvn clean install` again.

Notice that the generated code is now bigger, but you can call the Java class from JavaScript!

To do so, paste the code into a blank page in your browser (or open `target/classes/index.html` in
your browser), then open the JavaScript console and type the fully qualified class name to access
the class and its methods, just like from Java.

### json

This example demonstrates the use of the "Encodable" API (provided by jacline-lib-common) in
JavaScript, and the "Common-Sourcing" approach of jacline.

```
  cd samples/json
  mvn clean install
  cat target/classes/jacline-generated.js
  open target/classes/index.html
```

The source code is in [src/main](samples/json/src/main) for both Java (under `java/`) and JavaScript
code (under `jacline/`).  The transpilation is configured and triggered via the Maven
[pom.xml](samples/json/pom.xml).

Inspect the JavaScript console of this page to see various forms of output, demonstrating how a
native Java class can be encoded as JSON, and back.

Compare the behavior with the vanilla Java test code under
[src/test/java](samples/json/src/test/java).  It uses the same classes, but provides an entirely
different implementation for the JSON parsing code.

## Maven plugin usage

The primary way to use jacline is via the provided Maven plugin (`jacline-maven-plugin`), which
also supports Eclipse m2e (detailed errors are shown in the "Error Log" view).

Not only the samples above but jacline itself makes use of the plugin as much as possible, so please
also check the individual sub modules for further inspiration,.

### Example

First, define a property `jacline.version` in your POM.

```xml
    <properties>
            <jacline.version>1.0.0-SNAPSHOT</jacline.version>
    </properties>
```

Then, in the `<build><plugins>` section, add the following plugin:

```xml
    <plugin>
        <groupId>com.kohlschutter.jacline</groupId>
        <artifactId>jacline-maven-plugin</artifactId>
        <version>${jacline.version}</version>
        <executions>
            <execution>
                <id>default-jacline-compile</id>
                <goals>
                    <goal>compile</goal>
                </goals>
                <phase>compile</phase>

                <!-- Configuration can be omitted for sensible default values -->
                <configuration>
                    <!-- If true (by default), a META-INF/jacline folder will be created
                    in the target jar of your project, which allows adding the JavaScript code as a
                    dependency by other Maven projects. -->
                    <createLibrary>true</createLibrary>

                    <!-- Specifies all source roots where Java files should be transpiled to
                    JavaScript. By default, it's ${project.compileSourceRoots}. This can be
                    narrowed down for a project that has code in a separate source folder
                    that is not to be transpiled. See jacline-lib-common/pom.xml for example -->
                    <transpileSourceRoots>
                        <transpileSourceRoot>src/main/java</transpileSourceRoot>
                    </transpileSourceRoots>

                    <!-- Specifies the source roots for JavaScript files that should be included
                    in the final output -->
                    <javascriptSourceRoots>
                        <javascriptSourceRoot>src/main/jacline</javascriptSourceRoot>
                    </javascriptSourceRoots>

                    <!-- List all possible entry points here -->
                    <entryPoints>
                        <entryPoint>src/main/jacline/app.js</entryPoint>
                    </entryPoints>

                    <!-- Relative paths are relative to ${project.build.outputDirectory} / target/classes -->
                    <outputFile>
                        jacline-generated.js
                    </outputFile>
                </configuration>
            </execution>
        </executions>
    </plugin>
```

Your project should now support jacline:

```bash
mvn clean compile
```

## Building

### Quick start

Clone this repository, change into the clone's directory, and run

```
  git submodule update --init
  mvn clean install
```

to setup and build everything.

### Snapshot builds for testing

When you're testing a `-SNAPSHOT` version from your project, make sure that the Sonatype snapshot
repository is enabled in your POM:

```
<repositories>
    <repository>
        <id>sonatype.snapshots</id>
        <name>Sonatype snapshot repository</name>
        <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
        <layout>default</layout>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

To update to the latest SNAPSHOT (which is currently not being built for every commit),
run the following command from within your own project:

```
mvn -U dependency:resolve
```

or (for Gradle)

```
./gradlew refreshVersions
```

## Licensing

jacline is released under the Apache 2.0 License.

Commercial support is available through [Kohlschütter Search Intelligence](http://www.kohlschutter.com/).
