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

import jsinterop.annotations.JsType;

@JsType
public class StandardArrayDecoders {
  @FunctionalInterface
  public interface ArrayCreator<T> {
    T[] newArray(int size);
  }

  public static Object[] objects(Object serialized) throws DecodingException {
    return objectsWithDecoder(serialized, null, (l) -> new Object[l]);
  }

  public static <T> T[] objectsWithDecoder(Object serialized, ObjectDecoder<T> decoder,
      ArrayCreator<T> arrayCreator) throws DecodingException {
    SequenceDecoder dec = SequenceDecoder.load(serialized);
    T[] array = arrayCreator.newArray(dec.size());
    dec.objects(array.length, decoder, (e) -> array[dec.offset()] = e);
    assert (dec.offset() == dec.size());
    return array;
  }

  public static String[] strings(Object serialized) throws DecodingException {
    SequenceDecoder dec = SequenceDecoder.load(serialized);
    String[] array = new String[dec.size()];
    dec.strings(array.length, (e) -> array[dec.offset()] = e);
    assert (dec.offset() == dec.size());
    return array;
  }

  public static Boolean[] booleans(Object serialized) throws DecodingException {
    SequenceDecoder dec = SequenceDecoder.load(serialized);
    Boolean[] array = new Boolean[dec.size()];
    dec.booleans(array.length, (e) -> array[dec.offset()] = e);
    assert (dec.offset() == dec.size());
    return array;
  }

  public static Number[] numbers(Object serialized) throws DecodingException {
    SequenceDecoder dec = SequenceDecoder.load(serialized);
    Number[] array = new Number[dec.size()];
    dec.numbers(array.length, (e) -> array[dec.offset()] = e);
    assert (dec.offset() == dec.size());
    return array;
  }

  public static Object[][] arrays(Object serialized) throws DecodingException {
    return arraysWithDecoder(serialized, null, (l) -> new Object[l][]);
  }

  public static <T> T[][] arraysWithDecoder(Object serialized, ArrayDecoder<T[]> decoder,
      ArrayCreator<T[]> arrayCreator) throws DecodingException {
    SequenceDecoder dec = SequenceDecoder.load(serialized);
    T[][] array = arrayCreator.newArray(dec.size());
    dec.arrays(array.length, decoder, (e) -> array[dec.offset()] = e);
    assert (dec.offset() == dec.size());
    return array;
  }
}
