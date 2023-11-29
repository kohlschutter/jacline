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

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class Problems {
  private String stage = "default";
  private final List<Problem> errors = new ArrayList<>();
  private final List<Problem> warnings = new ArrayList<>();
  private final List<Problem> infoMessages = new ArrayList<>();

  public static final class Problem {
    String stage;
    String message;

    private Problem(String stage, String message) {
      this.stage = stage;
      this.message = message;
    }

    public String getStage() {
      return stage;
    }

    public String getMessage() {
      return message;
    }

    @Override
    public String toString() {
      return stage + ": " + message;
    }
  }

  public static Problems of(Problems... list) {
    if (list.length == 1) {
      return list[0];
    }
    Problems out = new Problems();
    for (Problems p : list) {
      out.updateFrom(p);
    }
    return out;
  }

  public Problems() {
  }

  public void updateFrom(Problems other) {
    errors.addAll(other.getErrors());
    warnings.addAll(other.getWarnings());
    infoMessages.addAll(other.getInfoMessages());
    this.stage = other.stage;
  }

  public boolean hasErrors() {
    return !errors.isEmpty();
  }

  public void addError(String s) {
    errors.add(new Problem(stage, s));
  }

  public void addErrors(List<String> list) {
    for (String s : list) {
      addError(s);
    }
  }

  public void addWarning(String s) {
    warnings.add(new Problem(stage, s));
  }

  public void addWarnings(List<String> list) {
    for (String s : list) {
      addWarning(s);
    }
  }

  public void addInfoMessage(String s) {
    infoMessages.add(new Problem(stage, s));
  }

  public void addInfoMessages(List<String> list) {
    for (String s : list) {
      addInfoMessage(s);
    }
  }

  public void consumeMessages(Consumer<String> msg) {
    for (Problem s : getErrors()) {
      msg.accept(s.toString());
    }
    for (Problem s : getWarnings()) {
      msg.accept(s.toString());
    }
    for (Problem s : getInfoMessages()) {
      msg.accept(s.toString());
    }
  }

  public List<Problem> getErrors() {
    return errors;
  }

  public List<Problem> getWarnings() {
    return warnings;
  }

  public List<Problem> getInfoMessages() {
    return infoMessages;
  }

  public Problems newSnapshot() {
    Problems prob = new Problems();
    prob.updateFrom(this);
    return prob;
  }

  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }
}
