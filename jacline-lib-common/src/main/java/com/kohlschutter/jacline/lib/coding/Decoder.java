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
package com.kohlschutter.jacline.lib.coding;

import jsinterop.annotations.JsFunction;

/**
 * Decodes an encoded {@link Codable} object compatible with the provided
 * {@link CodingServiceProvider}.
 * <p>
 * This usually refers to a static {@code decode} method defined in a {@link Codable} class.
 * 
 * @param <T> The type of the {@link Codable} object.
 * @author Christian Kohlschütter
 */
@JsFunction
@FunctionalInterface
public interface Decoder<T> {
  T decode(KeyDecoder dec) throws CodingException;
}
