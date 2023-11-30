package com.kohlschutter.jacline.lib.common.vanilla;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import com.kohlschutter.jacline.lib.common.ArrayDecoder;
import com.kohlschutter.jacline.lib.common.DecodingException;
import com.kohlschutter.jacline.lib.common.KeyDecoder;
import com.kohlschutter.jacline.lib.common.ObjectDecoder;

import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;

public class JsonKeyDecoder implements KeyDecoder {
  private static final JsonProvider PROVIDER = JsonProvider.provider();
  private final JsonParser parser;
  private final JsonObject object;

  public JsonKeyDecoder(String expectedCodedType, Object encoded) throws DecodingException {
    if (encoded == null) {
      parser = null;
      object = null;
    } else if (encoded instanceof JsonObject) {
      parser = null;
      object = (JsonObject) encoded;
    } else {
      if (encoded instanceof Reader) {
        parser = PROVIDER.createParser((Reader) encoded);
      } else {
        parser = PROVIDER.createParser(new StringReader(encoded.toString()));
      }
      if (parser.hasNext()) {
        Event next = parser.next();
        if (next != Event.START_OBJECT) {
          throw new DecodingException("Not an object");
        }
        object = parser.getObject();
      } else {
        object = null;
      }
    }

    if (expectedCodedType != null && object != null) {
      String javaClass = stringForKey("javaClass");
      if (!expectedCodedType.equals(javaClass)) {
        throw DecodingException.withUnexpectedType(expectedCodedType, javaClass);
      }
    }
  }

  private boolean isNull(String key) {
    return object == null || !object.containsKey(key) || object.isNull(key);
  }

  @Override
  public String stringForKey(String key) {
    return isNull(key) ? null : object.getString(key);
  }

  @Override
  public Boolean booleanForKey(String key) {
    return isNull(key) ? null : object.getBoolean(key);
  }

  @Override
  public Number numberForKey(String key) {
    return isNull(key) ? null : object.getJsonNumber(key).numberValue();
  }

  @Override
  public <T> T[] arrayForKey(String key, ArrayDecoder<T> decoder) throws DecodingException {
    if (isNull(key)) {
      return null;
    }
    JsonArray jsonArray = object.getJsonArray(key);
    return decoder.decode(jsonArray);
  }

  @SuppressWarnings("null")
  @Override
  public <T> T objectForKey(String key, ObjectDecoder<T> decoder) throws DecodingException {
    if (isNull(key)) {
      return null;
    }
    JsonObject jsonObject = object.getJsonObject(key);
    return decoder.decode(jsonObject);
  }

  @Override
  public boolean hasKey(String key) {
    return object != null && object.containsKey(key);
  }

  @Override
  public void close() throws IOException {
    if (parser != null) {
      parser.close();
    }
  }
}
