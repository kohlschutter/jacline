package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_BreakStatement {

  public static Node visit(Processor processor, BreakStatement breakStatement) {
    Node result = breakStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, breakStatement);

    try {
      if (processorImpl.shouldProcessBreakStatement(breakStatement)) {
        processorImpl.pushParent(breakStatement);
        visitMembers(processorImpl, breakStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessBreakStatement(breakStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), breakStatement, e);
    }

    popContext(processor, breakStatement);
    return result;
  }

  static void pushContext(Processor processor, BreakStatement breakStatement) {
    Visitor_BreakOrContinueStatement.pushContext(processor, breakStatement);
  }

  static void popContext(Processor processor, BreakStatement breakStatement) {
    Visitor_BreakOrContinueStatement.popContext(processor, breakStatement);
  }

  static void visitMembers(Processor processor, BreakStatement breakStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_BreakOrContinueStatement.visitMembers(processorImpl, breakStatement);
  }
}
