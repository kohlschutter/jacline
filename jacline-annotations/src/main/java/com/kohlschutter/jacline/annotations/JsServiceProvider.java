/*
 * jacline-annotations
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
package com.kohlschutter.jacline.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ServiceLoader;

/**
 * Declares that a type provides certain service implementations that can be loaded via
 * {@link ServiceLoader}.
 * <p>
 * Classes annotated with this type must be public and have a public no-arg constructor with no
 * declared exceptions. They also must implement all service interfaces declared in this annotation.
 * <p>
 * The instance will be instantiated upon demand, but code is initialized along with types annotated
 * with {@link JsEntryPoint}, so the services might not be available if there is a dependency cycle
 * upon calling a particular static initializer).
 *
 * @author Christian Kohlschütter
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface JsServiceProvider {
  /**
   * The services implemented by the annotated class.
   *
   * @return The list of services.
   */
  Class<?>[] value() default {};
}
