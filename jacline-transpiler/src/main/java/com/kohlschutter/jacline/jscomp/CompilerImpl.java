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

import com.google.javascript.jscomp.CodePrinter.LicenseTracker;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;

public final class CompilerImpl extends Compiler {
  private boolean suppressReport;

  public CompilerImpl() {
    super(System.err); // FIXME
  }

  @Override
  public String toSource() {
    return toSource(new TrackingOnlyLicenseTracker(this));
  }

  /** Converts the main parse tree back to JS code. */
  public String toSource(LicenseTracker lt) {
    return runInCompilerThread(() -> {
      CodeBuilder cb = new CodeBuilder();
      // We are emitting all the sources at once, so use the SingleBinaryLicenseTracker
      // to de-dupe seen licenses across all inputs.
      Node jsRoot = getJsRoot();
      if (jsRoot != null) {
        int i = 0;
        for (Node scriptNode = jsRoot.getFirstChild(); scriptNode != null; scriptNode = scriptNode
            .getNext()) {
          toSource(cb, lt, i++, scriptNode);
        }
      }
      return cb.toString();
    });
  }

  @Override
  public void generateReport() {
    if (!isSuppressReport()) {
      super.generateReport();
    }
  }

  public boolean isSuppressReport() {
    return suppressReport;
  }

  public void setSuppressReport(boolean suppressReport) {
    this.suppressReport = suppressReport;
  }
}
