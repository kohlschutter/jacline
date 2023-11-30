package com.kohlschutter.jacline.lib.common;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface ArrayCreator<T> {
  T[] newArray(int size);
}