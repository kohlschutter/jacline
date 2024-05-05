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

import elemental2.dom.DomGlobal;

/**
 * Helper to schedule some delayed task, which may be rescheduled/replaced by some other operation.
 * 
 * @author Christian Kohlschütter
 */
final class ExclusiveJsDelay implements ExclusiveDelay {
  private volatile double timeoutID = -1;

  ExclusiveJsDelay() {
  }

  /**
   * Cancels the scheduled operation.
   */
  @Override
  public synchronized void cancel() {
    if (timeoutID != -1) {
      DomGlobal.clearTimeout(timeoutID);
      timeoutID = -1;
    }
  }

  /**
   * Schedules an operation immediately (with zero delay).
   *
   * @param callback The operation.
   */
  @Override
  public void schedule(Runnable callback) {
    schedule(0, callback);
  }

  /**
   * Schedules an operation with the given delay (in milliseconds).
   *
   * @param delay The delay, in milliseconds.
   * @param callback The operation.
   */
  @Override
  public synchronized void schedule(double delay, Runnable callback) {
    cancel();
    timeoutID = DomGlobal.setTimeout((x) -> {
      if (timeoutID != -1) {
        callback.run();
        timeoutID = -1;
      }
    }, delay);
  }
}
