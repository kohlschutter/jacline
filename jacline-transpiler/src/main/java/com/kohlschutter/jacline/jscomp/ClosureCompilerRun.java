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

public final class ClosureCompilerRun implements Closeable {
  private final CompilerImpl compiler;
  private final List<SourceFile> builtinExterns;
  private final CompilerOptions options;
  private final Map<Path, SourceFile> filesMap;
  private final Map<String, List<Path>> matchingPaths = new HashMap<>();
  private final String outputFileName;
  private final SourceMapLocationMapping slm;

  ClosureCompilerRun(CompilerImpl compiler, List<SourceFile> builtinExterns,
      Map<Path, SourceFile> filesMap, CompilerOptions options, String outputFileName,
      SourceMapLocationMapping sourceMapLocationMapping) {
    this.compiler = compiler;
    this.builtinExterns = builtinExterns;
    this.filesMap = filesMap;
    this.options = options;
    this.outputFileName = outputFileName;
    this.slm = sourceMapLocationMapping;

    for (Map.Entry<Path, SourceFile> en : filesMap.entrySet()) {
      Path path = en.getKey();
      String name = en.getValue().getName();
      matchingPaths.computeIfAbsent(name, (n) -> new ArrayList<>()).add(path);
    }
  }

  public ClosureCompilationResult compile() throws IOException {
    compiler.setTranspiledFiles(true);
    Result result = compiler.compile(builtinExterns, new ArrayList<>(filesMap.values()), options);
    if (result.success) {
      String source = compiler.toSource();

      if (slm != null) {
        StringBuilder sb = new StringBuilder();
        if (result.sourceMap != null) {
          result.sourceMap.appendTo(sb, simpleName(outputFileName));
        }
        String appendToSource = slm.initMainSourceMap(outputFileName, sb.toString());
        if (appendToSource != null) {
          source += "\n" + appendToSource;
        }
      }

      return ClosureCompilationResult.ofSource(source);
    } else {
      return ClosureCompilationResult.ofFailure();
    }
  }

  private static String simpleName(String s) {
    int index = s.lastIndexOf('/');
    return s.substring(index + 1);
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

  @Override
  public void close() throws IOException {
    if (slm != null) {
      slm.close();
    }
  }
}
