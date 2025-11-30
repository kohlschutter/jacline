package jsinterop.generator.model;

public abstract class AbstractRewriter extends ProcessorPrivate {

  public boolean shouldProcessAbstractTypeReference(AbstractTypeReference abstractTypeReference) {
    return shouldProcessTypeReference(abstractTypeReference);
  }

  public boolean shouldProcessArrayTypeReference(ArrayTypeReference arrayTypeReference) {
    return shouldProcessTypeReference(arrayTypeReference);
  }

  public boolean shouldProcessCastExpression(CastExpression castExpression) {
    return shouldProcessExpression(castExpression);
  }

  public boolean shouldProcessEntity(Entity entity) {
    return true;
  }

  public boolean shouldProcessExpression(Expression expression) {
    return true;
  }

  public boolean shouldProcessExpressionStatement(ExpressionStatement expressionStatement) {
    return shouldProcessStatement(expressionStatement);
  }

  public boolean shouldProcessField(Field field) {
    return shouldProcessEntity(field);
  }

  public boolean shouldProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return shouldProcessExpression(instanceOfExpression);
  }

  public boolean shouldProcessJavaTypeReference(JavaTypeReference javaTypeReference) {
    return shouldProcessAbstractTypeReference(javaTypeReference);
  }

  public boolean shouldProcessLiteralExpression(LiteralExpression literalExpression) {
    return shouldProcessExpression(literalExpression);
  }

  public boolean shouldProcessMethod(Method method) {
    return shouldProcessEntity(method);
  }

  public boolean shouldProcessMethodInvocation(MethodInvocation methodInvocation) {
    return shouldProcessExpression(methodInvocation);
  }

  public boolean shouldProcessParameter(Parameter parameter) {
    return true;
  }

  public boolean shouldProcessParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference) {
    return shouldProcessAbstractTypeReference(parametrizedTypeReference);
  }

  public boolean shouldProcessProgram(Program program) {
    return true;
  }

  public boolean shouldProcessReturnStatement(ReturnStatement returnStatement) {
    return shouldProcessStatement(returnStatement);
  }

  public boolean shouldProcessStatement(Statement statement) {
    return true;
  }

  public boolean shouldProcessType(Type type) {
    return shouldProcessEntity(type);
  }

  public boolean shouldProcessTypeQualifier(TypeQualifier typeQualifier) {
    return shouldProcessExpression(typeQualifier);
  }

  public boolean shouldProcessTypeReference(TypeReference typeReference) {
    return true;
  }

  public boolean shouldProcessTypeVariableReference(TypeVariableReference typeVariableReference) {
    return shouldProcessAbstractTypeReference(typeVariableReference);
  }

  public boolean shouldProcessUnionTypeReference(UnionTypeReference unionTypeReference) {
    return shouldProcessTypeReference(unionTypeReference);
  }

  public boolean shouldProcessWildcardTypeReference(WildcardTypeReference wildcardTypeReference) {
    return shouldProcessTypeReference(wildcardTypeReference);
  }
  @Override
  final TypeReference postProcessAbstractTypeReference(AbstractTypeReference abstractTypeReference) {
    return rewriteAbstractTypeReference(abstractTypeReference);
  }

  @Override
  final TypeReference postProcessArrayTypeReference(ArrayTypeReference arrayTypeReference) {
    return rewriteArrayTypeReference(arrayTypeReference);
  }

  @Override
  final Expression postProcessCastExpression(CastExpression castExpression) {
    return rewriteCastExpression(castExpression);
  }

  @Override
  final Entity postProcessEntity(Entity entity) {
    return rewriteEntity(entity);
  }

  @Override
  final Expression postProcessExpression(Expression expression) {
    return rewriteExpression(expression);
  }

  @Override
  final Statement postProcessExpressionStatement(ExpressionStatement expressionStatement) {
    return rewriteExpressionStatement(expressionStatement);
  }

  @Override
  final Entity postProcessField(Field field) {
    return rewriteField(field);
  }

  @Override
  final Expression postProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return rewriteInstanceOfExpression(instanceOfExpression);
  }

  @Override
  final TypeReference postProcessJavaTypeReference(JavaTypeReference javaTypeReference) {
    return rewriteJavaTypeReference(javaTypeReference);
  }

  @Override
  final Expression postProcessLiteralExpression(LiteralExpression literalExpression) {
    return rewriteLiteralExpression(literalExpression);
  }

  @Override
  final Entity postProcessMethod(Method method) {
    return rewriteMethod(method);
  }

  @Override
  final Expression postProcessMethodInvocation(MethodInvocation methodInvocation) {
    return rewriteMethodInvocation(methodInvocation);
  }

  @Override
  final Parameter postProcessParameter(Parameter parameter) {
    return rewriteParameter(parameter);
  }

  @Override
  final TypeReference postProcessParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference) {
    return rewriteParametrizedTypeReference(parametrizedTypeReference);
  }

  @Override
  final Program postProcessProgram(Program program) {
    return rewriteProgram(program);
  }

  @Override
  final Statement postProcessReturnStatement(ReturnStatement returnStatement) {
    return rewriteReturnStatement(returnStatement);
  }

  @Override
  final Statement postProcessStatement(Statement statement) {
    return rewriteStatement(statement);
  }

  @Override
  final Entity postProcessType(Type type) {
    return rewriteType(type);
  }

  @Override
  final Expression postProcessTypeQualifier(TypeQualifier typeQualifier) {
    return rewriteTypeQualifier(typeQualifier);
  }

  @Override
  final TypeReference postProcessTypeReference(TypeReference typeReference) {
    return rewriteTypeReference(typeReference);
  }

  @Override
  final TypeReference postProcessTypeVariableReference(TypeVariableReference typeVariableReference) {
    return rewriteTypeVariableReference(typeVariableReference);
  }

  @Override
  final TypeReference postProcessUnionTypeReference(UnionTypeReference unionTypeReference) {
    return rewriteUnionTypeReference(unionTypeReference);
  }

  @Override
  final TypeReference postProcessWildcardTypeReference(WildcardTypeReference wildcardTypeReference) {
    return rewriteWildcardTypeReference(wildcardTypeReference);
  }


  public TypeReference  rewriteAbstractTypeReference(AbstractTypeReference abstractTypeReference) {
    return rewriteTypeReference(abstractTypeReference);
  }

  public TypeReference  rewriteArrayTypeReference(ArrayTypeReference arrayTypeReference) {
    return rewriteTypeReference(arrayTypeReference);
  }

  public Expression  rewriteCastExpression(CastExpression castExpression) {
    return rewriteExpression(castExpression);
  }

  public Entity  rewriteEntity(Entity entity) {
    return entity;
  }

  public Expression  rewriteExpression(Expression expression) {
    return expression;
  }

  public Statement  rewriteExpressionStatement(ExpressionStatement expressionStatement) {
    return rewriteStatement(expressionStatement);
  }

  public Entity  rewriteField(Field field) {
    return rewriteEntity(field);
  }

  public Expression  rewriteInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return rewriteExpression(instanceOfExpression);
  }

  public TypeReference  rewriteJavaTypeReference(JavaTypeReference javaTypeReference) {
    return rewriteAbstractTypeReference(javaTypeReference);
  }

  public Expression  rewriteLiteralExpression(LiteralExpression literalExpression) {
    return rewriteExpression(literalExpression);
  }

  public Entity  rewriteMethod(Method method) {
    return rewriteEntity(method);
  }

  public Expression  rewriteMethodInvocation(MethodInvocation methodInvocation) {
    return rewriteExpression(methodInvocation);
  }

  public Parameter  rewriteParameter(Parameter parameter) {
    return parameter;
  }

  public TypeReference  rewriteParametrizedTypeReference(ParametrizedTypeReference parametrizedTypeReference) {
    return rewriteAbstractTypeReference(parametrizedTypeReference);
  }

  public Program  rewriteProgram(Program program) {
    return program;
  }

  public Statement  rewriteReturnStatement(ReturnStatement returnStatement) {
    return rewriteStatement(returnStatement);
  }

  public Statement  rewriteStatement(Statement statement) {
    return statement;
  }

  public Entity  rewriteType(Type type) {
    return rewriteEntity(type);
  }

  public Expression  rewriteTypeQualifier(TypeQualifier typeQualifier) {
    return rewriteExpression(typeQualifier);
  }

  public TypeReference  rewriteTypeReference(TypeReference typeReference) {
    return typeReference;
  }

  public TypeReference  rewriteTypeVariableReference(TypeVariableReference typeVariableReference) {
    return rewriteAbstractTypeReference(typeVariableReference);
  }

  public TypeReference  rewriteUnionTypeReference(UnionTypeReference unionTypeReference) {
    return rewriteTypeReference(unionTypeReference);
  }

  public TypeReference  rewriteWildcardTypeReference(WildcardTypeReference wildcardTypeReference) {
    return rewriteTypeReference(wildcardTypeReference);
  }
}
