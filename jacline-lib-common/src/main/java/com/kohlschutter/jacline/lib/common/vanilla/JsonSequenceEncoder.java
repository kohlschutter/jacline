package com.kohlschutter.jacline.lib.common.vanilla;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.kohlschutter.jacline.lib.common.ObjectEncoder;
import com.kohlschutter.jacline.lib.common.SequenceEncoder;

import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;
import jsinterop.annotations.JsIgnore;

@SuppressWarnings("unusable-by-js")
public class JsonSequenceEncoder implements SequenceEncoder {
  private static final JsonProvider PROVIDER = JsonProvider.provider();
  private final JsonArrayBuilder builder;
  private final JsonSequenceEncoder parent;

  @JsIgnore
  public JsonSequenceEncoder() {
    this(null);
  }

  private JsonSequenceEncoder(JsonSequenceEncoder parent) {
    this.builder = PROVIDER.createArrayBuilder();
    this.parent = parent;
  }

  @Override
  @JsIgnore
  public SequenceEncoder encodeStrings(String... values) {
    for (String value : values) {
      if (value == null) {
        builder.addNull();
      } else {
        builder.add(value);
      }
    }
    return this;
  }

  @Override
  @JsIgnore
  public SequenceEncoder encodeBooleans(Boolean... values) {
    for (Boolean value : values) {
      if (value == null) {
        builder.addNull();
      } else {
        builder.add(value);
      }
    }
    return this;
  }

  @Override
  @JsIgnore
  public SequenceEncoder encodeNumbers(Number... values) {
    for (Number value : values) {
      if (value == null) {
        builder.addNull();
      } else if (value instanceof Integer) {
        builder.add(value.intValue());
      } else if (value instanceof Long) {
        builder.add(value.longValue());
      } else if (value instanceof Float) {
        builder.add(value.floatValue());
      } else if (value instanceof BigInteger) {
        builder.add((BigInteger) value);
      } else if (value instanceof BigDecimal) {
        builder.add((BigDecimal) value);
      } else if (value instanceof Short) {
        builder.add(value.shortValue());
      } else {
        builder.add(value.doubleValue());
      }
    }
    return this;
  }

  @Override
  @JsIgnore
  public SequenceEncoder beginEncodeArray() {
    return new JsonSequenceEncoder(this);
  }

  @Override
  @JsIgnore
  public SequenceEncoder encodeObjects(ObjectEncoder encoder, Object... obj) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  @JsIgnore
  public SequenceEncoder end() {
    JsonSequenceEncoder p = this.parent;
    if (p != null) {
      p.builder.add(this.builder);
    }
    return p;
  }

  @Override
  @JsIgnore
  @SuppressWarnings("unusable-by-js")
  public JsonValue getEncoded() {
    return builder.build();
  }
}
