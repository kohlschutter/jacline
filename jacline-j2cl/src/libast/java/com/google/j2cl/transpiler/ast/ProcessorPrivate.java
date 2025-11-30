package com.google.j2cl.transpiler.ast;

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


  private Deque<CompilationUnit> stackOfCompilationUnit = new ArrayDeque<>();
  final void pushCompilationUnit(CompilationUnit compilationUnit) {
    stackOfContext.push(compilationUnit);
    stackOfCompilationUnit.push(compilationUnit);
  }
  final CompilationUnit popCompilationUnit() {
    stackOfContext.pop();
    return stackOfCompilationUnit.pop();
  }
  public final CompilationUnit getCurrentCompilationUnit() {
    return stackOfCompilationUnit.peek();
  }

  private Deque<Member> stackOfMember = new ArrayDeque<>();
  final void pushMember(Member member) {
    stackOfContext.push(member);
    stackOfMember.push(member);
  }
  final Member popMember() {
    stackOfContext.pop();
    return stackOfMember.pop();
  }
  public final Member getCurrentMember() {
    return stackOfMember.peek();
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

  abstract boolean shouldProcessArrayAccess(ArrayAccess arrayAccess);
  abstract boolean shouldProcessArrayCreationReference(ArrayCreationReference arrayCreationReference);
  abstract boolean shouldProcessArrayLength(ArrayLength arrayLength);
  abstract boolean shouldProcessArrayLiteral(ArrayLiteral arrayLiteral);
  abstract boolean shouldProcessArrayTypeDescriptor(ArrayTypeDescriptor arrayTypeDescriptor);
  abstract boolean shouldProcessAssertStatement(AssertStatement assertStatement);
  abstract boolean shouldProcessBinaryExpression(BinaryExpression binaryExpression);
  abstract boolean shouldProcessBindingPattern(BindingPattern bindingPattern);
  abstract boolean shouldProcessBlock(Block block);
  abstract boolean shouldProcessBooleanLiteral(BooleanLiteral booleanLiteral);
  abstract boolean shouldProcessBreakOrContinueStatement(BreakOrContinueStatement breakOrContinueStatement);
  abstract boolean shouldProcessBreakStatement(BreakStatement breakStatement);
  abstract boolean shouldProcessCastExpression(CastExpression castExpression);
  abstract boolean shouldProcessCatchClause(CatchClause catchClause);
  abstract boolean shouldProcessCompilationUnit(CompilationUnit compilationUnit);
  abstract boolean shouldProcessConditionalExpression(ConditionalExpression conditionalExpression);
  abstract boolean shouldProcessContinueStatement(ContinueStatement continueStatement);
  abstract boolean shouldProcessDeclaredTypeDescriptor(DeclaredTypeDescriptor declaredTypeDescriptor);
  abstract boolean shouldProcessDoWhileStatement(DoWhileStatement doWhileStatement);
  abstract boolean shouldProcessEmbeddedStatement(EmbeddedStatement embeddedStatement);
  abstract boolean shouldProcessExpression(Expression expression);
  abstract boolean shouldProcessExpressionStatement(ExpressionStatement expressionStatement);
  abstract boolean shouldProcessExpressionWithComment(ExpressionWithComment expressionWithComment);
  abstract boolean shouldProcessField(Field field);
  abstract boolean shouldProcessFieldAccess(FieldAccess fieldAccess);
  abstract boolean shouldProcessFieldDeclarationStatement(FieldDeclarationStatement fieldDeclarationStatement);
  abstract boolean shouldProcessFieldDescriptor(FieldDescriptor fieldDescriptor);
  abstract boolean shouldProcessForEachStatement(ForEachStatement forEachStatement);
  abstract boolean shouldProcessForStatement(ForStatement forStatement);
  abstract boolean shouldProcessFunctionExpression(FunctionExpression functionExpression);
  abstract boolean shouldProcessIfStatement(IfStatement ifStatement);
  abstract boolean shouldProcessInitializerBlock(InitializerBlock initializerBlock);
  abstract boolean shouldProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression);
  abstract boolean shouldProcessIntersectionTypeDescriptor(IntersectionTypeDescriptor intersectionTypeDescriptor);
  abstract boolean shouldProcessInvocation(Invocation invocation);
  abstract boolean shouldProcessJsAwaitExpression(JsAwaitExpression jsAwaitExpression);
  abstract boolean shouldProcessJsConstructorReference(JsConstructorReference jsConstructorReference);
  abstract boolean shouldProcessJsDocCastExpression(JsDocCastExpression jsDocCastExpression);
  abstract boolean shouldProcessJsDocExpression(JsDocExpression jsDocExpression);
  abstract boolean shouldProcessJsForInStatement(JsForInStatement jsForInStatement);
  abstract boolean shouldProcessJsYieldExpression(JsYieldExpression jsYieldExpression);
  abstract boolean shouldProcessLabel(Label label);
  abstract boolean shouldProcessLabelReference(LabelReference labelReference);
  abstract boolean shouldProcessLabeledStatement(LabeledStatement labeledStatement);
  abstract boolean shouldProcessLibrary(Library library);
  abstract boolean shouldProcessLiteral(Literal literal);
  abstract boolean shouldProcessLocalClassDeclarationStatement(LocalClassDeclarationStatement localClassDeclarationStatement);
  abstract boolean shouldProcessLocalFunctionDeclarationStatement(LocalFunctionDeclarationStatement localFunctionDeclarationStatement);
  abstract boolean shouldProcessLoopStatement(LoopStatement loopStatement);
  abstract boolean shouldProcessMember(Member member);
  abstract boolean shouldProcessMemberDescriptor(MemberDescriptor memberDescriptor);
  abstract boolean shouldProcessMemberReference(MemberReference memberReference);
  abstract boolean shouldProcessMethod(Method method);
  abstract boolean shouldProcessMethodCall(MethodCall methodCall);
  abstract boolean shouldProcessMethodDescriptor(MethodDescriptor methodDescriptor);
  abstract boolean shouldProcessMethodReference(MethodReference methodReference);
  abstract boolean shouldProcessMultiExpression(MultiExpression multiExpression);
  abstract boolean shouldProcessNameDeclaration(NameDeclaration nameDeclaration);
  abstract boolean shouldProcessNewArray(NewArray newArray);
  abstract boolean shouldProcessNewInstance(NewInstance newInstance);
  abstract boolean shouldProcessNode(Node node);
  abstract boolean shouldProcessNullLiteral(NullLiteral nullLiteral);
  abstract boolean shouldProcessNumberLiteral(NumberLiteral numberLiteral);
  abstract boolean shouldProcessPattern(Pattern pattern);
  abstract boolean shouldProcessPostfixExpression(PostfixExpression postfixExpression);
  abstract boolean shouldProcessPrefixExpression(PrefixExpression prefixExpression);
  abstract boolean shouldProcessPrimitiveTypeDescriptor(PrimitiveTypeDescriptor primitiveTypeDescriptor);
  abstract boolean shouldProcessReturnStatement(ReturnStatement returnStatement);
  abstract boolean shouldProcessStatement(Statement statement);
  abstract boolean shouldProcessStringLiteral(StringLiteral stringLiteral);
  abstract boolean shouldProcessSuperReference(SuperReference superReference);
  abstract boolean shouldProcessSwitchCase(SwitchCase switchCase);
  abstract boolean shouldProcessSwitchExpression(SwitchExpression switchExpression);
  abstract boolean shouldProcessSwitchStatement(SwitchStatement switchStatement);
  abstract boolean shouldProcessSynchronizedStatement(SynchronizedStatement synchronizedStatement);
  abstract boolean shouldProcessThisOrSuperReference(ThisOrSuperReference thisOrSuperReference);
  abstract boolean shouldProcessThisReference(ThisReference thisReference);
  abstract boolean shouldProcessThrowStatement(ThrowStatement throwStatement);
  abstract boolean shouldProcessTryStatement(TryStatement tryStatement);
  abstract boolean shouldProcessType(Type type);
  abstract boolean shouldProcessTypeDeclaration(TypeDeclaration typeDeclaration);
  abstract boolean shouldProcessTypeDescriptor(TypeDescriptor typeDescriptor);
  abstract boolean shouldProcessTypeLiteral(TypeLiteral typeLiteral);
  abstract boolean shouldProcessUnaryExpression(UnaryExpression unaryExpression);
  abstract boolean shouldProcessUnionTypeDescriptor(UnionTypeDescriptor unionTypeDescriptor);
  abstract boolean shouldProcessVariable(Variable variable);
  abstract boolean shouldProcessVariableDeclarationExpression(VariableDeclarationExpression variableDeclarationExpression);
  abstract boolean shouldProcessVariableDeclarationFragment(VariableDeclarationFragment variableDeclarationFragment);
  abstract boolean shouldProcessVariableReference(VariableReference variableReference);
  abstract boolean shouldProcessWhileStatement(WhileStatement whileStatement);
  abstract boolean shouldProcessYieldStatement(YieldStatement yieldStatement);

  abstract Node postProcessArrayAccess(ArrayAccess arrayAccess);
  abstract Node postProcessArrayCreationReference(ArrayCreationReference arrayCreationReference);
  abstract Node postProcessArrayLength(ArrayLength arrayLength);
  abstract Node postProcessArrayLiteral(ArrayLiteral arrayLiteral);
  abstract TypeDescriptor postProcessArrayTypeDescriptor(ArrayTypeDescriptor arrayTypeDescriptor);
  abstract Node postProcessAssertStatement(AssertStatement assertStatement);
  abstract Node postProcessBinaryExpression(BinaryExpression binaryExpression);
  abstract Node postProcessBindingPattern(BindingPattern bindingPattern);
  abstract Node postProcessBlock(Block block);
  abstract Node postProcessBooleanLiteral(BooleanLiteral booleanLiteral);
  abstract Node postProcessBreakOrContinueStatement(BreakOrContinueStatement breakOrContinueStatement);
  abstract Node postProcessBreakStatement(BreakStatement breakStatement);
  abstract Node postProcessCastExpression(CastExpression castExpression);
  abstract Node postProcessCatchClause(CatchClause catchClause);
  abstract Node postProcessCompilationUnit(CompilationUnit compilationUnit);
  abstract Node postProcessConditionalExpression(ConditionalExpression conditionalExpression);
  abstract Node postProcessContinueStatement(ContinueStatement continueStatement);
  abstract TypeDescriptor postProcessDeclaredTypeDescriptor(DeclaredTypeDescriptor declaredTypeDescriptor);
  abstract Node postProcessDoWhileStatement(DoWhileStatement doWhileStatement);
  abstract Node postProcessEmbeddedStatement(EmbeddedStatement embeddedStatement);
  abstract Node postProcessExpression(Expression expression);
  abstract Node postProcessExpressionStatement(ExpressionStatement expressionStatement);
  abstract Node postProcessExpressionWithComment(ExpressionWithComment expressionWithComment);
  abstract Node postProcessField(Field field);
  abstract Node postProcessFieldAccess(FieldAccess fieldAccess);
  abstract Node postProcessFieldDeclarationStatement(FieldDeclarationStatement fieldDeclarationStatement);
  abstract MemberDescriptor postProcessFieldDescriptor(FieldDescriptor fieldDescriptor);
  abstract Node postProcessForEachStatement(ForEachStatement forEachStatement);
  abstract Node postProcessForStatement(ForStatement forStatement);
  abstract Node postProcessFunctionExpression(FunctionExpression functionExpression);
  abstract Node postProcessIfStatement(IfStatement ifStatement);
  abstract Node postProcessInitializerBlock(InitializerBlock initializerBlock);
  abstract Node postProcessInstanceOfExpression(InstanceOfExpression instanceOfExpression);
  abstract TypeDescriptor postProcessIntersectionTypeDescriptor(IntersectionTypeDescriptor intersectionTypeDescriptor);
  abstract Node postProcessInvocation(Invocation invocation);
  abstract Node postProcessJsAwaitExpression(JsAwaitExpression jsAwaitExpression);
  abstract Node postProcessJsConstructorReference(JsConstructorReference jsConstructorReference);
  abstract Node postProcessJsDocCastExpression(JsDocCastExpression jsDocCastExpression);
  abstract Node postProcessJsDocExpression(JsDocExpression jsDocExpression);
  abstract Node postProcessJsForInStatement(JsForInStatement jsForInStatement);
  abstract Node postProcessJsYieldExpression(JsYieldExpression jsYieldExpression);
  abstract Node postProcessLabel(Label label);
  abstract Node postProcessLabelReference(LabelReference labelReference);
  abstract Node postProcessLabeledStatement(LabeledStatement labeledStatement);
  abstract Node postProcessLibrary(Library library);
  abstract Node postProcessLiteral(Literal literal);
  abstract Node postProcessLocalClassDeclarationStatement(LocalClassDeclarationStatement localClassDeclarationStatement);
  abstract Node postProcessLocalFunctionDeclarationStatement(LocalFunctionDeclarationStatement localFunctionDeclarationStatement);
  abstract Node postProcessLoopStatement(LoopStatement loopStatement);
  abstract Node postProcessMember(Member member);
  abstract MemberDescriptor postProcessMemberDescriptor(MemberDescriptor memberDescriptor);
  abstract Node postProcessMemberReference(MemberReference memberReference);
  abstract Node postProcessMethod(Method method);
  abstract Node postProcessMethodCall(MethodCall methodCall);
  abstract MemberDescriptor postProcessMethodDescriptor(MethodDescriptor methodDescriptor);
  abstract Node postProcessMethodReference(MethodReference methodReference);
  abstract Node postProcessMultiExpression(MultiExpression multiExpression);
  abstract Node postProcessNameDeclaration(NameDeclaration nameDeclaration);
  abstract Node postProcessNewArray(NewArray newArray);
  abstract Node postProcessNewInstance(NewInstance newInstance);
  abstract Node postProcessNode(Node node);
  abstract Node postProcessNullLiteral(NullLiteral nullLiteral);
  abstract Node postProcessNumberLiteral(NumberLiteral numberLiteral);
  abstract Node postProcessPattern(Pattern pattern);
  abstract Node postProcessPostfixExpression(PostfixExpression postfixExpression);
  abstract Node postProcessPrefixExpression(PrefixExpression prefixExpression);
  abstract TypeDescriptor postProcessPrimitiveTypeDescriptor(PrimitiveTypeDescriptor primitiveTypeDescriptor);
  abstract Node postProcessReturnStatement(ReturnStatement returnStatement);
  abstract Node postProcessStatement(Statement statement);
  abstract Node postProcessStringLiteral(StringLiteral stringLiteral);
  abstract Node postProcessSuperReference(SuperReference superReference);
  abstract Node postProcessSwitchCase(SwitchCase switchCase);
  abstract Node postProcessSwitchExpression(SwitchExpression switchExpression);
  abstract Node postProcessSwitchStatement(SwitchStatement switchStatement);
  abstract Node postProcessSynchronizedStatement(SynchronizedStatement synchronizedStatement);
  abstract Node postProcessThisOrSuperReference(ThisOrSuperReference thisOrSuperReference);
  abstract Node postProcessThisReference(ThisReference thisReference);
  abstract Node postProcessThrowStatement(ThrowStatement throwStatement);
  abstract Node postProcessTryStatement(TryStatement tryStatement);
  abstract Node postProcessType(Type type);
  abstract TypeDeclaration postProcessTypeDeclaration(TypeDeclaration typeDeclaration);
  abstract TypeDescriptor postProcessTypeDescriptor(TypeDescriptor typeDescriptor);
  abstract Node postProcessTypeLiteral(TypeLiteral typeLiteral);
  abstract Node postProcessUnaryExpression(UnaryExpression unaryExpression);
  abstract TypeDescriptor postProcessUnionTypeDescriptor(UnionTypeDescriptor unionTypeDescriptor);
  abstract Node postProcessVariable(Variable variable);
  abstract Node postProcessVariableDeclarationExpression(VariableDeclarationExpression variableDeclarationExpression);
  abstract Node postProcessVariableDeclarationFragment(VariableDeclarationFragment variableDeclarationFragment);
  abstract Node postProcessVariableReference(VariableReference variableReference);
  abstract Node postProcessWhileStatement(WhileStatement whileStatement);
  abstract Node postProcessYieldStatement(YieldStatement yieldStatement);
}
