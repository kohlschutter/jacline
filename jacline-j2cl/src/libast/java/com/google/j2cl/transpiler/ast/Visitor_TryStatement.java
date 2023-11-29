package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_TryStatement {

  public static Node visit(Processor processor, TryStatement tryStatement) {
    Node result = tryStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, tryStatement);

    try {
      if (processorImpl.shouldProcessTryStatement(tryStatement)) {
        processorImpl.pushParent(tryStatement);
        visitMembers(processorImpl, tryStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessTryStatement(tryStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), tryStatement, e);
    }

    popContext(processor, tryStatement);
    return result;
  }

  static void pushContext(Processor processor, TryStatement tryStatement) {
    Visitor_Statement.pushContext(processor, tryStatement);
  }

  static void popContext(Processor processor, TryStatement tryStatement) {
    Visitor_Statement.popContext(processor, tryStatement);
  }

  static void visitMembers(Processor processor, TryStatement tryStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, tryStatement);
      ListVisitor.visit(
          tryStatement.resourceDeclarations,
          n -> (VariableDeclarationExpression) n.acceptInternal(processorImpl));
      tryStatement.body = (Block) Preconditions.checkNotNull(
      tryStatement.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"TryStatement\" cannot be null");
      ListVisitor.visit(
          tryStatement.catchClauses,
          n -> (CatchClause) n.acceptInternal(processorImpl));
    if (tryStatement.finallyBlock != null) {
      tryStatement.finallyBlock = (Block) tryStatement.finallyBlock.acceptInternal(processorImpl);
    }
  }
}
