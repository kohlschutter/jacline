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
package com.kohlschutter.jacline.lib.exception;

import java.util.concurrent.CompletionException;

/**
 * Wraps an arbitrary object in an exception.
 *
 * @author Christian Kohlschütter
 */
public final class JsException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  private final transient Object object;

  /**
   * Wraps the given JavaScript error object as an exception.
   *
   * @param o The object.
   */
  private JsException(Object o) {
    super(String.valueOf(o));
    this.object = o;
  }

  public static Exception wrap(Object o) {
    if (o instanceof Exception) {
      return ((Exception) o);
    } else {
      return new JsException(o);
    }
  }

  public static JsException wrapAsJsException(Object o) {
    if (o == null) {
      return null;
    } else if (o instanceof JsException) {
      return ((JsException) o);
    } else {
      return new JsException(o);
    }
  }

  public static Object unwrap(Object o) {
    if (o instanceof CompletionException) {
      Throwable cause = ((CompletionException) o).getCause();
      if (cause != null) {
        return unwrap(cause);
      } else {
        return o;
      }
    } else if (o instanceof JsException) {
      return ((JsException) o).getObject();
    } else {
      return o;
    }
  }

  /**
   * Returns the wrapped object.
   *
   * @return The object.
   */
  public Object getObject() {
    return object;
  }
}
