/*
 * jacline-lib-common
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
package com.kohlschutter.jacline.lib.coding;

import java.io.Closeable;

/**
 * Something that can encode an array.
 *
 * @author Christian Kohlschütter
 */
public interface ArrayEncoder extends Closeable {
  /**
   * Returns an object that contains the encoded contents of the given array.
   *
   * @param array The array to encode.
   * @return The encoded object.
   * @throws CodingException on error.
   */
  Object encode(Object[] array) throws CodingException;

  @Override
  default void close() throws CodingException {

  }
}
