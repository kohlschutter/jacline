package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_MultiExpression {

  public static Node visit(Processor processor, MultiExpression multiExpression) {
    Node result = multiExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, multiExpression);

    try {
      if (processorImpl.shouldProcessMultiExpression(multiExpression)) {
        processorImpl.pushParent(multiExpression);
        visitMembers(processorImpl, multiExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMultiExpression(multiExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), multiExpression, e);
    }

    popContext(processor, multiExpression);
    return result;
  }

  static void pushContext(Processor processor, MultiExpression multiExpression) {
    Visitor_Expression.pushContext(processor, multiExpression);
  }

  static void popContext(Processor processor, MultiExpression multiExpression) {
    Visitor_Expression.popContext(processor, multiExpression);
  }

  static void visitMembers(Processor processor, MultiExpression multiExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, multiExpression);
      ListVisitor.visit(
          multiExpression.expressions,
          n -> (Expression) n.acceptInternal(processorImpl));
  }
}
