/*
 * jacline
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
package com.kohlschutter.jacline.jscomp;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.CompilerOptions.Environment;
import com.google.javascript.jscomp.DependencyOptions;
import com.google.javascript.jscomp.ModuleIdentifier;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SourceMap.DetailLevel;
import com.google.javascript.jscomp.SourceMap.Format;
import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;

public class ClosureCompiler implements Closeable {
  private static List<SourceFile> builtinExterns;

  private final Path sourceMapWorkDir;
  private final URI sourceMapPrefix;

  @SuppressWarnings("PMD.AssignmentToNonFinalStatic")
  @SuppressFBWarnings({
      "ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD", "EI_EXPOSE_REP", "CT_CONSTRUCTOR_THROW"})
  public ClosureCompiler(Path sourceMapWorkDir, URI sourceMapPrefix) throws IOException {
    this.sourceMapPrefix = sourceMapPrefix;
    if (builtinExterns == null) {
      builtinExterns = Collections.unmodifiableList(CommandLineRunner.getBuiltinExterns(
          Environment.BROWSER));
    }
    this.sourceMapWorkDir = sourceMapWorkDir;
  }

  @Override
  public void close() throws IOException {
    // FIXME delete temporary files as necessary
  }

  public ClosureCompilerRun prepareCompile(ClosureCompilerSources compilerSources,
      boolean disableStderr, Consumer<CompilerOptions> optionsModifier, String outputFileName)
      throws IOException {

    List<Path> entryPoints = resolveFiles(compilerSources.getEntryPoints());
    List<Path> otherSources = resolveFiles(compilerSources.getOtherFiles());

    Map<Path, SourceFile> filesMap = new HashMap<>();
    addSourceFiles(entryPoints, filesMap);
    List<Path> entryPointPaths = new ArrayList<>(filesMap.keySet());
    addSourceFiles(otherSources, filesMap);

    CompilerImpl compiler = new CompilerImpl();

    CompilerOptions options = ClosureCompilerOptionsBuilder.newDefaultOptions();
    if (!Environment.BROWSER.equals(options.getEnvironment())) {
      throw new IllegalStateException("Unexpected environment");
    }

    List<ModuleIdentifier> entryPointsList = entryPointPaths.stream() //
        .map( //
            (p) -> ModuleIdentifier.forFile(p.toString()) //
        ).collect(Collectors.toList());

    if (entryPointsList.isEmpty()) {
      options.setDependencyOptions(DependencyOptions.sortOnly());
    } else {
      options.setDependencyOptions(DependencyOptions.pruneForEntryPoints(//
          entryPointsList));
    }

    SourceMapLocationMapping sourceMapLocationMapping = enableSourceMaps(options);

    if (optionsModifier != null) {
      optionsModifier.accept(options);
    }

    options.setColorizeErrorOutput(false);
    if (disableStderr) {
      compiler.setSuppressReport(true);
    }

    return new ClosureCompilerRun(compiler, builtinExterns, filesMap, options, outputFileName,
        sourceMapLocationMapping);
  }

  private SourceMapLocationMapping enableSourceMaps(CompilerOptions options) throws IOException {
    if (sourceMapWorkDir == null) {
      return null;
    }
    options.setSourceMapFormat(Format.V3);
    options.setApplyInputSourceMaps(true);
    options.setAlwaysGatherSourceMapInfo(true);
    options.setSourceMapDetailLevel(DetailLevel.ALL);
    options.setParseInlineSourceMaps(true);
    SourceMapLocationMapping sourceMapLocationMapping = new SourceMapLocationMapping(
        sourceMapWorkDir, sourceMapPrefix);
    options.setSourceMapLocationMappings(List.of(sourceMapLocationMapping));

    return sourceMapLocationMapping;
  }

  private void addSourceFiles(List<Path> paths, Map<Path, SourceFile> filesMap) throws IOException {
    for (Path p : paths) {
      filesMap.computeIfAbsent(p.toRealPath(), (path) -> fromPath(path));
    }
  }

  private static SourceFile fromPath(Path path) {
    String originalPath;
    URI u = path.toUri();
    if ("file".equals(u.getScheme())) {
      originalPath = path.toAbsolutePath().toString();
    } else {
      originalPath = u.toString();
    }

    return SourceFile.builder().withPath(path).withCharset(StandardCharsets.UTF_8).withOriginalPath(
        originalPath).build();
  }

  private List<Path> resolveFiles(List<Path> list) throws IOException {
    List<Path> out = new ArrayList<>();

    for (Path path : list) {
      if (Files.isDirectory(path)) {
        Files.find(path, 64, (p, a) -> {
          return !a.isDirectory() && p.getName(p.getNameCount() - 1).toString().endsWith(".js");
        }, FileVisitOption.FOLLOW_LINKS).forEach(out::add);
      } else if (Files.exists(path)) {
        out.add(path);
      }
    }

    return out;
  }

  public Path getSourceMapWorkDir() {
    return sourceMapWorkDir;
  }
}
