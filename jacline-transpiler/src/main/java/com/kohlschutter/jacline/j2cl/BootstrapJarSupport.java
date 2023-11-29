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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

/**
 * Helper class to locate the bootstrap jar to use for the j2cl bootclasspath.
 *
 * @author Christian Kohlschütter
 */
final class BootstrapJarSupport {
  private static final Pattern PAT_JREJS = Pattern.compile(
      "/jacline-jrejs-[0-9\\.]+(-SNAPSHOT)?\\.jar$");

  private static String jreJsPath = null;

  private BootstrapJarSupport() {

  }

  @SuppressWarnings({
      "PMD.NcssCount", "PMD.CognitiveComplexity", "PMD.NPathComplexity", "PMD.CyclomaticComplexity",
      "PMD.PreserveStackTrace", "PMD.AvoidBranchingStatementAsLastInLoop"})
  public static synchronized String jrejsLibraryPath() {
    if (jreJsPath != null) {
      return jreJsPath;
    }

    // Always permit an override. You never know...
    String overrideBootstrapJar = System.getProperty("jacline.j2cl.bootstrap.jar", "");
    if (!overrideBootstrapJar.isEmpty()) {
      if (Files.isReadable(Path.of(overrideBootstrapJar))) {
        return (jreJsPath = overrideBootstrapJar);
      } else {
        throw new IllegalStateException(
            "jar specified via \"jacline.j2cl.bootstrap.jar\" system property is not accessible: "
                + overrideBootstrapJar);
      }
    }

    List<Path> classpathElements = new ArrayList<>();
    for (String s : System.getProperty("java.class.path", "").split("[ ]*\\:[ ]*")) {
      classpathElements.add(Path.of(s));
    }

    // java.class.path may be incomplete; try adding entries from our classloader if possible
    // This is required for the Maven plugin, for example.
    @SuppressWarnings("PMD.UseProperClassLoader")
    ClassLoader cl = BootstrapJarSupport.class.getClassLoader();
    if (cl instanceof URLClassLoader) {
      for (URL url : ((URLClassLoader) cl).getURLs()) {
        try {
          classpathElements.add(Path.of(url.toURI()));
        } catch (URISyntaxException e) {
          continue;
        }
      }
    }

    // The compiler needs the jacline-jrejs bootstrap jar, which we cannot add to the Maven
    // dependency classpath. We have to resort to some trickery:
    //
    // Since we have the default jacline-jrejs jar in the classpath, check if we also have
    // the "bootstrap" classifier variant. If so, reuse it.
    //
    // If we don't have it, obtain the bootstrap variant from the embedded jar in the classpath,
    // inferring the version string from the default jar.
    //
    // Try to copy that jar to the same location as the non-bootstrap version. If that fails,
    // use a temporary path, and delete that file upon VM shutdown.
    //
    for (Path p : classpathElements) {
      String s = p.toString();

      if (s.endsWith("/jacline-jrejs/target-eclipse/classes")) {
        // we're running from within Eclipse, and we're developing jacline-jrejs
        // This assumes that we have run "mvn clean install" on jacline-jrejs before
        try {
          Optional<Path> jar = Files.find(p.resolve("../../target/"), 1, (f, a) -> {
            return a.isRegularFile() && f.toString().endsWith("-bootstrap.jar");
          }).findFirst();
          if (jar.isPresent() && Files.isReadable(jar.get())) {
            return (jreJsPath = jar.get().toString());
          }
        } catch (IOException ignore) {
          // ignore
        }
      }

      if (!PAT_JREJS.matcher(s).find()) {
        continue;
      }

      String bootstrapJar = s.substring(0, s.length() - 4) + "-bootstrap.jar";
      Path bootstrapJarPath = Path.of(bootstrapJar);
      if (Files.isReadable(bootstrapJarPath)) {
        long size;
        try {
          size = Files.size(bootstrapJarPath);
        } catch (IOException e) {
          continue;
        }
        if (size > 0) {
          return (jreJsPath = bootstrapJarPath.toString());
        }
      }

      int lastSlash = bootstrapJar.lastIndexOf('/');
      String embeddedJar = bootstrapJar.substring(lastSlash);
      String targetDir = bootstrapJar.substring(0, lastSlash);

      URL embeddedJarUrl = BootstrapJarSupport.class.getResource(embeddedJar);
      if (embeddedJarUrl == null) {
        throw new IllegalStateException("Could not find embedded bootstrap jar in classpath: "
            + embeddedJar);
      }

      Path targetPath = Path.of(targetDir);

      boolean reuseFile = false;
      boolean reuseDir;
      Path tempFile = null;

      String pathToReturn;
      try {
        try {
          tempFile = Files.createTempFile(targetPath, "jaclineTmp-", ".jar");
          reuseDir = true;
        } catch (IOException e) {
          reuseDir = false;
          try {
            tempFile = Files.createTempFile("jaclineTmp-", ".jar");
          } catch (IOException e1) {
            IllegalStateException ise = new IllegalStateException(
                "Cannot create temporary files needed for bootstrap classpath", e);
            ise.addSuppressed(e1);
            throw ise;
          }
        }
        pathToReturn = tempFile.toString();

        try (InputStream in = embeddedJarUrl.openStream();
            OutputStream out = Files.newOutputStream(tempFile)) {
          in.transferTo(out);
        } catch (IOException e) {
          throw new IllegalStateException("Could not copy bootstrap jar from classpath", e);
        }
        if (reuseDir) {
          try {
            Files.move(tempFile, bootstrapJarPath, StandardCopyOption.ATOMIC_MOVE);
            reuseFile = true;
            pathToReturn = bootstrapJarPath.toString();
          } catch (IOException e) {
            // ignore
          }
        }

      } finally {
        if (!reuseFile) {
          if (tempFile != null) {
            tempFile.toFile().deleteOnExit();
          }
        }
      }

      return (jreJsPath = pathToReturn);
    }

    // Looks like our expectations failed
    throw new IllegalStateException("Could not locate jacline-jrejs bootstrap.jar");
  }
}
