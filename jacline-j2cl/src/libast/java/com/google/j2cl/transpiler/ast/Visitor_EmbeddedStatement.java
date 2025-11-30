package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_EmbeddedStatement {

  public static Node visit(Processor processor, EmbeddedStatement embeddedStatement) {
    Node result = embeddedStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, embeddedStatement);

    try {
      if (processorImpl.shouldProcessEmbeddedStatement(embeddedStatement)) {
        processorImpl.pushParent(embeddedStatement);
        visitMembers(processorImpl, embeddedStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessEmbeddedStatement(embeddedStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), embeddedStatement, e);
    }

    popContext(processor, embeddedStatement);
    return result;
  }

  static void pushContext(Processor processor, EmbeddedStatement embeddedStatement) {
    Visitor_Expression.pushContext(processor, embeddedStatement);
  }

  static void popContext(Processor processor, EmbeddedStatement embeddedStatement) {
    Visitor_Expression.popContext(processor, embeddedStatement);
  }

  static void visitMembers(Processor processor, EmbeddedStatement embeddedStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, embeddedStatement);
      embeddedStatement.statement = (Statement) Preconditions.checkNotNull(
      embeddedStatement.statement.acceptInternal(processorImpl),
          "Field \"statement\" in class \"EmbeddedStatement\" cannot be null");
      embeddedStatement.typeDescriptor = (TypeDescriptor) Preconditions.checkNotNull(
      embeddedStatement.typeDescriptor.acceptInternal(processorImpl),
          "Field \"typeDescriptor\" in class \"EmbeddedStatement\" cannot be null");
  }
}
