package com.google.j2cl.transpiler.ast;

public abstract class AbstractRewriter extends ProcessorPrivate {

  public boolean shouldProcessArrayAccess(ArrayAccess arrayAccess) {
    return shouldProcessExpression(arrayAccess);
  }

  public boolean shouldProcessArrayCreationReference(ArrayCreationReference arrayCreationReference) {
    return shouldProcessExpression(arrayCreationReference);
  }

  public boolean shouldProcessArrayLength(ArrayLength arrayLength) {
    return shouldProcessExpression(arrayLength);
  }

  public boolean shouldProcessArrayLiteral(ArrayLiteral arrayLiteral) {
    return shouldProcessExpression(arrayLiteral);
  }

  public boolean shouldProcessArrayTypeDescriptor(ArrayTypeDescriptor arrayTypeDescriptor) {
    return shouldProcessTypeDescriptor(arrayTypeDescriptor);
  }

  public boolean shouldProcessAssertStatement(AssertStatement assertStatement) {
    return shouldProcessStatement(assertStatement);
  }

  public boolean shouldProcessBinaryExpression(BinaryExpression binaryExpression) {
    return shouldProcessExpression(binaryExpression);
  }

  public boolean shouldProcessBindingPattern(BindingPattern bindingPattern) {
    return shouldProcessPattern(bindingPattern);
  }

  public boolean shouldProcessBlock(Block block) {
    return shouldProcessStatement(block);
  }

  public boolean shouldProcessBooleanLiteral(BooleanLiteral booleanLiteral) {
    return shouldProcessLiteral(booleanLiteral);
  }

  public boolean shouldProcessBreakOrContinueStatement(BreakOrContinueStatement breakOrContinueStatement) {
    return shouldProcessStatement(breakOrContinueStatement);
  }

  public boolean shouldProcessBreakStatement(BreakStatement breakStatement) {
    return shouldProcessBreakOrContinueStatement(breakStatement);
  }

  public boolean shouldProcessCastExpression(CastExpression castExpression) {
    return shouldProcessExpression(castExpression);
  }

  public boolean shouldProcessCatchClause(CatchClause catchClause) {
    return shouldProcessNode(catchClause);
  }

  public boolean shouldProcessCompilationUnit(CompilationUnit compilationUnit) {
    return shouldProcessNode(compilationUnit);
  }

  public boolean shouldProcessConditionalExpression(ConditionalExpression conditionalExpression) {
    return shouldProcessExpression(conditionalExpression);
  }

  public boolean shouldProcessContinueStatement(ContinueStatement continueStatement) {
    return shouldProcessBreakOrContinueStatement(continueStatement);
  }

  public boolean shouldProcessDeclaredTypeDescriptor(DeclaredTypeDescriptor declaredTypeDescriptor) {
    return shouldProcessTypeDescriptor(declaredTypeDescriptor);
  }

  public boolean shouldProcessDoWhileStatement(DoWhileStatement doWhileStatement) {
    return shouldProcessLoopStatement(doWhileStatement);
  }

  public boolean shouldProcessEmbeddedStatement(EmbeddedStatement embeddedStatement) {
    return shouldProcessExpression(embeddedStatement);
  }

  public boolean shouldProcessExpression(Expression expression) {
    return shouldProcessNode(expression);
  }

  public boolean shouldProcessExpressionStatement(ExpressionStatement expressionStatement) {
    return shouldProcessStatement(expressionStatement);
  }

  public boolean shouldProcessExpressionWithComment(ExpressionWithComment expressionWithComment) {
    return shouldProcessExpression(expressionWithComment);
  }

  public boolean shouldProcessField(Field field) {
    return shouldProcessMember(field);
  }

  public boolean shouldProcessFieldAccess(FieldAccess fieldAccess) {
    return shouldProcessMemberReference(fieldAccess);
  }

  public boolean shouldProcessFieldDeclarationStatement(FieldDeclarationStatement fieldDeclarationStatement) {
    return shouldProcessStatement(fieldDeclarationStatement);
  }

  public boolean shouldProcessFieldDescriptor(FieldDescriptor fieldDescriptor) {
    return shouldProcessMemberDescriptor(fieldDescriptor);
  }

  public boolean shouldProcessForEachStatement(ForEachStatement forEachStatement) {
    return shouldProcessLoopStatement(forEachStatement);
  }

  public boolean shouldProcessForStatement(ForStatement forStatement) {
    return shouldProcessLoopStatement(forStatement);
  }

  public boolean shouldProcessFunctionExpression(FunctionExpression functionExpression) {
    return shouldProcessExpression(functionExpression);
  }

  public boolean shouldProcessIfStatement(IfStatement ifStatement) {
    return shouldProcessStatement(ifStatement);
  }

  public boolean shouldProcessInitializerBlock(InitializerBlock initializerBlock) {
    return shouldProcessMember(initializerBlock);
  }

  public boolean shouldProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return shouldProcessExpression(instanceOfExpression);
  }

  public boolean shouldProcessIntersectionTypeDescriptor(IntersectionTypeDescriptor intersectionTypeDescriptor) {
    return shouldProcessTypeDescriptor(intersectionTypeDescriptor);
  }

  public boolean shouldProcessInvocation(Invocation invocation) {
    return shouldProcessMemberReference(invocation);
  }

  public boolean shouldProcessJsAwaitExpression(JsAwaitExpression jsAwaitExpression) {
    return shouldProcessExpression(jsAwaitExpression);
  }

  public boolean shouldProcessJsConstructorReference(JsConstructorReference jsConstructorReference) {
    return shouldProcessExpression(jsConstructorReference);
  }

  public boolean shouldProcessJsDocCastExpression(JsDocCastExpression jsDocCastExpression) {
    return shouldProcessExpression(jsDocCastExpression);
  }

  public boolean shouldProcessJsDocExpression(JsDocExpression jsDocExpression) {
    return shouldProcessExpression(jsDocExpression);
  }

  public boolean shouldProcessJsForInStatement(JsForInStatement jsForInStatement) {
    return shouldProcessLoopStatement(jsForInStatement);
  }

  public boolean shouldProcessJsYieldExpression(JsYieldExpression jsYieldExpression) {
    return shouldProcessExpression(jsYieldExpression);
  }

  public boolean shouldProcessLabel(Label label) {
    return shouldProcessNameDeclaration(label);
  }

  public boolean shouldProcessLabelReference(LabelReference labelReference) {
    return shouldProcessNode(labelReference);
  }

  public boolean shouldProcessLabeledStatement(LabeledStatement labeledStatement) {
    return shouldProcessStatement(labeledStatement);
  }

  public boolean shouldProcessLibrary(Library library) {
    return shouldProcessNode(library);
  }

  public boolean shouldProcessLiteral(Literal literal) {
    return shouldProcessExpression(literal);
  }

  public boolean shouldProcessLocalClassDeclarationStatement(LocalClassDeclarationStatement localClassDeclarationStatement) {
    return shouldProcessStatement(localClassDeclarationStatement);
  }

  public boolean shouldProcessLocalFunctionDeclarationStatement(LocalFunctionDeclarationStatement localFunctionDeclarationStatement) {
    return shouldProcessStatement(localFunctionDeclarationStatement);
  }

  public boolean shouldProcessLoopStatement(LoopStatement loopStatement) {
    return shouldProcessStatement(loopStatement);
  }

  public boolean shouldProcessMember(Member member) {
    return shouldProcessNode(member);
  }

  public boolean shouldProcessMemberDescriptor(MemberDescriptor memberDescriptor) {
    return true;
  }

  public boolean shouldProcessMemberReference(MemberReference memberReference) {
    return shouldProcessExpression(memberReference);
  }

  public boolean shouldProcessMethod(Method method) {
    return shouldProcessMember(method);
  }

  public boolean shouldProcessMethodCall(MethodCall methodCall) {
    return shouldProcessInvocation(methodCall);
  }

  public boolean shouldProcessMethodDescriptor(MethodDescriptor methodDescriptor) {
    return shouldProcessMemberDescriptor(methodDescriptor);
  }

  public boolean shouldProcessMethodReference(MethodReference methodReference) {
    return shouldProcessExpression(methodReference);
  }

  public boolean shouldProcessMultiExpression(MultiExpression multiExpression) {
    return shouldProcessExpression(multiExpression);
  }

  public boolean shouldProcessNameDeclaration(NameDeclaration nameDeclaration) {
    return shouldProcessNode(nameDeclaration);
  }

  public boolean shouldProcessNewArray(NewArray newArray) {
    return shouldProcessExpression(newArray);
  }

  public boolean shouldProcessNewInstance(NewInstance newInstance) {
    return shouldProcessInvocation(newInstance);
  }

  public boolean shouldProcessNode(Node node) {
    return true;
  }

  public boolean shouldProcessNullLiteral(NullLiteral nullLiteral) {
    return shouldProcessLiteral(nullLiteral);
  }

  public boolean shouldProcessNumberLiteral(NumberLiteral numberLiteral) {
    return shouldProcessLiteral(numberLiteral);
  }

  public boolean shouldProcessPattern(Pattern pattern) {
    return shouldProcessNode(pattern);
  }

  public boolean shouldProcessPostfixExpression(PostfixExpression postfixExpression) {
    return shouldProcessUnaryExpression(postfixExpression);
  }

  public boolean shouldProcessPrefixExpression(PrefixExpression prefixExpression) {
    return shouldProcessUnaryExpression(prefixExpression);
  }

  public boolean shouldProcessPrimitiveTypeDescriptor(PrimitiveTypeDescriptor primitiveTypeDescriptor) {
    return shouldProcessTypeDescriptor(primitiveTypeDescriptor);
  }

  public boolean shouldProcessReturnStatement(ReturnStatement returnStatement) {
    return shouldProcessStatement(returnStatement);
  }

  public boolean shouldProcessStatement(Statement statement) {
    return shouldProcessNode(statement);
  }

  public boolean shouldProcessStringLiteral(StringLiteral stringLiteral) {
    return shouldProcessLiteral(stringLiteral);
  }

  public boolean shouldProcessSuperReference(SuperReference superReference) {
    return shouldProcessThisOrSuperReference(superReference);
  }

  public boolean shouldProcessSwitchCase(SwitchCase switchCase) {
    return shouldProcessNode(switchCase);
  }

  public boolean shouldProcessSwitchExpression(SwitchExpression switchExpression) {
    return shouldProcessExpression(switchExpression);
  }

  public boolean shouldProcessSwitchStatement(SwitchStatement switchStatement) {
    return shouldProcessStatement(switchStatement);
  }

  public boolean shouldProcessSynchronizedStatement(SynchronizedStatement synchronizedStatement) {
    return shouldProcessStatement(synchronizedStatement);
  }

  public boolean shouldProcessThisOrSuperReference(ThisOrSuperReference thisOrSuperReference) {
    return shouldProcessExpression(thisOrSuperReference);
  }

  public boolean shouldProcessThisReference(ThisReference thisReference) {
    return shouldProcessThisOrSuperReference(thisReference);
  }

  public boolean shouldProcessThrowStatement(ThrowStatement throwStatement) {
    return shouldProcessStatement(throwStatement);
  }

  public boolean shouldProcessTryStatement(TryStatement tryStatement) {
    return shouldProcessStatement(tryStatement);
  }

  public boolean shouldProcessType(Type type) {
    return shouldProcessNode(type);
  }

  public boolean shouldProcessTypeDeclaration(TypeDeclaration typeDeclaration) {
    return true;
  }

  public boolean shouldProcessTypeDescriptor(TypeDescriptor typeDescriptor) {
    return true;
  }

  public boolean shouldProcessTypeLiteral(TypeLiteral typeLiteral) {
    return shouldProcessLiteral(typeLiteral);
  }

  public boolean shouldProcessUnaryExpression(UnaryExpression unaryExpression) {
    return shouldProcessExpression(unaryExpression);
  }

  public boolean shouldProcessUnionTypeDescriptor(UnionTypeDescriptor unionTypeDescriptor) {
    return shouldProcessTypeDescriptor(unionTypeDescriptor);
  }

  public boolean shouldProcessVariable(Variable variable) {
    return shouldProcessNameDeclaration(variable);
  }

  public boolean shouldProcessVariableDeclarationExpression(VariableDeclarationExpression variableDeclarationExpression) {
    return shouldProcessExpression(variableDeclarationExpression);
  }

  public boolean shouldProcessVariableDeclarationFragment(VariableDeclarationFragment variableDeclarationFragment) {
    return shouldProcessNode(variableDeclarationFragment);
  }

  public boolean shouldProcessVariableReference(VariableReference variableReference) {
    return shouldProcessExpression(variableReference);
  }

  public boolean shouldProcessWhileStatement(WhileStatement whileStatement) {
    return shouldProcessLoopStatement(whileStatement);
  }

  public boolean shouldProcessYieldStatement(YieldStatement yieldStatement) {
    return shouldProcessStatement(yieldStatement);
  }
  @Override
  final Node postProcessArrayAccess(ArrayAccess arrayAccess) {
    return rewriteArrayAccess(arrayAccess);
  }

  @Override
  final Node postProcessArrayCreationReference(ArrayCreationReference arrayCreationReference) {
    return rewriteArrayCreationReference(arrayCreationReference);
  }

  @Override
  final Node postProcessArrayLength(ArrayLength arrayLength) {
    return rewriteArrayLength(arrayLength);
  }

  @Override
  final Node postProcessArrayLiteral(ArrayLiteral arrayLiteral) {
    return rewriteArrayLiteral(arrayLiteral);
  }

  @Override
  final TypeDescriptor postProcessArrayTypeDescriptor(ArrayTypeDescriptor arrayTypeDescriptor) {
    return rewriteArrayTypeDescriptor(arrayTypeDescriptor);
  }

  @Override
  final Node postProcessAssertStatement(AssertStatement assertStatement) {
    return rewriteAssertStatement(assertStatement);
  }

  @Override
  final Node postProcessBinaryExpression(BinaryExpression binaryExpression) {
    return rewriteBinaryExpression(binaryExpression);
  }

  @Override
  final Node postProcessBindingPattern(BindingPattern bindingPattern) {
    return rewriteBindingPattern(bindingPattern);
  }

  @Override
  final Node postProcessBlock(Block block) {
    return rewriteBlock(block);
  }

  @Override
  final Node postProcessBooleanLiteral(BooleanLiteral booleanLiteral) {
    return rewriteBooleanLiteral(booleanLiteral);
  }

  @Override
  final Node postProcessBreakOrContinueStatement(BreakOrContinueStatement breakOrContinueStatement) {
    return rewriteBreakOrContinueStatement(breakOrContinueStatement);
  }

  @Override
  final Node postProcessBreakStatement(BreakStatement breakStatement) {
    return rewriteBreakStatement(breakStatement);
  }

  @Override
  final Node postProcessCastExpression(CastExpression castExpression) {
    return rewriteCastExpression(castExpression);
  }

  @Override
  final Node postProcessCatchClause(CatchClause catchClause) {
    return rewriteCatchClause(catchClause);
  }

  @Override
  final Node postProcessCompilationUnit(CompilationUnit compilationUnit) {
    return rewriteCompilationUnit(compilationUnit);
  }

  @Override
  final Node postProcessConditionalExpression(ConditionalExpression conditionalExpression) {
    return rewriteConditionalExpression(conditionalExpression);
  }

  @Override
  final Node postProcessContinueStatement(ContinueStatement continueStatement) {
    return rewriteContinueStatement(continueStatement);
  }

  @Override
  final TypeDescriptor postProcessDeclaredTypeDescriptor(DeclaredTypeDescriptor declaredTypeDescriptor) {
    return rewriteDeclaredTypeDescriptor(declaredTypeDescriptor);
  }

  @Override
  final Node postProcessDoWhileStatement(DoWhileStatement doWhileStatement) {
    return rewriteDoWhileStatement(doWhileStatement);
  }

  @Override
  final Node postProcessEmbeddedStatement(EmbeddedStatement embeddedStatement) {
    return rewriteEmbeddedStatement(embeddedStatement);
  }

  @Override
  final Node postProcessExpression(Expression expression) {
    return rewriteExpression(expression);
  }

  @Override
  final Node postProcessExpressionStatement(ExpressionStatement expressionStatement) {
    return rewriteExpressionStatement(expressionStatement);
  }

  @Override
  final Node postProcessExpressionWithComment(ExpressionWithComment expressionWithComment) {
    return rewriteExpressionWithComment(expressionWithComment);
  }

  @Override
  final Node postProcessField(Field field) {
    return rewriteField(field);
  }

  @Override
  final Node postProcessFieldAccess(FieldAccess fieldAccess) {
    return rewriteFieldAccess(fieldAccess);
  }

  @Override
  final Node postProcessFieldDeclarationStatement(FieldDeclarationStatement fieldDeclarationStatement) {
    return rewriteFieldDeclarationStatement(fieldDeclarationStatement);
  }

  @Override
  final MemberDescriptor postProcessFieldDescriptor(FieldDescriptor fieldDescriptor) {
    return rewriteFieldDescriptor(fieldDescriptor);
  }

  @Override
  final Node postProcessForEachStatement(ForEachStatement forEachStatement) {
    return rewriteForEachStatement(forEachStatement);
  }

  @Override
  final Node postProcessForStatement(ForStatement forStatement) {
    return rewriteForStatement(forStatement);
  }

  @Override
  final Node postProcessFunctionExpression(FunctionExpression functionExpression) {
    return rewriteFunctionExpression(functionExpression);
  }

  @Override
  final Node postProcessIfStatement(IfStatement ifStatement) {
    return rewriteIfStatement(ifStatement);
  }

  @Override
  final Node postProcessInitializerBlock(InitializerBlock initializerBlock) {
    return rewriteInitializerBlock(initializerBlock);
  }

  @Override
  final Node postProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return rewriteInstanceOfExpression(instanceOfExpression);
  }

  @Override
  final TypeDescriptor postProcessIntersectionTypeDescriptor(IntersectionTypeDescriptor intersectionTypeDescriptor) {
    return rewriteIntersectionTypeDescriptor(intersectionTypeDescriptor);
  }

  @Override
  final Node postProcessInvocation(Invocation invocation) {
    return rewriteInvocation(invocation);
  }

  @Override
  final Node postProcessJsAwaitExpression(JsAwaitExpression jsAwaitExpression) {
    return rewriteJsAwaitExpression(jsAwaitExpression);
  }

  @Override
  final Node postProcessJsConstructorReference(JsConstructorReference jsConstructorReference) {
    return rewriteJsConstructorReference(jsConstructorReference);
  }

  @Override
  final Node postProcessJsDocCastExpression(JsDocCastExpression jsDocCastExpression) {
    return rewriteJsDocCastExpression(jsDocCastExpression);
  }

  @Override
  final Node postProcessJsDocExpression(JsDocExpression jsDocExpression) {
    return rewriteJsDocExpression(jsDocExpression);
  }

  @Override
  final Node postProcessJsForInStatement(JsForInStatement jsForInStatement) {
    return rewriteJsForInStatement(jsForInStatement);
  }

  @Override
  final Node postProcessJsYieldExpression(JsYieldExpression jsYieldExpression) {
    return rewriteJsYieldExpression(jsYieldExpression);
  }

  @Override
  final Node postProcessLabel(Label label) {
    return rewriteLabel(label);
  }

  @Override
  final Node postProcessLabelReference(LabelReference labelReference) {
    return rewriteLabelReference(labelReference);
  }

  @Override
  final Node postProcessLabeledStatement(LabeledStatement labeledStatement) {
    return rewriteLabeledStatement(labeledStatement);
  }

  @Override
  final Node postProcessLibrary(Library library) {
    return rewriteLibrary(library);
  }

  @Override
  final Node postProcessLiteral(Literal literal) {
    return rewriteLiteral(literal);
  }

  @Override
  final Node postProcessLocalClassDeclarationStatement(LocalClassDeclarationStatement localClassDeclarationStatement) {
    return rewriteLocalClassDeclarationStatement(localClassDeclarationStatement);
  }

  @Override
  final Node postProcessLocalFunctionDeclarationStatement(LocalFunctionDeclarationStatement localFunctionDeclarationStatement) {
    return rewriteLocalFunctionDeclarationStatement(localFunctionDeclarationStatement);
  }

  @Override
  final Node postProcessLoopStatement(LoopStatement loopStatement) {
    return rewriteLoopStatement(loopStatement);
  }

  @Override
  final Node postProcessMember(Member member) {
    return rewriteMember(member);
  }

  @Override
  final MemberDescriptor postProcessMemberDescriptor(MemberDescriptor memberDescriptor) {
    return rewriteMemberDescriptor(memberDescriptor);
  }

  @Override
  final Node postProcessMemberReference(MemberReference memberReference) {
    return rewriteMemberReference(memberReference);
  }

  @Override
  final Node postProcessMethod(Method method) {
    return rewriteMethod(method);
  }

  @Override
  final Node postProcessMethodCall(MethodCall methodCall) {
    return rewriteMethodCall(methodCall);
  }

  @Override
  final MemberDescriptor postProcessMethodDescriptor(MethodDescriptor methodDescriptor) {
    return rewriteMethodDescriptor(methodDescriptor);
  }

  @Override
  final Node postProcessMethodReference(MethodReference methodReference) {
    return rewriteMethodReference(methodReference);
  }

  @Override
  final Node postProcessMultiExpression(MultiExpression multiExpression) {
    return rewriteMultiExpression(multiExpression);
  }

  @Override
  final Node postProcessNameDeclaration(NameDeclaration nameDeclaration) {
    return rewriteNameDeclaration(nameDeclaration);
  }

  @Override
  final Node postProcessNewArray(NewArray newArray) {
    return rewriteNewArray(newArray);
  }

  @Override
  final Node postProcessNewInstance(NewInstance newInstance) {
    return rewriteNewInstance(newInstance);
  }

  @Override
  final Node postProcessNode(Node node) {
    return rewriteNode(node);
  }

  @Override
  final Node postProcessNullLiteral(NullLiteral nullLiteral) {
    return rewriteNullLiteral(nullLiteral);
  }

  @Override
  final Node postProcessNumberLiteral(NumberLiteral numberLiteral) {
    return rewriteNumberLiteral(numberLiteral);
  }

  @Override
  final Node postProcessPattern(Pattern pattern) {
    return rewritePattern(pattern);
  }

  @Override
  final Node postProcessPostfixExpression(PostfixExpression postfixExpression) {
    return rewritePostfixExpression(postfixExpression);
  }

  @Override
  final Node postProcessPrefixExpression(PrefixExpression prefixExpression) {
    return rewritePrefixExpression(prefixExpression);
  }

  @Override
  final TypeDescriptor postProcessPrimitiveTypeDescriptor(PrimitiveTypeDescriptor primitiveTypeDescriptor) {
    return rewritePrimitiveTypeDescriptor(primitiveTypeDescriptor);
  }

  @Override
  final Node postProcessReturnStatement(ReturnStatement returnStatement) {
    return rewriteReturnStatement(returnStatement);
  }

  @Override
  final Node postProcessStatement(Statement statement) {
    return rewriteStatement(statement);
  }

  @Override
  final Node postProcessStringLiteral(StringLiteral stringLiteral) {
    return rewriteStringLiteral(stringLiteral);
  }

  @Override
  final Node postProcessSuperReference(SuperReference superReference) {
    return rewriteSuperReference(superReference);
  }

  @Override
  final Node postProcessSwitchCase(SwitchCase switchCase) {
    return rewriteSwitchCase(switchCase);
  }

  @Override
  final Node postProcessSwitchExpression(SwitchExpression switchExpression) {
    return rewriteSwitchExpression(switchExpression);
  }

  @Override
  final Node postProcessSwitchStatement(SwitchStatement switchStatement) {
    return rewriteSwitchStatement(switchStatement);
  }

  @Override
  final Node postProcessSynchronizedStatement(SynchronizedStatement synchronizedStatement) {
    return rewriteSynchronizedStatement(synchronizedStatement);
  }

  @Override
  final Node postProcessThisOrSuperReference(ThisOrSuperReference thisOrSuperReference) {
    return rewriteThisOrSuperReference(thisOrSuperReference);
  }

  @Override
  final Node postProcessThisReference(ThisReference thisReference) {
    return rewriteThisReference(thisReference);
  }

  @Override
  final Node postProcessThrowStatement(ThrowStatement throwStatement) {
    return rewriteThrowStatement(throwStatement);
  }

  @Override
  final Node postProcessTryStatement(TryStatement tryStatement) {
    return rewriteTryStatement(tryStatement);
  }

  @Override
  final Node postProcessType(Type type) {
    return rewriteType(type);
  }

  @Override
  final TypeDeclaration postProcessTypeDeclaration(TypeDeclaration typeDeclaration) {
    return rewriteTypeDeclaration(typeDeclaration);
  }

  @Override
  final TypeDescriptor postProcessTypeDescriptor(TypeDescriptor typeDescriptor) {
    return rewriteTypeDescriptor(typeDescriptor);
  }

  @Override
  final Node postProcessTypeLiteral(TypeLiteral typeLiteral) {
    return rewriteTypeLiteral(typeLiteral);
  }

  @Override
  final Node postProcessUnaryExpression(UnaryExpression unaryExpression) {
    return rewriteUnaryExpression(unaryExpression);
  }

  @Override
  final TypeDescriptor postProcessUnionTypeDescriptor(UnionTypeDescriptor unionTypeDescriptor) {
    return rewriteUnionTypeDescriptor(unionTypeDescriptor);
  }

  @Override
  final Node postProcessVariable(Variable variable) {
    return rewriteVariable(variable);
  }

  @Override
  final Node postProcessVariableDeclarationExpression(VariableDeclarationExpression variableDeclarationExpression) {
    return rewriteVariableDeclarationExpression(variableDeclarationExpression);
  }

  @Override
  final Node postProcessVariableDeclarationFragment(VariableDeclarationFragment variableDeclarationFragment) {
    return rewriteVariableDeclarationFragment(variableDeclarationFragment);
  }

  @Override
  final Node postProcessVariableReference(VariableReference variableReference) {
    return rewriteVariableReference(variableReference);
  }

  @Override
  final Node postProcessWhileStatement(WhileStatement whileStatement) {
    return rewriteWhileStatement(whileStatement);
  }

  @Override
  final Node postProcessYieldStatement(YieldStatement yieldStatement) {
    return rewriteYieldStatement(yieldStatement);
  }


  public Node  rewriteArrayAccess(ArrayAccess arrayAccess) {
    return rewriteExpression(arrayAccess);
  }

  public Node  rewriteArrayCreationReference(ArrayCreationReference arrayCreationReference) {
    return rewriteExpression(arrayCreationReference);
  }

  public Node  rewriteArrayLength(ArrayLength arrayLength) {
    return rewriteExpression(arrayLength);
  }

  public Node  rewriteArrayLiteral(ArrayLiteral arrayLiteral) {
    return rewriteExpression(arrayLiteral);
  }

  public TypeDescriptor  rewriteArrayTypeDescriptor(ArrayTypeDescriptor arrayTypeDescriptor) {
    return rewriteTypeDescriptor(arrayTypeDescriptor);
  }

  public Node  rewriteAssertStatement(AssertStatement assertStatement) {
    return rewriteStatement(assertStatement);
  }

  public Node  rewriteBinaryExpression(BinaryExpression binaryExpression) {
    return rewriteExpression(binaryExpression);
  }

  public Node  rewriteBindingPattern(BindingPattern bindingPattern) {
    return rewritePattern(bindingPattern);
  }

  public Node  rewriteBlock(Block block) {
    return rewriteStatement(block);
  }

  public Node  rewriteBooleanLiteral(BooleanLiteral booleanLiteral) {
    return rewriteLiteral(booleanLiteral);
  }

  public Node  rewriteBreakOrContinueStatement(BreakOrContinueStatement breakOrContinueStatement) {
    return rewriteStatement(breakOrContinueStatement);
  }

  public Node  rewriteBreakStatement(BreakStatement breakStatement) {
    return rewriteBreakOrContinueStatement(breakStatement);
  }

  public Node  rewriteCastExpression(CastExpression castExpression) {
    return rewriteExpression(castExpression);
  }

  public Node  rewriteCatchClause(CatchClause catchClause) {
    return rewriteNode(catchClause);
  }

  public Node  rewriteCompilationUnit(CompilationUnit compilationUnit) {
    return rewriteNode(compilationUnit);
  }

  public Node  rewriteConditionalExpression(ConditionalExpression conditionalExpression) {
    return rewriteExpression(conditionalExpression);
  }

  public Node  rewriteContinueStatement(ContinueStatement continueStatement) {
    return rewriteBreakOrContinueStatement(continueStatement);
  }

  public TypeDescriptor  rewriteDeclaredTypeDescriptor(DeclaredTypeDescriptor declaredTypeDescriptor) {
    return rewriteTypeDescriptor(declaredTypeDescriptor);
  }

  public Node  rewriteDoWhileStatement(DoWhileStatement doWhileStatement) {
    return rewriteLoopStatement(doWhileStatement);
  }

  public Node  rewriteEmbeddedStatement(EmbeddedStatement embeddedStatement) {
    return rewriteExpression(embeddedStatement);
  }

  public Node  rewriteExpression(Expression expression) {
    return rewriteNode(expression);
  }

  public Node  rewriteExpressionStatement(ExpressionStatement expressionStatement) {
    return rewriteStatement(expressionStatement);
  }

  public Node  rewriteExpressionWithComment(ExpressionWithComment expressionWithComment) {
    return rewriteExpression(expressionWithComment);
  }

  public Node  rewriteField(Field field) {
    return rewriteMember(field);
  }

  public Node  rewriteFieldAccess(FieldAccess fieldAccess) {
    return rewriteMemberReference(fieldAccess);
  }

  public Node  rewriteFieldDeclarationStatement(FieldDeclarationStatement fieldDeclarationStatement) {
    return rewriteStatement(fieldDeclarationStatement);
  }

  public MemberDescriptor  rewriteFieldDescriptor(FieldDescriptor fieldDescriptor) {
    return rewriteMemberDescriptor(fieldDescriptor);
  }

  public Node  rewriteForEachStatement(ForEachStatement forEachStatement) {
    return rewriteLoopStatement(forEachStatement);
  }

  public Node  rewriteForStatement(ForStatement forStatement) {
    return rewriteLoopStatement(forStatement);
  }

  public Node  rewriteFunctionExpression(FunctionExpression functionExpression) {
    return rewriteExpression(functionExpression);
  }

  public Node  rewriteIfStatement(IfStatement ifStatement) {
    return rewriteStatement(ifStatement);
  }

  public Node  rewriteInitializerBlock(InitializerBlock initializerBlock) {
    return rewriteMember(initializerBlock);
  }

  public Node  rewriteInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return rewriteExpression(instanceOfExpression);
  }

  public TypeDescriptor  rewriteIntersectionTypeDescriptor(IntersectionTypeDescriptor intersectionTypeDescriptor) {
    return rewriteTypeDescriptor(intersectionTypeDescriptor);
  }

  public Node  rewriteInvocation(Invocation invocation) {
    return rewriteMemberReference(invocation);
  }

  public Node  rewriteJsAwaitExpression(JsAwaitExpression jsAwaitExpression) {
    return rewriteExpression(jsAwaitExpression);
  }

  public Node  rewriteJsConstructorReference(JsConstructorReference jsConstructorReference) {
    return rewriteExpression(jsConstructorReference);
  }

  public Node  rewriteJsDocCastExpression(JsDocCastExpression jsDocCastExpression) {
    return rewriteExpression(jsDocCastExpression);
  }

  public Node  rewriteJsDocExpression(JsDocExpression jsDocExpression) {
    return rewriteExpression(jsDocExpression);
  }

  public Node  rewriteJsForInStatement(JsForInStatement jsForInStatement) {
    return rewriteLoopStatement(jsForInStatement);
  }

  public Node  rewriteJsYieldExpression(JsYieldExpression jsYieldExpression) {
    return rewriteExpression(jsYieldExpression);
  }

  public Node  rewriteLabel(Label label) {
    return rewriteNameDeclaration(label);
  }

  public Node  rewriteLabelReference(LabelReference labelReference) {
    return rewriteNode(labelReference);
  }

  public Node  rewriteLabeledStatement(LabeledStatement labeledStatement) {
    return rewriteStatement(labeledStatement);
  }

  public Node  rewriteLibrary(Library library) {
    return rewriteNode(library);
  }

  public Node  rewriteLiteral(Literal literal) {
    return rewriteExpression(literal);
  }

  public Node  rewriteLocalClassDeclarationStatement(LocalClassDeclarationStatement localClassDeclarationStatement) {
    return rewriteStatement(localClassDeclarationStatement);
  }

  public Node  rewriteLocalFunctionDeclarationStatement(LocalFunctionDeclarationStatement localFunctionDeclarationStatement) {
    return rewriteStatement(localFunctionDeclarationStatement);
  }

  public Node  rewriteLoopStatement(LoopStatement loopStatement) {
    return rewriteStatement(loopStatement);
  }

  public Node  rewriteMember(Member member) {
    return rewriteNode(member);
  }

  public MemberDescriptor  rewriteMemberDescriptor(MemberDescriptor memberDescriptor) {
    return memberDescriptor;
  }

  public Node  rewriteMemberReference(MemberReference memberReference) {
    return rewriteExpression(memberReference);
  }

  public Node  rewriteMethod(Method method) {
    return rewriteMember(method);
  }

  public Node  rewriteMethodCall(MethodCall methodCall) {
    return rewriteInvocation(methodCall);
  }

  public MemberDescriptor  rewriteMethodDescriptor(MethodDescriptor methodDescriptor) {
    return rewriteMemberDescriptor(methodDescriptor);
  }

  public Node  rewriteMethodReference(MethodReference methodReference) {
    return rewriteExpression(methodReference);
  }

  public Node  rewriteMultiExpression(MultiExpression multiExpression) {
    return rewriteExpression(multiExpression);
  }

  public Node  rewriteNameDeclaration(NameDeclaration nameDeclaration) {
    return rewriteNode(nameDeclaration);
  }

  public Node  rewriteNewArray(NewArray newArray) {
    return rewriteExpression(newArray);
  }

  public Node  rewriteNewInstance(NewInstance newInstance) {
    return rewriteInvocation(newInstance);
  }

  public Node  rewriteNode(Node node) {
    return node;
  }

  public Node  rewriteNullLiteral(NullLiteral nullLiteral) {
    return rewriteLiteral(nullLiteral);
  }

  public Node  rewriteNumberLiteral(NumberLiteral numberLiteral) {
    return rewriteLiteral(numberLiteral);
  }

  public Node  rewritePattern(Pattern pattern) {
    return rewriteNode(pattern);
  }

  public Node  rewritePostfixExpression(PostfixExpression postfixExpression) {
    return rewriteUnaryExpression(postfixExpression);
  }

  public Node  rewritePrefixExpression(PrefixExpression prefixExpression) {
    return rewriteUnaryExpression(prefixExpression);
  }

  public TypeDescriptor  rewritePrimitiveTypeDescriptor(PrimitiveTypeDescriptor primitiveTypeDescriptor) {
    return rewriteTypeDescriptor(primitiveTypeDescriptor);
  }

  public Node  rewriteReturnStatement(ReturnStatement returnStatement) {
    return rewriteStatement(returnStatement);
  }

  public Node  rewriteStatement(Statement statement) {
    return rewriteNode(statement);
  }

  public Node  rewriteStringLiteral(StringLiteral stringLiteral) {
    return rewriteLiteral(stringLiteral);
  }

  public Node  rewriteSuperReference(SuperReference superReference) {
    return rewriteThisOrSuperReference(superReference);
  }

  public Node  rewriteSwitchCase(SwitchCase switchCase) {
    return rewriteNode(switchCase);
  }

  public Node  rewriteSwitchExpression(SwitchExpression switchExpression) {
    return rewriteExpression(switchExpression);
  }

  public Node  rewriteSwitchStatement(SwitchStatement switchStatement) {
    return rewriteStatement(switchStatement);
  }

  public Node  rewriteSynchronizedStatement(SynchronizedStatement synchronizedStatement) {
    return rewriteStatement(synchronizedStatement);
  }

  public Node  rewriteThisOrSuperReference(ThisOrSuperReference thisOrSuperReference) {
    return rewriteExpression(thisOrSuperReference);
  }

  public Node  rewriteThisReference(ThisReference thisReference) {
    return rewriteThisOrSuperReference(thisReference);
  }

  public Node  rewriteThrowStatement(ThrowStatement throwStatement) {
    return rewriteStatement(throwStatement);
  }

  public Node  rewriteTryStatement(TryStatement tryStatement) {
    return rewriteStatement(tryStatement);
  }

  public Node  rewriteType(Type type) {
    return rewriteNode(type);
  }

  public TypeDeclaration  rewriteTypeDeclaration(TypeDeclaration typeDeclaration) {
    return typeDeclaration;
  }

  public TypeDescriptor  rewriteTypeDescriptor(TypeDescriptor typeDescriptor) {
    return typeDescriptor;
  }

  public Node  rewriteTypeLiteral(TypeLiteral typeLiteral) {
    return rewriteLiteral(typeLiteral);
  }

  public Node  rewriteUnaryExpression(UnaryExpression unaryExpression) {
    return rewriteExpression(unaryExpression);
  }

  public TypeDescriptor  rewriteUnionTypeDescriptor(UnionTypeDescriptor unionTypeDescriptor) {
    return rewriteTypeDescriptor(unionTypeDescriptor);
  }

  public Node  rewriteVariable(Variable variable) {
    return rewriteNameDeclaration(variable);
  }

  public Node  rewriteVariableDeclarationExpression(VariableDeclarationExpression variableDeclarationExpression) {
    return rewriteExpression(variableDeclarationExpression);
  }

  public Node  rewriteVariableDeclarationFragment(VariableDeclarationFragment variableDeclarationFragment) {
    return rewriteNode(variableDeclarationFragment);
  }

  public Node  rewriteVariableReference(VariableReference variableReference) {
    return rewriteExpression(variableReference);
  }

  public Node  rewriteWhileStatement(WhileStatement whileStatement) {
    return rewriteLoopStatement(whileStatement);
  }

  public Node  rewriteYieldStatement(YieldStatement yieldStatement) {
    return rewriteStatement(yieldStatement);
  }
}
