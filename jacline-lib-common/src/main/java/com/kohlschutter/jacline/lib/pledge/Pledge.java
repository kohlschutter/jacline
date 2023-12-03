/*
 * jacline-lib-common
 *
 * Copyright 2023 Christian Kohlschütter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kohlschutter.jacline.lib.pledge;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;
import com.kohlschutter.jacline.annotations.JsImport;
import com.kohlschutter.jacline.annotations.JsPatched;
import com.kohlschutter.jacline.lib.exception.JsException;
import com.kohlschutter.jacline.lib.function.JsConsumerCallback;
import com.kohlschutter.jacline.lib.function.JsFunctionCallback;
import com.kohlschutter.jacline.lib.function.JsRunnable;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

/**
 * A {@link Pledge} is similar to a JavaScript {@code promise} or Java {@code CompletableFuture},
 * and even implemented as one of them, depending on the platform.
 *
 * @param <T> The expected return type.
 * @author Christian Kohlschütter
 */
@JsType(isNative = true, namespace = "kohlschutter.pledge", name = "Pledge")
@JsImport
@JsPatched
public interface Pledge<T> {
  @JsMethod(name = "then")
  <U> Pledge<U> then(JsFunctionCallback<? super T, ? extends U> function);

  @JsOverlay
  default Pledge<Void> thenAccept(JsConsumerCallback<? super T> action) {
    return then((t) -> {
      action.consume(t);
      return null;
    });
  }

  @JsMethod(name = "catch")
  Pledge<T> exceptionally(JsFunctionCallback<Object, T> function);

  @SuppressWarnings({"unchecked", "null"})
  @JsOverlay
  default Pledge<Void> exceptionallyAccept(JsConsumerCallback<Object> error) {
    return (Pledge<Void>) exceptionally((Object t) -> {
      error.consume(t);
      return null;
    });
  }

  @JsMethod(name = "finally")
  Pledge<Void> lastly(JsRunnable action);

  @JsImplementationProvidedSeparately
  static <T> Pledge<T> ofResult(T obj) {
    return FuturePledge.supplyCompleted(obj);
  }

  @JsImplementationProvidedSeparately
  static <T> Pledge<T> ofThenable(Thenable<T> thenable) {
    return FuturePledge.supplyAsyncThenable(thenable);
  }

  @JsImplementationProvidedSeparately
  static <T> Pledge<T> ofRejected(Object obj) {
    return FuturePledge.<T>supplyRejected(obj);
  }

  @JsImplementationProvidedSeparately
  static <T> Pledge<T[]> allOf(Class<T> resultType, Pledge<T>[] pledges) {
    return FuturePledge.<T>supplyAllOf(resultType, pledges);
  }

  @JsImplementationProvidedSeparately
  static <T> Pledge<T> firstToSettle(Pledge<T>[] pledges) {
    return FuturePledge.<T>firstToSettle(pledges);
  }

  @JsImplementationProvidedSeparately
  static <T> Pledge<T> firstToSucceed(Pledge<T>[] pledges) {
    return FuturePledge.<T>firstToSucceed(pledges);
  }

  @SafeVarargs
  @SuppressWarnings("cast")
  @JsOverlay
  static <T> Pledge<T>[] group(Pledge<T>... pledges) {
    return (Pledge<T>[]) pledges;
  }

  @JsImplementationProvidedSeparately
  static Throwable asThrowable(Object o) {
    return o instanceof Throwable ? (Throwable) o : JsException.wrap(o);
  }

  @JsImplementationProvidedSeparately
  static Object asObject(Object o) {
    return JsException.unwrap(o);
  }
}
