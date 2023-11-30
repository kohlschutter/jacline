/*
 * jacline sample: helloworld
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
package com.kohlschutter.jacline.samples.helloworld;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import com.kohlschutter.jacline.annotations.JsExport;
import com.kohlschutter.jacline.lib.common.Encodable;
import com.kohlschutter.jacline.lib.common.KeyDecoder;
import com.kohlschutter.jacline.lib.common.KeyEncoder;
import com.kohlschutter.jacline.lib.common.StandardArrayDecoders;
import com.kohlschutter.jacline.lib.common.StandardArrayEncoders;

import jsinterop.annotations.JsType;

/**
 * A simple hello world example.
 * <p>
 * When both class and method are marked with {@code @JsExport}, you can reference the class in the
 * browser by name, i.e.,
 * {@code com.kohlschutter.jacline.samples.helloworld.HelloWorld.getHelloWorld()} works.
 * <p>
 * If they're not marked with {@code @JsExport}, the closure compiler can optimize this code away
 * and ultimately produce a single-statement output file.
 */
@JsType // Mark this class as being accessible from jacline JavaScript
@JsExport // Additionally, mark this class as being accessible from outside JavaScript
@SuppressFBWarnings("CNT_ROUGH_CONSTANT_VALUE")
public final class HelloWorld implements Encodable {
  private static final String CODED_TYPE = "com.kohlschutter.jacline.samples.helloworld.HelloWorld";
  private String message = "Hello from Java";
  private Object[] array;

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
  public Object encode() {
    KeyEncoder enc = KeyEncoder.begin(CODED_TYPE);
    enc.encodeString("message", message);
    enc.beginEncodeObject("obj", "SomeObjectType").encodeBoolean("indiana", true).encodeNumber("pi",
        3.14).end();
    enc.encodeArray("stringArray", StandardArrayEncoders::strings, array);
    return enc.getEncoded();
  }

  /**
   * Decodes an encoded object of this type via {@link KeyDecoder}.
   * 
   * @param obj The encoded object.
   * @return A new {@link HelloWorld} instance.
   */
  @JsExport
  public static HelloWorld decode(Object obj) {
    KeyDecoder dec = KeyDecoder.load(CODED_TYPE, obj);
    checkSanity(dec);

    HelloWorld hw = new HelloWorld();
    hw.setMessage(dec.stringForKey("message"));

    hw.array = dec.arrayForKey("stringArray", StandardArrayDecoders::strings);

    return hw;
  }

  /**
   * Checks for the presence of some object and its properties, without actually using the data for
   * the target object.
   * 
   * @param dec The {@link KeyDecoder} instance.
   */
  private static void checkSanity(KeyDecoder dec) {
    dec.objectForKey("obj", "SomeObjectType", (encoded) -> {
      KeyDecoder objectDecoder = KeyDecoder.load("SomeObjectType", encoded);

      Number pi = objectDecoder.numberForKey("pi");

      if (Math.abs(3.141 - pi.floatValue()) > 0.001f) {
        if (objectDecoder.booleanForKey("indiana")) {
          throw new IllegalStateException("Not again, Indiana!");
        } else {
          throw new IllegalStateException("Not my reality");
        }
      }
      return pi.floatValue(); // return value is not used
    });
  }
}
