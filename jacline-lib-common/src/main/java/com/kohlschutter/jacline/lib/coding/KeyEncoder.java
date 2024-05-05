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

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;
import com.kohlschutter.jacline.annotations.JsPatched;

import jsinterop.annotations.JsType;

@JsType
@JsPatched
public interface KeyEncoder {
  /**
   * Encodes a string (or {@code null}) for the given key.
   *
   * @param key The key, or {@code null}
   * @param value The value.
   * @return This encoder.
   * @throws CodingException on error.
   */
  KeyEncoder encodeString(String key, String value) throws CodingException;

  /**
   * Encodes a boolean (or {@code null}) for the given key.
   *
   * @param key The key, or {@code null}
   * @param value The value.
   * @return This encoder.
   * @throws CodingException on error.
   */
  KeyEncoder encodeBoolean(String key, Boolean value) throws CodingException;

  /**
   * Encodes a number (or {@code null}) for the given key.
   *
   * @param key The key, or {@code null}
   * @param value The value.
   * @return This encoder.
   * @throws CodingException on error.
   */
  KeyEncoder encodeNumber(String key, Number value) throws CodingException;

  /**
   * Encodes an array (or {@code null}) for the given key.
   *
   * @param key The key, or {@code null}
   * @param encoder The encoder
   * @param array The array.
   * @return This encoder.
   * @throws CodingException on error.
   */
  KeyEncoder encodeArray(String key, ArrayEncoder encoder, Object[] array) throws CodingException;

  /**
   * Returns a new encoder that can encode the object stored under the given key.
   *
   * @param key The key to store the object under.
   * @param type The encoded type.
   * @return The sub-encoder.
   * @throws CodingException on error.
   */
  KeyEncoder beginEncodeObject(String key, String type) throws CodingException;

  /**
   * Ends any {@link #beginEncodeObject(String, String)} block, returning the parent encoder, or the
   * same encoder if it's the root encoder.
   *
   * @return The parent or this encoder.
   * @throws CodingException on error.
   */
  KeyEncoder end() throws CodingException;

  /**
   * Returns the encoded representation for the data encoded by this encoder.
   *
   * @return The object.
   * @throws CodingException on error.
   */
  Object getEncoded() throws CodingException;

  @JsImplementationProvidedSeparately
  static KeyEncoder begin(String type) throws CodingException {
    return CodingServiceProvider.getDefault().keyEncoder(type);
  }
}
