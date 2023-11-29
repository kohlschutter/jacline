package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_InstanceOfExpression {

  public static Node visit(Processor processor, InstanceOfExpression instanceOfExpression) {
    Node result = instanceOfExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, instanceOfExpression);

    try {
      if (processorImpl.shouldProcessInstanceOfExpression(instanceOfExpression)) {
        processorImpl.pushParent(instanceOfExpression);
        visitMembers(processorImpl, instanceOfExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessInstanceOfExpression(instanceOfExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), instanceOfExpression, e);
    }

    popContext(processor, instanceOfExpression);
    return result;
  }

  static void pushContext(Processor processor, InstanceOfExpression instanceOfExpression) {
    Visitor_Expression.pushContext(processor, instanceOfExpression);
  }

  static void popContext(Processor processor, InstanceOfExpression instanceOfExpression) {
    Visitor_Expression.popContext(processor, instanceOfExpression);
  }

  static void visitMembers(Processor processor, InstanceOfExpression instanceOfExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, instanceOfExpression);
      instanceOfExpression.expression = (Expression) Preconditions.checkNotNull(
      instanceOfExpression.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"InstanceOfExpression\" cannot be null");
  }
}
