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
package com.kohlschutter.jacline.lib.coding;

import jsinterop.annotations.JsFunction;

/**
 * Creates a new array for a given generic type.
 *
 * @param <T> The type of the array.
 * @author Christian Kohlschütter
 */
@FunctionalInterface
@JsFunction
public interface ArrayCreator<T> {
  /**
   * Creates a new array for a given generic type of the given size.
   *
   * @param size The size.
   * @return The array.
   */
  T[] newArray(int size);
}