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

import java.io.IOException;

public class StandardArrayDecoders {
  public static ArrayDecoder<Object> objects(KeyDecoderProvider provider) {
    return objectsWithDecoder(provider, null, (l) -> new Object[l]);
  }

  public static <T> ArrayDecoder<T> objectsWithDecoder(KeyDecoderProvider provider,
      ObjectDecoder<T> decoder, ArrayCreator<T> arrayCreator) {
    return (serialized) -> {
      try (SequenceDecoder dec = provider.sequenceDecoder(serialized)) {
        T[] array = arrayCreator.newArray(dec.size());
        dec.objects(array.length, decoder, (e) -> array[dec.position()] = e);
        assert (dec.position() == dec.size());
        return array;
      } catch (IOException e) {
        throw new CodingException(e);
      }
    };
  }

  public static ArrayDecoder<String> strings(CodingServiceProvider csp) {
    return (serialized) -> {
      try (SequenceDecoder dec = csp.sequenceDecoder(serialized)) {
        String[] array = new String[dec.size()];
        dec.strings(array.length, (e) -> array[dec.position()] = e);
        assert (dec.position() == dec.size());
        return array;
      } catch (IOException e) {
        throw new CodingException(e);
      }
    };
  }

  public static ArrayDecoder<Boolean> booleans(CodingServiceProvider csp) {
    return (serialized) -> {
      try (SequenceDecoder dec = csp.sequenceDecoder(serialized)) {
        Boolean[] array = new Boolean[dec.size()];
        dec.booleans(array.length, (e) -> array[dec.position()] = e);
        assert (dec.position() == dec.size());
        return array;
      } catch (IOException e) {
        throw new CodingException(e);
      }
    };
  }

  public static ArrayDecoder<Number> numbers(CodingServiceProvider csp) throws CodingException {
    return (serialized) -> {
      try (SequenceDecoder dec = csp.sequenceDecoder(serialized)) {
        Number[] array = new Number[dec.size()];
        dec.numbers(array.length, (e) -> array[dec.position()] = e);
        assert (dec.position() == dec.size());
        return array;
      } catch (IOException e) {
        throw new CodingException(e);
      }
    };
  }

  public static ArrayDecoder<Object[]> arrays(CodingServiceProvider csp) {
    return arraysWithDecoder(csp, null, (l) -> new Object[l][]);
  }

  public static <T> ArrayDecoder<T[]> arraysWithDecoder(CodingServiceProvider csp,
      ArrayDecoder<T> decoder, ArrayCreator<T[]> arrayCreator) {
    return (serialized) -> {
      try (SequenceDecoder dec = csp.sequenceDecoder(serialized)) {
        T[][] array = arrayCreator.newArray(dec.size());
        dec.arrays(array.length, decoder, (e) -> array[dec.position()] = e);
        assert (dec.position() == dec.size());
        return array;
      } catch (IOException e) {
        throw new CodingException(e);
      }
    };
  }
}
