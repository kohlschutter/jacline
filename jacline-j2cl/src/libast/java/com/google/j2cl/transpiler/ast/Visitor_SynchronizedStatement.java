package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_SynchronizedStatement {

  public static Node visit(Processor processor, SynchronizedStatement synchronizedStatement) {
    Node result = synchronizedStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, synchronizedStatement);

    try {
      if (processorImpl.shouldProcessSynchronizedStatement(synchronizedStatement)) {
        processorImpl.pushParent(synchronizedStatement);
        visitMembers(processorImpl, synchronizedStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessSynchronizedStatement(synchronizedStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), synchronizedStatement, e);
    }

    popContext(processor, synchronizedStatement);
    return result;
  }

  static void pushContext(Processor processor, SynchronizedStatement synchronizedStatement) {
    Visitor_Statement.pushContext(processor, synchronizedStatement);
  }

  static void popContext(Processor processor, SynchronizedStatement synchronizedStatement) {
    Visitor_Statement.popContext(processor, synchronizedStatement);
  }

  static void visitMembers(Processor processor, SynchronizedStatement synchronizedStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, synchronizedStatement);
      synchronizedStatement.expression = (Expression) Preconditions.checkNotNull(
      synchronizedStatement.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"SynchronizedStatement\" cannot be null");
      synchronizedStatement.body = (Block) Preconditions.checkNotNull(
      synchronizedStatement.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"SynchronizedStatement\" cannot be null");
  }
}
