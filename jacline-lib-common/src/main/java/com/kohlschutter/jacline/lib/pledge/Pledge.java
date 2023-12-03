package com.kohlschutter.jacline.lib.pledge;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;
import com.kohlschutter.jacline.annotations.JsImport;
import com.kohlschutter.jacline.annotations.JsPatched;
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
@JsType(isNative = true, namespace = "kohlschutter.promise", name = "Pledge")
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
  static <T> Pledge<T> resolveObject(T obj) {
    return FuturePledge.supplyCompleted(obj);
  }

  @JsImplementationProvidedSeparately
  static <T> Pledge<T> resolveThenable(Class<T> outputClass, Thenable<T> thenable) {
    return FuturePledge.supplyAsyncThenable(thenable);
  }

  @JsImplementationProvidedSeparately
  static Throwable asThrowable(Object o) {
    return o == null || o instanceof Throwable ? (Throwable) o : new FuturePledgeWrapperException(
        o);
  }

  @JsImplementationProvidedSeparately
  static Object asObject(Object o) {
    return o instanceof FuturePledgeWrapperException ? ((FuturePledgeWrapperException) o)
        .getObject() : o;
  }
}
