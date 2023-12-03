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

/**
 * Common helper methods for {@link Codable} coding providers.
 * 
 * @author Christian Kohlschütter
 */
public final class CodingProviders {
  private CodingProviders() {
  }

  /**
   * Returns the {@link KeyEncoderProvider} that should be used, given the parameters.
   * 
   * @param provider The original {@link KeyEncoderProvider}, or {@code null} (for default).
   * @return Some {@link KeyEncoderProvider}.
   */
  public static KeyEncoderProvider decorateEncoderProvider(KeyEncoderProvider provider) {
    if (provider == null) {
      return KeyEncoder::begin;
    } else {
      return provider;
    }
  }

  /**
   * Returns the {@link KeyDecoderProvider} that should be used, given the parameters.
   * 
   * @param provider The original {@link KeyDecoderProvider}, or {@code null} (for default).
   * @return Some {@link KeyDecoderProvider}.
   */
  public static KeyDecoderProvider decorateDecoderProvider(KeyDecoderProvider provider) {
    if (provider == null) {
      return KeyDecoder::load;
    } else {
      return provider;
    }
  }

  public static String getTypeFromEncoded(Object obj) {
    // TODO Auto-generated method stub
    return null;
  }
}
