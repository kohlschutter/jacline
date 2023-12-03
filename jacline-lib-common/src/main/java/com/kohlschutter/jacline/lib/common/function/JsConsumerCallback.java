package com.kohlschutter.jacline.lib.common.function;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface JsConsumerCallback<T> {

  /**
   * Performs this operation on the given argument.
   *
   * @param t the input argument
   */
  void accept(T t);
}
