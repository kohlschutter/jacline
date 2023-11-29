package com.google.j2cl.transpiler.ast;

public abstract class AbstractVisitor extends ProcessorPrivate {

  @Override
  final boolean shouldProcessArrayAccess(ArrayAccess arrayAccess) {
    return enterArrayAccess(arrayAccess);
  }

  @Override
  final boolean shouldProcessArrayCreationReference(ArrayCreationReference arrayCreationReference) {
    return enterArrayCreationReference(arrayCreationReference);
  }

  @Override
  final boolean shouldProcessArrayLength(ArrayLength arrayLength) {
    return enterArrayLength(arrayLength);
  }

  @Override
  final boolean shouldProcessArrayLiteral(ArrayLiteral arrayLiteral) {
    return enterArrayLiteral(arrayLiteral);
  }

  @Override
  final boolean shouldProcessAssertStatement(AssertStatement assertStatement) {
    return enterAssertStatement(assertStatement);
  }

  @Override
  final boolean shouldProcessAwaitExpression(AwaitExpression awaitExpression) {
    return enterAwaitExpression(awaitExpression);
  }

  @Override
  final boolean shouldProcessBinaryExpression(BinaryExpression binaryExpression) {
    return enterBinaryExpression(binaryExpression);
  }

  @Override
  final boolean shouldProcessBlock(Block block) {
    return enterBlock(block);
  }

  @Override
  final boolean shouldProcessBooleanLiteral(BooleanLiteral booleanLiteral) {
    return enterBooleanLiteral(booleanLiteral);
  }

  @Override
  final boolean shouldProcessBreakStatement(BreakStatement breakStatement) {
    return enterBreakStatement(breakStatement);
  }

  @Override
  final boolean shouldProcessCastExpression(CastExpression castExpression) {
    return enterCastExpression(castExpression);
  }

  @Override
  final boolean shouldProcessCatchClause(CatchClause catchClause) {
    return enterCatchClause(catchClause);
  }

  @Override
  final boolean shouldProcessCompilationUnit(CompilationUnit compilationUnit) {
    return enterCompilationUnit(compilationUnit);
  }

  @Override
  final boolean shouldProcessConditionalExpression(ConditionalExpression conditionalExpression) {
    return enterConditionalExpression(conditionalExpression);
  }

  @Override
  final boolean shouldProcessContinueStatement(ContinueStatement continueStatement) {
    return enterContinueStatement(continueStatement);
  }

  @Override
  final boolean shouldProcessDoWhileStatement(DoWhileStatement doWhileStatement) {
    return enterDoWhileStatement(doWhileStatement);
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
  final boolean shouldProcessExpressionWithComment(ExpressionWithComment expressionWithComment) {
    return enterExpressionWithComment(expressionWithComment);
  }

  @Override
  final boolean shouldProcessField(Field field) {
    return enterField(field);
  }

  @Override
  final boolean shouldProcessFieldAccess(FieldAccess fieldAccess) {
    return enterFieldAccess(fieldAccess);
  }

  @Override
  final boolean shouldProcessFieldDeclarationStatement(FieldDeclarationStatement fieldDeclarationStatement) {
    return enterFieldDeclarationStatement(fieldDeclarationStatement);
  }

  @Override
  final boolean shouldProcessForEachStatement(ForEachStatement forEachStatement) {
    return enterForEachStatement(forEachStatement);
  }

  @Override
  final boolean shouldProcessForStatement(ForStatement forStatement) {
    return enterForStatement(forStatement);
  }

  @Override
  final boolean shouldProcessFunctionExpression(FunctionExpression functionExpression) {
    return enterFunctionExpression(functionExpression);
  }

  @Override
  final boolean shouldProcessIfStatement(IfStatement ifStatement) {
    return enterIfStatement(ifStatement);
  }

  @Override
  final boolean shouldProcessInitializerBlock(InitializerBlock initializerBlock) {
    return enterInitializerBlock(initializerBlock);
  }

  @Override
  final boolean shouldProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return enterInstanceOfExpression(instanceOfExpression);
  }

  @Override
  final boolean shouldProcessInvocation(Invocation invocation) {
    return enterInvocation(invocation);
  }

  @Override
  final boolean shouldProcessJavaScriptConstructorReference(JavaScriptConstructorReference javaScriptConstructorReference) {
    return enterJavaScriptConstructorReference(javaScriptConstructorReference);
  }

  @Override
  final boolean shouldProcessJsDocCastExpression(JsDocCastExpression jsDocCastExpression) {
    return enterJsDocCastExpression(jsDocCastExpression);
  }

  @Override
  final boolean shouldProcessJsDocExpression(JsDocExpression jsDocExpression) {
    return enterJsDocExpression(jsDocExpression);
  }

  @Override
  final boolean shouldProcessLabel(Label label) {
    return enterLabel(label);
  }

  @Override
  final boolean shouldProcessLabelReference(LabelReference labelReference) {
    return enterLabelReference(labelReference);
  }

  @Override
  final boolean shouldProcessLabeledStatement(LabeledStatement labeledStatement) {
    return enterLabeledStatement(labeledStatement);
  }

  @Override
  final boolean shouldProcessLibrary(Library library) {
    return enterLibrary(library);
  }

  @Override
  final boolean shouldProcessLiteral(Literal literal) {
    return enterLiteral(literal);
  }

  @Override
  final boolean shouldProcessLocalClassDeclarationStatement(LocalClassDeclarationStatement localClassDeclarationStatement) {
    return enterLocalClassDeclarationStatement(localClassDeclarationStatement);
  }

  @Override
  final boolean shouldProcessLoopStatement(LoopStatement loopStatement) {
    return enterLoopStatement(loopStatement);
  }

  @Override
  final boolean shouldProcessMember(Member member) {
    return enterMember(member);
  }

  @Override
  final boolean shouldProcessMemberReference(MemberReference memberReference) {
    return enterMemberReference(memberReference);
  }

  @Override
  final boolean shouldProcessMethod(Method method) {
    return enterMethod(method);
  }

  @Override
  final boolean shouldProcessMethodCall(MethodCall methodCall) {
    return enterMethodCall(methodCall);
  }

  @Override
  final boolean shouldProcessMethodReference(MethodReference methodReference) {
    return enterMethodReference(methodReference);
  }

  @Override
  final boolean shouldProcessMultiExpression(MultiExpression multiExpression) {
    return enterMultiExpression(multiExpression);
  }

  @Override
  final boolean shouldProcessNameDeclaration(NameDeclaration nameDeclaration) {
    return enterNameDeclaration(nameDeclaration);
  }

  @Override
  final boolean shouldProcessNewArray(NewArray newArray) {
    return enterNewArray(newArray);
  }

  @Override
  final boolean shouldProcessNewInstance(NewInstance newInstance) {
    return enterNewInstance(newInstance);
  }

  @Override
  final boolean shouldProcessNode(Node node) {
    return enterNode(node);
  }

  @Override
  final boolean shouldProcessNullLiteral(NullLiteral nullLiteral) {
    return enterNullLiteral(nullLiteral);
  }

  @Override
  final boolean shouldProcessNumberLiteral(NumberLiteral numberLiteral) {
    return enterNumberLiteral(numberLiteral);
  }

  @Override
  final boolean shouldProcessPostfixExpression(PostfixExpression postfixExpression) {
    return enterPostfixExpression(postfixExpression);
  }

  @Override
  final boolean shouldProcessPrefixExpression(PrefixExpression prefixExpression) {
    return enterPrefixExpression(prefixExpression);
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
  final boolean shouldProcessStringLiteral(StringLiteral stringLiteral) {
    return enterStringLiteral(stringLiteral);
  }

  @Override
  final boolean shouldProcessSuperReference(SuperReference superReference) {
    return enterSuperReference(superReference);
  }

  @Override
  final boolean shouldProcessSwitchCase(SwitchCase switchCase) {
    return enterSwitchCase(switchCase);
  }

  @Override
  final boolean shouldProcessSwitchStatement(SwitchStatement switchStatement) {
    return enterSwitchStatement(switchStatement);
  }

  @Override
  final boolean shouldProcessSynchronizedStatement(SynchronizedStatement synchronizedStatement) {
    return enterSynchronizedStatement(synchronizedStatement);
  }

  @Override
  final boolean shouldProcessThisOrSuperReference(ThisOrSuperReference thisOrSuperReference) {
    return enterThisOrSuperReference(thisOrSuperReference);
  }

  @Override
  final boolean shouldProcessThisReference(ThisReference thisReference) {
    return enterThisReference(thisReference);
  }

  @Override
  final boolean shouldProcessThrowStatement(ThrowStatement throwStatement) {
    return enterThrowStatement(throwStatement);
  }

  @Override
  final boolean shouldProcessTryStatement(TryStatement tryStatement) {
    return enterTryStatement(tryStatement);
  }

  @Override
  final boolean shouldProcessType(Type type) {
    return enterType(type);
  }

  @Override
  final boolean shouldProcessTypeLiteral(TypeLiteral typeLiteral) {
    return enterTypeLiteral(typeLiteral);
  }

  @Override
  final boolean shouldProcessUnaryExpression(UnaryExpression unaryExpression) {
    return enterUnaryExpression(unaryExpression);
  }

  @Override
  final boolean shouldProcessVariable(Variable variable) {
    return enterVariable(variable);
  }

  @Override
  final boolean shouldProcessVariableDeclarationExpression(VariableDeclarationExpression variableDeclarationExpression) {
    return enterVariableDeclarationExpression(variableDeclarationExpression);
  }

  @Override
  final boolean shouldProcessVariableDeclarationFragment(VariableDeclarationFragment variableDeclarationFragment) {
    return enterVariableDeclarationFragment(variableDeclarationFragment);
  }

  @Override
  final boolean shouldProcessVariableReference(VariableReference variableReference) {
    return enterVariableReference(variableReference);
  }

  @Override
  final boolean shouldProcessWhileStatement(WhileStatement whileStatement) {
    return enterWhileStatement(whileStatement);
  }

  @Override
  final Node postProcessArrayAccess(ArrayAccess arrayAccess) {
    exitArrayAccess(arrayAccess);
    return arrayAccess;
  }

  @Override
  final Node postProcessArrayCreationReference(ArrayCreationReference arrayCreationReference) {
    exitArrayCreationReference(arrayCreationReference);
    return arrayCreationReference;
  }

  @Override
  final Node postProcessArrayLength(ArrayLength arrayLength) {
    exitArrayLength(arrayLength);
    return arrayLength;
  }

  @Override
  final Node postProcessArrayLiteral(ArrayLiteral arrayLiteral) {
    exitArrayLiteral(arrayLiteral);
    return arrayLiteral;
  }

  @Override
  final Node postProcessAssertStatement(AssertStatement assertStatement) {
    exitAssertStatement(assertStatement);
    return assertStatement;
  }

  @Override
  final Node postProcessAwaitExpression(AwaitExpression awaitExpression) {
    exitAwaitExpression(awaitExpression);
    return awaitExpression;
  }

  @Override
  final Node postProcessBinaryExpression(BinaryExpression binaryExpression) {
    exitBinaryExpression(binaryExpression);
    return binaryExpression;
  }

  @Override
  final Node postProcessBlock(Block block) {
    exitBlock(block);
    return block;
  }

  @Override
  final Node postProcessBooleanLiteral(BooleanLiteral booleanLiteral) {
    exitBooleanLiteral(booleanLiteral);
    return booleanLiteral;
  }

  @Override
  final Node postProcessBreakStatement(BreakStatement breakStatement) {
    exitBreakStatement(breakStatement);
    return breakStatement;
  }

  @Override
  final Node postProcessCastExpression(CastExpression castExpression) {
    exitCastExpression(castExpression);
    return castExpression;
  }

  @Override
  final Node postProcessCatchClause(CatchClause catchClause) {
    exitCatchClause(catchClause);
    return catchClause;
  }

  @Override
  final Node postProcessCompilationUnit(CompilationUnit compilationUnit) {
    exitCompilationUnit(compilationUnit);
    return compilationUnit;
  }

  @Override
  final Node postProcessConditionalExpression(ConditionalExpression conditionalExpression) {
    exitConditionalExpression(conditionalExpression);
    return conditionalExpression;
  }

  @Override
  final Node postProcessContinueStatement(ContinueStatement continueStatement) {
    exitContinueStatement(continueStatement);
    return continueStatement;
  }

  @Override
  final Node postProcessDoWhileStatement(DoWhileStatement doWhileStatement) {
    exitDoWhileStatement(doWhileStatement);
    return doWhileStatement;
  }

  @Override
  final Node postProcessExpression(Expression expression) {
    exitExpression(expression);
    return expression;
  }

  @Override
  final Node postProcessExpressionStatement(ExpressionStatement expressionStatement) {
    exitExpressionStatement(expressionStatement);
    return expressionStatement;
  }

  @Override
  final Node postProcessExpressionWithComment(ExpressionWithComment expressionWithComment) {
    exitExpressionWithComment(expressionWithComment);
    return expressionWithComment;
  }

  @Override
  final Node postProcessField(Field field) {
    exitField(field);
    return field;
  }

  @Override
  final Node postProcessFieldAccess(FieldAccess fieldAccess) {
    exitFieldAccess(fieldAccess);
    return fieldAccess;
  }

  @Override
  final Node postProcessFieldDeclarationStatement(FieldDeclarationStatement fieldDeclarationStatement) {
    exitFieldDeclarationStatement(fieldDeclarationStatement);
    return fieldDeclarationStatement;
  }

  @Override
  final Node postProcessForEachStatement(ForEachStatement forEachStatement) {
    exitForEachStatement(forEachStatement);
    return forEachStatement;
  }

  @Override
  final Node postProcessForStatement(ForStatement forStatement) {
    exitForStatement(forStatement);
    return forStatement;
  }

  @Override
  final Node postProcessFunctionExpression(FunctionExpression functionExpression) {
    exitFunctionExpression(functionExpression);
    return functionExpression;
  }

  @Override
  final Node postProcessIfStatement(IfStatement ifStatement) {
    exitIfStatement(ifStatement);
    return ifStatement;
  }

  @Override
  final Node postProcessInitializerBlock(InitializerBlock initializerBlock) {
    exitInitializerBlock(initializerBlock);
    return initializerBlock;
  }

  @Override
  final Node postProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    exitInstanceOfExpression(instanceOfExpression);
    return instanceOfExpression;
  }

  @Override
  final Node postProcessInvocation(Invocation invocation) {
    exitInvocation(invocation);
    return invocation;
  }

  @Override
  final Node postProcessJavaScriptConstructorReference(JavaScriptConstructorReference javaScriptConstructorReference) {
    exitJavaScriptConstructorReference(javaScriptConstructorReference);
    return javaScriptConstructorReference;
  }

  @Override
  final Node postProcessJsDocCastExpression(JsDocCastExpression jsDocCastExpression) {
    exitJsDocCastExpression(jsDocCastExpression);
    return jsDocCastExpression;
  }

  @Override
  final Node postProcessJsDocExpression(JsDocExpression jsDocExpression) {
    exitJsDocExpression(jsDocExpression);
    return jsDocExpression;
  }

  @Override
  final Node postProcessLabel(Label label) {
    exitLabel(label);
    return label;
  }

  @Override
  final Node postProcessLabelReference(LabelReference labelReference) {
    exitLabelReference(labelReference);
    return labelReference;
  }

  @Override
  final Node postProcessLabeledStatement(LabeledStatement labeledStatement) {
    exitLabeledStatement(labeledStatement);
    return labeledStatement;
  }

  @Override
  final Node postProcessLibrary(Library library) {
    exitLibrary(library);
    return library;
  }

  @Override
  final Node postProcessLiteral(Literal literal) {
    exitLiteral(literal);
    return literal;
  }

  @Override
  final Node postProcessLocalClassDeclarationStatement(LocalClassDeclarationStatement localClassDeclarationStatement) {
    exitLocalClassDeclarationStatement(localClassDeclarationStatement);
    return localClassDeclarationStatement;
  }

  @Override
  final Node postProcessLoopStatement(LoopStatement loopStatement) {
    exitLoopStatement(loopStatement);
    return loopStatement;
  }

  @Override
  final Node postProcessMember(Member member) {
    exitMember(member);
    return member;
  }

  @Override
  final Node postProcessMemberReference(MemberReference memberReference) {
    exitMemberReference(memberReference);
    return memberReference;
  }

  @Override
  final Node postProcessMethod(Method method) {
    exitMethod(method);
    return method;
  }

  @Override
  final Node postProcessMethodCall(MethodCall methodCall) {
    exitMethodCall(methodCall);
    return methodCall;
  }

  @Override
  final Node postProcessMethodReference(MethodReference methodReference) {
    exitMethodReference(methodReference);
    return methodReference;
  }

  @Override
  final Node postProcessMultiExpression(MultiExpression multiExpression) {
    exitMultiExpression(multiExpression);
    return multiExpression;
  }

  @Override
  final Node postProcessNameDeclaration(NameDeclaration nameDeclaration) {
    exitNameDeclaration(nameDeclaration);
    return nameDeclaration;
  }

  @Override
  final Node postProcessNewArray(NewArray newArray) {
    exitNewArray(newArray);
    return newArray;
  }

  @Override
  final Node postProcessNewInstance(NewInstance newInstance) {
    exitNewInstance(newInstance);
    return newInstance;
  }

  @Override
  final Node postProcessNode(Node node) {
    exitNode(node);
    return node;
  }

  @Override
  final Node postProcessNullLiteral(NullLiteral nullLiteral) {
    exitNullLiteral(nullLiteral);
    return nullLiteral;
  }

  @Override
  final Node postProcessNumberLiteral(NumberLiteral numberLiteral) {
    exitNumberLiteral(numberLiteral);
    return numberLiteral;
  }

  @Override
  final Node postProcessPostfixExpression(PostfixExpression postfixExpression) {
    exitPostfixExpression(postfixExpression);
    return postfixExpression;
  }

  @Override
  final Node postProcessPrefixExpression(PrefixExpression prefixExpression) {
    exitPrefixExpression(prefixExpression);
    return prefixExpression;
  }

  @Override
  final Node postProcessReturnStatement(ReturnStatement returnStatement) {
    exitReturnStatement(returnStatement);
    return returnStatement;
  }

  @Override
  final Node postProcessStatement(Statement statement) {
    exitStatement(statement);
    return statement;
  }

  @Override
  final Node postProcessStringLiteral(StringLiteral stringLiteral) {
    exitStringLiteral(stringLiteral);
    return stringLiteral;
  }

  @Override
  final Node postProcessSuperReference(SuperReference superReference) {
    exitSuperReference(superReference);
    return superReference;
  }

  @Override
  final Node postProcessSwitchCase(SwitchCase switchCase) {
    exitSwitchCase(switchCase);
    return switchCase;
  }

  @Override
  final Node postProcessSwitchStatement(SwitchStatement switchStatement) {
    exitSwitchStatement(switchStatement);
    return switchStatement;
  }

  @Override
  final Node postProcessSynchronizedStatement(SynchronizedStatement synchronizedStatement) {
    exitSynchronizedStatement(synchronizedStatement);
    return synchronizedStatement;
  }

  @Override
  final Node postProcessThisOrSuperReference(ThisOrSuperReference thisOrSuperReference) {
    exitThisOrSuperReference(thisOrSuperReference);
    return thisOrSuperReference;
  }

  @Override
  final Node postProcessThisReference(ThisReference thisReference) {
    exitThisReference(thisReference);
    return thisReference;
  }

  @Override
  final Node postProcessThrowStatement(ThrowStatement throwStatement) {
    exitThrowStatement(throwStatement);
    return throwStatement;
  }

  @Override
  final Node postProcessTryStatement(TryStatement tryStatement) {
    exitTryStatement(tryStatement);
    return tryStatement;
  }

  @Override
  final Node postProcessType(Type type) {
    exitType(type);
    return type;
  }

  @Override
  final Node postProcessTypeLiteral(TypeLiteral typeLiteral) {
    exitTypeLiteral(typeLiteral);
    return typeLiteral;
  }

  @Override
  final Node postProcessUnaryExpression(UnaryExpression unaryExpression) {
    exitUnaryExpression(unaryExpression);
    return unaryExpression;
  }

  @Override
  final Node postProcessVariable(Variable variable) {
    exitVariable(variable);
    return variable;
  }

  @Override
  final Node postProcessVariableDeclarationExpression(VariableDeclarationExpression variableDeclarationExpression) {
    exitVariableDeclarationExpression(variableDeclarationExpression);
    return variableDeclarationExpression;
  }

  @Override
  final Node postProcessVariableDeclarationFragment(VariableDeclarationFragment variableDeclarationFragment) {
    exitVariableDeclarationFragment(variableDeclarationFragment);
    return variableDeclarationFragment;
  }

  @Override
  final Node postProcessVariableReference(VariableReference variableReference) {
    exitVariableReference(variableReference);
    return variableReference;
  }

  @Override
  final Node postProcessWhileStatement(WhileStatement whileStatement) {
    exitWhileStatement(whileStatement);
    return whileStatement;
  }

  public boolean enterArrayAccess(ArrayAccess arrayAccess) {
    return enterExpression(arrayAccess);
  }

  public boolean enterArrayCreationReference(ArrayCreationReference arrayCreationReference) {
    return enterExpression(arrayCreationReference);
  }

  public boolean enterArrayLength(ArrayLength arrayLength) {
    return enterExpression(arrayLength);
  }

  public boolean enterArrayLiteral(ArrayLiteral arrayLiteral) {
    return enterExpression(arrayLiteral);
  }

  public boolean enterAssertStatement(AssertStatement assertStatement) {
    return enterStatement(assertStatement);
  }

  public boolean enterAwaitExpression(AwaitExpression awaitExpression) {
    return enterExpression(awaitExpression);
  }

  public boolean enterBinaryExpression(BinaryExpression binaryExpression) {
    return enterExpression(binaryExpression);
  }

  public boolean enterBlock(Block block) {
    return enterStatement(block);
  }

  public boolean enterBooleanLiteral(BooleanLiteral booleanLiteral) {
    return enterLiteral(booleanLiteral);
  }

  public boolean enterBreakStatement(BreakStatement breakStatement) {
    return enterStatement(breakStatement);
  }

  public boolean enterCastExpression(CastExpression castExpression) {
    return enterExpression(castExpression);
  }

  public boolean enterCatchClause(CatchClause catchClause) {
    return enterNode(catchClause);
  }

  public boolean enterCompilationUnit(CompilationUnit compilationUnit) {
    return enterNode(compilationUnit);
  }

  public boolean enterConditionalExpression(ConditionalExpression conditionalExpression) {
    return enterExpression(conditionalExpression);
  }

  public boolean enterContinueStatement(ContinueStatement continueStatement) {
    return enterStatement(continueStatement);
  }

  public boolean enterDoWhileStatement(DoWhileStatement doWhileStatement) {
    return enterLoopStatement(doWhileStatement);
  }

  public boolean enterExpression(Expression expression) {
    return enterNode(expression);
  }

  public boolean enterExpressionStatement(ExpressionStatement expressionStatement) {
    return enterStatement(expressionStatement);
  }

  public boolean enterExpressionWithComment(ExpressionWithComment expressionWithComment) {
    return enterExpression(expressionWithComment);
  }

  public boolean enterField(Field field) {
    return enterMember(field);
  }

  public boolean enterFieldAccess(FieldAccess fieldAccess) {
    return enterMemberReference(fieldAccess);
  }

  public boolean enterFieldDeclarationStatement(FieldDeclarationStatement fieldDeclarationStatement) {
    return enterStatement(fieldDeclarationStatement);
  }

  public boolean enterForEachStatement(ForEachStatement forEachStatement) {
    return enterStatement(forEachStatement);
  }

  public boolean enterForStatement(ForStatement forStatement) {
    return enterLoopStatement(forStatement);
  }

  public boolean enterFunctionExpression(FunctionExpression functionExpression) {
    return enterExpression(functionExpression);
  }

  public boolean enterIfStatement(IfStatement ifStatement) {
    return enterStatement(ifStatement);
  }

  public boolean enterInitializerBlock(InitializerBlock initializerBlock) {
    return enterMember(initializerBlock);
  }

  public boolean enterInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    return enterExpression(instanceOfExpression);
  }

  public boolean enterInvocation(Invocation invocation) {
    return enterMemberReference(invocation);
  }

  public boolean enterJavaScriptConstructorReference(JavaScriptConstructorReference javaScriptConstructorReference) {
    return enterExpression(javaScriptConstructorReference);
  }

  public boolean enterJsDocCastExpression(JsDocCastExpression jsDocCastExpression) {
    return enterExpression(jsDocCastExpression);
  }

  public boolean enterJsDocExpression(JsDocExpression jsDocExpression) {
    return enterExpression(jsDocExpression);
  }

  public boolean enterLabel(Label label) {
    return enterNameDeclaration(label);
  }

  public boolean enterLabelReference(LabelReference labelReference) {
    return enterNode(labelReference);
  }

  public boolean enterLabeledStatement(LabeledStatement labeledStatement) {
    return enterStatement(labeledStatement);
  }

  public boolean enterLibrary(Library library) {
    return enterNode(library);
  }

  public boolean enterLiteral(Literal literal) {
    return enterExpression(literal);
  }

  public boolean enterLocalClassDeclarationStatement(LocalClassDeclarationStatement localClassDeclarationStatement) {
    return enterStatement(localClassDeclarationStatement);
  }

  public boolean enterLoopStatement(LoopStatement loopStatement) {
    return enterStatement(loopStatement);
  }

  public boolean enterMember(Member member) {
    return enterNode(member);
  }

  public boolean enterMemberReference(MemberReference memberReference) {
    return enterExpression(memberReference);
  }

  public boolean enterMethod(Method method) {
    return enterMember(method);
  }

  public boolean enterMethodCall(MethodCall methodCall) {
    return enterInvocation(methodCall);
  }

  public boolean enterMethodReference(MethodReference methodReference) {
    return enterExpression(methodReference);
  }

  public boolean enterMultiExpression(MultiExpression multiExpression) {
    return enterExpression(multiExpression);
  }

  public boolean enterNameDeclaration(NameDeclaration nameDeclaration) {
    return enterNode(nameDeclaration);
  }

  public boolean enterNewArray(NewArray newArray) {
    return enterExpression(newArray);
  }

  public boolean enterNewInstance(NewInstance newInstance) {
    return enterInvocation(newInstance);
  }

  public boolean enterNode(Node node) {
    return true;
  }

  public boolean enterNullLiteral(NullLiteral nullLiteral) {
    return enterLiteral(nullLiteral);
  }

  public boolean enterNumberLiteral(NumberLiteral numberLiteral) {
    return enterLiteral(numberLiteral);
  }

  public boolean enterPostfixExpression(PostfixExpression postfixExpression) {
    return enterUnaryExpression(postfixExpression);
  }

  public boolean enterPrefixExpression(PrefixExpression prefixExpression) {
    return enterUnaryExpression(prefixExpression);
  }

  public boolean enterReturnStatement(ReturnStatement returnStatement) {
    return enterStatement(returnStatement);
  }

  public boolean enterStatement(Statement statement) {
    return enterNode(statement);
  }

  public boolean enterStringLiteral(StringLiteral stringLiteral) {
    return enterLiteral(stringLiteral);
  }

  public boolean enterSuperReference(SuperReference superReference) {
    return enterThisOrSuperReference(superReference);
  }

  public boolean enterSwitchCase(SwitchCase switchCase) {
    return enterNode(switchCase);
  }

  public boolean enterSwitchStatement(SwitchStatement switchStatement) {
    return enterStatement(switchStatement);
  }

  public boolean enterSynchronizedStatement(SynchronizedStatement synchronizedStatement) {
    return enterStatement(synchronizedStatement);
  }

  public boolean enterThisOrSuperReference(ThisOrSuperReference thisOrSuperReference) {
    return enterExpression(thisOrSuperReference);
  }

  public boolean enterThisReference(ThisReference thisReference) {
    return enterThisOrSuperReference(thisReference);
  }

  public boolean enterThrowStatement(ThrowStatement throwStatement) {
    return enterStatement(throwStatement);
  }

  public boolean enterTryStatement(TryStatement tryStatement) {
    return enterStatement(tryStatement);
  }

  public boolean enterType(Type type) {
    return enterNode(type);
  }

  public boolean enterTypeLiteral(TypeLiteral typeLiteral) {
    return enterLiteral(typeLiteral);
  }

  public boolean enterUnaryExpression(UnaryExpression unaryExpression) {
    return enterExpression(unaryExpression);
  }

  public boolean enterVariable(Variable variable) {
    return enterNameDeclaration(variable);
  }

  public boolean enterVariableDeclarationExpression(VariableDeclarationExpression variableDeclarationExpression) {
    return enterExpression(variableDeclarationExpression);
  }

  public boolean enterVariableDeclarationFragment(VariableDeclarationFragment variableDeclarationFragment) {
    return enterNode(variableDeclarationFragment);
  }

  public boolean enterVariableReference(VariableReference variableReference) {
    return enterExpression(variableReference);
  }

  public boolean enterWhileStatement(WhileStatement whileStatement) {
    return enterLoopStatement(whileStatement);
  }

  public void exitArrayAccess(ArrayAccess arrayAccess) {
    exitExpression(arrayAccess);
  }
  public void exitArrayCreationReference(ArrayCreationReference arrayCreationReference) {
    exitExpression(arrayCreationReference);
  }
  public void exitArrayLength(ArrayLength arrayLength) {
    exitExpression(arrayLength);
  }
  public void exitArrayLiteral(ArrayLiteral arrayLiteral) {
    exitExpression(arrayLiteral);
  }
  public void exitAssertStatement(AssertStatement assertStatement) {
    exitStatement(assertStatement);
  }
  public void exitAwaitExpression(AwaitExpression awaitExpression) {
    exitExpression(awaitExpression);
  }
  public void exitBinaryExpression(BinaryExpression binaryExpression) {
    exitExpression(binaryExpression);
  }
  public void exitBlock(Block block) {
    exitStatement(block);
  }
  public void exitBooleanLiteral(BooleanLiteral booleanLiteral) {
    exitLiteral(booleanLiteral);
  }
  public void exitBreakStatement(BreakStatement breakStatement) {
    exitStatement(breakStatement);
  }
  public void exitCastExpression(CastExpression castExpression) {
    exitExpression(castExpression);
  }
  public void exitCatchClause(CatchClause catchClause) {
    exitNode(catchClause);
  }
  public void exitCompilationUnit(CompilationUnit compilationUnit) {
    exitNode(compilationUnit);
  }
  public void exitConditionalExpression(ConditionalExpression conditionalExpression) {
    exitExpression(conditionalExpression);
  }
  public void exitContinueStatement(ContinueStatement continueStatement) {
    exitStatement(continueStatement);
  }
  public void exitDoWhileStatement(DoWhileStatement doWhileStatement) {
    exitLoopStatement(doWhileStatement);
  }
  public void exitExpression(Expression expression) {
    exitNode(expression);
  }
  public void exitExpressionStatement(ExpressionStatement expressionStatement) {
    exitStatement(expressionStatement);
  }
  public void exitExpressionWithComment(ExpressionWithComment expressionWithComment) {
    exitExpression(expressionWithComment);
  }
  public void exitField(Field field) {
    exitMember(field);
  }
  public void exitFieldAccess(FieldAccess fieldAccess) {
    exitMemberReference(fieldAccess);
  }
  public void exitFieldDeclarationStatement(FieldDeclarationStatement fieldDeclarationStatement) {
    exitStatement(fieldDeclarationStatement);
  }
  public void exitForEachStatement(ForEachStatement forEachStatement) {
    exitStatement(forEachStatement);
  }
  public void exitForStatement(ForStatement forStatement) {
    exitLoopStatement(forStatement);
  }
  public void exitFunctionExpression(FunctionExpression functionExpression) {
    exitExpression(functionExpression);
  }
  public void exitIfStatement(IfStatement ifStatement) {
    exitStatement(ifStatement);
  }
  public void exitInitializerBlock(InitializerBlock initializerBlock) {
    exitMember(initializerBlock);
  }
  public void exitInstanceOfExpression(InstanceOfExpression instanceOfExpression) {
    exitExpression(instanceOfExpression);
  }
  public void exitInvocation(Invocation invocation) {
    exitMemberReference(invocation);
  }
  public void exitJavaScriptConstructorReference(JavaScriptConstructorReference javaScriptConstructorReference) {
    exitExpression(javaScriptConstructorReference);
  }
  public void exitJsDocCastExpression(JsDocCastExpression jsDocCastExpression) {
    exitExpression(jsDocCastExpression);
  }
  public void exitJsDocExpression(JsDocExpression jsDocExpression) {
    exitExpression(jsDocExpression);
  }
  public void exitLabel(Label label) {
    exitNameDeclaration(label);
  }
  public void exitLabelReference(LabelReference labelReference) {
    exitNode(labelReference);
  }
  public void exitLabeledStatement(LabeledStatement labeledStatement) {
    exitStatement(labeledStatement);
  }
  public void exitLibrary(Library library) {
    exitNode(library);
  }
  public void exitLiteral(Literal literal) {
    exitExpression(literal);
  }
  public void exitLocalClassDeclarationStatement(LocalClassDeclarationStatement localClassDeclarationStatement) {
    exitStatement(localClassDeclarationStatement);
  }
  public void exitLoopStatement(LoopStatement loopStatement) {
    exitStatement(loopStatement);
  }
  public void exitMember(Member member) {
    exitNode(member);
  }
  public void exitMemberReference(MemberReference memberReference) {
    exitExpression(memberReference);
  }
  public void exitMethod(Method method) {
    exitMember(method);
  }
  public void exitMethodCall(MethodCall methodCall) {
    exitInvocation(methodCall);
  }
  public void exitMethodReference(MethodReference methodReference) {
    exitExpression(methodReference);
  }
  public void exitMultiExpression(MultiExpression multiExpression) {
    exitExpression(multiExpression);
  }
  public void exitNameDeclaration(NameDeclaration nameDeclaration) {
    exitNode(nameDeclaration);
  }
  public void exitNewArray(NewArray newArray) {
    exitExpression(newArray);
  }
  public void exitNewInstance(NewInstance newInstance) {
    exitInvocation(newInstance);
  }
  public void exitNode(Node node) {
  }
  public void exitNullLiteral(NullLiteral nullLiteral) {
    exitLiteral(nullLiteral);
  }
  public void exitNumberLiteral(NumberLiteral numberLiteral) {
    exitLiteral(numberLiteral);
  }
  public void exitPostfixExpression(PostfixExpression postfixExpression) {
    exitUnaryExpression(postfixExpression);
  }
  public void exitPrefixExpression(PrefixExpression prefixExpression) {
    exitUnaryExpression(prefixExpression);
  }
  public void exitReturnStatement(ReturnStatement returnStatement) {
    exitStatement(returnStatement);
  }
  public void exitStatement(Statement statement) {
    exitNode(statement);
  }
  public void exitStringLiteral(StringLiteral stringLiteral) {
    exitLiteral(stringLiteral);
  }
  public void exitSuperReference(SuperReference superReference) {
    exitThisOrSuperReference(superReference);
  }
  public void exitSwitchCase(SwitchCase switchCase) {
    exitNode(switchCase);
  }
  public void exitSwitchStatement(SwitchStatement switchStatement) {
    exitStatement(switchStatement);
  }
  public void exitSynchronizedStatement(SynchronizedStatement synchronizedStatement) {
    exitStatement(synchronizedStatement);
  }
  public void exitThisOrSuperReference(ThisOrSuperReference thisOrSuperReference) {
    exitExpression(thisOrSuperReference);
  }
  public void exitThisReference(ThisReference thisReference) {
    exitThisOrSuperReference(thisReference);
  }
  public void exitThrowStatement(ThrowStatement throwStatement) {
    exitStatement(throwStatement);
  }
  public void exitTryStatement(TryStatement tryStatement) {
    exitStatement(tryStatement);
  }
  public void exitType(Type type) {
    exitNode(type);
  }
  public void exitTypeLiteral(TypeLiteral typeLiteral) {
    exitLiteral(typeLiteral);
  }
  public void exitUnaryExpression(UnaryExpression unaryExpression) {
    exitExpression(unaryExpression);
  }
  public void exitVariable(Variable variable) {
    exitNameDeclaration(variable);
  }
  public void exitVariableDeclarationExpression(VariableDeclarationExpression variableDeclarationExpression) {
    exitExpression(variableDeclarationExpression);
  }
  public void exitVariableDeclarationFragment(VariableDeclarationFragment variableDeclarationFragment) {
    exitNode(variableDeclarationFragment);
  }
  public void exitVariableReference(VariableReference variableReference) {
    exitExpression(variableReference);
  }
  public void exitWhileStatement(WhileStatement whileStatement) {
    exitLoopStatement(whileStatement);
  }
}
