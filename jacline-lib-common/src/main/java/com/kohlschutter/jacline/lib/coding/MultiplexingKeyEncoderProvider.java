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

public final class MultiplexingKeyEncoderProvider implements KeyEncoderProvider {
  private final KeyEncoderProvider[] providers;

  public MultiplexingKeyEncoderProvider(KeyEncoderProvider... providers) {
    this.providers = providers;
  }

  final static class MultiplexingKeyEncoder implements KeyEncoder {
    private final KeyEncoder[] encoders;
    private final MultiplexingKeyEncoder parent;

    private MultiplexingKeyEncoder(KeyEncoder[] encoders, MultiplexingKeyEncoder parentEncoder) {
      this.encoders = encoders;
      this.parent = parentEncoder == null ? this : parentEncoder;
    }

    @Override
    public KeyEncoder encodeString(String key, String value) throws CodingException {
      for (KeyEncoder ke : encoders) {
        ke.encodeString(key, value);
      }
      return this;
    }

    @Override
    public KeyEncoder encodeBoolean(String key, Boolean value) throws CodingException {
      for (KeyEncoder ke : encoders) {
        ke.encodeBoolean(key, value);
      }
      return this;
    }

    @Override
    public KeyEncoder encodeNumber(String key, Number value) throws CodingException {
      for (KeyEncoder ke : encoders) {
        ke.encodeNumber(key, value);
      }
      return this;
    }

    @Override
    public KeyEncoder encodeArray(String key, ArrayEncoder encoder, Object[] array)
        throws CodingException {
      for (KeyEncoder ke : encoders) {
        ke.encodeArray(key, encoder, array);
      }
      return this;
    }

    @Override
    public void markAdvisory(CodingAdvisory advisory)
        throws CodingException {
      for (KeyEncoder ke : encoders) {
        ke.markAdvisory(advisory);
      }
    }

    @Override
    public KeyEncoder beginEncodeObject(String key, String type) throws CodingException {
      KeyEncoder[] objectEncoders = new KeyEncoder[encoders.length];
      for (int i = 0, n = encoders.length; i < n; i++) {
        objectEncoders[i] = encoders[i].beginEncodeObject(key, type);
      }

      return new MultiplexingKeyEncoder(objectEncoders, this);
    }

    @Override
    public KeyEncoder end() throws CodingException {
      return parent;
    }

    @Override
    public Object getEncoded() throws CodingException {
      return getEncoded(0);
    }

    public Object getEncoded(int index) throws CodingException {
      return encoders[index].getEncoded();
    }
  }

  @Override
  public KeyEncoder begin(String type) throws CodingException {
    KeyEncoder[] encoders = new KeyEncoder[providers.length];
    for (int i = 0, n = providers.length; i < n; i++) {
      encoders[i] = providers[i].begin(type);
    }

    return new MultiplexingKeyEncoder(encoders, null);
  }
}
