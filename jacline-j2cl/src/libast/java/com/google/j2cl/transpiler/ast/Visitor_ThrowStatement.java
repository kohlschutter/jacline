package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ThrowStatement {

  public static Node visit(Processor processor, ThrowStatement throwStatement) {
    Node result = throwStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, throwStatement);

    try {
      if (processorImpl.shouldProcessThrowStatement(throwStatement)) {
        processorImpl.pushParent(throwStatement);
        visitMembers(processorImpl, throwStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessThrowStatement(throwStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), throwStatement, e);
    }

    popContext(processor, throwStatement);
    return result;
  }

  static void pushContext(Processor processor, ThrowStatement throwStatement) {
    Visitor_Statement.pushContext(processor, throwStatement);
  }

  static void popContext(Processor processor, ThrowStatement throwStatement) {
    Visitor_Statement.popContext(processor, throwStatement);
  }

  static void visitMembers(Processor processor, ThrowStatement throwStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, throwStatement);
      throwStatement.expression = (Expression) Preconditions.checkNotNull(
      throwStatement.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"ThrowStatement\" cannot be null");
  }
}
