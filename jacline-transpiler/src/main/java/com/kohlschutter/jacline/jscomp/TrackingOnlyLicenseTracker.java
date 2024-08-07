/*
 * jacline
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
package com.kohlschutter.jacline.jscomp;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodePrinter.LicenseTracker;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;

public final class TrackingOnlyLicenseTracker implements LicenseTracker {
  private final AbstractCompiler compiler;
  private final Set<String> seenLicenses = new LinkedHashSet<>();
  private String lastSeenFile = "";

  @SuppressFBWarnings("EI_EXPOSE_REP2")
  public TrackingOnlyLicenseTracker(AbstractCompiler compiler) {
    this.compiler = compiler;
  }

  private boolean shouldUseLicenseInfo(Node node) {
    return !node.isRoot() && !node.isScript();
  }

  @Override
  public void trackLicensesForNode(Node node) {
    if (!shouldUseLicenseInfo(node)) {
      return;
    }
    String file = node.getSourceFileName();
    if (file == null || file.equals(lastSeenFile)) {
      return;
    }
    lastSeenFile = file;

    String license = Compiler.getLicenseForFile(compiler, file);
    if (license == null) {
      return;
    }
    seenLicenses.add(license);
  }

  @Override
  public ImmutableSet<String> emitLicenses() {
    return ImmutableSet.of();
  }

  public Set<String> getSeenLicenses() {
    return Collections.unmodifiableSet(seenLicenses);
  }
}
