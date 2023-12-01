package java.util;

public final class ServiceLoader<S> implements Iterable<S> {
  private static final Map<Class<Object>, Collection<Object>> JS_SERVICE = new HashMap<>();
  private final Class<S> service;
  private final Collection<S> implementations;

  private ServiceLoader(Class<S> service, Collection<S> implementations) {
    this.service = service;
    this.implementations = implementations;
  }

  public Iterator<S> iterator() {
    if (implementations == null) {
      return Collections.emptyIterator();
    } else {
      return implementations.iterator();
    }
  }

  public static <S extends Object> void jaclineRegisterService(Class<S> service, S implementation) {
    JS_SERVICE.computeIfAbsent((Class<Object>) service, k -> new LinkedHashSet<Object>()).add(
        implementation);
  }

  public static <S> ServiceLoader<S> load(Class<S> service) {
    return new ServiceLoader<>(service, (Collection<S>) JS_SERVICE.get(service));
  }

  public Optional<S> findFirst() {
    if (implementations == null || implementations.isEmpty()) {
      return Optional.empty();
    } else {
      return Optional.of(implementations.iterator().next());
    }
  }

  /**
   * Returns a string describing this service.
   *
   * @return A descriptive string
   */
  public String toString() {
    return "java.util.ServiceLoader[" + service.getName() + "]";
  }
}
