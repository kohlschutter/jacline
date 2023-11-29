package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_IfStatement {

  public static Node visit(Processor processor, IfStatement ifStatement) {
    Node result = ifStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, ifStatement);

    try {
      if (processorImpl.shouldProcessIfStatement(ifStatement)) {
        processorImpl.pushParent(ifStatement);
        visitMembers(processorImpl, ifStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessIfStatement(ifStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), ifStatement, e);
    }

    popContext(processor, ifStatement);
    return result;
  }

  static void pushContext(Processor processor, IfStatement ifStatement) {
    Visitor_Statement.pushContext(processor, ifStatement);
  }

  static void popContext(Processor processor, IfStatement ifStatement) {
    Visitor_Statement.popContext(processor, ifStatement);
  }

  static void visitMembers(Processor processor, IfStatement ifStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, ifStatement);
      ifStatement.conditionExpression = (Expression) Preconditions.checkNotNull(
      ifStatement.conditionExpression.acceptInternal(processorImpl),
          "Field \"conditionExpression\" in class \"IfStatement\" cannot be null");
      ifStatement.thenStatement = (Statement) Preconditions.checkNotNull(
      ifStatement.thenStatement.acceptInternal(processorImpl),
          "Field \"thenStatement\" in class \"IfStatement\" cannot be null");
    if (ifStatement.elseStatement != null) {
      ifStatement.elseStatement = (Statement) ifStatement.elseStatement.acceptInternal(processorImpl);
    }
  }
}
