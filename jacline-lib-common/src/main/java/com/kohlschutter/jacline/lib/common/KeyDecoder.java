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

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "kohlschutter.coding", name = "KeyDecoder")
public interface KeyDecoder extends JsCloseable {
  String stringForKey(String key);

  Boolean booleanForKey(String key);

  Number numberForKey(String key);

  <T> T[] arrayForKey(String key, ArrayDecoder<T> decoder) throws DecodingException;

  <T> T objectForKey(String key, ObjectDecoder<T> decoder) throws DecodingException;

  boolean hasKey(String key);

  @JsImplementationProvidedSeparately
  static KeyDecoder load(String expectedCodedType, Object encoded) throws DecodingException {
    return EncodableSupportProvider.getDefault().keyDecoder(expectedCodedType, encoded);
  }
}
