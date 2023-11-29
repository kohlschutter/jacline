package com.kohlschutter.jacline.lib.common;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ArrayEncoder {
  Object encode(Object[] serialized);
}
