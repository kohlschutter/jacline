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
package com.kohlschutter.jacline.lib.pledge;

import com.kohlschutter.jacline.annotations.JsExport;
import com.kohlschutter.jacline.lib.function.JsConsumerCallback;

import jsinterop.annotations.JsMethod;

@FunctionalInterface
public interface ThenableCallback<T> {
  @JsExport
  @JsMethod(name = "then")
  void then(JsConsumerCallback<T> onFulfilled);
}
