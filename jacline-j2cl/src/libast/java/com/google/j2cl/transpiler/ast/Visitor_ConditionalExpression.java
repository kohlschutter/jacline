package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ConditionalExpression {

  public static Node visit(Processor processor, ConditionalExpression conditionalExpression) {
    Node result = conditionalExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, conditionalExpression);

    try {
      if (processorImpl.shouldProcessConditionalExpression(conditionalExpression)) {
        processorImpl.pushParent(conditionalExpression);
        visitMembers(processorImpl, conditionalExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessConditionalExpression(conditionalExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), conditionalExpression, e);
    }

    popContext(processor, conditionalExpression);
    return result;
  }

  static void pushContext(Processor processor, ConditionalExpression conditionalExpression) {
    Visitor_Expression.pushContext(processor, conditionalExpression);
  }

  static void popContext(Processor processor, ConditionalExpression conditionalExpression) {
    Visitor_Expression.popContext(processor, conditionalExpression);
  }

  static void visitMembers(Processor processor, ConditionalExpression conditionalExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, conditionalExpression);
      conditionalExpression.conditionExpression = (Expression) Preconditions.checkNotNull(
      conditionalExpression.conditionExpression.acceptInternal(processorImpl),
          "Field \"conditionExpression\" in class \"ConditionalExpression\" cannot be null");
      conditionalExpression.trueExpression = (Expression) Preconditions.checkNotNull(
      conditionalExpression.trueExpression.acceptInternal(processorImpl),
          "Field \"trueExpression\" in class \"ConditionalExpression\" cannot be null");
      conditionalExpression.falseExpression = (Expression) Preconditions.checkNotNull(
      conditionalExpression.falseExpression.acceptInternal(processorImpl),
          "Field \"falseExpression\" in class \"ConditionalExpression\" cannot be null");
  }
}
