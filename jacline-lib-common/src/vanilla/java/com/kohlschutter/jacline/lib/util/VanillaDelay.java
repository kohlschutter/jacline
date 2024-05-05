package com.kohlschutter.jacline.lib.util;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.kohlschutter.jacline.annotations.JsIgnoreType;

@JsIgnoreType
final class VanillaDelay {
  private static final ScheduledExecutorService EXECUTOR = Executors.newScheduledThreadPool(0);
  private final ScheduledFuture<?> schedule;

  VanillaDelay() {
    schedule = null;
  }

  VanillaDelay(int delay, Callable<?> op) {
    schedule = EXECUTOR.schedule(op, delay, TimeUnit.MILLISECONDS);
  }

  VanillaDelay(int delay, Runnable op) {
    schedule = EXECUTOR.schedule(op, delay, TimeUnit.MILLISECONDS);
  }

  boolean cancel() {
    if (schedule != null) {
      return schedule.cancel(false);
    } else {
      return false;
    }
  }
}
