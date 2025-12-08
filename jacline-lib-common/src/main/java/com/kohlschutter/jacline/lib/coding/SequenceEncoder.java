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

public interface SequenceEncoder {
  /**
   * Encodes a string (or {@code null}).
   *
   * @param values The values.
   * @return This encoder.
   * @throws CodingException on error.
   */
  SequenceEncoder encodeStrings(String... values) throws CodingException;

  /**
   * Encodes a boolean (or {@code null}).
   *
   * @param values The values.
   * @return This encoder.
   * @throws CodingException on error.
   */
  SequenceEncoder encodeBooleans(Boolean... values) throws CodingException;

  /**
   * Encodes a number (or {@code null}).
   *
   * @param values The values.
   * @return This encoder.
   * @throws CodingException on error.
   */
  SequenceEncoder encodeNumbers(Number... values) throws CodingException;

  /**
   * Encodes an array.
   *
   * @return A new sub-encoder.
   * @throws CodingException on error.
   */
  SequenceEncoder beginEncodeArray() throws CodingException;

  /**
   * Returns a new encoder that can encode the object stored under the given key.
   *
   * @param encoder The object encoder
   * @param objects The objects
   * @return This encoder.
   * @throws CodingException on error.
   */
  SequenceEncoder encodeObjects(ObjectEncoder encoder, Object... objects) throws CodingException;

  /**
   * Ends any {@link #beginEncodeArray()} block, returning the parent encoder, or the same encoder
   * if it's the root encoder.
   *
   * @return The parent or this encoder.
   * @throws CodingException on error.
   */
  SequenceEncoder end() throws CodingException;

  /**
   * Returns the encoded representation for the data encoded by this encoder.
   *
   * @return The object.
   * @throws CodingException on error.
   */
  Object getEncoded() throws CodingException;
}
