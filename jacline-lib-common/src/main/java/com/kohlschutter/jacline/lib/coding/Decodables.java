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

import java.util.Objects;

import com.kohlschutter.jacline.annotations.JsExport;

import jsinterop.annotations.JsType;

/**
 * Maps a decodable type identifier to its {@link ObjectDecoder}.
 * <p>
 * While the {@link ObjectDecoder}s can be registered manually, the recommended process is to call
 * {@link Decodables#setDecoder(String, Decoder)} from a <em>static initializer</em> block in each
 * class implementing {@link Codable}. See {@link Codable} for details.
 *
 * @author Christian Kohlschütter
 */
@JsExport
@JsType(name = "Decodables", namespace = "kohlschutter.coding")
public final class Decodables {
  private static final Dictionary<Decoder<?>> MAP = Dictionary.newDictionary();

  static {
    DecodablesInit.init();
  }

  @JsExport
  public static Decoder<?> getDecoder(String type) {
    return Objects.requireNonNull(MAP.get(type), () -> {
      return "Decoder not found: " + type;
    });
  }

  public static void setDecoder(String type, Decoder<?> dec) {
    MAP.put(type, dec);
  }
}
