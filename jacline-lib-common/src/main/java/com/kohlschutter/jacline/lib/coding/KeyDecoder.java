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

public interface KeyDecoder extends Closeable {
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

  CodingServiceProvider provider();

  @Override
  default void close() throws CodingException {
  }
}
