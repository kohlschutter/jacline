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
package com.kohlschutter.jacline.lib.common;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;
import com.kohlschutter.jacline.lib.common.vanilla.JsonSequenceEncoder;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "kohlschutter.coding", name = "SequenceEncoder")
public interface SequenceEncoder {
  /**
   * Encodes a string (or {@code null}).
   *
   * @param values The values.
   * @return This encoder.
   */
  SequenceEncoder encodeStrings(String... values);

  /**
   * Encodes a boolean (or {@code null}).
   *
   * @param values The values.
   * @return This encoder.
   */
  SequenceEncoder encodeBooleans(Boolean... values);

  /**
   * Encodes a number (or {@code null}).
   *
   * @param values The values.
   * @return This encoder.
   */
  SequenceEncoder encodeNumbers(Number... values);

  /**
   * Encodes an array.
   *
   * @return A new sub-encoder.
   */
  SequenceEncoder beginEncodeArray();

  /**
   * Returns a new encoder that can encode the object stored under the given key.
   *
   * @param encoder The object encoder
   * @param objects The objects
   * @return This encoder.
   */
  SequenceEncoder encodeObjects(ObjectEncoder encoder, Object... objects);

  /**
   * Ends any {@link #beginEncodeArray()} block, returning the parent encoder, or the same encoder
   * if it's the root encoder.
   *
   * @return The parent or this encoder.
   */
  SequenceEncoder end();

  /**
   * Returns the encoded representation for the data encoded by this encoder.
   *
   * @return The object.
   */
  Object getEncoded();

  @JsImplementationProvidedSeparately
  static SequenceEncoder begin() {
    return new JsonSequenceEncoder();
  }
}
