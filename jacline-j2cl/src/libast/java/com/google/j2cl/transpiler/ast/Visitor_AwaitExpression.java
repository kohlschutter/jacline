package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_AwaitExpression {

  public static Node visit(Processor processor, AwaitExpression awaitExpression) {
    Node result = awaitExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, awaitExpression);

    try {
      if (processorImpl.shouldProcessAwaitExpression(awaitExpression)) {
        processorImpl.pushParent(awaitExpression);
        visitMembers(processorImpl, awaitExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessAwaitExpression(awaitExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), awaitExpression, e);
    }

    popContext(processor, awaitExpression);
    return result;
  }

  static void pushContext(Processor processor, AwaitExpression awaitExpression) {
    Visitor_Expression.pushContext(processor, awaitExpression);
  }

  static void popContext(Processor processor, AwaitExpression awaitExpression) {
    Visitor_Expression.popContext(processor, awaitExpression);
  }

  static void visitMembers(Processor processor, AwaitExpression awaitExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, awaitExpression);
      awaitExpression.expression = (Expression) Preconditions.checkNotNull(
      awaitExpression.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"AwaitExpression\" cannot be null");
  }
}
