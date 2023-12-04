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
package com.kohlschutter.jacline.lib.log;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;
import com.kohlschutter.jacline.annotations.JsPatched;

import jsinterop.annotations.JsType;

/**
 * A simple, common log API that can be shared between JavaScript and Java.
 * <p>
 * The messages may contain placeholders ("<code>{}</code>"), which (unless escaped as
 * "<code>\\{}"</code>), are replaced with the next available argument provided, and converted to a
 * string.
 * <p>
 * If there are more paramerters than placeholders, then the remaining ones will be appended to end
 * of the message or provided as additional parameters, depending on the environment. *
 *
 * @author Christian Kohlschütter
 */
@JsType(namespace = "kohlschutter.log", name = "Log")
@JsPatched
public final class CommonLog {
  private CommonLog() {
  }

  @JsImplementationProvidedSeparately
  public static void log(String message, Object... args) {
    CommonLogServiceProvider.DEFAULT.log(message, args);
  }

  @JsImplementationProvidedSeparately
  public static void debug(String message, Object... args) {
    CommonLogServiceProvider.DEFAULT.debug(message, args);
  }

  @JsImplementationProvidedSeparately
  public static void info(String message, Object... args) {
    CommonLogServiceProvider.DEFAULT.info(message, args);
  }

  @JsImplementationProvidedSeparately
  public static void warn(String message, Object... args) {
    CommonLogServiceProvider.DEFAULT.warn(message, args);
  }

  @JsImplementationProvidedSeparately
  public static void error(String message, Object... args) {
    CommonLogServiceProvider.DEFAULT.error(message, args);
  }
}
