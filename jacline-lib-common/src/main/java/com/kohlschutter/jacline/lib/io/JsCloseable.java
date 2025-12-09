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
package com.kohlschutter.jacline.lib.io;

import java.io.Closeable;
import java.io.IOException;

/**
 * Glue code to enable native JavaScript classes supporting {@link Closeable} for try-finally etc.
 * <p>
 * Such JavaScript classes must:
 * <ul>
 * <li>source {@code JsCloseable} as follows:
 * {@code const JsCloseable = goog.require('com.kohlschutter.jacline.lib.io.JsCloseable');}</li>
 * <li>declare <code>@implements {JsCloseable}</code> in the type's JsDoc comment</li>
 * <li>implement the following method:
 * {@code m_close__void()}<code>{</code><em>[...]</em><code>}</code>
 * <li>call {@code JsCloseable.$markImplementor(TheTypeName);} after declaring the class</li>
 * </ul>
 * See {@code key-decoder.js} as an example.
 *
 * @author Christian Kohlschütter
 */
@SuppressWarnings("unusable-by-js" /* for "extends Closeable" */ )
@FunctionalInterface
public interface JsCloseable extends Closeable {
  @Override
  void close() throws IOException;
}
