package com.kohlschutter.jacline.lib.pledge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
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
final class FuturePledge<T> implements Pledge<T> {
  private final CompletableFuture<T> future;

  private FuturePledge(CompletableFuture<T> future) {
    this.future = future;
  }

  static <T> FuturePledge<T> ofCompletableFuture(CompletableFuture<T> future) {
    return new FuturePledge<>(future);
  }

  static <T> FuturePledge<T> supplyCompleted(T obj) {
    CompletableFuture<T> future = new CompletableFuture<T>();
    future.complete(obj);
    return ofCompletableFuture(future);
  }

  static <T> Pledge<T> supplyAsyncThenable(Thenable<T> thenable) {
    CompletableFuture<T> future = new CompletableFuture<T>();
    FuturePledge<T> pledge = FuturePledge.ofCompletableFuture(future);

    JsConsumerCallback<T> onFulfilled = (o) -> {
      future.complete(o);
    };
    JsConsumerCallback<Object> onRejected = (o) -> {
      future.completeExceptionally(Pledge.asThrowable(o));
    };

    ForkJoinPool.commonPool().submit(() -> thenable.then(onFulfilled, onRejected));

    return pledge;
  }

  static <T> FuturePledge<T> supplyAsync(Supplier<T> supplier) {
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

  public static <T> Pledge<T> supplyRejected(Object obj) {
    CompletableFuture<T> future = new CompletableFuture<T>();
    future.completeExceptionally(Pledge.asThrowable(obj));
    return ofCompletableFuture(future);
  }

  private static <T> CompletableFuture<T>[] unwrap(Pledge<T>[] pledges) {
    @SuppressWarnings({"unchecked"})
    CompletableFuture<T>[] futures =
        (CompletableFuture<T>[]) new CompletableFuture<?>[pledges.length];
    int i = 0;
    for (Pledge<T> pledge : pledges) {
      if (!(pledge instanceof FuturePledge<?>)) {
        throw new ClassCastException("Unsupported Pledge type: " + pledge.getClass());
      }
      futures[i++] = ((FuturePledge<T>) pledge).future;
    }
    return futures;
  }

  static <T> Pledge<T> firstToSettle(Pledge<T>[] pledges) {
    if (pledges.length == 0) {
      return supplyRejected(new IllegalArgumentException("No futures specified"));
    }

    @SuppressWarnings("unchecked")
    CompletableFuture<T> future = (CompletableFuture<T>) CompletableFuture.anyOf(unwrap(pledges));
    return ofCompletableFuture(future);
  }

  static <T> Pledge<T[]> supplyAllOf(Class<T> resultType, Pledge<T>[] pledges) {
    CompletableFuture<T>[] unwrappedFutures = unwrap(pledges);
    @SuppressWarnings({"unchecked"})
    CompletableFuture<T>[] unwrappedFuturesPlus1 =
        (CompletableFuture[]) new CompletableFuture<?>[unwrappedFutures.length + 1];

    CompletableFuture<T> additionalFuture = new CompletableFuture<T>();

    AtomicInteger remaining = new AtomicInteger(unwrappedFutures.length);

    @SuppressWarnings("null")
    final T nullResult = null;

    @SuppressWarnings("unchecked")
    T[] results = (T[]) Array.newInstance(resultType, unwrappedFutures.length);
    for (int i = 0, n = unwrappedFutures.length; i < n; i++) {
      final int index = i;
      CompletableFuture<T> cfOrig = unwrappedFutures[i];

      cfOrig.thenAccept((t) -> {
        results[index] = t;
        if (remaining.decrementAndGet() == 0) {
          additionalFuture.complete(nullResult);
        }
      });

      unwrappedFuturesPlus1[i] = cfOrig;
    }
    unwrappedFuturesPlus1[unwrappedFutures.length] = additionalFuture;

    if (unwrappedFutures.length == 0) {
      additionalFuture.complete(nullResult);
    }

    @SuppressWarnings("cast")
    CompletableFuture<T[]> future = (CompletableFuture<T[]>) CompletableFuture.allOf(
        unwrappedFuturesPlus1).thenApply((v) -> {
          return results;
        });
    return ofCompletableFuture(future);
  }

  static <T> Pledge<T> firstToSucceed(Pledge<T>[] pledges) {
    if (pledges.length == 0) {
      return supplyRejected(new IllegalArgumentException("No futures specified"));
    }

    CompletableFuture<T>[] unwrappedFutures = unwrap(pledges);

    List<Throwable> failures = Collections.synchronizedList(new ArrayList<>());
    AtomicInteger failedCountdown = new AtomicInteger(unwrappedFutures.length);
    for (int i = 0, n = unwrappedFutures.length; i < n; i++) {
      CompletableFuture<T> cfOrig = unwrappedFutures[i];
      if (cfOrig.isDone() && !cfOrig.isCompletedExceptionally()) {
        continue;
      }
      CompletableFuture<T> cfNew = new CompletableFuture<T>();
      cfOrig.thenAccept((t) -> {
        cfNew.complete(t);
      }).exceptionally((t) -> {
        failures.add(t);
        if (failedCountdown.decrementAndGet() == 0) {
          // all failed

          IllegalStateException cex = new IllegalStateException(
              "All futures completed exceptionally");
          for (Throwable failure : failures) {
            cex.addSuppressed(failure);
          }
          cfNew.completeExceptionally(cex);
        }
        return null;
      });
      unwrappedFutures[i] = cfNew;
    }

    @SuppressWarnings("unchecked")
    CompletableFuture<T> future = (CompletableFuture<T>) CompletableFuture.anyOf(unwrappedFutures);
    return ofCompletableFuture(future);
  }
}
