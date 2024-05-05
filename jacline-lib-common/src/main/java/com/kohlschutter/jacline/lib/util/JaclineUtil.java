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
