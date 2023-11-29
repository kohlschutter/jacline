package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_DoWhileStatement {

  public static Node visit(Processor processor, DoWhileStatement doWhileStatement) {
    Node result = doWhileStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, doWhileStatement);

    try {
      if (processorImpl.shouldProcessDoWhileStatement(doWhileStatement)) {
        processorImpl.pushParent(doWhileStatement);
        visitMembers(processorImpl, doWhileStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessDoWhileStatement(doWhileStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), doWhileStatement, e);
    }

    popContext(processor, doWhileStatement);
    return result;
  }

  static void pushContext(Processor processor, DoWhileStatement doWhileStatement) {
    Visitor_LoopStatement.pushContext(processor, doWhileStatement);
  }

  static void popContext(Processor processor, DoWhileStatement doWhileStatement) {
    Visitor_LoopStatement.popContext(processor, doWhileStatement);
  }

  static void visitMembers(Processor processor, DoWhileStatement doWhileStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_LoopStatement.visitMembers(processorImpl, doWhileStatement);
      doWhileStatement.body = (Statement) Preconditions.checkNotNull(
      doWhileStatement.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"DoWhileStatement\" cannot be null");
      doWhileStatement.conditionExpression = (Expression) Preconditions.checkNotNull(
      doWhileStatement.conditionExpression.acceptInternal(processorImpl),
          "Field \"conditionExpression\" in class \"DoWhileStatement\" cannot be null");
  }
}
