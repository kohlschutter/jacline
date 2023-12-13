/*
 * Copyright 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package jsinterop.generator.visitor;

import static jsinterop.generator.helper.ModelHelper.isGlobalType;

import jsinterop.generator.model.AbstractVisitor;
import jsinterop.generator.model.AccessModifier;
import jsinterop.generator.model.Program;
import jsinterop.generator.model.Type;

/**
 * Traverses the Program and write the dependency file. This file makes the link between typescript
 * type and java type and is used when a generated library is used as dependency of another
 * generated library. The generator uses this file to know that a java type has already been
 * generated for a typescript type.
 */
public class DependencyFileWriter {
  public static String render(Program program) {
    StringBuilder fileContentBuilder = new StringBuilder();

    program.accept(
        new AbstractVisitor() {
          @Override
          public boolean enterType(Type type) {
            if (!isGlobalType(type)
                && !type.isExtern()
                && !type.isExtensionType()
                && type.getAccessModifier() == AccessModifier.PUBLIC) {
              fileContentBuilder
                  .append(type.getNativeFqn())
                  .append("=")
                  .append(type.getJavaFqn())
                  .append("\n");
            }

            // Inner types are generated by the compiler and won't be referenced by
            // another third party libraries
            return false;
          }
        });

    return fileContentBuilder.toString();
  }
}
