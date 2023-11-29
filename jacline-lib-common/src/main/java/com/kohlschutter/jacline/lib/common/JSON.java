package com.kohlschutter.jacline.lib.common;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "JSON", namespace = JsPackage.GLOBAL)
public class JSON {
  public static native String stringify(Object... obj);

  public static native Object parse(String json);
}
