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

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public final class ClosureCompilerSources {
  private static final String META_INF_JACLINE = "META-INF/jacline";
  private final Collection<Path> entryPoints = new LinkedHashSet<>();
  private final Collection<Path> otherFiles = new LinkedHashSet<>();

  public ClosureCompilerSources() {
  }

  public boolean addEntryPoint(Path p) {
    return entryPoints.add(p);
  }

  public void addSource(Path p) {
    otherFiles.add(p);
  }

  public List<Path> getEntryPoints() {
    return Collections.unmodifiableList(new ArrayList<>(entryPoints));
  }

  public List<Path> getOtherFiles() {
    return Collections.unmodifiableList(new ArrayList<>(otherFiles));
  }

  public void addSourcesFromClasspath() throws IOException {
    addSourcesFromClasspath((Predicate<Path>) null);
  }

  public void addSourcesFromClasspath(Predicate<Path> acceptableEntries) throws IOException {
    addSourcesFromClasspath(Arrays.asList(System.getProperty("java.class.path").split(
        "[ ]*\\:[ ]*")), acceptableEntries);
  }

  public void addSourcesFromClasspath(List<String> classpath) throws IOException {
    addSourcesFromClasspath(classpath, null);
  }

  @SuppressWarnings("PMD.CognitiveComplexity")
  public void addSourcesFromClasspath(List<String> classpath, Predicate<Path> acceptableEntries)
      throws IOException {
    Path dir;
    for (String s : classpath) {
      if (s.endsWith(".jar") && Files.exists(dir = Path.of(s))) {
        URI u = URI.create("jar:" + dir.toUri() + "!/");

        boolean close;

        FileSystem fs;
        try {
          fs = FileSystems.newFileSystem(u, Map.of("create", false));
          close = true;
        } catch (FileSystemAlreadyExistsException e) {
          fs = FileSystems.getFileSystem(u);
          close = false;
        }
        dir = fs.getPath(META_INF_JACLINE);
        if (!Files.isDirectory(dir)) {
          if (close) {
            fs.close();
          }
          continue;
        }
        dir = dir.toAbsolutePath();

        if (acceptableEntries == null || acceptableEntries.test(dir)) {
          addSource(dir);
        }
      } else if (Files.isDirectory((dir = Path.of(s)))) {
        dir = dir.resolve(META_INF_JACLINE);
        if (Files.isDirectory(dir)) {
          dir = dir.toAbsolutePath();
          if (acceptableEntries == null || acceptableEntries.test(dir)) {
            addSource(dir);
          }
        }
      }
    }
  }
}
