package com.kohlschutter.jacline.lib.common.function;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface JsFunctionCallback<T, R> {

  /**
   * Applies this function to the given argument.
   *
   * @param t the function argument
   * @return the function result
   */
  R apply(T t);
}
