package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ForEachStatement {

  public static Node visit(Processor processor, ForEachStatement forEachStatement) {
    Node result = forEachStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, forEachStatement);

    try {
      if (processorImpl.shouldProcessForEachStatement(forEachStatement)) {
        processorImpl.pushParent(forEachStatement);
        visitMembers(processorImpl, forEachStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessForEachStatement(forEachStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), forEachStatement, e);
    }

    popContext(processor, forEachStatement);
    return result;
  }

  static void pushContext(Processor processor, ForEachStatement forEachStatement) {
    Visitor_LoopStatement.pushContext(processor, forEachStatement);
  }

  static void popContext(Processor processor, ForEachStatement forEachStatement) {
    Visitor_LoopStatement.popContext(processor, forEachStatement);
  }

  static void visitMembers(Processor processor, ForEachStatement forEachStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_LoopStatement.visitMembers(processorImpl, forEachStatement);
      forEachStatement.loopVariable = (Variable) Preconditions.checkNotNull(
      forEachStatement.loopVariable.acceptInternal(processorImpl),
          "Field \"loopVariable\" in class \"ForEachStatement\" cannot be null");
      forEachStatement.iterableExpression = (Expression) Preconditions.checkNotNull(
      forEachStatement.iterableExpression.acceptInternal(processorImpl),
          "Field \"iterableExpression\" in class \"ForEachStatement\" cannot be null");
      forEachStatement.body = (Statement) Preconditions.checkNotNull(
      forEachStatement.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"ForEachStatement\" cannot be null");
  }
}
