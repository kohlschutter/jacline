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

import java.util.function.Consumer;

import org.eclipse.jdt.annotation.Nullable;

/**
 * Maintains a known state.
 *
 * @param <V> The type of the known state.
 * @author Christian Kohlschütter
 */
public final class KnownState<V> {
  private @Nullable V value;

  public KnownState() {
    this(null);
  }

  public KnownState(@Nullable V initialValue) {
    this.value = initialValue;
  }

  /**
   * Updates the known state, and calls the given consumer only if the new state is different from
   * the currently known state.
   *
   * @param val The new state.
   * @param onNewValue The function to call if the state has changed.
   */
  public void updateValue(V val, Consumer<V> onNewValue) {
    if (!checkValue(val)) {
      setValue(val);
      onNewValue.accept(val);
    }
  }

  /**
   * Updates the known state.
   *
   * @param value The new state.
   */
  public void setValue(V value) {
    this.value = value;
  }

  /**
   * Checks if the known state is equivalent to the given state.
   *
   * @param val The state to check.
   * @return {@code true} if equivalent.
   */
  public boolean checkValue(V val) {
    @Nullable
    V v = this.value;
    if (v == null) {
      if (val == null) {
        return true;
      } else {
        return false;
      }
    } else {
      return v.equals(val);
    }
  }
}
