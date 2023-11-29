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
package com.kohlschutter.jacline;

import java.io.PrintStream;
import java.io.PrintWriter;

public class JaclineException extends Exception {

  private static final long serialVersionUID = 1L;
  private final Problems problems;

  public JaclineException(Problems problems) {
    super();
    this.problems = problems;
  }

  public Problems getProblems() {
    return problems;
  }

  @Override
  public void printStackTrace(PrintStream s) {
    super.printStackTrace(s);
    problems.consumeMessages((msg) -> s.println("\t" + msg));
  }

  @Override
  public void printStackTrace(PrintWriter s) {
    super.printStackTrace(s);
    problems.consumeMessages((msg) -> s.println("\t" + msg));
  }
}
