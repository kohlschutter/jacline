package com.kohlschutter.jacline.lib.common;

import jsinterop.annotations.JsType;

@JsType
public class StandardArrayEncoders {
  public static Object strings(Object[] array) {
    SequenceEncoder sec = SequenceEncoder.begin();
    for (Object obj : array) {
      sec.encodeStrings(obj == null ? null : obj.toString());
    }
    sec.end();
    return sec.getEncoded();
  }
}
