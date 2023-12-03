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
import java.util.Objects;

import com.kohlschutter.jacline.annotations.JsIgnoreType;

import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;

@JsIgnoreType
public final class JsonKeyEncoder implements KeyEncoder {
  private static final JsonProvider PROVIDER = JsonProvider.provider();
  private final JsonKeyEncoder parent;
  private final JsonObjectBuilder builder;
  private final String parentKey;

  public JsonKeyEncoder(String type) {
    this(type, null, null);
  }

  private JsonKeyEncoder(String type, JsonKeyEncoder parent, String parentKey) {
    this.parent = parent;
    this.parentKey = parentKey;
    if (parent != null) {
      Objects.requireNonNull(parentKey);
    }
    this.builder = PROVIDER.createObjectBuilder();
    if (type != null) {
      encodeString("javaClass", type);
    }
  }

  @Override
  public KeyEncoder encodeString(String key, String value) {
    if (value == null) {
      builder.addNull(key);
    } else {
      builder.add(key, value);
    }
    return this;
  }

  @Override
  public KeyEncoder encodeBoolean(String key, Boolean value) {
    if (value == null) {
      builder.addNull(key);
    } else {
      builder.add(key, value);
    }
    return this;
  }

  @Override
  public KeyEncoder encodeNumber(String key, Number value) {
    if (value == null) {
      builder.addNull(key);
    } else if (value instanceof Integer) {
      builder.add(key, value.intValue());
    } else if (value instanceof Long) {
      builder.add(key, value.longValue());
    } else if (value instanceof Float) {
      builder.add(key, value.floatValue());
    } else if (value instanceof BigInteger) {
      builder.add(key, (BigInteger) value);
    } else if (value instanceof BigDecimal) {
      builder.add(key, (BigDecimal) value);
    } else if (value instanceof Short) {
      builder.add(key, value.shortValue());
    } else {
      builder.add(key, value.doubleValue());
    }
    return this;
  }

  @Override
  public KeyEncoder encodeArray(String key, ArrayEncoder encoder, Object[] array) {
    if (array == null) {
      builder.addNull(key);
    } else {
      Object encoded = encoder.encode(array);
      if (encoded == null) {
        builder.addNull(key);
      } else {
        builder.add(key, (JsonValue) encoded);
      }
    }
    return this;
  }

  @Override
  public KeyEncoder beginEncodeObject(String key, String type) {
    return new JsonKeyEncoder(type, this, key);
  }

  @Override
  public KeyEncoder end() {
    JsonKeyEncoder p = this.parent;
    if (p != null) {
      p.builder.add(parentKey, this.builder);
    }
    return p;
  }

  @Override
  public JsonObject getEncoded() {
    return builder.build();
  }
}
