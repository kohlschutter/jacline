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

- Can be referenced as dependencies by Maven, Gradle, etc.
- Can be built from source with Maven and especially without "bazel"/"bazelisk"
- Follows semantic versioning that is consistent for the entire codebase
- Provides a Maven plugin to simplify developing from the command line and IDEs like Eclipse
- Embeds/reuses transpiled JavaScript into a META-INF folder included in regular Java libraries
- Replaces "Super-Sourcing" with "Common-Sourcing", i.e., having the same Java source definitions
  for JavaScript/JVM targets along with the occasional native JavaScript file that replaces the
  vanilla Java implementation for the JavaScript context.
- Improves the interaction with outside JavaScript code using custom annotations, such as
  @JsImport and @JsExport
- Provides all required and recommended JavaScript library dependencies in the same repository as
  the rest of the code (some required code from
  [closure-library](https://github.com/google/closure-library) as well as j2cl's jre.js,
[jsinterop-base](https://github.com/google/jsinterop-base),
[elemental2](https://github.com/google/elemental2))
- Provides optional library code utilizing jacline's additional features, such as JSON-based
  class encoding/decoding.
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

Now try to modify the source code for
[HelloWorld.java](src/main/java/com/kohlschutter/jacline/samples/helloworld/HelloWorld.java),
enabling the two `@JsExport` statements, then run `mvn clean install` again.

Notice that the generated code is now bigger, but you can call the Java class from JavaScript!

To do so, paste the code into a blank page in your browser, then open the JavaScript console
and type the fully qualified class name to access the class and its methods, just like from
Java.

## Building

### Quick start

Clone this repository, change into the clone's directory, and run

```
  mvn clean install
```

to build everything.

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
