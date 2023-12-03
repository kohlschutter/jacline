package com.kohlschutter.jacline.lib.common.pledge;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ThenableCallback<T> {
  void call(T arg);
}
