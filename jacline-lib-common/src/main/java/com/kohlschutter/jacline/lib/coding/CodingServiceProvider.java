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

import java.util.Objects;
import java.util.Optional;
import java.util.ServiceLoader;

public interface CodingServiceProvider {
  CodingServiceProvider DEFAULT = findDefault();

  static CodingServiceProvider getDefault() {
    if (DEFAULT == null) {
      throw new IllegalStateException("Could not find any " + CodingServiceProvider.class);
    } else {
      return DEFAULT;
    }
  }

  private static CodingServiceProvider findDefault() {
    Optional<com.kohlschutter.jacline.lib.coding.CodingServiceProvider> first = ServiceLoader.load(
        CodingServiceProvider.class).findFirst();
    return first.isPresent() ? Objects.requireNonNull(first.get()) : null;
  }

  KeyDecoder keyDecoder(String expectedCodedType, Object encoded) throws DecodingException;

  KeyEncoder keyEncoder(String type);

  SequenceDecoder sequenceDecoder(Object encoded) throws DecodingException;

  SequenceEncoder sequenceEncoder();
}
