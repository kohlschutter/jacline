package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_SwitchCase {

  public static Node visit(Processor processor, SwitchCase switchCase) {
    Node result = switchCase;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, switchCase);

    try {
      if (processorImpl.shouldProcessSwitchCase(switchCase)) {
        processorImpl.pushParent(switchCase);
        visitMembers(processorImpl, switchCase);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessSwitchCase(switchCase);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), switchCase, e);
    }

    popContext(processor, switchCase);
    return result;
  }

  static void pushContext(Processor processor, SwitchCase switchCase) {
    Visitor_Node.pushContext(processor, switchCase);
  }

  static void popContext(Processor processor, SwitchCase switchCase) {
    Visitor_Node.popContext(processor, switchCase);
  }

  static void visitMembers(Processor processor, SwitchCase switchCase) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, switchCase);
    if (switchCase.caseExpression != null) {
      switchCase.caseExpression = (Expression) switchCase.caseExpression.acceptInternal(processorImpl);
    }
      ListVisitor.visit(
          switchCase.statements,
          n -> (Statement) n.acceptInternal(processorImpl));
  }
}
