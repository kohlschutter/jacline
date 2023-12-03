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

/**
 * Declares that a type's JavaScript implementation (module ending with {@code $impl}) is patched
 * using native JavaScript code provided separately (providing a module ending with
 * {@code $impl$patched}), and that the header file (module not ending in {@code $impl}), which
 * usually sources the implementation script, should rather source the patched module.
 * <p>
 * The {@code $impl$patched} module can either modify/decorate the default implementation, or
 * replace it entirely.
 * </p>
 *
 * @author Christian Kohlschütter
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface JsPatched {
}
