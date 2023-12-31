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
import com.kohlschutter.jacline.lib.io.JsCloseable;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "kohlschutter.coding", name = "SequenceDecoder")
public interface SequenceDecoder extends JsCloseable {

  @FunctionalInterface
  @JsFunction
  interface SequenceConsumer<T> {
    void consume(T t) throws CodingException;
  }

  int size();

  int position();

  SequenceDecoder strings(int count, SequenceConsumer<String> forEach) throws CodingException;

  SequenceDecoder booleans(int count, SequenceConsumer<Boolean> forEach) throws CodingException;

  SequenceDecoder numbers(int count, SequenceConsumer<Number> forEach) throws CodingException;

  <T> SequenceDecoder arrays(int count, ArrayDecoder<T> decoder, SequenceConsumer<T[]> forEach)
      throws CodingException;

  <T> SequenceDecoder objects(int count, ObjectDecoder<T> decoder, SequenceConsumer<T> forEach)
      throws CodingException;

  @JsImplementationProvidedSeparately
  static SequenceDecoder load(Object encoded) throws CodingException {
    return CodingServiceProvider.getDefault().sequenceDecoder(encoded);
  }
}
