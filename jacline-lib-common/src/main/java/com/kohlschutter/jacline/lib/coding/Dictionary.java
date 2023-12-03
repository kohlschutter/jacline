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

import java.util.HashMap;
import java.util.Map;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;

import jsinterop.annotations.JsType;

/**
 * A simple dictionary implementation, using strings as keys, and a generic type for values.
 *
 * @param <V> The value type.
 * @author Christian Kohlschütter
 */
@JsType(isNative = true, namespace = "kohlschutter.coding", name = "Dictionary")
public interface Dictionary<V> {
  boolean containsKey(String k);

  V get(String k);

  void put(String k, V v);

  void remove(String k);

  @JsImplementationProvidedSeparately
  static <V> Dictionary<V> newDictionary() {
    Map<String, V> map = new HashMap<String, V>();
    return new Dictionary<V>() {

      @Override
      public boolean containsKey(String k) {
        return map.containsKey(k);
      }

      @Override
      public V get(String k) {
        return map.get(k);
      }

      @Override
      public void put(String k, V v) {
        map.put(k, v);
      }

      @Override
      public void remove(String k) {
        map.remove(k);
      }
    };
  }
}
