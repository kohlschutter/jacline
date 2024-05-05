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

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;
import com.kohlschutter.jacline.annotations.JsPatched;

/**
 * Helper class for very simple Jacline-specific tests.
 *
 * @author Christian Kohlschütter
 */
@JsPatched
public final class JaclineUtil {
  private JaclineUtil() {
  }

  /**
   * Checks if the code runs in a JavaScript environment.
   *
   * @return {@code true} if so.
   */
  @JsImplementationProvidedSeparately
  public static boolean isJavaScriptEnvironment() {
    return false;
  }
}
