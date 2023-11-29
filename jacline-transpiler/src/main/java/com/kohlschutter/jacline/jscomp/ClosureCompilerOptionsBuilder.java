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

import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DiagnosticGroups;

public final class ClosureCompilerOptionsBuilder {
  private static final class CommandLineRunnerOptionsAccess extends CommandLineRunner {

    protected CommandLineRunnerOptionsAccess(String[] args) {
      super(args);
    }

    public CompilerOptions getParsedOptions() {
      return createOptions();
    }
  }

  private ClosureCompilerOptionsBuilder() {
  }

  public static CompilerOptions newDefaultOptions() {
    CommandLineRunnerOptionsAccess clr = new CommandLineRunnerOptionsAccess(new String[] {
        "--dependency_mode=PRUNE", //
        "--compilation_level=ADVANCED", //
        "--entry_point=dummyEntryPoint" //
    });
    CompilerOptions options = clr.getParsedOptions();

    // options.setRemoveDeadCode(false);
    // options.setRenamingPolicy(VariableRenamingPolicy.LOCAL, PropertyRenamingPolicy.OFF);

    options.setDefineToBooleanLiteral("goog.DEBUG", false);

    // https://github.com/google/j2cl/blob/master/docs/best-practices.md#super-sourcing-writing-platform-specific-code
    options.setDefineToStringLiteral("jre.logging.logLevel", "OFF"); // OFF|SEVERE|WARNING|INFO|ALL
    options.setDefineToStringLiteral("jre.classMetadata", "STRIPPED"); // SIMPLE|STRIPPED
    options.setDefineToStringLiteral("jre.checks.checkLevel", "OPTIMIZED"); // NORMAL|OPTIMIZED|MINIMAL

    options.setWarningLevel(DiagnosticGroups.GLOBAL_THIS, CheckLevel.WARNING);
    options.setWarningLevel(DiagnosticGroups.NON_STANDARD_JSDOC, CheckLevel.OFF);
    options.setWarningLevel(DiagnosticGroups.MSG_CONVENTIONS, CheckLevel.OFF);

    return options;
  }
}
