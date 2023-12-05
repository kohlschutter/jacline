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

import java.io.IOException;

import jsinterop.annotations.JsType;

@JsType
public class StandardArrayDecoders {
  public static Object[] objects(Object serialized) throws CodingException {
    return objectsWithDecoder(serialized, null, (l) -> new Object[l]);
  }

  public static <T> T[] objectsWithDecoder(Object serialized, ObjectDecoder<T> decoder,
      ArrayCreator<T> arrayCreator) throws CodingException {
    try (SequenceDecoder dec = SequenceDecoder.load(serialized)) {
      T[] array = arrayCreator.newArray(dec.size());
      dec.objects(array.length, decoder, (e) -> array[dec.position()] = e);
      assert (dec.position() == dec.size());
      return array;
    } catch (IOException e) {
      throw new CodingException(e);
    }
  }

  public static String[] strings(Object serialized) throws CodingException {
    try (SequenceDecoder dec = SequenceDecoder.load(serialized)) {
      String[] array = new String[dec.size()];
      dec.strings(array.length, (e) -> array[dec.position()] = e);
      assert (dec.position() == dec.size());
      return array;
    } catch (IOException e) {
      throw new CodingException(e);
    }

  }

  public static Boolean[] booleans(Object serialized) throws CodingException {
    try (SequenceDecoder dec = SequenceDecoder.load(serialized)) {
      Boolean[] array = new Boolean[dec.size()];
      dec.booleans(array.length, (e) -> array[dec.position()] = e);
      assert (dec.position() == dec.size());
      return array;
    } catch (IOException e) {
      throw new CodingException(e);
    }
  }

  public static Number[] numbers(Object serialized) throws CodingException {
    try (SequenceDecoder dec = SequenceDecoder.load(serialized)) {
      Number[] array = new Number[dec.size()];
      dec.numbers(array.length, (e) -> array[dec.position()] = e);
      assert (dec.position() == dec.size());
      return array;
    } catch (IOException e) {
      throw new CodingException(e);
    }
  }

  public static Object[][] arrays(Object serialized) throws CodingException {
    return arraysWithDecoder(serialized, null, (l) -> new Object[l][]);
  }

  public static <T> T[][] arraysWithDecoder(Object serialized, ArrayDecoder<T> decoder,
      ArrayCreator<T[]> arrayCreator) throws CodingException {
    try (SequenceDecoder dec = SequenceDecoder.load(serialized)) {
      T[][] array = arrayCreator.newArray(dec.size());
      dec.arrays(array.length, decoder, (e) -> array[dec.position()] = e);
      assert (dec.position() == dec.size());
      return array;
    } catch (IOException e) {
      throw new CodingException(e);
    }
  }
}
