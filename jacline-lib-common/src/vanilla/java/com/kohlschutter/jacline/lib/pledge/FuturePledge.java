package com.kohlschutter.jacline.lib.pledge;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

import com.kohlschutter.jacline.lib.function.JsConsumerCallback;
import com.kohlschutter.jacline.lib.function.JsFunctionCallback;
import com.kohlschutter.jacline.lib.function.JsRunnable;

/**
 * A {@link Pledge} that is implemented as a {@link CompletableFuture}.
 * 
 * @param <T> The return type.
 * @author Christian Kohlschütter
 */
public class FuturePledge<T> implements Pledge<T> {
  private final CompletableFuture<T> future;

  private FuturePledge(CompletableFuture<T> future) {
    this.future = future;
  }

  public static <T> FuturePledge<T> ofCompletableFuture(CompletableFuture<T> future) {
    return new FuturePledge<>(future);
  }

  public static <T> FuturePledge<T> supplyCompleted(T obj) {
    CompletableFuture<T> future = new CompletableFuture<T>();
    future.complete(obj);
    return ofCompletableFuture(future);
  }

  public static <T> Pledge<T> supplyAsyncThenable(Thenable<T> thenable) {
    CompletableFuture<T> future = new CompletableFuture<T>();
    FuturePledge<T> pledge = FuturePledge.ofCompletableFuture(future);

    JsConsumerCallback<T> onFulfilled = future::complete;
    JsConsumerCallback<Object> onRejected = (o) -> {
      future.completeExceptionally(Pledge.asThrowable(o));
    };

    ForkJoinPool.commonPool().submit(() -> thenable.then(onFulfilled, onRejected));

    return pledge;
  }

  public static <T> FuturePledge<T> supplyAsync(Supplier<T> supplier) {
    return ofCompletableFuture(CompletableFuture.supplyAsync(supplier));
  }

  @Override
  public <U> Pledge<U> then(JsFunctionCallback<? super T, ? extends U> function) {
    return new FuturePledge<>(future.thenApply(function::apply));
  }

  @Override
  public Pledge<T> exceptionally(JsFunctionCallback<Object, T> function) {
    return new FuturePledge<>(future.exceptionally(function::apply));
  }

  @Override
  public Pledge<Void> lastly(JsRunnable runnable) {
    return new FuturePledge<>(future.thenAccept((x) -> runnable.run()));
  }
}
