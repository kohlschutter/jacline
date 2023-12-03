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

import com.kohlschutter.jacline.annotations.JsServiceProvider;

/**
 * Marks an object capable to be encoded via {@link KeyEncoder}, and decoded via {@link KeyDecoder}.
 * <p>
 * Implementations should also provide a public static method {@code #decode(Object)} and register
 * the decoder via {@link Decodables#setDecoder} from a <em>static initializer</em> block.
 * <p>
 * In order to ensure that the static initializer is run before {@link Decodables} tries to resolve
 * the decoder, the implementation should be registered as a service provider for this interface
 * (either via {@code module-info.java} or
 * {@code META-INF/services/com.kohlschutter.jacline.lib.coding.Codable}), as well as annotated with
 * {@code @JsServiceProvider(Codable.class)}.
 *
 * @author Christian Kohlschütter
 * @see JsServiceProvider
 */
public interface Codable {
  /**
   * Encodes this instance via the given {@link KeyEncoderProvider}.
   *
   * @return The encoded representation.
   */
  Object encode(KeyEncoderProvider provider);
}
