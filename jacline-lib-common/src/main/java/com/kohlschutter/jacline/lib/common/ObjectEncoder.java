package com.kohlschutter.jacline.lib.common;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ObjectEncoder {
  Object encode(Object obj);
}
