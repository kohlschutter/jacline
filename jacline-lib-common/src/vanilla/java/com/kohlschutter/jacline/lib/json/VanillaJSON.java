package com.kohlschutter.jacline.lib.json;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kohlschutter.jacline.lib.coding.Codable;
import com.kohlschutter.jacline.lib.coding.CodingSupportProviderJsonImpl;
import com.kohlschutter.jacline.lib.exception.JsException;

import elemental2.core.SyntaxError;
import jakarta.json.JsonArray;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParser.Event;

final class VanillaJSON {
  private static final JsonProvider PROVIDER = JsonProvider.provider();
  private static final CodingSupportProviderJsonImpl JSON_CODING =
      new CodingSupportProviderJsonImpl();

  @SuppressWarnings({"PMD.CognitiveComplexity"})
  public static String stringify(Object obj) {
    if (obj == null) {
      return "null";
    } else if (obj instanceof JsonValue) {
      return obj.toString();
    } else if (obj instanceof JsonObjectBuilder) {
      return obj.toString();
    } else if (obj instanceof JsonArrayBuilder) {
      return obj.toString();
    } else if (obj instanceof CharSequence) {
      return PROVIDER.createValue(obj.toString()).toString();
    } else if (obj instanceof Character) {
      return PROVIDER.createValue(obj.toString()).toString();
    } else if (obj instanceof Boolean) {
      return Boolean.toString((Boolean) obj);
    } else if (obj instanceof Number) {
      return PROVIDER.createValue((Number) obj).toString();
    } else if (obj instanceof Collection<?>) {
      return buildArray((Collection<?>) obj).toString();
    } else if (obj.getClass().isArray()) {
      return buildArray(toCollection(obj)).toString();
    } else if (obj instanceof Codable) {
      return ((Codable) obj).encode(JSON_CODING::keyEncoder).toString();
    } else if (obj instanceof Map) {
      Map<String, Object> outMap = new HashMap<>();
      for (Map.Entry<?, ?> en : ((Map<?, ?>) obj).entrySet()) {
        String key = String.valueOf(en.getValue());
        outMap.put(key, en.getValue());
      }
      return PROVIDER.createObjectBuilder(outMap).build().toString();
    } else {
      // nothing better than a fallback
      return PROVIDER.createValue(obj.toString()).toString();
    }
  }

  @SuppressWarnings({"PMD.CognitiveComplexity", "PMD.NcssCount"})
  private static Collection<?> toCollection(Object array) {
    Class<?> arrayClass = array.getClass();

    List<Object> list;
    if (arrayClass == int[].class) {
      int[] arr = (int[]) array;
      list = new ArrayList<>(arr.length);
      for (int i : arr) {
        list.add(i);
      }
    } else if (arrayClass == long[].class) {
      long[] arr = (long[]) array;
      list = new ArrayList<>(arr.length);
      for (long i : arr) {
        list.add(i);
      }
    } else if (arrayClass == short[].class) {
      short[] arr = (short[]) array;
      list = new ArrayList<>(arr.length);
      for (short i : arr) {
        list.add(i);
      }
    } else if (arrayClass == byte[].class) {
      byte[] arr = (byte[]) array;
      list = new ArrayList<>(arr.length);
      for (byte i : arr) {
        list.add(i);
      }
    } else if (arrayClass == float[].class) {
      float[] arr = (float[]) array;
      list = new ArrayList<>(arr.length);
      for (float i : arr) {
        list.add(i);
      }
    } else if (arrayClass == double[].class) {
      double[] arr = (double[]) array;
      list = new ArrayList<>(arr.length);
      for (double i : arr) {
        list.add(i);
      }
    } else if (arrayClass == boolean[].class) {
      boolean[] arr = (boolean[]) array;
      list = new ArrayList<>(arr.length);
      for (boolean i : arr) {
        list.add(i);
      }
    } else if (arrayClass == char[].class) {
      char[] arr = (char[]) array;
      list = new ArrayList<>(arr.length);
      for (char i : arr) {
        list.add(i);
      }
    } else {
      list = Arrays.asList((Object[]) array);
    }
    return list;
  }

  private static JsonArray buildArray(Collection<?> coll) {
    JsonArrayBuilder builder = PROVIDER.createArrayBuilder(coll);
    return builder.build();
  }

  public static Object parse(String json) throws JsException {
    JsonParser parser = PROVIDER.createParser(new StringReader(json));
    if (!parser.hasNext()) {
      return null;
    }
    Event event = parser.next();
    switch (event) {
      case START_ARRAY:
      case START_OBJECT:
      case VALUE_FALSE:
      case VALUE_TRUE:
      case VALUE_NULL:
      case VALUE_NUMBER:
      case VALUE_STRING:
        // permitted
        break;
      default:
        throw JsException.wrapAsJsException(new SyntaxError("Unexpected event state: " + event));
    }
    return parser.getValue();
  }
}
