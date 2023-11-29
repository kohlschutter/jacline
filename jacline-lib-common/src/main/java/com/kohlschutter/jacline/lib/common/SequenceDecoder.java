package com.kohlschutter.jacline.lib.common;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "kohlschutter.coding", name = "SequenceDecoder")
public interface SequenceDecoder {
  int size();

  SequenceDecoder strings(int count);

  SequenceDecoder booleans(int count);

  SequenceDecoder numbers(int count);

  SequenceDecoder arrays(int count, ArrayDecoder decoder);

  SequenceDecoder objects(int count, String expectedCodedType, ObjectDecoder decoder);

  Object[] getArray();

  @JsImplementationProvidedSeparately
  static SequenceDecoder load(Object serialized) {
    throw new UnsupportedOperationException("Not yet implemented for vanilla Java");
  }
}
