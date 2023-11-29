package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_CatchClause {

  public static Node visit(Processor processor, CatchClause catchClause) {
    Node result = catchClause;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, catchClause);

    try {
      if (processorImpl.shouldProcessCatchClause(catchClause)) {
        processorImpl.pushParent(catchClause);
        visitMembers(processorImpl, catchClause);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessCatchClause(catchClause);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), catchClause, e);
    }

    popContext(processor, catchClause);
    return result;
  }

  static void pushContext(Processor processor, CatchClause catchClause) {
    Visitor_Node.pushContext(processor, catchClause);
  }

  static void popContext(Processor processor, CatchClause catchClause) {
    Visitor_Node.popContext(processor, catchClause);
  }

  static void visitMembers(Processor processor, CatchClause catchClause) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, catchClause);
      catchClause.exceptionVariable = (Variable) Preconditions.checkNotNull(
      catchClause.exceptionVariable.acceptInternal(processorImpl),
          "Field \"exceptionVariable\" in class \"CatchClause\" cannot be null");
      catchClause.body = (Block) Preconditions.checkNotNull(
      catchClause.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"CatchClause\" cannot be null");
  }
}
