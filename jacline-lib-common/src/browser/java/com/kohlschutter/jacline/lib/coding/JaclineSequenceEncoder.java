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

import elemental2.core.JsArray;

public final class JaclineSequenceEncoder implements SequenceEncoder {
  private final JaclineSequenceEncoder parent;
  private JsArray<Object> array;

  public JaclineSequenceEncoder() {
    this(null);
  }

  private JaclineSequenceEncoder(JaclineSequenceEncoder parent) {
    this.parent = parent;
    this.array = JsArray.of();
  }

  @Override
  public SequenceEncoder encodeStrings(String... values) {
    for (String value : values) {
      array.push(value);
    }
    return this;
  }

  @Override
  public SequenceEncoder encodeBooleans(Boolean... values) {
    for (Boolean value : values) {
      array.push(value);
    }
    return this;
  }

  @Override
  public SequenceEncoder encodeNumbers(Number... values) {
    for (Number value : values) {
      array.push(value);
    }
    return this;
  }

  @Override
  public SequenceEncoder beginEncodeArray() {
    return new JaclineSequenceEncoder(this);
  }

  @Override
  public SequenceEncoder encodeObjects(ObjectEncoder encoder, Object... objects)
      throws CodingException {
    try (JaclineKeyEncoder enc = new JaclineKeyEncoder(null)) {
      encoder.encode(enc);
      array.push(enc.getEncoded());
    }
    return this;
  }

  @Override
  public SequenceEncoder end() {
    JaclineSequenceEncoder p = this.parent;
    if (p != null) {
      p.array.push(this.array);
    }
    return p;
  }

  @Override
  public Object getEncoded() {
    return array;
  }
}
