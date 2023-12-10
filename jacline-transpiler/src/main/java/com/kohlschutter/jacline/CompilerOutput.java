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
package com.kohlschutter.jacline;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;

public class CompilerOutput implements Closeable {
  protected final Path outputDir;

  private boolean skipped;
  private boolean successful;

  private final Problems problems = new Problems();

  private CompilerOutput(Path dir) {
    this.outputDir = dir;
  }

  public Path getOutputPath() {
    return outputDir;
  }

  public static CompilerOutput newInstanceWithTemporaryDirectory() throws IOException {
    return new TempDirOutput(Files.createTempDirectory("jacline-"));
  }

  public static CompilerOutput newInstanceWithTargetDirectory(Path target) throws IOException {
    return newInstanceWithTargetDirectory(target, true);
  }

  public static CompilerOutput newInstanceWithTargetDirectory(Path target, boolean cleanFirst)
      throws IOException {
    if (cleanFirst) {
      IOUtil.deleteRecursively(target);
    }
    Files.createDirectories(target);
    return new CompilerOutput(target);
  }

  @Override
  public void close() throws IOException {

  }

  @SuppressFBWarnings("EI_EXPOSE_REP")
  public Problems getProblems() {
    return problems;
  }

  public boolean isSuccessful() {
    return successful;
  }

  public boolean isSkipped() {
    return skipped;
  }

  public void markSkipped() {
    skipped = true;
  }

  public void complete(boolean success, List<String> errorMessages, List<String> warningMessages,
      List<String> infoMessages) {
    this.successful = success && errorMessages.isEmpty();
    problems.addErrors(errorMessages);
    problems.addWarnings(warningMessages);
    problems.addInfoMessages(infoMessages);
  }

  private static class TempDirOutput extends CompilerOutput {
    TempDirOutput(Path dir) {
      super(dir);
    }

    @Override
    public void close() throws IOException {
      IOUtil.deleteRecursively(outputDir);
      super.close();
    }
  }

  public Problems getProblemSnapshot() {
    return problems.newSnapshot();
  }

  public void setStage(String stage) {
    problems.setStage(stage);
  }
}
