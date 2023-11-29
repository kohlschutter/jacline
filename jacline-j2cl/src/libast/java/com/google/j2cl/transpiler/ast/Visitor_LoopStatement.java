package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_LoopStatement {

  public static Node visit(Processor processor, LoopStatement loopStatement) {
    Node result = loopStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, loopStatement);

    try {
      if (processorImpl.shouldProcessLoopStatement(loopStatement)) {
        processorImpl.pushParent(loopStatement);
        visitMembers(processorImpl, loopStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessLoopStatement(loopStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), loopStatement, e);
    }

    popContext(processor, loopStatement);
    return result;
  }

  static void pushContext(Processor processor, LoopStatement loopStatement) {
    Visitor_Statement.pushContext(processor, loopStatement);
  }

  static void popContext(Processor processor, LoopStatement loopStatement) {
    Visitor_Statement.popContext(processor, loopStatement);
  }

  static void visitMembers(Processor processor, LoopStatement loopStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, loopStatement);
  }
}
