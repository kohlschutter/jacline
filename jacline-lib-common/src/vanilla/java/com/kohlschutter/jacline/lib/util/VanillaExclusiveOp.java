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

import com.kohlschutter.jacline.annotations.JsIgnoreType;

/**
 * Helper to schedule some delayed task, which may be rescheduled/replaced by some other operation.
 * 
 * @author Christian Kohlschütter
 */
@JsIgnoreType
final class VanillaExclusiveOp implements ExclusiveOp {
  private volatile VanillaDelay vanillaDelay = null;

  VanillaExclusiveOp() {
  }

  /**
   * Cancels the scheduled operation.
   */
  @Override
  public synchronized void cancel() {
    VanillaDelay vd = vanillaDelay;
    if (vd != null) {
      vd.cancel();
      vd = null;
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

    this.vanillaDelay = new VanillaDelay((int) delay, () -> {
      callback.run();
      this.vanillaDelay = null;
    });
  }

  @Override
  public Object reserve() {
    cancel();
    VanillaDelay reservation = new VanillaDelay();
    this.vanillaDelay = reservation;
    return reservation;
  }

  @Override
  public boolean isCurrent(Object reservation) {
    return reservation != null && this.vanillaDelay == reservation;
  }
}
