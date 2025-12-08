/*
 * jacline sample: json
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
package com.kohlschutter.jacline.samples.json;

import java.io.IOException;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import com.kohlschutter.jacline.annotations.JsExport;
import com.kohlschutter.jacline.annotations.JsServiceProvider;
import com.kohlschutter.jacline.lib.coding.ArrayDecoder;
import com.kohlschutter.jacline.lib.coding.ArrayEncoder;
import com.kohlschutter.jacline.lib.coding.Codable;
import com.kohlschutter.jacline.lib.coding.CodingException;
import com.kohlschutter.jacline.lib.coding.CodingProviders;
import com.kohlschutter.jacline.lib.coding.CodingServiceProvider;
import com.kohlschutter.jacline.lib.coding.Decodables;
import com.kohlschutter.jacline.lib.coding.KeyDecoder;
import com.kohlschutter.jacline.lib.coding.KeyEncoder;
import com.kohlschutter.jacline.lib.coding.KeyEncoderProvider;
import com.kohlschutter.jacline.lib.coding.StandardArrayDecoders;
import com.kohlschutter.jacline.lib.coding.StandardArrayEncoders;

import jsinterop.annotations.JsType;

/**
 * A not so simple hello world example, demonstrating the use of {@link KeyEncoder} and company.
 */
@JsType // Mark this class as being accessible from jacline JavaScript
@JsExport // Additionally, mark this class as being accessible from outside JavaScript
@SuppressFBWarnings("CNT_ROUGH_CONSTANT_VALUE")
@JsServiceProvider(Codable.class)
public final class HelloWorld implements Codable {
  private static final String CODED_TYPE = "com.kohlschutter.jacline.samples.helloworld.HelloWorld";
  private String message = "Hello from Java";
  private Object[] array;

  static {
    // Register our decoder with the global Decodables registry
    // FIXME: Until @JsServiceProvider is properly implemented, we need to manually trigger
    // static initializers by "new HelloWorld()" or similar.
    Decodables.setDecoder(CODED_TYPE, HelloWorld::decode);
  }

  /**
   * Creates some hello world magic.
   */
  public HelloWorld() {
  }

  /**
   * Returns a hello world greeting.
   *
   * @return The greeting.
   */
  @JsExport
  public String getMessage() {
    return message;
  }

  /**
   * Sets the hello world greeting.
   *
   * @param message The new greeting.
   */
  @JsExport
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  @JsExport
  public Object encode(KeyEncoderProvider provider) throws CodingException {
    try (KeyEncoder enc = CodingProviders.decorateEncoderProvider(provider).keyEncoder(CODED_TYPE);
        ArrayEncoder stringEncoder = StandardArrayEncoders.strings(enc.provider())) {

      enc.encodeString("message", message);
      enc.beginEncodeObject("obj", "SomeObjectType").encodeBoolean("indiana", false).encodeNumber(
          "pi", 3.14).end();
      enc.encodeArray("stringArray", stringEncoder, array);
      return enc.getEncoded();
    }
  }

  /**
   * Decodes an encoded object of this type via {@link KeyDecoder}.
   *
   * @param provider The {@link CodingServiceProvider}, or {@code null} for default.
   * @param obj The encoded object.
   * @return A new {@link HelloWorld} instance.
   * @throws CodingException on error.
   */
  @JsExport
  public static HelloWorld decode(CodingServiceProvider provider, Object obj)
      throws CodingException {
    try (KeyDecoder dec = CodingProviders.decorateDecoderProvider(provider).keyDecoder(CODED_TYPE,
        obj); //
        ArrayDecoder<String> stringDecoder = StandardArrayDecoders.strings(dec.provider())) {
      checkSanity(dec);

      HelloWorld hw = new HelloWorld();
      hw.setMessage(dec.stringForKey("message"));
      hw.array = dec.arrayForKey("stringArray", stringDecoder);

      return hw;
    } catch (IOException e) {
      throw new CodingException(e);
    }
  }

  /**
   * Checks for the presence of some object and its properties, without actually using the data for
   * the target object.
   *
   * @param dec The {@link KeyDecoder} instance.
   * 
   * @throws CodingException on error.
   */
  private static void checkSanity(KeyDecoder dec) throws CodingException {
    CodingServiceProvider csp = dec.provider();

    dec.objectForKey("obj", (encoded) -> {
      KeyDecoder objectDecoder = csp.keyDecoder("SomeObjectType", encoded);

      Number pi = objectDecoder.numberForKey("pi");

      if (Math.abs(3.141 - pi.floatValue()) > 0.001f) {
        if (objectDecoder.booleanForKey("indiana")) {
          throw new CodingException("Not again, Indiana!");
        } else {
          throw new CodingException("Not my reality");
        }
      }
      return pi.floatValue(); // return value is not used
    });
  }

  @Override
  public String toString() {
    return getMessage();
  }
}
