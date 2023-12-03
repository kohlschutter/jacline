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

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.kohlschutter.jacline.lib.coding.HelloWorld;

public class JSONTest {
  @Test
  public void testStringify() throws Exception {

    System.out.println(JSON.stringify(new HelloWorld()));

    System.out.println(JSON.stringify(Arrays.asList("a", "b", "c")));

  }

  @Test
  public void testParse() throws Exception {
    System.out.println(JSON.parse("{\"result\":true, \"count\":42}"));
  }
}
