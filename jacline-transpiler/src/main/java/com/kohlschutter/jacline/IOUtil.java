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

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public final class IOUtil {
  private IOUtil() {
  }

  /**
   * Tries to delete a directory; if it's not empty, the call silently returns without deleting.
   * 
   * @param dir The directory to delete.
   * @throws IOException on some other error.
   */
  public static void tryDeleteEmptyDirectory(Path dir) throws IOException {
    try {
      Files.deleteIfExists(dir);
    } catch (DirectoryNotEmptyException ignore) {
      // ignore
    }
  }

  /**
   * Recursively deletes a directory tree, even if it's not empty.
   * 
   * @param root The root of the directory tree to delete.
   * @throws IOException on error.
   */
  public static void deleteRecursively(Path root) throws IOException {
    Files.walkFileTree(root, new FileVisitor<Path>() {

      @Override
      public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
          throws IOException {
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Files.deleteIfExists(file);
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        Files.deleteIfExists(dir);
        return FileVisitResult.CONTINUE;
      }
    });
  }

  /**
   * Moves a file, replacing any existing file/directory at the target location.
   * 
   * @param source The source
   * @param dest The destination
   * @throws IOException on error.
   */
  public static void moveWithReplace(Path source, Path dest) throws IOException {
    try {
      Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);
    } catch (DirectoryNotEmptyException e) {
      IOUtil.deleteRecursively(dest);
      Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);
    }
  }

  /**
   * Copies a file, replacing any existing file/directory at the target location.
   * 
   * @param source The source
   * @param dest The destination
   * @throws IOException on error.
   */
  public static void copyWithReplace(Path source, Path dest) throws IOException {
    try {
      Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
    } catch (DirectoryNotEmptyException e) {
      IOUtil.deleteRecursively(dest);
      Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
    }
  }
}
