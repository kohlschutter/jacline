package com.kohlschutter.jacline.lib.coding;

/**
 * Something that can consume coding-related advisories.
 * 
 * @author Christian Kohlschütter
 */
@FunctionalInterface
public interface CodingAdvisoryConsumer {
  /**
   * Makes this advisory known.
   * 
   * @param advisory The advisory.
   * @throws CodingException on error.
   */
  void markAdvisory(CodingAdvisory advisory) throws CodingException;
}
