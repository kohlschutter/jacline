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

import java.io.IOException;

import jsinterop.annotations.JsMethod;

public class CodingException extends IOException {
  private static final long serialVersionUID = 1L;

  public CodingException() {
    super();
  }

  public CodingException(String message, Throwable cause) {
    super(message, cause);
  }

  public CodingException(String message) {
    super(message);
  }

  public CodingException(Throwable cause) {
    super(cause);
  }

  @JsMethod
  public static CodingException withMessage(String message) {
    return new CodingException(message);
  }

  @JsMethod
  public static CodingException withUnexpectedType(String expected, String found) {
    return new CodingException("Unexpected coding type: " + found + "; expected: " + expected);
  }
}
