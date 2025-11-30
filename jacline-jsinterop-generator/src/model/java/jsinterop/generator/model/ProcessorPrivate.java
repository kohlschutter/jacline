package jsinterop.generator.model;

import com.google.j2cl.common.visitor.Processor;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Predicate;
import java.util.stream.Stream;

abstract class ProcessorPrivate implements Processor {

  private Deque<Object> stackOfContext = new ArrayDeque<Object>();

  final Object getCurrentContext() {
    return stackOfContext.peek();
  }


  private Deque<Field> stackOfField = new ArrayDeque<>();
  final void pushField(Field field) {
    stackOfContext.push(field);
    stackOfField.push(field);
  }
  final Field popField() {
    stackOfContext.pop();
    return stackOfField.pop();
  }
  public final Field getCurrentField() {
    return stackOfField.peek();
  }

  private Deque<Method> stackOfMethod = new ArrayDeque<>();
  final void pushMethod(Method method) {
    stackOfContext.push(method);
    stackOfMethod.push(method);
  }
  final Method popMethod() {
    stackOfContext.pop();
    return stackOfMethod.pop();
  }
  public final Method getCurrentMethod() {
    return stackOfMethod.peek();
  }

  private Deque<Parameter> stackOfParameter = new ArrayDeque<>();
  final void pushParameter(Parameter parameter) {
    stackOfContext.push(parameter);
    stackOfParameter.push(parameter);
  }
  final Parameter popParameter() {
    stackOfContext.pop();
    return stackOfParameter.pop();
  }
  public final Parameter getCurrentParameter() {
    return stackOfParameter.peek();
  }

  private Deque<ParametrizedTypeReference> stackOfParametrizedTypeReference = new ArrayDeque<>();
  final void pushParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference) {
    stackOfContext.push(parametrizedTypeReference);
    stackOfParametrizedTypeReference.push(parametrizedTypeReference);
  }
  final ParametrizedTypeReference popParametrizedTypeReference() {
    stackOfContext.pop();
    return stackOfParametrizedTypeReference.pop();
  }
  public final ParametrizedTypeReference getCurrentParametrizedTypeReference() {
    return stackOfParametrizedTypeReference.peek();
  }

  private Deque<Program> stackOfProgram = new ArrayDeque<>();
  final void pushProgram(Program program) {
    stackOfContext.push(program);
    stackOfProgram.push(program);
  }
  final Program popProgram() {
    stackOfContext.pop();
    return stackOfProgram.pop();
  }
  public final Program getCurrentProgram() {
    return stackOfProgram.peek();
  }

  private Deque<Type> stackOfType = new ArrayDeque<>();
  final void pushType(Type type) {
    stackOfContext.push(type);
    stackOfType.push(type);
  }
  final Type popType() {
    stackOfContext.pop();
    return stackOfType.pop();
  }
  public final Type getCurrentType() {
    return stackOfType.peek();
  }

  private Deque<Object> stackOfParent = new ArrayDeque<Object>();

  public Stream<Object> getParents() {
    return stackOfParent.stream();
  }

  public Object getParent() {
    return stackOfParent.peek();
  }

  public Object getParent(Predicate<Object> predicate) {
    return getParents().filter(predicate).findFirst().orElse(null);
  }

  final void pushParent(Object p) {
    stackOfParent.push(p);
  }

  final void popParent() {
    stackOfParent.pop();
  }

  abstract boolean shouldProcessAbstractTypeReference(AbstractTypeReference abstractTypeReference);
  abstract boolean shouldProcessArrayTypeReference(ArrayTypeReference arrayTypeReference);
  abstract boolean shouldProcessCastExpression(CastExpression castExpression);
  abstract boolean shouldProcessEntity(Entity entity);
  abstract boolean shouldProcessExpression(Expression expression);
  abstract boolean shouldProcessExpressionStatement(ExpressionStatement expressionStatement);
  abstract boolean shouldProcessField(Field field);
  abstract boolean shouldProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression);
  abstract boolean shouldProcessJavaTypeReference(JavaTypeReference javaTypeReference);
  abstract boolean shouldProcessLiteralExpression(LiteralExpression literalExpression);
  abstract boolean shouldProcessMethod(Method method);
  abstract boolean shouldProcessMethodInvocation(MethodInvocation methodInvocation);
  abstract boolean shouldProcessParameter(Parameter parameter);
  abstract boolean shouldProcessParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference);
  abstract boolean shouldProcessProgram(Program program);
  abstract boolean shouldProcessReturnStatement(ReturnStatement returnStatement);
  abstract boolean shouldProcessStatement(Statement statement);
  abstract boolean shouldProcessType(Type type);
  abstract boolean shouldProcessTypeQualifier(TypeQualifier typeQualifier);
  abstract boolean shouldProcessTypeReference(TypeReference typeReference);
  abstract boolean shouldProcessTypeVariableReference(TypeVariableReference typeVariableReference);
  abstract boolean shouldProcessUnionTypeReference(UnionTypeReference unionTypeReference);
  abstract boolean shouldProcessWildcardTypeReference(WildcardTypeReference wildcardTypeReference);

  abstract TypeReference postProcessAbstractTypeReference(AbstractTypeReference abstractTypeReference);
  abstract TypeReference postProcessArrayTypeReference(ArrayTypeReference arrayTypeReference);
  abstract Expression postProcessCastExpression(CastExpression castExpression);
  abstract Entity postProcessEntity(Entity entity);
  abstract Expression postProcessExpression(Expression expression);
  abstract Statement postProcessExpressionStatement(ExpressionStatement expressionStatement);
  abstract Entity postProcessField(Field field);
  abstract Expression postProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression);
  abstract TypeReference postProcessJavaTypeReference(JavaTypeReference javaTypeReference);
  abstract Expression postProcessLiteralExpression(LiteralExpression literalExpression);
  abstract Entity postProcessMethod(Method method);
  abstract Expression postProcessMethodInvocation(MethodInvocation methodInvocation);
  abstract Parameter postProcessParameter(Parameter parameter);
  abstract TypeReference postProcessParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference);
  abstract Program postProcessProgram(Program program);
  abstract Statement postProcessReturnStatement(ReturnStatement returnStatement);
  abstract Statement postProcessStatement(Statement statement);
  abstract Entity postProcessType(Type type);
  abstract Expression postProcessTypeQualifier(TypeQualifier typeQualifier);
  abstract TypeReference postProcessTypeReference(TypeReference typeReference);
  abstract TypeReference postProcessTypeVariableReference(TypeVariableReference typeVariableReference);
  abstract TypeReference postProcessUnionTypeReference(UnionTypeReference unionTypeReference);
  abstract TypeReference postProcessWildcardTypeReference(WildcardTypeReference wildcardTypeReference);
}
