package com.kohlschutter.jacline.lib.common;

import java.util.HashMap;
import java.util.Map;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "kohlschutter.coding", name = "Dictionary")
public interface Dictionary<V> {
  boolean containsKey(String k);

  V get(String k);

  void put(String k, V v);

  void remove(String k);

  @JsImplementationProvidedSeparately
  public static <V> Dictionary<V> newDictionary() {
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
