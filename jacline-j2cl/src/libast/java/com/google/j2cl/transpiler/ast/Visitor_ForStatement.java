package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ForStatement {

  public static Node visit(Processor processor, ForStatement forStatement) {
    Node result = forStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, forStatement);

    try {
      if (processorImpl.shouldProcessForStatement(forStatement)) {
        processorImpl.pushParent(forStatement);
        visitMembers(processorImpl, forStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessForStatement(forStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), forStatement, e);
    }

    popContext(processor, forStatement);
    return result;
  }

  static void pushContext(Processor processor, ForStatement forStatement) {
    Visitor_LoopStatement.pushContext(processor, forStatement);
  }

  static void popContext(Processor processor, ForStatement forStatement) {
    Visitor_LoopStatement.popContext(processor, forStatement);
  }

  static void visitMembers(Processor processor, ForStatement forStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_LoopStatement.visitMembers(processorImpl, forStatement);
      ListVisitor.visit(
          forStatement.initializers,
          n -> (Expression) n.acceptInternal(processorImpl));
      forStatement.conditionExpression = (Expression) Preconditions.checkNotNull(
      forStatement.conditionExpression.acceptInternal(processorImpl),
          "Field \"conditionExpression\" in class \"ForStatement\" cannot be null");
      ListVisitor.visit(
          forStatement.updates,
          n -> (Expression) n.acceptInternal(processorImpl));
      forStatement.body = (Statement) Preconditions.checkNotNull(
      forStatement.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"ForStatement\" cannot be null");
  }
}
