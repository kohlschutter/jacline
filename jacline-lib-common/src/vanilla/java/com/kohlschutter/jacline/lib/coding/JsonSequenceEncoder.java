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

import java.math.BigDecimal;
import java.math.BigInteger;

import com.kohlschutter.jacline.annotations.JsIgnoreType;

import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;

@JsIgnoreType
public final class JsonSequenceEncoder implements SequenceEncoder {
  private static final JsonProvider PROVIDER = JsonProvider.provider();
  private final JsonArrayBuilder builder;
  private final JsonSequenceEncoder parent;

  public JsonSequenceEncoder() {
    this(null);
  }

  private JsonSequenceEncoder(JsonSequenceEncoder parent) {
    this.builder = PROVIDER.createArrayBuilder();
    this.parent = parent;
  }

  @Override
  public SequenceEncoder encodeStrings(String... values) {
    for (String value : values) {
      if (value == null) {
        builder.addNull();
      } else {
        builder.add(value);
      }
    }
    return this;
  }

  @Override
  public SequenceEncoder encodeBooleans(Boolean... values) {
    for (Boolean value : values) {
      if (value == null) {
        builder.addNull();
      } else {
        builder.add(value);
      }
    }
    return this;
  }

  @Override
  public SequenceEncoder encodeNumbers(Number... values) {
    for (Number value : values) {
      if (value == null) {
        builder.addNull();
      } else if (value instanceof Integer) {
        builder.add(value.intValue());
      } else if (value instanceof Long) {
        builder.add(value.longValue());
      } else if (value instanceof Float) {
        builder.add(value.floatValue());
      } else if (value instanceof BigInteger) {
        builder.add((BigInteger) value);
      } else if (value instanceof BigDecimal) {
        builder.add((BigDecimal) value);
      } else if (value instanceof Short) {
        builder.add(value.shortValue());
      } else {
        builder.add(value.doubleValue());
      }
    }
    return this;
  }

  @Override
  public SequenceEncoder beginEncodeArray() {
    return new JsonSequenceEncoder(this);
  }

  @Override
  public SequenceEncoder encodeObjects(ObjectEncoder encoder, Object... objects)
      throws CodingException {
    for (Object obj : objects) {
      if (obj == null) {
        builder.addNull();
      } else {
        try (JsonKeyEncoder enc = new JsonKeyEncoder(null)) {
          encoder.encode(enc);
          builder.add(enc.getEncoded());
        }
      }
    }
    return this;
  }

  @Override
  public SequenceEncoder end() {
    JsonSequenceEncoder p = this.parent;
    if (p != null) {
      p.builder.add(this.builder);
      return p;
    } else {
      return this;
    }
  }

  @Override
  public JsonValue getEncoded() {
    return builder.build();
  }
}
