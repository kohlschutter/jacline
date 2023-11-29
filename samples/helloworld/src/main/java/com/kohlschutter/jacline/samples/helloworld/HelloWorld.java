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
// @JsExport // Additionally, mark this class as being accessible from outside JavaScript
public final class HelloWorld {

  private HelloWorld() {
  }

  /**
   * Returns a hello world greeting.
   * 
   * @return The greeting.
   */
  // @JsExport // Mark this method as being accessible from outside JavaScript
  public static String getHelloWorld() {
    return "Hello from Java";
  }
}
