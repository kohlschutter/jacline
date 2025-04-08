package com.kohlschutter.jacline.lib.util;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;
import com.kohlschutter.jacline.annotations.JsPatched;

import elemental2.core.ArrayBuffer;

@JsPatched
public final class ArrayBufferUtil {
  private ArrayBufferUtil() {
  }
  
  @JsImplementationProvidedSeparately
  public static String encodeArrayBufferToUrlSafeBase64(ArrayBuffer arrayBuffer) {
    // FIXME provide vanilla implementation
    throw new UnsupportedOperationException();
  }

  @JsImplementationProvidedSeparately
  public static ArrayBuffer decodeUrlSafeBase64ToArrayBuffer(String base64) {
    // FIXME provide vanilla implementation
    throw new UnsupportedOperationException();
  }
}
