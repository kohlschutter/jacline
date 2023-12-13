package jsinterop.generator.model;

public abstract class AbstractVisitor extends ProcessorPrivate {

  @Override
  final boolean shouldProcessAbstractTypeReference(AbstractTypeReference abstractTypeReference) {
    return enterAbstractTypeReference(abstractTypeReference);
  }

  @Override
  final boolean shouldProcessArrayTypeReference(ArrayTypeReference arrayTypeReference) {
    return enterArrayTypeReference(arrayTypeReference);
  }

  @Override
  final boolean shouldProcessCastExpression(CastExpression castExpression) {
    return enterCastExpression(castExpression);
  }

  @Override
  final boolean shouldProcessEntity(Entity entity) {
    return enterEntity(entity);
  }

  @Override
  final boolean shouldProcessExpression(Expression expression) {
    return enterExpression(expression);
  }

  @Override
  final boolean shouldProcessExpressionStatement(ExpressionStatement expressionStatement) {
    return enterExpressionStatement(expressionStatement);
  }

  @Override
  final boolean shouldProcessField(Field field) {
    return enterField(field);
  }

  @Override
  final boolean shouldProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return enterInstanceOfExpression(instanceOfExpression);
  }

  @Override
  final boolean shouldProcessJavaTypeReference(JavaTypeReference javaTypeReference) {
    return enterJavaTypeReference(javaTypeReference);
  }

  @Override
  final boolean shouldProcessLiteralExpression(LiteralExpression literalExpression) {
    return enterLiteralExpression(literalExpression);
  }

  @Override
  final boolean shouldProcessMethod(Method method) {
    return enterMethod(method);
  }

  @Override
  final boolean shouldProcessMethodInvocation(MethodInvocation methodInvocation) {
    return enterMethodInvocation(methodInvocation);
  }

  @Override
  final boolean shouldProcessParameter(Parameter parameter) {
    return enterParameter(parameter);
  }

  @Override
  final boolean shouldProcessParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference) {
    return enterParametrizedTypeReference(parametrizedTypeReference);
  }

  @Override
  final boolean shouldProcessPredefinedTypeReference(PredefinedTypeReference predefinedTypeReference) {
    return enterPredefinedTypeReference(predefinedTypeReference);
  }

  @Override
  final boolean shouldProcessProgram(Program program) {
    return enterProgram(program);
  }

  @Override
  final boolean shouldProcessReturnStatement(ReturnStatement returnStatement) {
    return enterReturnStatement(returnStatement);
  }

  @Override
  final boolean shouldProcessStatement(Statement statement) {
    return enterStatement(statement);
  }

  @Override
  final boolean shouldProcessType(Type type) {
    return enterType(type);
  }

  @Override
  final boolean shouldProcessTypeQualifier(TypeQualifier typeQualifier) {
    return enterTypeQualifier(typeQualifier);
  }

  @Override
  final boolean shouldProcessTypeReference(TypeReference typeReference) {
    return enterTypeReference(typeReference);
  }

  @Override
  final boolean shouldProcessTypeVariableReference(TypeVariableReference typeVariableReference) {
    return enterTypeVariableReference(typeVariableReference);
  }

  @Override
  final boolean shouldProcessUnionTypeReference(UnionTypeReference unionTypeReference) {
    return enterUnionTypeReference(unionTypeReference);
  }

  @Override
  final boolean shouldProcessWildcardTypeReference(WildcardTypeReference wildcardTypeReference) {
    return enterWildcardTypeReference(wildcardTypeReference);
  }

  @Override
  final TypeReference postProcessAbstractTypeReference(AbstractTypeReference abstractTypeReference) {
    exitAbstractTypeReference(abstractTypeReference);
    return abstractTypeReference;
  }

  @Override
  final TypeReference postProcessArrayTypeReference(ArrayTypeReference arrayTypeReference) {
    exitArrayTypeReference(arrayTypeReference);
    return arrayTypeReference;
  }

  @Override
  final Expression postProcessCastExpression(CastExpression castExpression) {
    exitCastExpression(castExpression);
    return castExpression;
  }

  @Override
  final Entity postProcessEntity(Entity entity) {
    exitEntity(entity);
    return entity;
  }

  @Override
  final Expression postProcessExpression(Expression expression) {
    exitExpression(expression);
    return expression;
  }

  @Override
  final Statement postProcessExpressionStatement(ExpressionStatement expressionStatement) {
    exitExpressionStatement(expressionStatement);
    return expressionStatement;
  }

  @Override
  final Entity postProcessField(Field field) {
    exitField(field);
    return field;
  }

  @Override
  final Expression postProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    exitInstanceOfExpression(instanceOfExpression);
    return instanceOfExpression;
  }

  @Override
  final TypeReference postProcessJavaTypeReference(JavaTypeReference javaTypeReference) {
    exitJavaTypeReference(javaTypeReference);
    return javaTypeReference;
  }

  @Override
  final Expression postProcessLiteralExpression(LiteralExpression literalExpression) {
    exitLiteralExpression(literalExpression);
    return literalExpression;
  }

  @Override
  final Entity postProcessMethod(Method method) {
    exitMethod(method);
    return method;
  }

  @Override
  final Expression postProcessMethodInvocation(MethodInvocation methodInvocation) {
    exitMethodInvocation(methodInvocation);
    return methodInvocation;
  }

  @Override
  final Parameter postProcessParameter(Parameter parameter) {
    exitParameter(parameter);
    return parameter;
  }

  @Override
  final TypeReference postProcessParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference) {
    exitParametrizedTypeReference(parametrizedTypeReference);
    return parametrizedTypeReference;
  }

  @Override
  final TypeReference postProcessPredefinedTypeReference(PredefinedTypeReference predefinedTypeReference) {
    exitPredefinedTypeReference(predefinedTypeReference);
    return predefinedTypeReference;
  }

  @Override
  final Program postProcessProgram(Program program) {
    exitProgram(program);
    return program;
  }

  @Override
  final Statement postProcessReturnStatement(ReturnStatement returnStatement) {
    exitReturnStatement(returnStatement);
    return returnStatement;
  }

  @Override
  final Statement postProcessStatement(Statement statement) {
    exitStatement(statement);
    return statement;
  }

  @Override
  final Entity postProcessType(Type type) {
    exitType(type);
    return type;
  }

  @Override
  final Expression postProcessTypeQualifier(TypeQualifier typeQualifier) {
    exitTypeQualifier(typeQualifier);
    return typeQualifier;
  }

  @Override
  final TypeReference postProcessTypeReference(TypeReference typeReference) {
    exitTypeReference(typeReference);
    return typeReference;
  }

  @Override
  final TypeReference postProcessTypeVariableReference(TypeVariableReference typeVariableReference) {
    exitTypeVariableReference(typeVariableReference);
    return typeVariableReference;
  }

  @Override
  final TypeReference postProcessUnionTypeReference(UnionTypeReference unionTypeReference) {
    exitUnionTypeReference(unionTypeReference);
    return unionTypeReference;
  }

  @Override
  final TypeReference postProcessWildcardTypeReference(WildcardTypeReference wildcardTypeReference) {
    exitWildcardTypeReference(wildcardTypeReference);
    return wildcardTypeReference;
  }

  public boolean enterAbstractTypeReference(AbstractTypeReference abstractTypeReference) {
    return enterTypeReference(abstractTypeReference);
  }

  public boolean enterArrayTypeReference(ArrayTypeReference arrayTypeReference) {
    return enterTypeReference(arrayTypeReference);
  }

  public boolean enterCastExpression(CastExpression castExpression) {
    return enterExpression(castExpression);
  }

  public boolean enterEntity(Entity entity) {
    return true;
  }

  public boolean enterExpression(Expression expression) {
    return true;
  }

  public boolean enterExpressionStatement(ExpressionStatement expressionStatement) {
    return enterStatement(expressionStatement);
  }

  public boolean enterField(Field field) {
    return enterEntity(field);
  }

  public boolean enterInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return enterExpression(instanceOfExpression);
  }

  public boolean enterJavaTypeReference(JavaTypeReference javaTypeReference) {
    return enterAbstractTypeReference(javaTypeReference);
  }

  public boolean enterLiteralExpression(LiteralExpression literalExpression) {
    return enterExpression(literalExpression);
  }

  public boolean enterMethod(Method method) {
    return enterEntity(method);
  }

  public boolean enterMethodInvocation(MethodInvocation methodInvocation) {
    return enterExpression(methodInvocation);
  }

  public boolean enterParameter(Parameter parameter) {
    return true;
  }

  public boolean enterParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference) {
    return enterAbstractTypeReference(parametrizedTypeReference);
  }

  public boolean enterPredefinedTypeReference(PredefinedTypeReference predefinedTypeReference) {
    return enterTypeReference(predefinedTypeReference);
  }

  public boolean enterProgram(Program program) {
    return true;
  }

  public boolean enterReturnStatement(ReturnStatement returnStatement) {
    return enterStatement(returnStatement);
  }

  public boolean enterStatement(Statement statement) {
    return true;
  }

  public boolean enterType(Type type) {
    return enterEntity(type);
  }

  public boolean enterTypeQualifier(TypeQualifier typeQualifier) {
    return enterExpression(typeQualifier);
  }

  public boolean enterTypeReference(TypeReference typeReference) {
    return true;
  }

  public boolean enterTypeVariableReference(TypeVariableReference typeVariableReference) {
    return enterAbstractTypeReference(typeVariableReference);
  }

  public boolean enterUnionTypeReference(UnionTypeReference unionTypeReference) {
    return enterTypeReference(unionTypeReference);
  }

  public boolean enterWildcardTypeReference(WildcardTypeReference wildcardTypeReference) {
    return enterTypeReference(wildcardTypeReference);
  }

  public void exitAbstractTypeReference(AbstractTypeReference abstractTypeReference) {
    exitTypeReference(abstractTypeReference);
  }
  public void exitArrayTypeReference(ArrayTypeReference arrayTypeReference) {
    exitTypeReference(arrayTypeReference);
  }
  public void exitCastExpression(CastExpression castExpression) {
    exitExpression(castExpression);
  }
  public void exitEntity(Entity entity) {
  }
  public void exitExpression(Expression expression) {
  }
  public void exitExpressionStatement(ExpressionStatement expressionStatement) {
    exitStatement(expressionStatement);
  }
  public void exitField(Field field) {
    exitEntity(field);
  }
  public void exitInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    exitExpression(instanceOfExpression);
  }
  public void exitJavaTypeReference(JavaTypeReference javaTypeReference) {
    exitAbstractTypeReference(javaTypeReference);
  }
  public void exitLiteralExpression(LiteralExpression literalExpression) {
    exitExpression(literalExpression);
  }
  public void exitMethod(Method method) {
    exitEntity(method);
  }
  public void exitMethodInvocation(MethodInvocation methodInvocation) {
    exitExpression(methodInvocation);
  }
  public void exitParameter(Parameter parameter) {
  }
  public void exitParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference) {
    exitAbstractTypeReference(parametrizedTypeReference);
  }
  public void exitPredefinedTypeReference(PredefinedTypeReference predefinedTypeReference) {
    exitTypeReference(predefinedTypeReference);
  }
  public void exitProgram(Program program) {
  }
  public void exitReturnStatement(ReturnStatement returnStatement) {
    exitStatement(returnStatement);
  }
  public void exitStatement(Statement statement) {
  }
  public void exitType(Type type) {
    exitEntity(type);
  }
  public void exitTypeQualifier(TypeQualifier typeQualifier) {
    exitExpression(typeQualifier);
  }
  public void exitTypeReference(TypeReference typeReference) {
  }
  public void exitTypeVariableReference(TypeVariableReference typeVariableReference) {
    exitAbstractTypeReference(typeVariableReference);
  }
  public void exitUnionTypeReference(UnionTypeReference unionTypeReference) {
    exitTypeReference(unionTypeReference);
  }
  public void exitWildcardTypeReference(WildcardTypeReference wildcardTypeReference) {
    exitTypeReference(wildcardTypeReference);
  }
}
