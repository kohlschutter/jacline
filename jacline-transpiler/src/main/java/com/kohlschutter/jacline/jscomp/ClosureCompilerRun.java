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

  public CompilerOptions getOptions() {
    return options;
  }
}
