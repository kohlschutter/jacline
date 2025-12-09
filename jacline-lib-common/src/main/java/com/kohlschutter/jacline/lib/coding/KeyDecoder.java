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

import java.io.Closeable;

/**
 * Encodes object-like types that are safe to use in multiple serialization formats and
 * implementations, such as JSON, and especially for the interaction between JavaScript and Java.
 * 
 * @author Christian Kohlschütter
 */
public interface KeyDecoder extends KeyDecoderProvider, Closeable {
  /**
   * Designates "any" coded type is valid.
   */
  String ANY_CODED_TYPE = null;

  /**
   * Returns the type of the encoded object, which could be a fully-qualified Java class name, for
   * example.
   * 
   * @return The coded type.
   * @throws CodingException on error.
   */
  String getCodedType() throws CodingException;

  /**
   * Checks if the type of the encoded object matches the expected one, failing with a
   * {@link CodingException} if not.
   * 
   * @param expectedCodedType The expected type.
   * @throws CodingException on error.
   */
  default void assertCodedType(String expectedCodedType) throws CodingException {
    String codedType = getCodedType();
    if (codedType != null && !expectedCodedType.equals(codedType)) {
      throw CodingException.withUnexpectedType(expectedCodedType, codedType);
    }
  }

  String stringForKey(String key) throws CodingException;

  Boolean booleanForKey(String key) throws CodingException;

  Number numberForKey(String key) throws CodingException;

  default int intForKey(String key) throws CodingException {
    Number num = numberForKey(key);
    if (num == null) {
      return 0;
    } else {
      return num.intValue();
    }
  }

  <T> T[] arrayForKey(String key, ArrayDecoder<T> decoder) throws CodingException;

  <T> T objectForKey(String key, ObjectDecoder<T> decoder) throws CodingException;

  boolean hasKey(String key) throws CodingException;

  void markAdvisory(CodingAdvisory advisory) throws CodingException;

  @Override
  default void close() throws CodingException {
  }

  SequenceDecoder sequenceDecoder(Object encoded) throws CodingException;
}
