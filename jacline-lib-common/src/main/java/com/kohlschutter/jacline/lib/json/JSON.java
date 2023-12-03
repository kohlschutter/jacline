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
package com.kohlschutter.jacline.lib.json;

import com.kohlschutter.jacline.annotations.JsImplementationProvidedSeparately;
import com.kohlschutter.jacline.annotations.JsImport;
import com.kohlschutter.jacline.lib.coding.Codable;
import com.kohlschutter.jacline.lib.coding.KeyEncoderProvider;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Provides a minimal view over the JavaScript {@link JSON} API.
 * <p>
 * In vanilla Java, this is implemented using {@code jakarta.json-api}. Due to the constraints of
 * the Java environment, not all objects can be serialized as JSON. Objects marked as
 * {@link Codable} are serialized using a JSON {@link KeyEncoderProvider}.
 *
 * @author Christian Kohlschütter
 */
@SuppressWarnings("PMD.ShortClassName")
@JsImport
@JsType(isNative = true, name = "JSON", namespace = JsPackage.GLOBAL)
public class JSON {

  @JsOverlay
  public static String stringify(Object obj) {
    return _stringify(obj);
  }

  @JsMethod(name = "stringify")
  @JsImplementationProvidedSeparately
  private static String _stringify(Object obj, Object... moreArgs) {
    return VanillaJSON.stringify(obj);
  }

  @JsImplementationProvidedSeparately
  public static Object parse(String json) {
    return VanillaJSON.parse(json);
  }
}
