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
