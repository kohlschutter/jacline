package com.google.j2cl.transpiler;

import com.google.j2cl.common.Problems;

public final class JaclineUtil {
  private JaclineUtil() {
  }

  public static void transpile(J2clTranspilerOptions options, Problems problems) {
    J2clTranspiler.transpile(options, problems);
  }
}
