package com.kohlschutter.jacline.lib.common;

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
        hw.encode().toString());
  }

  @Test
  public void testDecoder() throws Exception {
    HelloWorld hw = new HelloWorld();
    Object encode = hw.encode();

    HelloWorld hw1a = HelloWorld.decode(encode); // JsonObject shortcut
    assertEquals(hw.getMessage(), hw1a.getMessage());
    assertEquals(encode, hw1a.encode());

    HelloWorld hw1b = HelloWorld.decode(encode.toString()); // String
    assertEquals(hw.getMessage(), hw1b.getMessage());
    assertEquals(encode.toString(), hw1b.encode().toString());

    HelloWorld hw1c = HelloWorld.decode(new StringReader(encode.toString())); // Reader
    assertEquals(hw.getMessage(), hw1c.getMessage());
    assertEquals(encode.toString(), hw1c.encode().toString());
  }

  @Test
  public void testDecodeJsonHelloWorld() throws Exception {
    String json = "{\"javaClass\":\"com.kohlschutter.jacline.samples.helloworld.HelloWorld\","
        + "\"message\":\"Greetings, jacline user!\"," + "\"obj\":{"
        + "\"javaClass\":\"SomeObjectType\"," + "\"indiana\":false," + "\"pi\":3.14" + "},"
        + "\"stringArray\":[\"one\",\"two\",\"mississippi\"]" + "}";
    HelloWorld hw = HelloWorld.decode(json);

    assertEquals("Greetings, jacline user!", hw.getMessage());
    assertEquals(json, hw.encode().toString());
  }

  @Test
  public void testDecodingError() throws Exception {
    String json = "{\"javaClass\":\"com.kohlschutter.jacline.samples.helloworld.HelloWorld\","
        + "\"message\":\"Greetings, jacline user!\"," + "\"obj\":{"
        + "\"javaClass\":\"SomeObjectType\"," + "\"indiana\":true," + "\"pi\":4" + "},"
        + "\"stringArray\":[\"one\",\"two\",\"mississippi\"]" + "}";

    assertThrows(DecodingException.class, () -> HelloWorld.decode(json));
  }
}
