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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public final class TranspilerSources {
  private final List<Path> sourceFiles = new ArrayList<>();
  private final Set<String> bootclasspath = new LinkedHashSet<>();
  private final Set<String> classpath = new LinkedHashSet<>();

  private TranspilerSources() {
  }

  public static TranspilerSources newInstanceWithoutDefaults() {
    return new TranspilerSources();
  }

  public static TranspilerSources newInstanceWithDefaultJreClasses() {
    TranspilerSources instance = new TranspilerSources();

    String jrejsLibraryPath = BootstrapJarSupport.jrejsLibraryPath();
    instance.addBootClasspathElement(jrejsLibraryPath);

    return instance;
  }

  public static TranspilerSources newInstanceWithJavaClasspath() {
    return newInstanceWithJavaClasspath(null);
  }

  public static TranspilerSources newInstanceWithJavaClasspath(Predicate<Path> acceptableEntries) {
    TranspilerSources instance = newInstanceWithDefaultJreClasses();
    for (String s : System.getProperty("java.class.path").split("[ ]*\\:[ ]*")) {
      if (acceptableEntries == null || acceptableEntries.test(Path.of(s))) {
        instance.addClasspathElement(s);
      }
    }
    return instance;
  }

  public void addBootClasspathElement(String p) {
    bootclasspath.add(p);
  }

  public void addClasspathElement(String p) {
    classpath.add(p);
  }

  public void addSource(Path path) throws IOException {
    if (Files.isDirectory(path)) {
      Files.find(path, 32, (p, a) -> {
        if (a.isRegularFile()) {
          String name = p.getName(p.getNameCount() - 1).toString();
          return name.endsWith(".java") || name.endsWith(".native.js");
        } else {
          return false;
        }
      }).forEach(sourceFiles::add);
    } else if (Files.isReadable(path)) {
      sourceFiles.add(path);
    } else {
      throw new FileNotFoundException("Cannot access source file: " + path);
    }
  }

  public List<Path> getSourceFiles() {
    return sourceFiles;
  }

  public List<String> getEffectiveClasspath(boolean onlyAddExisting) {
    List<String> list = new ArrayList<>(bootclasspath.size() + classpath.size());
    if (onlyAddExisting) {
      addAllExisting(list, bootclasspath);
      addAllExisting(list, classpath);
    } else {
      list.addAll(bootclasspath);
      list.addAll(classpath);
    }
    return list;
  }

  private static void addAllExisting(List<String> list, Set<String> paths) {
    for (String p : paths) {
      if (Files.exists(Path.of(p))) {
        list.add(p);
      }
    }
  }
}
