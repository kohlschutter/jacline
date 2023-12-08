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

import java.util.Objects;
import java.util.Optional;
import java.util.ServiceLoader;

public interface CommonLogServiceProvider {
  CommonLogServiceProvider DEFAULT = findDefault();

  static CommonLogServiceProvider getDefault() {
    if (DEFAULT == null) {
      throw new IllegalStateException("Could not find any " + CommonLogServiceProvider.class);
    } else {
      return DEFAULT;
    }
  }

  private static CommonLogServiceProvider findDefault() {
    @SuppressWarnings("null")
    Optional<CommonLogServiceProvider> first = ServiceLoader.load(CommonLogServiceProvider.class)
        .findFirst();
    return first.isPresent() ? Objects.requireNonNull(first.get()) : null;
  }

  void log(String message, Object... args);

  void debug(String message, Object... args);

  void info(String message, Object... args);

  void warn(String message, Object... args);

  void error(String message, Object... args);
}
