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

import com.kohlschutter.jacline.lib.json.JSON;
import com.kohlschutter.jacline.lib.log.CommonLog;

import jsinterop.base.JsPropertyMap;

public final class JaclineKeyDecoder implements KeyDecoder {
  private final JsPropertyMap<?> object;
  private final String expectedCodedType;

  public JaclineKeyDecoder(String expectedCodedType, Object encoded) throws CodingException {
    this.expectedCodedType = expectedCodedType;
    if (encoded == null) {
      object = null;
    } else if (encoded instanceof String) {
      object = (JsPropertyMap<?>) JSON.parse(String.valueOf(encoded));
    } else {
      object = (JsPropertyMap<?>) encoded;
    }

    if (expectedCodedType != null && object != null) {
      assertCodedType(expectedCodedType);
    }
  }

  private boolean isNull(String key) {
    return object == null || !object.has(key) || object.get(key) == null;
  }

  @Override
  public String stringForKey(String key) {
    return isNull(key) ? null : String.valueOf(object.get(key));
  }

  @Override
  public Boolean booleanForKey(String key) {
    if (isNull(key)) {
      return null;
    }
    Object obj = object.get(key);
    if (obj instanceof Boolean) {
      return ((Boolean) obj);
    } else {
      return Boolean.valueOf(String.valueOf(obj));
    }
  }

  @Override
  public Number numberForKey(String key) {
    if (isNull(key)) {
      return null;
    }
    Object obj = object.get(key);
    if (obj instanceof Number) {
      return ((Number) obj);
    } else {
      return Double.valueOf(String.valueOf(obj)); // FIXME?
    }
  }

  @Override
  @SuppressWarnings("PMD.ReturnEmptyCollectionRatherThanNull")
  public <T> T[] arrayForKey(String key, ArrayDecoder<T> decoder) throws CodingException {
    if (isNull(key)) {
      return null;
    }
    Object jsonArray = object.get(key);
    return decoder.decode(jsonArray);
  }

  @SuppressWarnings("null")
  @Override
  public <T> T objectForKey(String key, ObjectDecoder<T> decoder) throws CodingException {
    if (isNull(key)) {
      return null;
    }
    Object jsonObject = object.get(key);
    return decoder.decode(jsonObject);
  }

  @Override
  public boolean hasKey(String key) {
    return object != null && object.has(key);
  }

  @Override
  public void markAdvisory(CodingAdvisory advisory) throws CodingException {
    if (CommonLog.isWarnEnabled()) {
      CommonLog.warn("CodingAdvisory while decoding " + expectedCodedType, advisory);
    }
  }

  @Override
  public SequenceDecoder sequenceDecoder(Object encoded) throws CodingException {
    return new JaclineSequenceDecoder(encoded);
  }

  @Override
  public KeyDecoder keyDecoder(String type, Object encoded) throws CodingException {
    return new JaclineKeyDecoder(type, encoded);
  }

  @Override
  public String getCodedType() throws CodingException {
    return stringForKey("javaClass");
  }
}
