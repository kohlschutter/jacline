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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@SuppressWarnings("PMD.ShortClassName")
@JsType(isNative = true, name = "JSON", namespace = JsPackage.GLOBAL)
public class JSON {
  public static native String stringify(Object... obj);

  public static native Object parse(String json);
}