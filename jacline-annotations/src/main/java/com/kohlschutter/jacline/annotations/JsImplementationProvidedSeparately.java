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
 * Declares that a method of a type that is either:
 * <ul>
 * <li>marked with {@code @JsType(isNative=true)}, or</li>
 * <li>marked with {@code @JsPatched}</li>
 * </ul>
 * is being provided with a default implementation for vanilla Java, whereas the JavaScript-specific
 * implementation is provided separately in some JavaScript file.
 *
 * @author Christian Kohlschütter
 * @see JsPatched
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface JsImplementationProvidedSeparately {
}
