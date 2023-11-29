package com.kohlschutter.jacline.lib.common;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "kohlschutter.coding", name = "KeyDecoder")
public interface KeyDecoder {
  String stringForKey(String key);

  Boolean booleanForKey(String key);

  Number numberForKey(String key);

  Object[] arrayForKey(String key, ArrayDecoder decoderProvider);

  Object objectForKey(String key, String expectedCodedType, ObjectDecoder decoder);

  boolean hasKey(String key);

  @JsImplementationProvidedSeparately
  static KeyDecoder load(String expectedCodedType, Object serialized) {
    throw new UnsupportedOperationException(); // code for Java, not JavaScript
  }
}
