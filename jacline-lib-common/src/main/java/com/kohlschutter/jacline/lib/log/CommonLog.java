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
