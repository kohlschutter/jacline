package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_CastExpression {

  public static Node visit(Processor processor, CastExpression castExpression) {
    Node result = castExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, castExpression);

    try {
      if (processorImpl.shouldProcessCastExpression(castExpression)) {
        processorImpl.pushParent(castExpression);
        visitMembers(processorImpl, castExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessCastExpression(castExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), castExpression, e);
    }

    popContext(processor, castExpression);
    return result;
  }

  static void pushContext(Processor processor, CastExpression castExpression) {
    Visitor_Expression.pushContext(processor, castExpression);
  }

  static void popContext(Processor processor, CastExpression castExpression) {
    Visitor_Expression.popContext(processor, castExpression);
  }

  static void visitMembers(Processor processor, CastExpression castExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, castExpression);
      castExpression.expression = (Expression) Preconditions.checkNotNull(
      castExpression.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"CastExpression\" cannot be null");
  }
}
