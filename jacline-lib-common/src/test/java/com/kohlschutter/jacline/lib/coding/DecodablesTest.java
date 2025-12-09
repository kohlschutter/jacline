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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Objects;

import org.junit.jupiter.api.Test;

public class DecodablesTest {
  private static final CodingServiceProvider CSP = CodingServiceProvider.getDefault();

  @Test
  public void testDecodables() throws Exception {
    // NOTE: We declared HelloWorld as a SPI service provider in
    // src/test/resources/META-INF/services/com.kohlschutter.jacline.lib.common.coding.Encodable
    // (for Java), and via {@code @JsServiceProvider(Encodable.class)} in HelloWorld.java (for
    // j2cl).
    // These declarations trigger HelloWorld's static initializer, which in turn registers the
    // Encodable (using the correct type) with Decodables.
    try (KeyDecoder dec = CSP.keyDecoder("com.kohlschutter.jacline.samples.helloworld.HelloWorld",
        "{\"javaClass\":\"com.kohlschutter.jacline.samples.helloworld.HelloWorld\","
            + "\"message\":\"Greetings, jacline user!\"," + "\"obj\":{"
            + "\"javaClass\":\"SomeObjectType\"," + "\"indiana\":true," + "\"pi\":3.14" + "},"
            + "\"stringArray\":[\"one\",\"two\",\"mississippi\"]" + "}")) {
      Object decoded = Objects.requireNonNull(Decodables.getDecoder(
          "com.kohlschutter.jacline.samples.helloworld.HelloWorld").decode(dec));
      assertEquals("Greetings, jacline user!", decoded.toString());
    }
  }
}
