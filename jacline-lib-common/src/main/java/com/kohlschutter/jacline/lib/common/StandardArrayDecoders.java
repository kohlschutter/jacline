package com.kohlschutter.jacline.lib.common;

import jsinterop.annotations.JsType;

@JsType
public class StandardArrayDecoders {
  public static Object[] strings(Object serialized) {
    return SequenceDecoder.load(serialized).strings(-1).getArray();
  }
}
