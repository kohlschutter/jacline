package com.kohlschutter.jacline.lib.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Objects;

import org.junit.jupiter.api.Test;

public class DecodablesTest {
  @Test
  public void testDecodables() throws Exception {
    Object decoded = Objects.requireNonNull(Decodables.getDecoder(
        "com.kohlschutter.jacline.samples.helloworld.HelloWorld").decode(
            "{\"javaClass\":\"com.kohlschutter.jacline.samples.helloworld.HelloWorld\","
                + "\"message\":\"Greetings, jacline user!\"," + "\"obj\":{"
                + "\"javaClass\":\"SomeObjectType\"," + "\"indiana\":true," + "\"pi\":3.14" + "},"
                + "\"stringArray\":[\"one\",\"two\",\"mississippi\"]" + "}"));
    assertEquals("Greetings, jacline user!", decoded.toString());
  }
}
