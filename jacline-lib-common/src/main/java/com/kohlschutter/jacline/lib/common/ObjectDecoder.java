package com.kohlschutter.jacline.lib.common;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ObjectDecoder {
  Object decode(Object serialized);
}
