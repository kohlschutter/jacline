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

  final class MultiplexingKeyEncoder implements KeyEncoder {
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
    public void markAdvisory(CodingAdvisory advisory) throws CodingException {
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

    @Override
    public SequenceEncoder sequenceEncoder() throws CodingException {
      SequenceEncoder[] se = new SequenceEncoder[encoders.length];
      for (int i = 0, n = encoders.length; i < n; i++) {
        se[i] = encoders[i].sequenceEncoder();
      }
      return new MultiplexingSequenceEncoder(null, se);
    }

    @Override
    public KeyEncoder keyEncoder(String type) throws CodingException {
      return MultiplexingKeyEncoderProvider.this.keyEncoder(type);
    }

    @Override
    public void close() throws CodingException {
      for (int i = 0, n = encoders.length; i < n; i++) {
        encoders[i].close();
      }
    }
  }

  final class MultiplexingSequenceEncoder implements SequenceEncoder {
    private final SequenceEncoder parent;
    private final SequenceEncoder[] sequence;

    private MultiplexingSequenceEncoder(SequenceEncoder parent, SequenceEncoder[] se) {
      this.parent = parent;
      this.sequence = se;
    }

    @Override
    public SequenceEncoder encodeStrings(String... values) throws CodingException {
      for (int i = 0, n = sequence.length; i < n; i++) {
        sequence[i].encodeStrings(values);
      }
      return this;
    }

    @Override
    public SequenceEncoder encodeBooleans(Boolean... values) throws CodingException {
      for (int i = 0, n = sequence.length; i < n; i++) {
        sequence[i].encodeBooleans(values);
      }
      return this;
    }

    @Override
    public SequenceEncoder encodeNumbers(Number... values) throws CodingException {
      for (int i = 0, n = sequence.length; i < n; i++) {
        sequence[i].encodeNumbers(values);
      }
      return this;
    }

    @Override
    public SequenceEncoder encodeObjects(ObjectEncoder encoder, Object... objects)
        throws CodingException {
      for (int i = 0, n = sequence.length; i < n; i++) {
        sequence[i].encodeObjects(encoder, objects);
      }
      return this;
    }

    @Override
    public SequenceEncoder beginEncodeArray() throws CodingException {
      SequenceEncoder[] se = new SequenceEncoder[sequence.length];
      for (int i = 0, n = sequence.length; i < n; i++) {
        se[i] = sequence[i].beginEncodeArray();
      }
      return new MultiplexingSequenceEncoder(this, se);
    }

    @Override
    public SequenceEncoder end() throws CodingException {
      for (int i = 0, n = sequence.length; i < n; i++) {
        sequence[i].end();
      }
      return parent == null ? this : parent;
    }

    @Override
    public Object getEncoded() throws CodingException {
      return getEncoded(0);
    }

    public Object getEncoded(int i) throws CodingException {
      return sequence[i].getEncoded();
    }

  }

  @Override
  public KeyEncoder keyEncoder(String type) throws CodingException {
    KeyEncoder[] encoders = new KeyEncoder[providers.length];
    for (int i = 0, n = providers.length; i < n; i++) {
      encoders[i] = providers[i].keyEncoder(type);
    }

    return new MultiplexingKeyEncoder(encoders, null);
  }
}
