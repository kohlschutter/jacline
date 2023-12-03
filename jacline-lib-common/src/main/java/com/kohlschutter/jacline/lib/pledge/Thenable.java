package com.kohlschutter.jacline.lib.pledge;

import com.kohlschutter.jacline.annotations.JsExport;
import com.kohlschutter.jacline.lib.function.JsConsumerCallback;

import jsinterop.annotations.JsMethod;

@FunctionalInterface
public interface Thenable<T> {
  @JsExport
  @JsMethod(name = "then")
  void then(JsConsumerCallback<T> onFulfilled, JsConsumerCallback<Object> onRejected);
}
