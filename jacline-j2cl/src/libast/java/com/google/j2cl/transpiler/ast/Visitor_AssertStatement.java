package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_AssertStatement {

  public static Node visit(Processor processor, AssertStatement assertStatement) {
    Node result = assertStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, assertStatement);

    try {
      if (processorImpl.shouldProcessAssertStatement(assertStatement)) {
        processorImpl.pushParent(assertStatement);
        visitMembers(processorImpl, assertStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessAssertStatement(assertStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), assertStatement, e);
    }

    popContext(processor, assertStatement);
    return result;
  }

  static void pushContext(Processor processor, AssertStatement assertStatement) {
    Visitor_Statement.pushContext(processor, assertStatement);
  }

  static void popContext(Processor processor, AssertStatement assertStatement) {
    Visitor_Statement.popContext(processor, assertStatement);
  }

  static void visitMembers(Processor processor, AssertStatement assertStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, assertStatement);
      assertStatement.expression = (Expression) Preconditions.checkNotNull(
      assertStatement.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"AssertStatement\" cannot be null");
    if (assertStatement.message != null) {
      assertStatement.message = (Expression) assertStatement.message.acceptInternal(processorImpl);
    }
  }
}
