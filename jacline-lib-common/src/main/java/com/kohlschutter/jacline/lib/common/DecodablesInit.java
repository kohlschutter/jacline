package com.kohlschutter.jacline.lib.common;

import java.util.ServiceLoader;

final class DecodablesInit {
  private DecodablesInit() {
  }

  static void init() {
    for (@SuppressWarnings("unused")
    Encodable en : ServiceLoader.load(Encodable.class)) {
      // trigger static initializers
    }
  }
}
