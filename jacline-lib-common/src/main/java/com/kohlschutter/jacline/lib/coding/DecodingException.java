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

import jsinterop.annotations.JsMethod;

public class DecodingException extends Exception {
  private static final long serialVersionUID = 1L;

  public DecodingException() {
    super();
  }

  public DecodingException(String message, Throwable cause) {
    super(message, cause);
  }

  public DecodingException(String message) {
    super(message);
  }

  public DecodingException(Throwable cause) {
    super(cause);
  }

  @JsMethod
  public static DecodingException withMessage(String message) {
    return new DecodingException(message);
  }

  @JsMethod
  public static DecodingException withUnexpectedType(String expected, String found) {
    return new DecodingException("Unexpected type: " + found + "; expected: " + expected);
  }
}
