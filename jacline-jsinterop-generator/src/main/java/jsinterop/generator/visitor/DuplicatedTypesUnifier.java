/*
 * Copyright 2017 Google Inc.
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

import static jsinterop.generator.model.EntityKind.CONSTRUCTOR;

import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jsinterop.generator.helper.ModelHelper;
import jsinterop.generator.model.AbstractVisitor;
import jsinterop.generator.model.Entity;
import jsinterop.generator.model.Field;
import jsinterop.generator.model.JavaTypeReference;
import jsinterop.generator.model.Method;
import jsinterop.generator.model.ModelVisitor;
import jsinterop.generator.model.Parameter;
import jsinterop.generator.model.Program;
import jsinterop.generator.model.Statement;
import jsinterop.generator.model.Type;
import jsinterop.generator.model.TypeReference;

/**
 * The generator generates interfaces for abstracting some concepts of typescript/closure like
 * function types, union types or literal types. By creating a different Java interfaces each time
 * we abstract one of these concepts, we could make APIs incompatible wrt. their parent contract.
 *
 * <pre>
 *  ex:
 *   Typescript code:
 *
 *   interface Foo {
 *     foo(bar: {baz: string}): void;
 *   }
 *
 *   class FooImpl implements Foo {
 *     foo(bar: {baz: string}): void;
 *   }
 *
 *   generated java code (jsinterop annotations omitted):
 *   interface Foo {
 *     interface FooBarType {
 *       String getBaz();
 *     }
 *
 *     void foo(Foo.FooBarType bar);
 *   }
 *
 *   class FooImpl implements Foo {
 *     interface FooBarType {
 *       String getBaz();
 *     }
 *
 *     void foo(FooImpl.FooBarType bar);
 *   }
 * </pre>
 *
 * The example clearly shows that the generated class FooImpl doesn't implement correctly the api of
 * the interface Foo.
 *
 * <p>This visitor will try to detect that case and collect the duplicated types.
 */
public class DuplicatedTypesUnifier implements ModelVisitor {
  private static final String TYPE_DELIMITER_PATTERN = "([{(,|<})>]|\\b)";

  private static String createTypeKey(Type type, String keyPrefix) {
    String typeKey = type.getNativeFqn();

    int i = 0;
    for (TypeReference typeParameter : type.getTypeParameters()) {
      // Because class Foo<T> { T field;) is structurally equivalent to class Foo<U> {U field;}.
      // We cannot use the name of type parameters to generate a unique key a type.  We are creating
      // an unique key for each type parameter that depends on their declaration index in the type
      // parameters declaration and replace each type parameter by this index.
      // EX: if we have an interface Foo<U,V> abstracting the native type function(U): V
      // the resulting key is function(%0): %1
      String key = "%" + i++;
      typeKey =
          typeKey.replaceAll(
              TYPE_DELIMITER_PATTERN + typeParameter.getTypeName() + TYPE_DELIMITER_PATTERN,
              "$1" + key + "$2");
    }

    return keyPrefix + "@" + typeKey;
  }

  private static String getKeyContextIfStatic(String currentKey, Entity member) {
    if (member.isStatic()) {
      return "%s%" + currentKey;
    }
    return currentKey;
  }

  private final Map<Type, Type> syntheticTypesToReplace = new HashMap<>();

  public Map<Type, Type> getTypesToReplace() {
    return ImmutableMap.copyOf(syntheticTypesToReplace);
  }

  @Override
  public void applyTo(Program program) {
    program.accept(new Visitor());
  }

  private class Visitor extends AbstractVisitor {

    private String currentKeyContext;
    private final Map<Type, Map<String, Type>> syntheticTypesByEnclosingType = new HashMap<>();

    public Visitor() {}

    @Override
    public boolean enterType(Type type) {
      // Don't visit:
      //  - types that have been already visited.
      //  - types that are synthetic type (because they don't implement any interfaces).
      if (syntheticTypesByEnclosingType.containsKey(type) || type.isSynthetic()) {
        return false;
      }

      // Synthetic type can be used in generics. In order to avoid a false positive match reset
      // the keyContext
      currentKeyContext = type.getJavaFqn();

      syntheticTypesByEnclosingType.put(type, getParentSyntheticTypes(type));

      // Don't need to traverse the type if there are no synthetic types defined in this type.
      return type.getInnerTypes().stream().anyMatch(Type::isSynthetic);
    }

    private Map<String, Type> getParentSyntheticTypes(Type type) {
      List<Type> parentInterfaces = ModelHelper.getParentInterfaces(type);
      // visit implemented/extended interfaces first
      parentInterfaces.forEach(t -> t.accept(this));

      Map<String, Type> syntheticTypesByKey = new HashMap<>();

      // Add existing synthetic types from parent interfaces
      for (Type parentInterface : parentInterfaces) {
        syntheticTypesByKey.putAll(syntheticTypesByEnclosingType.get(parentInterface));
      }

      return syntheticTypesByKey;
    }

    @Override
    public boolean enterMethod(Method method) {
      currentKeyContext = method.getKind() == CONSTRUCTOR ? "<constructor>" : method.getName();
      currentKeyContext = getKeyContextIfStatic(currentKeyContext, method);
      return true;
    }

    @Override
    public boolean enterParameter(Parameter parameter) {
      // By adding %p% to the key each time we visit a parameter, we take into account the position
      // of
      // the parameters in the method definition. With this technique we ensure that we are trying
      // to
      // match synthetic types that are used in the same method for the same parameter.
      currentKeyContext += "%p%";
      return true;
    }

    @Override
    public boolean enterStatement(Statement statement) {
      // We don't want to try to find a structural match for a synthetic type used in a type
      // reference
      // of a body statement. This process is only done at field/method declaration level.
      return false;
    }

    @Override
    public boolean enterField(Field field) {
      // If an interface defines a field, the class implementing the interface contains the field
      // definition and the getter and setter. In this case we will try to use the same synthetic
      // type
      // for the field and for the accessor methods.
      currentKeyContext = getKeyContextIfStatic(getGetterName(field), field);

      return true;
    }

    private String getGetterName(Field field) {
      return "get"
          + Ascii.toUpperCase(field.getName().substring(0, 1))
          + field.getName().substring(1);
    }

    @Override
    public boolean enterTypeReference(TypeReference typeReference) {
      if (typeReference instanceof JavaTypeReference) {
        visitJavaTypeReference(((JavaTypeReference) typeReference));
      }
      return true;
    }

    @SuppressWarnings("ReferenceEquality")
    private void visitJavaTypeReference(JavaTypeReference typeReference) {
      Type syntheticType = typeReference.getTypeDeclaration();

      if (!syntheticType.isSynthetic()) {
        // typeReference is not a reference to an synthetic type.
        return;
      }

      String typeKey = createTypeKey(syntheticType, currentKeyContext);

      Map<String, Type> syntheticTypesByKey =
          syntheticTypesByEnclosingType.get(syntheticType.getEnclosingType());

      Type existingSyntheticType = syntheticTypesByKey.get(typeKey);

      if (existingSyntheticType != null && existingSyntheticType != syntheticType) {
        // A type with the same structure is already generated.
        if (syntheticTypesToReplace.put(syntheticType, existingSyntheticType) == null) {
          // A synthetic type can have reference to other synthetic type like a function type in a
          // union type: (function(V):U|string).
          // Because a synthetic type is only referred one time (where they are used), so we are
          // sure they are not used outside the current synthetic type we are deleting so they
          // should be deleted as well.
          visitInnerSyntheticTypes(syntheticType);
        }
      } else {
        syntheticTypesByKey.put(typeKey, syntheticType);
      }
    }

    private void visitInnerSyntheticTypes(Type mainType) {
      mainType.accept(
          new AbstractVisitor() {
            @Override
            public boolean enterJavaTypeReference(JavaTypeReference typeReference) {

              Type javaType = typeReference.getTypeDeclaration();
              if (javaType.isSynthetic()
                  && !mainType.equals(javaType)
                  && mainType.getEnclosingType().equals(javaType.getEnclosingType())) {
                // These type just need to be removed. Their references doesn't need to be
                // replaced
                // because they are used in a synthetic type that will be removed as well.
                syntheticTypesToReplace.put(javaType, javaType);
              }
              return true;
            }
          });
    }
  }
}
