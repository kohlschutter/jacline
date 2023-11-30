package com.kohlschutter.jacline.lib.common;

import java.io.Closeable;
import java.io.IOException;

/**
 * Glue code to enable native JavaScript classes supporting {@link Closeable} for try-finally etc.
 * <p>
 * Such JavaScript classes must implement the following method as follows:
 * <p>
 * {@code /** @export} {@code *}{@code /}<br />
 * {@code m_close__void()}<tt>{</tt><em>[...]</em><tt>}</tt>
 *
 * @author Christian Kohlschütter
 */
@SuppressWarnings("unusable-by-js" /* for "extends Closeable" */ )
public interface JsCloseable extends Closeable {
  @Override
  void close() throws IOException;
}
