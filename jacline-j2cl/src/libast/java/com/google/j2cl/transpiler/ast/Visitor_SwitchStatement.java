package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_SwitchStatement {

  public static Node visit(Processor processor, SwitchStatement switchStatement) {
    Node result = switchStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, switchStatement);

    try {
      if (processorImpl.shouldProcessSwitchStatement(switchStatement)) {
        processorImpl.pushParent(switchStatement);
        visitMembers(processorImpl, switchStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessSwitchStatement(switchStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), switchStatement, e);
    }

    popContext(processor, switchStatement);
    return result;
  }

  static void pushContext(Processor processor, SwitchStatement switchStatement) {
    Visitor_Statement.pushContext(processor, switchStatement);
  }

  static void popContext(Processor processor, SwitchStatement switchStatement) {
    Visitor_Statement.popContext(processor, switchStatement);
  }

  static void visitMembers(Processor processor, SwitchStatement switchStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, switchStatement);
      switchStatement.switchExpression = (Expression) Preconditions.checkNotNull(
      switchStatement.switchExpression.acceptInternal(processorImpl),
          "Field \"switchExpression\" in class \"SwitchStatement\" cannot be null");
      ListVisitor.visit(
          switchStatement.cases,
          n -> (SwitchCase) n.acceptInternal(processorImpl));
  }
}
