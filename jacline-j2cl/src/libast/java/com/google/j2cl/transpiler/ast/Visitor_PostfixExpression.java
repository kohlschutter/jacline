package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_PostfixExpression {

  public static Node visit(Processor processor, PostfixExpression postfixExpression) {
    Node result = postfixExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, postfixExpression);

    try {
      if (processorImpl.shouldProcessPostfixExpression(postfixExpression)) {
        processorImpl.pushParent(postfixExpression);
        visitMembers(processorImpl, postfixExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessPostfixExpression(postfixExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), postfixExpression, e);
    }

    popContext(processor, postfixExpression);
    return result;
  }

  static void pushContext(Processor processor, PostfixExpression postfixExpression) {
    Visitor_UnaryExpression.pushContext(processor, postfixExpression);
  }

  static void popContext(Processor processor, PostfixExpression postfixExpression) {
    Visitor_UnaryExpression.popContext(processor, postfixExpression);
  }

  static void visitMembers(Processor processor, PostfixExpression postfixExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_UnaryExpression.visitMembers(processorImpl, postfixExpression);
  }
}
