package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_SwitchExpression {

  public static Node visit(Processor processor, SwitchExpression switchExpression) {
    Node result = switchExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, switchExpression);

    try {
      if (processorImpl.shouldProcessSwitchExpression(switchExpression)) {
        processorImpl.pushParent(switchExpression);
        visitMembers(processorImpl, switchExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessSwitchExpression(switchExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), switchExpression, e);
    }

    popContext(processor, switchExpression);
    return result;
  }

  static void pushContext(Processor processor, SwitchExpression switchExpression) {
    Visitor_Expression.pushContext(processor, switchExpression);
  }

  static void popContext(Processor processor, SwitchExpression switchExpression) {
    Visitor_Expression.popContext(processor, switchExpression);
  }

  static void visitMembers(Processor processor, SwitchExpression switchExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, switchExpression);
      switchExpression.typeDescriptor = (TypeDescriptor) Preconditions.checkNotNull(
      switchExpression.typeDescriptor.acceptInternal(processorImpl),
          "Field \"typeDescriptor\" in class \"SwitchExpression\" cannot be null");
      switchExpression.expression = (Expression) Preconditions.checkNotNull(
      switchExpression.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"SwitchExpression\" cannot be null");
      ListVisitor.visit(
          switchExpression.cases,
          n -> (SwitchCase) n.acceptInternal(processorImpl));
  }
}
