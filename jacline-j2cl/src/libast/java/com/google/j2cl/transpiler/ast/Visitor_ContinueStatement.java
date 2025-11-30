package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ContinueStatement {

  public static Node visit(Processor processor, ContinueStatement continueStatement) {
    Node result = continueStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, continueStatement);

    try {
      if (processorImpl.shouldProcessContinueStatement(continueStatement)) {
        processorImpl.pushParent(continueStatement);
        visitMembers(processorImpl, continueStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessContinueStatement(continueStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), continueStatement, e);
    }

    popContext(processor, continueStatement);
    return result;
  }

  static void pushContext(Processor processor, ContinueStatement continueStatement) {
    Visitor_BreakOrContinueStatement.pushContext(processor, continueStatement);
  }

  static void popContext(Processor processor, ContinueStatement continueStatement) {
    Visitor_BreakOrContinueStatement.popContext(processor, continueStatement);
  }

  static void visitMembers(Processor processor, ContinueStatement continueStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_BreakOrContinueStatement.visitMembers(processorImpl, continueStatement);
  }
}
