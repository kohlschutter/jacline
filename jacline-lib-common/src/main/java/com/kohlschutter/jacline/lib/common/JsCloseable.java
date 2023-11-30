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
