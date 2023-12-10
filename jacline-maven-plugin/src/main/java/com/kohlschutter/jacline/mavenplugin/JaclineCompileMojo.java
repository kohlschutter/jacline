/*
 * jacline-maven-plugin
 *
 * Copyright 2023 Christian Kohlschütter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kohlschutter.jacline.mavenplugin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.apache.maven.project.MavenProject;
import org.eclipse.jdt.annotation.NonNull;

import com.google.javascript.jscomp.jarjar.com.google.re2j.Matcher;
import com.google.javascript.jscomp.jarjar.com.google.re2j.Pattern;
import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import com.kohlschutter.jacline.CompilerOutput;
import com.kohlschutter.jacline.IOUtil;
import com.kohlschutter.jacline.JaclineException;
import com.kohlschutter.jacline.Problems;
import com.kohlschutter.jacline.Problems.Problem;
import com.kohlschutter.jacline.j2cl.JaclineJ2ClTranspiler;
import com.kohlschutter.jacline.j2cl.TranspilerSources;
import com.kohlschutter.jacline.jscomp.ClosureCompilationResult;
import com.kohlschutter.jacline.jscomp.ClosureCompiler;
import com.kohlschutter.jacline.jscomp.ClosureCompilerRun;
import com.kohlschutter.jacline.jscomp.ClosureCompilerSources;

/**
 * Compiles code with jacline.
 *
 * @author Christian Kohlschütter
 */
@Mojo(name = "compile", defaultPhase = LifecyclePhase.COMPILE, threadSafe = true, //
    requiresDependencyCollection = ResolutionScope.COMPILE, requiresDependencyResolution = ResolutionScope.COMPILE)
@SuppressWarnings({
    "null", "PMD.GuardLogStatement", "PMD.CouplingBetweenObjects", "PMD.CyclomaticComplexity"})
public class JaclineCompileMojo extends AbstractMojo {
  private static final String PROPS_JACLINE_FORMAT = "jacline.format";
  private static final String PROPS_JACLINE_VERSION = "jacline.version";
  private static final String PROPS_JACLINE_COMMIT = "jacline.commit";
  private static final String JACLINE_FORMAT_V1 = "1";
  private static final String PROPS_GIT_BUILD_VERSION = "git.build.version";
  private static final String PROPS_GIT_COMMIT_ID_DESCRIBE = "git.commit.id.describe";

  private static final Pattern FILE_DEDUP_SUFFIX = Pattern.compile("(\\-[0-9]+)?(\\.[a-z]+)$");

  @Parameter(defaultValue = "${project}", required = true, readonly = true)
  private MavenProject project;

  /**
   * Whether library contents should be created.
   */
  @Parameter(defaultValue = "true")
  boolean createLibrary = true;

  /**
   * The output directory.
   */
  @Parameter(defaultValue = "")
  String jaclineMetaInfDirectory;

  /**
   * The output directory.
   */
  @Parameter(readonly = true, defaultValue = "${project.build.outputDirectory}/META-INF/jacline")
  String jaclineMetaInfDirectoryDefault;

  /**
   * The source directories containing the sources to be transpiled.
   */
  @Parameter(defaultValue = "${project.compileSourceRoots}")
  List<String> transpileSourceRoots;

  /**
   * The resource directories containing additional Javascript files.
   */
  @Parameter(defaultValue = "${project.basedir}/src/main/jacline")
  List<String> javascriptSourceRoots;

  /**
   * The resource directories containing additional Javascript files.
   */
  @Parameter()
  List<String> entryPoints;

  @Parameter(readonly = true, defaultValue = "${project.basedir}")
  File projectBaseDir;

  @Parameter(readonly = true, defaultValue = "${project.build.outputDirectory}")
  String outputFileDir;

  @Parameter(required = true, defaultValue = "jacline-generated.js")
  String outputFile;

  /**
   * When {@code true}, sourcemap files are created in addition to the JavaScript files.
   */
  @Parameter(required = true, defaultValue = "false")
  boolean createSourceMaps;

  /**
   * The output directory for sourcemap files. It is guaranteed that the actual files start with a
   * path of {@code sourcemaps/jacline/}.
   */
  @Parameter(required = true, defaultValue = "${project.build.directory}/jacline-sourcemap")
  String sourceMapOutputDirectory;

  /**
   * The URL prefix used in sourcemap references.
   */
  @Parameter(required = true, defaultValue = "/sourcemaps/jacline/")
  String sourceMapUrlPrefix;

  @Parameter(defaultValue = "true")
  boolean deleteJaclineMetaInfDirectory;

  private String projectBaseDirAbsoluteString;

  @SuppressWarnings("PMD.ProperLogger")
  private Log log;

  /**
   * Mucho mojo.
   */
  public JaclineCompileMojo() {
    super();
  }

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    this.log = getLog();
    if (entryPoints == null) {
      entryPoints = List.of();
    }

    projectBaseDirAbsoluteString = projectBaseDir.getAbsolutePath();

    if (jaclineMetaInfDirectory == null || jaclineMetaInfDirectory.isBlank()) {
      jaclineMetaInfDirectory = jaclineMetaInfDirectoryDefault;
    }

    Path jaclineMetaInfDirectoryPath = Path.of(jaclineMetaInfDirectory);

    if (deleteJaclineMetaInfDirectory) {
      // This is usually necessary to prevent "Duplicate module" errors
      // IMPORTANT: We'll always clear ./generated in code below
      try {
        if (Files.exists(jaclineMetaInfDirectoryPath)) {
          IOUtil.deleteRecursively(jaclineMetaInfDirectoryPath);
        }
      } catch (IOException e) {
        throw new MojoExecutionException("Could not delete " + jaclineMetaInfDirectory, e);
      }
    }

    try (CompilerOutput to = CompilerOutput.newInstanceWithTargetDirectory(
        jaclineMetaInfDirectoryPath.resolve("generated")); //
        JaclineJ2ClTranspiler transpiler = new JaclineJ2ClTranspiler();) {
      try {

        transpile(transpiler, to);

        if (to.isSkipped()) {
          return;
        }

        writeMetadata(jaclineMetaInfDirectoryPath);

        if (!createLibrary) {
          log.info("Not creating library contents under " + jaclineMetaInfDirectory);
          IOUtil.deleteRecursively(Path.of(jaclineMetaInfDirectory));
        } else {
          copyJavaScriptFiles(javascriptSourceRoots, entryPoints, Path.of(jaclineMetaInfDirectory,
              "sources"));
        }

        if (to.getProblems().hasErrors()) {
          throw new MojoExecutionException("Errors during transpilation");
        }
      } finally {
        Problems problems = Problems.of(to.getProblems());

        for (Problem s : problems.getErrors()) {
          log.error(s.toString());
        }
        for (Problem s : problems.getWarnings()) {
          log.warn(s.toString());
        }
        for (Problem s : problems.getInfoMessages()) {
          log.info(s.toString());
        }
      }
    } catch (DependencyResolutionRequiredException | JaclineException | URISyntaxException
        | IOException e) {
      throw new MojoExecutionException("Execution failed: " + e.toString(), e);
    }
  }

  private void writeMetadata(Path jaclineMetaInfDirectoryPath) throws IOException {
    Properties gitProps = loadGitProperties();

    Properties props = new Properties();
    props.put(PROPS_JACLINE_FORMAT, JACLINE_FORMAT_V1);
    props.put(PROPS_JACLINE_VERSION, gitProps.get(PROPS_GIT_BUILD_VERSION));
    props.put(PROPS_JACLINE_COMMIT, gitProps.get(PROPS_GIT_COMMIT_ID_DESCRIBE));
    try (Writer out = Files.newBufferedWriter(jaclineMetaInfDirectoryPath.resolve(
        "jacline.properties"))) {
      out.write("# https://github.com/kohlschutter/jacline\n");
      props.store(new BufferedWriter(out) {
        @Override
        public void write(String str) throws IOException {
          if (!str.isEmpty() && str.charAt(0) == '#') {
            str = "#"; // strip time from properties file
          }
          super.write(str);
        }
      }, null);
    }
  }

  private Properties loadGitProperties() throws IOException {
    Properties gitProps = new Properties();
    try (InputStream in = JaclineCompileMojo.class.getResourceAsStream(
        "/META-INF/maven/com.kohlschutter.jacline/jacline-maven-plugin/git.properties")) {
      if (in != null) {
        gitProps.load(in);
      }
    }

    if (!gitProps.containsKey(PROPS_GIT_BUILD_VERSION)) {
      gitProps.put(PROPS_GIT_BUILD_VERSION, "unknown");
    }
    if (!gitProps.containsKey(PROPS_GIT_COMMIT_ID_DESCRIBE)) {
      gitProps.put(PROPS_GIT_COMMIT_ID_DESCRIBE, "unknown");
    }

    return gitProps;
  }

  @SuppressWarnings("PMD.CognitiveComplexity")
  private void copyJavaScriptFiles(List<String> roots, List<String> entryPointsList,
      @NonNull Path outDir) throws IOException {
    Set<Path> entryPointPaths = new HashSet<>();
    for (String ep : entryPointsList) {
      Path p = absolutePath(ep);
      if (!Files.exists(p)) {
        continue;
      }

      entryPointPaths.add(p);
    }

    try {
      if (!Files.isDirectory(outDir)) {
        Files.createDirectories(outDir);
      }
    } catch (FileAlreadyExistsException ignored) {
      // ignore
    }

    Map<String, AtomicInteger> sameFileMap = new HashMap<>();

    for (String r : roots) {
      Path rp = absolutePath(r);
      if (!Files.isDirectory(rp)) {
        log.info("Skipping non-existing directory: " + rp);
        continue;
      }
      List<Path> files = Files.find(rp, 64, (p, a) -> {
        return !a.isDirectory() && p.toString().endsWith(".js");
      }, FileVisitOption.FOLLOW_LINKS).collect(Collectors.toList());

      for (Path f : files) {
        if (entryPointPaths.contains(f)) {
          continue;
        }
        String simpleName = f.getName(f.getNameCount() - 1).toString();

        AtomicInteger ai = sameFileMap.computeIfAbsent(simpleName, (k) -> new AtomicInteger(0));
        if (ai.get() != 0) {
          Matcher matcher = FILE_DEDUP_SUFFIX.matcher(simpleName);
          if (!matcher.find()) {
            throw new IllegalStateException("Unexpected file name: " + simpleName);
          }
          String suffix = matcher.group(2);
          String baseName = matcher.replaceFirst(""); // strip .js suffix
          do {
            simpleName = baseName + "-" + ai.incrementAndGet() + suffix;
          } while (sameFileMap.containsKey(simpleName));
          sameFileMap.put(simpleName, new AtomicInteger(0));
        } else {
          ai.incrementAndGet();
        }

        Files.copy(f, outDir.resolve(simpleName), StandardCopyOption.REPLACE_EXISTING);
      }
    }
  }

  private void transpile(JaclineJ2ClTranspiler transpiler, CompilerOutput to)
      throws DependencyResolutionRequiredException, IOException, JaclineException,
      MojoExecutionException, URISyntaxException {
    TranspilerSources sources = TranspilerSources.newInstanceWithDefaultJreClasses();

    for (String s : project.getCompileClasspathElements()) {
      sources.addClasspathElement(s);
    }

    for (String sr : transpileSourceRoots) {
      Path p = absolutePath(sr);
      if (!Files.exists(p)) {
        log.info("Skipping non-existing directory: " + p);
        continue;
      }
      sources.addSource(p);
    }

    transpiler.transpile(sources, to);

    if (!to.isSkipped()) {
      closureCompile(to.getOutputPath());
    }
  }

  private Path absolutePath(String path) {
    return absolutePath(path, projectBaseDirAbsoluteString);
  }

  private Path absolutePath(String path, String base) {
    Path p = Path.of(path);
    if (p.isAbsolute()) {
      return p;
    } else {
      return Path.of(base, path);
    }
  }

  @SuppressWarnings({"PMD.CognitiveComplexity", "PMD.NPathComplexity"})
  @SuppressFBWarnings("QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT")
  private void closureCompile(Path transpiledOut) throws IOException,
      DependencyResolutionRequiredException, MojoExecutionException, URISyntaxException {
    ClosureCompilerSources cs = new ClosureCompilerSources();

    cs.addSource(transpiledOut);

    boolean haveSourceRoots = false;
    for (String s : javascriptSourceRoots) {
      Path p = absolutePath(s);
      if (!Files.exists(p)) {
        log.info("Skipping missing source root: " + p);
        continue;
      }
      haveSourceRoots = true;
      cs.addSource(p);
    }

    boolean haveEntryPoints = false;
    for (String s : entryPoints) {
      Path p = absolutePath(s);
      if (!Files.exists(p)) {
        log.warn("Skipping missing entry point: " + p);
        continue;
      }

      haveEntryPoints = true;
      cs.addEntryPoint(p);
    }

    List<String> compileClasspathElements = project.getCompileClasspathElements();
    cs.addSourcesFromClasspath(compileClasspathElements);

    for (Path p : cs.getOtherFiles()) {
      boolean isSubDir = false;
      if (p.endsWith("META-INF/jacline") || (p.endsWith("jacline/generated") && (isSubDir =
          true))) {

        // META-INF/jacline/generated/generated-entrypoints.js
        Path generatedEntryPoints = isSubDir ? p.resolve("generated-entrypoints.js") : p.resolve(
            "generated/generated-entrypoints.js");
        if (Files.exists(generatedEntryPoints)) {
          haveEntryPoints = true;
          if (cs.addEntryPoint(generatedEntryPoints)) {
            if (log.isInfoEnabled()) {
              log.info("Adding generated entry points: " + generatedEntryPoints.toUri());
            }
          }
        }

      }
    }

    if (!haveSourceRoots && !haveEntryPoints) {
      log.info("Nothing to do for the closure-compiler");
      return;
    }

    Path sourceMapOutputPath = createSourceMaps ? toPathIfPossible(sourceMapOutputDirectory) : null;
    if (sourceMapOutputPath != null) {
      log.info("Writing sourcemap files to: " + sourceMapOutputPath);
    }

    URI sourceMapPrefixUri = new URI(this.sourceMapUrlPrefix);
    if (sourceMapOutputPath != null) {
      log.info("Using sourcemap prefix: " + sourceMapPrefixUri);
    }

    Problems problems = new Problems();
    try (ClosureCompiler jc = new ClosureCompiler(sourceMapOutputPath, sourceMapPrefixUri);
        ClosureCompilerRun runConfig = jc.prepareCompile(cs, true, (opt) -> {
          opt.setErrorHandler((level, error) -> {
            String msg = error.toString();

            switch (level) {
              case ERROR:
                log.error(msg);
                problems.addError(msg);
                break;
              case WARNING:
                log.warn(msg);
                problems.addWarning(msg);
                break;
              default:
                log.info(msg);
                problems.addInfoMessage(msg);
                break;
            }
          });
        }, outputFile)) {

      try (ClosureCompilationResult result = runConfig.compile()) {
        File outFile = absolutePath(outputFile, outputFileDir).toFile();

        String source = result.getSource();
        if (source == null) {
          log.error("Closure compiler failed to build output file: " + outputFile);
          throw new MojoExecutionException("Closure compilation failure") {

            private static final long serialVersionUID = 1L;

            @Override
            public void printStackTrace(PrintStream s) {
              super.printStackTrace(s);
              problems.consumeMessages((msg) -> s.println("\t" + msg));
            }

            @Override
            public void printStackTrace(PrintWriter s) {
              super.printStackTrace(s);
              problems.consumeMessages((msg) -> s.println("\t" + msg));
            }
          };
        }

        log.info("Writing output to: " + outFile);
        writeStringToFile(source, outFile);
      }
    }
  }

  private Path toPathIfPossible(String path) {
    if (path == null) {
      return null;
    }
    if (path.startsWith("/")) {
      return Path.of(path);
    } else {
      return Path.of(outputFileDir).resolve(path);
    }
  }

  private static void writeStringToFile(String source, File outFile) throws IOException {
    mkdirs(outFile.getParentFile());
    try (PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(outFile),
        StandardCharsets.UTF_8))) {
      out.print(source);
    }
  }

  private static void mkdirs(File file) throws IOException {
    if (!file.mkdirs()) {
      if (!file.isDirectory()) {
        throw new IOException("Could not create directory: " + file);
      }
    }
  }
}
