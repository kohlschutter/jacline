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
package com.kohlschutter.jacline.j2cl;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.j2cl.common.OutputUtils;
import com.google.j2cl.common.OutputUtils.Output;
import com.google.j2cl.common.Problems;
import com.google.j2cl.common.SourceUtils;
import com.google.j2cl.common.SourceUtils.FileInfo;
import com.google.j2cl.transpiler.J2clTranspilerOptions;
import com.google.j2cl.transpiler.JaclineUtil;
import com.google.j2cl.transpiler.backend.Backend;
import com.google.j2cl.transpiler.frontend.Frontend;
import com.kohlschutter.jacline.CompilerOutput;
import com.kohlschutter.jacline.JaclineException;

public class JaclineJ2ClTranspiler implements Closeable {
  public JaclineJ2ClTranspiler() {
  }

  @Override
  public void close() throws IOException {
  }

  public void transpile(TranspilerSources sources, CompilerOutput output) throws IOException,
      JaclineException {
    output.setStage("j2js");

    Problems problems = new Problems();

    List<FileInfo> allSources = SourceUtils.getAllSources(sources.getSourceFiles().stream().map(
        Path::toString).collect(Collectors.toList()), problems).collect(Collectors.toList());

    List<FileInfo> sourceFileInfos = allSources.stream().filter( //
        (fi) -> fi.sourcePath().endsWith(".java") //
    ).collect(Collectors.toList());

    // https://github.com/google/j2cl/blob/master/docs/native-js-sources.md
    List<FileInfo> nativeSourceFileInfos = allSources.stream().filter( //
        (fi) -> fi.sourcePath().endsWith(".native.js") //
    ).collect(Collectors.toList());

    if (sourceFileInfos.isEmpty() && nativeSourceFileInfos.isEmpty()) {
      output.markSkipped();
      output.getProblems().addWarning("Nothing to compile");
      return;
    }

    try (Output out = OutputUtils.initOutput(output.getOutputPath(), problems)) {
      J2clTranspilerOptions options = J2clTranspilerOptions.newBuilder() //
          .setSources(sourceFileInfos) //
          .setNativeSources(nativeSourceFileInfos) //
          .setOutput(out) //
          .setClasspaths(sources.getEffectiveClasspath(true)) //
          .setEmitReadableSourceMap(false) //
          .setEmitReadableLibraryInfo(false) //
          .setOptimizeAutoValue(true) //
          .setGenerateKytheIndexingMetadata(false) //
          .setFrontend(Frontend.JDT) //
          .setNullMarkedSupported(false) //
          .setKotlincOptions(ImmutableList.of()) //
          .setBackend(Backend.CLOSURE) //
          .setWasmEntryPointStrings(ImmutableList.of()) //
          .setDefinesForWasm(ImmutableMap.of()) //
          .setForbiddenAnnotations(ImmutableList.of()) //
          .build(problems);
      try {
        JaclineUtil.transpile(options, problems);
      } catch (Problems.Exit ex) {
        // ignore
      }

      boolean success = !problems.hasErrors();
      output.complete(success, problems.getErrors(), problems.getWarnings(), problems
          .getInfoMessages());
      if (!success) {
        throw new JaclineException(output.getProblemSnapshot());
      }
    }
  }
}
