package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_BinaryExpression {

  public static Node visit(Processor processor, BinaryExpression binaryExpression) {
    Node result = binaryExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, binaryExpression);

    try {
      if (processorImpl.shouldProcessBinaryExpression(binaryExpression)) {
        processorImpl.pushParent(binaryExpression);
        visitMembers(processorImpl, binaryExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessBinaryExpression(binaryExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), binaryExpression, e);
    }

    popContext(processor, binaryExpression);
    return result;
  }

  static void pushContext(Processor processor, BinaryExpression binaryExpression) {
    Visitor_Expression.pushContext(processor, binaryExpression);
  }

  static void popContext(Processor processor, BinaryExpression binaryExpression) {
    Visitor_Expression.popContext(processor, binaryExpression);
  }

  static void visitMembers(Processor processor, BinaryExpression binaryExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, binaryExpression);
      binaryExpression.leftOperand = (Expression) Preconditions.checkNotNull(
      binaryExpression.leftOperand.acceptInternal(processorImpl),
          "Field \"leftOperand\" in class \"BinaryExpression\" cannot be null");
      binaryExpression.rightOperand = (Expression) Preconditions.checkNotNull(
      binaryExpression.rightOperand.acceptInternal(processorImpl),
          "Field \"rightOperand\" in class \"BinaryExpression\" cannot be null");
  }
}
