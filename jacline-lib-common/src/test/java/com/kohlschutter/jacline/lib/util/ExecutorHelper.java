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
package com.kohlschutter.jacline.lib.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.kohlschutter.jacline.lib.function.JsConsumerCallback;

import jsinterop.annotations.JsType;

@JsType
public final class ExecutorHelper {
  private static final ScheduledExecutorService EXECUTOR = Executors.newScheduledThreadPool(0);

  private ExecutorHelper() {
  }

  public static <T> void executeDelayed(JsConsumerCallback<T> callback, long delayMillis,
      T payload) {
    EXECUTOR.schedule(() -> {
      callback.consume(payload);
    }, delayMillis, TimeUnit.MILLISECONDS);
  }
}
