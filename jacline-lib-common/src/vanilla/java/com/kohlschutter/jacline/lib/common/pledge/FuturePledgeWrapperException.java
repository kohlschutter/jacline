package com.kohlschutter.jacline.lib.common.pledge;

/**
 * Wraps an arbitrary object in an exception.
 * 
 * @author Christian Kohlschütter
 */
final class FuturePledgeWrapperException extends Exception {
  private static final long serialVersionUID = 1L;
  private final Object object;

  /**
   * Wraps the given object as an exception.
   * 
   * @param o The object.
   */
  FuturePledgeWrapperException(Object o) {
    super();
    this.object = o;
  }

  /**
   * Returns the wrapped object.
   * 
   * @return The object.
   */
  Object getObject() {
    return object;
  }
}
