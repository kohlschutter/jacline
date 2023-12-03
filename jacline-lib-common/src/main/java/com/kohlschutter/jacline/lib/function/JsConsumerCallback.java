package com.kohlschutter.jacline.lib.function;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface JsConsumerCallback<T> {

  /**
   * Consumes the given argument.
   *
   * @param t the input argument
   */
  void consume(T t);
}

