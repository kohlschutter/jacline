package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_BreakOrContinueStatement {

  public static Node visit(Processor processor, BreakOrContinueStatement breakOrContinueStatement) {
    Node result = breakOrContinueStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, breakOrContinueStatement);

    try {
      if (processorImpl.shouldProcessBreakOrContinueStatement(breakOrContinueStatement)) {
        processorImpl.pushParent(breakOrContinueStatement);
        visitMembers(processorImpl, breakOrContinueStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessBreakOrContinueStatement(breakOrContinueStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), breakOrContinueStatement, e);
    }

    popContext(processor, breakOrContinueStatement);
    return result;
  }

  static void pushContext(Processor processor, BreakOrContinueStatement breakOrContinueStatement) {
    Visitor_Statement.pushContext(processor, breakOrContinueStatement);
  }

  static void popContext(Processor processor, BreakOrContinueStatement breakOrContinueStatement) {
    Visitor_Statement.popContext(processor, breakOrContinueStatement);
  }

  static void visitMembers(Processor processor, BreakOrContinueStatement breakOrContinueStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, breakOrContinueStatement);
    if (breakOrContinueStatement.labelReference != null) {
      breakOrContinueStatement.labelReference = (LabelReference) breakOrContinueStatement.labelReference.acceptInternal(processorImpl);
    }
  }
}
