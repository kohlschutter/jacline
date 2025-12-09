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

import com.kohlschutter.jacline.lib.json.JSON;

import elemental2.core.JsArray;

public final class JaclineSequenceDecoder implements SequenceDecoder {
  private int pos = 0;
  private final int length;
  private JsArray<Object> array;

  @SuppressWarnings("unchecked")
  public JaclineSequenceDecoder(Object encoded) throws CodingException {

    if (encoded == null) {
      this.array = null;
      this.length = 0;
    } else if (encoded instanceof JsArray) {
      this.array = (JsArray<Object>) encoded;
      this.length = array.length;
    } else {
      this.array = (JsArray<Object>) JSON.parse(String.valueOf(encoded));
      this.length = array.length;
    }
  }

  @Override
  public int size() {
    return length;
  }

  @Override
  public int position() {
    return pos;
  }

  private int checkCount(int count) {
    if (count > length - pos || count < 0) {
      count = length - pos;
    }
    return count;
  }

  @Override
  public SequenceDecoder strings(int count, SequenceConsumer<String> forEach)
      throws CodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      Object next = array.getAt(pos);

      String val;

      if (next == null) {
        val = null;
      } else if (next instanceof String) {
        val = (String) next;
      } else {
        val = String.valueOf(next);
      }

      forEach.consume(val);
    }

    return this;
  }

  @Override
  public SequenceDecoder booleans(int count, SequenceConsumer<Boolean> forEach)
      throws CodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      Object next = array.getAt(pos);

      Boolean val;

      if (next == null) {
        val = null;
      } else if (next instanceof Boolean) {
        val = (Boolean) next;
      } else {
        val = Boolean.valueOf(String.valueOf(next));
      }

      forEach.consume(val);
    }

    return this;
  }

  @Override
  public SequenceDecoder numbers(int count, SequenceConsumer<Number> forEach)
      throws CodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      Object next = array.getAt(pos);

      Number val;

      if (next == null) {
        val = null;
      } else if (next instanceof Number) {
        val = (Number) next;
      } else {
        val = Double.valueOf(String.valueOf(next));
      }

      forEach.consume(val);
    }

    return this;
  }

  @Override
  public <T> SequenceDecoder arrays(int count, ArrayDecoder<T> decoder,
      SequenceConsumer<T[]> forEach) throws CodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      Object next = array.getAt(pos);

      T[] val;

      if (next == null) {
        val = null;
      } else {
        val = decoder.decode(next);
      }

      forEach.consume(val);
    }

    return this;
  }

  @SuppressWarnings("null")
  @Override
  public <T> SequenceDecoder objects(int count, ObjectDecoder<T> decoder,
      SequenceConsumer<T> forEach) throws CodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      Object next = array.getAt(pos);

      T val;

      if (next == null) {
        val = null;
      } else {
        val = decoder.decode(next);
      }

      forEach.consume(val);
    }

    return this;
  }

  @Override
  public void close() throws IOException {
  }

}
