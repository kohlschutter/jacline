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
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.SourceFile;
import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;

public class ClosureCompiler implements Closeable {
  private static List<SourceFile> builtinExterns;

  @SuppressWarnings("PMD.AssignmentToNonFinalStatic")
  @SuppressFBWarnings({
      "ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD", "EI_EXPOSE_REP", "CT_CONSTRUCTOR_THROW"})
  public ClosureCompiler() throws IOException {
    if (builtinExterns == null) {
      builtinExterns = Collections.unmodifiableList(CommandLineRunner.getBuiltinExterns(
          Environment.BROWSER));
    }
  }

  @Override
  public void close() throws IOException {
    // FIXME delete temporary files as necessary
  }

  public ClosureCompilationResult compile(ClosureCompilerSources compilerSources)
      throws IOException {
    return compile(compilerSources, false, null);
  }
ls

  public ClosureCompilationResult compile(ClosureCompilerSources compilerSources,
      boolean disableStderr, Consumer<CompilerOptions> optionsModifier) throws IOException {

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

    if (optionsModifier != null) {
      optionsModifier.accept(options);
    }

    options.setColorizeErrorOutput(false);
    if (disableStderr) {
      compiler.setSuppressReport(true);
    }

    List<SourceFile> sources = new ArrayList<>(filesMap.values());
    Result result = compiler.compile(builtinExterns, sources, options);
    if (result.success) {
      return ClosureCompilationResult.ofSource(compiler.toSource());
    } else {
      return ClosureCompilationResult.ofFailure();
    }

  }

  private void addSourceFiles(List<Path> paths, Map<Path, SourceFile> filesMap) throws IOException {
    for (Path p : paths) {
      filesMap.computeIfAbsent(p.toRealPath(), (path) -> SourceFile.fromPath(path,
          StandardCharsets.UTF_8));
    }
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
}
