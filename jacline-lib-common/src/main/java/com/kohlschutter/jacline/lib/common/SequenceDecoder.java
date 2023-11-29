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

@JsType(isNative = true, namespace = "kohlschutter.coding", name = "SequenceDecoder")
public interface SequenceDecoder {
  int size();

  SequenceDecoder strings(int count);

  SequenceDecoder booleans(int count);

  SequenceDecoder numbers(int count);

  SequenceDecoder arrays(int count, ArrayDecoder decoder);

  SequenceDecoder objects(int count, String expectedCodedType, ObjectDecoder decoder);

  Object[] getArray();

  @JsImplementationProvidedSeparately
  static SequenceDecoder load(Object serialized) {
    throw new UnsupportedOperationException("Not yet implemented for vanilla Java");
  }
}
