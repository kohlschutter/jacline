package com.kohlschutter.jacline.lib.common;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "kohlschutter.coding", name = "SequenceEncoder")
public interface SequenceEncoder {
  /**
   * Encodes a string (or {@code null}).
   * 
   * @param value The value.
   * @return This encoder.
   */
  SequenceEncoder encodeStrings(String... value);

  /**
   * Encodes a boolean (or {@code null}).
   * 
   * @param value The value.
   * @return This encoder.
   */
  SequenceEncoder encodeBooleans(Boolean... value);

  /**
   * Encodes a number (or {@code null}).
   * 
   * @param value The value.
   * @return This encoder.
   */
  SequenceEncoder encodeNumbers(Number... value);

  /**
   * Encodes an array (or {@code null}).
   * 
   * @param key The key, or {@code null}
   * @param value The value.
   * @return A new sub-encoder.
   */
  SequenceEncoder beginEncodeArray();

  /**
   * Returns a new encoder that can encode the object stored under the given key.
   * 
   * @param encoder The object encoder
   * @param obj The objects
   * @return This encoder.
   */
  SequenceEncoder encodeObjects(ObjectEncoder encoder, Object... obj);

  /**
   * Ends any {@link #beginEncodeArray()} block, returning the parent encoder, or the same encoder
   * if it's the root encoder.
   * 
   * @return The parent or this encoder.
   */
  SequenceEncoder end();

  /**
   * Returns the encoded representation for the data encoded by this encoder.
   * 
   * @return The object.
   */
  Object getEncoded();

  @JsImplementationProvidedSeparately
  static SequenceEncoder begin() {
    throw new UnsupportedOperationException("Not yet implemented for vanilla Java");
  }
}
