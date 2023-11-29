package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_WhileStatement {

  public static Node visit(Processor processor, WhileStatement whileStatement) {
    Node result = whileStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, whileStatement);

    try {
      if (processorImpl.shouldProcessWhileStatement(whileStatement)) {
        processorImpl.pushParent(whileStatement);
        visitMembers(processorImpl, whileStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessWhileStatement(whileStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), whileStatement, e);
    }

    popContext(processor, whileStatement);
    return result;
  }

  static void pushContext(Processor processor, WhileStatement whileStatement) {
    Visitor_LoopStatement.pushContext(processor, whileStatement);
  }

  static void popContext(Processor processor, WhileStatement whileStatement) {
    Visitor_LoopStatement.popContext(processor, whileStatement);
  }

  static void visitMembers(Processor processor, WhileStatement whileStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_LoopStatement.visitMembers(processorImpl, whileStatement);
      whileStatement.conditionExpression = (Expression) Preconditions.checkNotNull(
      whileStatement.conditionExpression.acceptInternal(processorImpl),
          "Field \"conditionExpression\" in class \"WhileStatement\" cannot be null");
      whileStatement.body = (Statement) Preconditions.checkNotNull(
      whileStatement.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"WhileStatement\" cannot be null");
  }
}
