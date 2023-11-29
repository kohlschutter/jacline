/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javaemul.internal;

import jsinterop.annotations.JsType;

/** Defines helper functions used for generating assert statements. */
@JsType(namespace = "vmbootstrap")
public class Asserts {
  public static void $assert(boolean condition) {
    if (!condition) {
      throw new AssertionError();
    }
  }

  public static void $assertWithMessage(boolean condition, Object message) {
    if (!condition) {
      throw new AssertionError(message);
    }
  }
}
