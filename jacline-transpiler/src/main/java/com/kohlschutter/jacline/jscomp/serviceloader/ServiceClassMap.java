package com.kohlschutter.jacline.jscomp.serviceloader;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for ServiceLoader shim code generation.
 * 
 * @author Christian Kohlschütter
 */
public class ServiceClassMap {
  private final Map<String, ServiceClassInfo> serviceToProvider = new HashMap<>();
  private final Map<String, Map<String, ServiceClassInfo>> pathMapCandidates = new HashMap<>();

  public ServiceClassMap() {
  }

  public void register(String service, String provider) {
    ServiceClassInfo sci = serviceToProvider.computeIfAbsent(service, ServiceClassInfo::new)
        .addProvider(provider);

    int lastSep = Math.max(service.lastIndexOf('.'), service.lastIndexOf('$'));
    String basename = service.substring(lastSep + 1);

    pathMapCandidates.computeIfAbsent(basename, (k) -> new HashMap<>()).put(service, sci);
  }

  public Map<String, ServiceClassInfo> getServiceToProvider() {
    return Collections.unmodifiableMap(serviceToProvider);
  }

  public Map<String, Map<String, ServiceClassInfo>> getPathMapCandidates() {
    return Collections.unmodifiableMap(pathMapCandidates);
  }

  public void assertAllCovered() {
    for (ServiceClassInfo sci : serviceToProvider.values()) {
      if (!sci.isCovered()) {
        throw new IllegalStateException("Did not cover ServiceLoader mapping for service " + sci
            .getService());
      }
    }
  }
}
