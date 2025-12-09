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

import java.util.Collection;
import java.util.Objects;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;

import jsinterop.base.JsPropertyMap;

public final class JaclineKeyEncoder implements KeyEncoder {
  private final JaclineKeyEncoder parent;
  private final String parentKey;
  private final JsPropertyMap<Object> object = JsPropertyMap.of();

  public JaclineKeyEncoder(String type) {
    this(type, null, null);
  }

  private JaclineKeyEncoder(String type, JaclineKeyEncoder parent, String parentKey) {
    this.parent = parent;
    this.parentKey = parentKey;
    if (parent != null) {
      Objects.requireNonNull(parentKey);
    }
    if (type != null) {
      encodeString("javaClass", type);
    }
  }

  @Override
  public KeyEncoder encodeString(String key, String value) {
    object.set(key, value);
    return this;
  }

  @Override
  public KeyEncoder encodeBoolean(String key, Boolean value) {
    object.set(key, value);
    return this;
  }

  @Override
  public KeyEncoder encodeNumber(String key, Number value) {
    object.set(key, value);
    return this;
  }

  @Override
  public KeyEncoder encodeArray(String key, ArrayEncoder encoder, Object[] array)
      throws CodingException {
    if (array == null) {
      object.set(key, (Collection<?>) null);
    } else {
      Object encoded = encoder.encode(array);
      object.set(key, encoded);
    }
    return this;
  }

  @Override
  public KeyEncoder beginEncodeObject(String key, String type) {
    return new JaclineKeyEncoder(type, this, key);
  }

  @Override
  public KeyEncoder end() {
    JaclineKeyEncoder p = this.parent;
    if (p != null) {
      p.object.set(parentKey, this.object);
      return p;
    } else {
      return this;
    }
  }

  @SuppressFBWarnings("EI_EXPOSE_REP")
  @Override
  public JsPropertyMap<Object> getEncoded() {
    return object;
  }

  @Override
  public void markAdvisory(CodingAdvisory advisory) throws CodingException {
  }

  @Override
  public SequenceEncoder sequenceEncoder() throws CodingException {
    return new JaclineSequenceEncoder();
  }

  @Override
  public KeyEncoder keyEncoder(String type) throws CodingException {
    return new JaclineKeyEncoder(type);
  }
}
