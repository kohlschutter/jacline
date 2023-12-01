package java.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import jsinterop.annotations.JsFunction;

public final class ServiceLoader<S> implements Iterable<S> {
  private static final Map<String, Map<ServiceProvider<?>, ?>> JS_SERVICE_PROVIDERS =
      new HashMap<>();
  private final Class<S> service;
  private final Map<ServiceProvider<S>, S> implementations;

  @FunctionalInterface
  @JsFunction
  public static interface ServiceProvider<T> {
    T provideService();
  }

  private ServiceLoader(Class<S> service, Map<ServiceProvider<S>, S> implementations) {
    this.service = service;
    this.implementations = implementations;
  }

  @Override
  public Iterator<S> iterator() {
    if (implementations == null) {
      return Collections.emptyIterator();
    } else {
      final Iterator<Map.Entry<ServiceProvider<S>, S>> it = implementations.entrySet().iterator();
      return new Iterator<S>() {
        @Override
        public boolean hasNext() {
          return it.hasNext();
        }

        @Override
        public S next() {
          Map.Entry<ServiceProvider<S>, S> en = it.next();
          if (en.getValue() == null) {
            en.setValue(en.getKey().provideService());
          }

          return en.getValue();
        }
      };
    }
  }

  public static <S extends Object> void jaclineRegisterService(Class<S> service,
      ServiceProvider<S> implementation) {
    JS_SERVICE_PROVIDERS.computeIfAbsent(service.toString(), k -> new LinkedHashMap<>()).put(
        implementation, null);
  }

  @SuppressWarnings({"unchecked"})
  public static <S> ServiceLoader<S> load(Class<S> service) {
    return new ServiceLoader<S>(service, (Map<ServiceProvider<S>, S>)(Map<?,?>) JS_SERVICE_PROVIDERS.get(
        service.toString()));
  }

  public Optional<S> findFirst() {
    if (implementations == null || implementations.isEmpty()) {
      return Optional.empty();
    } else {
      return Optional.of(iterator().next());
    }
  }

  /**
   * Returns a string describing this service.
   *
   * @return A descriptive string
   */
  @Override
  public String toString() {
    return "java.util.ServiceLoader[" + service.getName() + "]";
  }
}
