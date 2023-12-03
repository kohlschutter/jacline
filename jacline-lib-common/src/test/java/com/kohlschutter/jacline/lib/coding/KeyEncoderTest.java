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
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.StringReader;

import org.junit.jupiter.api.Test;

public class KeyEncoderTest {

  @Test
  public void testEncoder() {
    KeyEncoder enc = KeyEncoder.begin("Dummy");
    enc.encodeString("hello", "world");
    enc.beginEncodeObject("obj", null).encodeBoolean("indiana", true).encodeNumber("pi", 4).end()
        .encodeString("hello", "world").encodeArray("array", StandardArrayEncoders::strings,
            new Object[] {false, 1, 2.0, "three"});

    assertEquals("{\"javaClass\":\"Dummy\",\"hello\":\"world\",\"obj\":{\"indiana\":true,\"pi\":4},"
        + "\"array\":[\"false\",\"1\",\"2.0\",\"three\"]}", enc.getEncoded().toString());
  }

  @Test
  public void testEncodeJsonHelloWorld() throws Exception {
    HelloWorld hw = new HelloWorld();
    assertEquals(
        "{\"javaClass\":\"com.kohlschutter.jacline.samples.helloworld.HelloWorld\",\"message\":\"Hello from Java\","
            + "\"obj\":{\"javaClass\":\"SomeObjectType\",\"indiana\":false,\"pi\":3.14},\"stringArray\":null}",
        hw.encode(null).toString());
  }

  @Test
  public void testDecoder() throws Exception {
    HelloWorld hw = new HelloWorld();
    Object encode = hw.encode(null);

    HelloWorld hw1a = HelloWorld.decodeDefault(encode); // JsonObject shortcut
    assertEquals(hw.getMessage(), hw1a.getMessage());
    assertEquals(encode, hw1a.encode(null));

    HelloWorld hw1b = HelloWorld.decodeDefault(encode.toString()); // String
    assertEquals(hw.getMessage(), hw1b.getMessage());
    assertEquals(encode.toString(), hw1b.encode(null).toString());

    HelloWorld hw1c = HelloWorld.decodeDefault(new StringReader(encode.toString())); // Reader
    assertEquals(hw.getMessage(), hw1c.getMessage());
    assertEquals(encode.toString(), hw1c.encode(null).toString());
  }

  @Test
  public void testDecodeJsonHelloWorld() throws Exception {
    String json = "{\"javaClass\":\"com.kohlschutter.jacline.samples.helloworld.HelloWorld\","
        + "\"message\":\"Greetings, jacline user!\"," + "\"obj\":{"
        + "\"javaClass\":\"SomeObjectType\"," + "\"indiana\":false," + "\"pi\":3.14" + "},"
        + "\"stringArray\":[\"one\",\"two\",\"mississippi\"]" + "}";
    HelloWorld hw = HelloWorld.decodeDefault(json);

    assertEquals("Greetings, jacline user!", hw.getMessage());
    assertEquals(json, hw.encode(null).toString());
  }

  @Test
  public void testDecodingError() throws Exception {
    String json = "{\"javaClass\":\"com.kohlschutter.jacline.samples.helloworld.HelloWorld\","
        + "\"message\":\"Greetings, jacline user!\"," + "\"obj\":{"
        + "\"javaClass\":\"SomeObjectType\"," + "\"indiana\":true," + "\"pi\":4" + "},"
        + "\"stringArray\":[\"one\",\"two\",\"mississippi\"]" + "}";

    assertThrows(DecodingException.class, () -> HelloWorld.decodeDefault(json));
  }
}
