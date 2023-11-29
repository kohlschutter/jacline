package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_UnaryExpression {

  public static Node visit(Processor processor, UnaryExpression unaryExpression) {
    Node result = unaryExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, unaryExpression);

    try {
      if (processorImpl.shouldProcessUnaryExpression(unaryExpression)) {
        processorImpl.pushParent(unaryExpression);
        visitMembers(processorImpl, unaryExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessUnaryExpression(unaryExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), unaryExpression, e);
    }

    popContext(processor, unaryExpression);
    return result;
  }

  static void pushContext(Processor processor, UnaryExpression unaryExpression) {
    Visitor_Expression.pushContext(processor, unaryExpression);
  }

  static void popContext(Processor processor, UnaryExpression unaryExpression) {
    Visitor_Expression.popContext(processor, unaryExpression);
  }

  static void visitMembers(Processor processor, UnaryExpression unaryExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, unaryExpression);
      unaryExpression.operand = (Expression) Preconditions.checkNotNull(
      unaryExpression.operand.acceptInternal(processorImpl),
          "Field \"operand\" in class \"UnaryExpression\" cannot be null");
  }
}
