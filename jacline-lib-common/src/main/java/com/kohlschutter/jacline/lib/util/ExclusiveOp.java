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

/**
 * Helper to schedule some exclusive operation, which may be requested via multiple
 * delayed/asynchronous tasks. If there are multiple concurrent requests, only the most recently
 * requested operation should be permitted.
 *
 * @author Christian Kohlschütter
 */
public interface ExclusiveOp {
  /**
   * Cancels the currently scheduled operation.
   */
  void cancel();

  /**
   * Schedules an operation immediately (with zero delay).
   *
   * @param callback The operation.
   */
  void schedule(Runnable callback);

  /**
   * Schedules an operation with the given delay (in milliseconds).
   *
   * @param delay The delay, in milliseconds.
   * @param callback The operation.
   */
  void schedule(double delay, Runnable callback);

  static ExclusiveOp newInstance() {
    return JaclineUtil.isJavaScriptEnvironment() ? new JsExclusiveOp() : new VanillaExclusiveOp();
  }

  /**
   * Begins a separately scheduled operation, and returns some ID that can be later checked with
   * {@link #isCurrent(Object)}.
   *
   * @return The reservation id;
   */
  Object reserve();

  /**
   * Checks if the given reservation ID is valid.
   *
   * @param reservationId The reservation id.
   * @return {@code true} if valid.
   */
  boolean isCurrent(Object reservationId);

  default void runIfCurrent(Object reservationId, Runnable op) {
    if (isCurrent(reservationId)) {
      op.run();
    }
  }
}
