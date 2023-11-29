package com.kohlschutter.jacline.lib.common;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ArrayDecoder {
  Object[] decode(Object serialized);
}
