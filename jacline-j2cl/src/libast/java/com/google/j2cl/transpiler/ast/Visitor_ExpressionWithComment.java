package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ExpressionWithComment {

  public static Node visit(Processor processor, ExpressionWithComment expressionWithComment) {
    Node result = expressionWithComment;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, expressionWithComment);

    try {
      if (processorImpl.shouldProcessExpressionWithComment(expressionWithComment)) {
        processorImpl.pushParent(expressionWithComment);
        visitMembers(processorImpl, expressionWithComment);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessExpressionWithComment(expressionWithComment);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), expressionWithComment, e);
    }

    popContext(processor, expressionWithComment);
    return result;
  }

  static void pushContext(Processor processor, ExpressionWithComment expressionWithComment) {
    Visitor_Expression.pushContext(processor, expressionWithComment);
  }

  static void popContext(Processor processor, ExpressionWithComment expressionWithComment) {
    Visitor_Expression.popContext(processor, expressionWithComment);
  }

  static void visitMembers(Processor processor, ExpressionWithComment expressionWithComment) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, expressionWithComment);
      expressionWithComment.expression = (Expression) Preconditions.checkNotNull(
      expressionWithComment.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"ExpressionWithComment\" cannot be null");
  }
}
