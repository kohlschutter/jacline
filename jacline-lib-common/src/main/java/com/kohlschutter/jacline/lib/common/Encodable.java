package com.kohlschutter.jacline.lib.common;

/**
 * Marks an object capable to encoding/decoding via {@link KeyEncoder}/{@link KeyDecoder}, etc.
 * <p>
 * Implementations must also provide a static method {@code #decode(Object)}.
 * 
 * @author Christian Kohlschütter
 */
public interface Encodable {

  /**
   * Encodes this instance via {@link KeyEncoder}.
   * 
   * @return The encoded representation.
   */
  Object encode();
}
