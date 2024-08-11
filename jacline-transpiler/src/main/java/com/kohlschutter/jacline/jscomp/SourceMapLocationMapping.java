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
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.jspecify.nullness.Nullable;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.javascript.jscomp.SourceMap.LocationMapping;
import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import com.kohlschutter.jacline.IOUtil;

@SuppressFBWarnings("CT_CONSTRUCTOR_THROW")
public class SourceMapLocationMapping implements LocationMapping, Closeable {
  private static final String META_INF_JACLINE = "/META-INF/jacline/";
  private static final String TARGET = "/target/classes";
  private static final String TARGET_ECLIPSE = "/target-eclipse/classes";

  private static final HashFunction SHA_256 = Hashing.sha256();

  private final Map<String, FileSystem> fileSystems = new HashMap<>();
  private final Map<String, String> prefixHash = new HashMap<>();
  private final List<FileSystem> fileSystemsToClose = new ArrayList<>();

  private final URI basePrefix;
  private final Path sourceMapWorkDir;
  private final String hostPrefix;
  private final URI prefix;

  public SourceMapLocationMapping(Path sourceMapWorkDir, URI basePrefix, URI prefix)
      throws IOException {
    this.sourceMapWorkDir = sourceMapWorkDir;
    this.basePrefix = basePrefix;
    this.prefix = prefix;
    hostPrefix = stripTrailingSlash(prefix.resolve("/").toASCIIString());
    if (Files.exists(sourceMapWorkDir)) {
      IOUtil.deleteRecursively(sourceMapWorkDir.resolve("sourcemaps/jacline"));
    }
    Files.createDirectories(sourceMapWorkDir);
  }

  private static String stripTrailingSlash(String s) {
    if (s.endsWith("/")) {
      return s.substring(0, s.length() - 1);
    } else {
      return s;
    }
  }

  @Override
  public @Nullable String map(String location) {
    int index;

    int lastSlash = location.lastIndexOf('/');
    if (lastSlash == -1) {
      // do not map file in the same folder
      return null;
    }

    Path p = locationToPath(location);
    if (p == null) {
      // cannot map
      System.err.println("WARN: CANNOT MAP: " + location);
      return null;
    }
    if (!Files.exists(p)) {
      System.err.println("WARN: MISSING: " + location);
      return null;
    }

    index = location.lastIndexOf(META_INF_JACLINE);

    String mappedPrefix;
    String localPath;

    if (index >= 0) {
      String locationPrefix = location.substring(0, index);
      localPath = location.substring(index + META_INF_JACLINE.length());
      mappedPrefix = prefixHash.computeIfAbsent(locationPrefix, this::idForPrefix);
    } else {
      String locationPrefix = location.substring(0, lastSlash);
      localPath = location.substring(lastSlash + 1);
      mappedPrefix = prefixHash.computeIfAbsent(locationPrefix, this::idForPrefix);
    }

    String mappedPath = "/sourcemaps/jacline/" + mappedPrefix + "/" + localPath;
    mappedPath = mappedPath.replace("//", "/");
    try {
      addFile(p, mappedPath);
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }

    return hostPrefix + mappedPath;
  }

  private Path resolveRelativePath(Path base, String path) {
    if (path.startsWith("/")) {
      path = path.substring(1);
    }
    return base.resolve(path);
  }

  @SuppressFBWarnings("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  private void addFile(Path sourceFile, String mappedPath) throws IOException {
    Path targetPath = resolveRelativePath(Objects.requireNonNull(sourceMapWorkDir), mappedPath);
    Files.createDirectories(targetPath.getParent());

    try {
      Files.copy(sourceFile, targetPath);
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  @SuppressFBWarnings("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
  private void addFile(String source, String mappedPath) throws IOException {
    Path targetPath = resolveRelativePath(Objects.requireNonNull(sourceMapWorkDir), mappedPath);
    Files.createDirectories(targetPath.getParent());

    try (Writer out = Files.newBufferedWriter(targetPath)) {
      out.write(source);
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  private String idForPrefix(String pathPrefix) {
    String hash = SHA_256.hashString(pathPrefix, StandardCharsets.UTF_8).toString();

    String projectName;
    projectName = projectNameFromTargetPath(pathPrefix);
    if (projectName == null) {
      projectName = projectNameFromLastPathElement(pathPrefix);
    }

    String id;
    if (projectName == null) {
      id = hash;
    } else {
      id = projectName + "-" + hash;
    }

    return id;
  }

  private String projectNameFromLastPathElement(String pathPrefix) {
    int index = pathPrefix.lastIndexOf('/');
    if (index == -1) {
      return null;
    }
    int end;
    if (pathPrefix.endsWith(".jar!")) {
      end = pathPrefix.length() - 5;
    } else if (pathPrefix.endsWith("!")) {
      end = pathPrefix.length() - 1;
    } else {
      end = pathPrefix.length();
    }
    String id = pathPrefix.substring(index + 1, end);
    if (id.isEmpty()) {
      return null;
    } else {
      return id;
    }
  }

  private String projectNameFromTargetPath(String path) {
    int indexTarget = path.indexOf(TARGET);
    if (indexTarget == -1) {
      indexTarget = path.indexOf(TARGET_ECLIPSE);
    }
    if (indexTarget == -1) {
      return null;
    }

    int slash = path.lastIndexOf('/', indexTarget - 1);
    String project = path.substring(slash + 1, indexTarget);
    if (!project.isEmpty()) {
      return project;
    } else {
      return null;
    }
  }

  private FileSystem getFileSystem(String fsPart) {
    URI u;
    try {
      u = new URI(fsPart);
    } catch (URISyntaxException e) {
      throw new IllegalStateException(e);
    }

    FileSystem fs;
    boolean close = false;
    try {
      fs = FileSystems.getFileSystem(u);
    } catch (FileSystemNotFoundException e) {
      try {
        fs = FileSystems.newFileSystem(u, Map.of("create", false));
        close = true;
      } catch (FileSystemAlreadyExistsException e1) {
        fs = FileSystems.getFileSystem(u);
      } catch (IOException e1) {
        IllegalStateException ex = new IllegalStateException(e);
        ex.addSuppressed(e1);
        throw ex; // NOPMD.PreserveStackTrace
      }
    }
    if (close) {
      fileSystemsToClose.add(fs);
    }
    return fs;
  }

  private Path locationToPath(String location) {
    int index = location.indexOf("!/");
    if (index >= 0) {
      String fsPart = location.substring(0, index);

      FileSystem fs = fileSystems.computeIfAbsent(fsPart, this::getFileSystem);
      if (fs == null) {
        return null;
      }

      return fs.getPath(location.substring(index + 1));
    } else {
      return Path.of(location);
    }
  }

  public String initMainSourceMap(String outputFileName, String sourceMapContents)
      throws IOException {

    String path = "by-content/" + SHA_256.hashString(sourceMapContents, StandardCharsets.UTF_8)
        + "/" + projectNameFromLastPathElement(outputFileName) + ".map";

    String path1 = prefix.resolve(path).toString();

    addFile(sourceMapContents, path1);
    String path2 = path1;
    if (path2.startsWith("/")) {
      path2 = path2.substring(1);
    }

    String mapped = basePrefix.resolve(path2).toString();

    return "//# sourceMappingURL=" + mapped;
  }

  @Override
  public void close() throws IOException {
    for (Iterator<FileSystem> it = fileSystemsToClose.iterator(); it.hasNext();) {
      try {
        it.next().close();
      } finally {
        it.remove();
      }
    }
  }
}
