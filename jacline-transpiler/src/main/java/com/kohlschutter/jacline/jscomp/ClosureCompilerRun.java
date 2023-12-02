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

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.SourceFile;
import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;

public final class ClosureCompilerRun {
  private final CompilerImpl compiler;
  private final List<SourceFile> builtinExterns;
  private final CompilerOptions options;
  private final Map<Path, SourceFile> filesMap;
  private final Map<String, List<Path>> matchingPaths = new HashMap<>();

  ClosureCompilerRun(CompilerImpl compiler, List<SourceFile> builtinExterns,
      Map<Path, SourceFile> filesMap, CompilerOptions options) {
    this.compiler = compiler;
    this.builtinExterns = builtinExterns;
    this.filesMap = filesMap;
    this.options = options;

    for (Map.Entry<Path, SourceFile> en : filesMap.entrySet()) {
      Path path = en.getKey();
      String name = en.getValue().getName();
      matchingPaths.computeIfAbsent(name, (n) -> new ArrayList<>()).add(path);
    }
  }

  public ClosureCompilationResult compile() {
    Result result = compiler.compile(builtinExterns, new ArrayList<>(filesMap.values()), options);
    if (result.success) {
      return ClosureCompilationResult.ofSource(compiler.toSource());
    } else {
      return ClosureCompilationResult.ofFailure();
    }
  }

  public List<Path> getPossiblePaths(String sourceFileName) {
    List<Path> list = matchingPaths.get(sourceFileName);
    if (list == null) {
      return Collections.emptyList();
    } else {
      return list;
    }
  }

  @SuppressFBWarnings("EI_EXPOSE_REP")
  public CompilerOptions getOptions() {
    return options;
  }
}
