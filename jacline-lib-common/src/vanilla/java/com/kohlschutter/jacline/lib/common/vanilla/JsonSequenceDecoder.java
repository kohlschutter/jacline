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
package com.kohlschutter.jacline.lib.common.vanilla;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.stream.Stream;

import com.kohlschutter.jacline.lib.common.ArrayDecoder;
import com.kohlschutter.jacline.lib.common.DecodingException;
import com.kohlschutter.jacline.lib.common.ObjectDecoder;
import com.kohlschutter.jacline.lib.common.SequenceDecoder;

import jakarta.json.JsonArray;
import jakarta.json.JsonNumber;
import jakarta.json.JsonObject;
import jakarta.json.JsonString;
import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;

public final class JsonSequenceDecoder implements SequenceDecoder {
  private static final JsonProvider PROVIDER = JsonProvider.provider();
  private final JsonParser parser;
  private int pos = 0;
  private final int length;
  private final Iterator<JsonValue> iterator;

  public JsonSequenceDecoder(Object encoded) throws DecodingException {
    Stream<JsonValue> stream;

    if (encoded instanceof JsonArray) {
      JsonArray array = ((JsonArray) encoded);
      stream = array.stream();
      parser = null;
      length = array.size();
    } else {
      if (encoded instanceof Reader) {
        parser = PROVIDER.createParser((Reader) encoded);
      } else {
        parser = PROVIDER.createParser(new StringReader(encoded.toString()));
      }
      if (parser.hasNext()) {
        if (parser.next() != Event.START_ARRAY) {
          throw new DecodingException("Not an array");
        }
        JsonArray array = parser.getArray();
        length = array.size();
        stream = array.stream();
      } else {
        stream = Stream.empty();
        length = 0;
      }
    }

    iterator = stream.iterator();
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
      throws DecodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      JsonValue next = iterator.next();

      String val;
      switch (next.getValueType()) {
        case NULL:
          val = null;
          break;
        case STRING:
          val = ((JsonString) next).getString();
          break;
        default:
          throw new DecodingException("Wrong type: " + next.getValueType()
              + "; expected array, but got: " + next);
      }

      forEach.consume(val);
    }

    return this;
  }

  @Override
  public SequenceDecoder booleans(int count, SequenceConsumer<Boolean> forEach)
      throws DecodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      JsonValue next = iterator.next();

      Boolean val;
      switch (next.getValueType()) {
        case NULL:
          val = null;
          break;
        case FALSE:
          val = false;
          break;
        case TRUE:
          val = true;
          break;
        default:
          throw new DecodingException("Wrong type: " + next.getValueType()
              + "; expected array, but got: " + next);
      }

      forEach.consume(val);
    }

    return this;
  }

  @Override
  public SequenceDecoder numbers(int count, SequenceConsumer<Number> forEach)
      throws DecodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      JsonValue next = iterator.next();

      Number val;
      switch (next.getValueType()) {
        case NULL:
          val = null;
          break;
        case NUMBER:
          val = ((JsonNumber) next).numberValue();
          break;
        default:
          throw new DecodingException("Wrong type: " + next.getValueType()
              + "; expected array, but got: " + next);
      }

      forEach.consume(val);
    }

    return this;
  }

  @Override
  public <T> SequenceDecoder arrays(int count, ArrayDecoder<T> decoder,
      SequenceConsumer<T[]> forEach) throws DecodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      JsonValue next = iterator.next();

      T[] val;
      switch (next.getValueType()) {
        case NULL:
          val = null;
          break;
        case ARRAY: {
          JsonArray jsonArray = (JsonArray) next;
          val = decoder.decode(jsonArray);
          break;
        }
        default:
          throw new DecodingException("Wrong type: " + next.getValueType()
              + "; expected array, but got: " + next);
      }

      forEach.consume(val);
    }

    return this;
  }

  @SuppressWarnings("null")
  @Override
  public <T> SequenceDecoder objects(int count, ObjectDecoder<T> decoder,
      SequenceConsumer<T> forEach) throws DecodingException {
    count = checkCount(count);
    for (int i = 0; i < count; i++, pos++) {
      JsonValue next = iterator.next();

      T val;
      switch (next.getValueType()) {
        case NULL:
          val = null;
          break;
        case OBJECT: {
          JsonObject jsonObject = (JsonObject) next;
          val = decoder.decode(jsonObject);
          break;
        }
        default:
          throw new DecodingException("Wrong type: " + next.getValueType()
              + "; expected array, but got: " + next);
      }

      forEach.consume(val);
    }

    return this;
  }

  @Override
  public void close() throws IOException {
    if (parser != null) {
      parser.close();
    }
  }
}
