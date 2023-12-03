package com.kohlschutter.jacline.lib.common.pledge;

import com.kohlschutter.jacline.annotations.JsExport;

import jsinterop.annotations.JsMethod;

@FunctionalInterface
public interface Thenable<T> {
  @JsExport
  @JsMethod(name = "then")
  void then(ThenableCallback<T> onFulfilled, ThenableCallback<Object> onRejected);
}
