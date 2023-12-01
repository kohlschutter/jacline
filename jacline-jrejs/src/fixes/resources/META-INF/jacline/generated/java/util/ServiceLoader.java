package java.util;

public final class ServiceLoader<S> implements Iterable<S> {
  private final Class<S> service;

  private ServiceLoader(Class<S> service) {
    this.service = service;
  }

  public Iterator<S> iterator() {
    return Collections.emptyIterator();
  }

  public static <S> ServiceLoader<S> load(Class<S> service) {
    return new ServiceLoader<>(service);
  }

  public Optional<S> findFirst() {
    return Optional.empty();
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
