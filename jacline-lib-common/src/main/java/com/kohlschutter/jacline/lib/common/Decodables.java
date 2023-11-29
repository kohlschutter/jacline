package com.kohlschutter.jacline.lib.common;

import com.kohlschutter.jacline.annotations.JsExport;

import jsinterop.annotations.JsType;

@JsExport
@JsType(name = "Decodables", namespace = "kohlschutter.coding")
public final class Decodables {
  private static final Dictionary<ObjectDecoder> MAP = Dictionary.newDictionary();

  @JsExport
  public static ObjectDecoder getDecoder(String type) {
    return MAP.get(type);
  }

  public static void setDecoder(String type, ObjectDecoder dec) {
    MAP.put(type, dec);
  }
}
