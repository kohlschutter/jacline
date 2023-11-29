package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_LocalClassDeclarationStatement {

  public static Node visit(Processor processor, LocalClassDeclarationStatement localClassDeclarationStatement) {
    Node result = localClassDeclarationStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, localClassDeclarationStatement);

    try {
      if (processorImpl.shouldProcessLocalClassDeclarationStatement(localClassDeclarationStatement)) {
        processorImpl.pushParent(localClassDeclarationStatement);
        visitMembers(processorImpl, localClassDeclarationStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessLocalClassDeclarationStatement(localClassDeclarationStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), localClassDeclarationStatement, e);
    }

    popContext(processor, localClassDeclarationStatement);
    return result;
  }

  static void pushContext(Processor processor, LocalClassDeclarationStatement localClassDeclarationStatement) {
    Visitor_Statement.pushContext(processor, localClassDeclarationStatement);
  }

  static void popContext(Processor processor, LocalClassDeclarationStatement localClassDeclarationStatement) {
    Visitor_Statement.popContext(processor, localClassDeclarationStatement);
  }

  static void visitMembers(Processor processor, LocalClassDeclarationStatement localClassDeclarationStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, localClassDeclarationStatement);
      localClassDeclarationStatement.localClass = (Type) Preconditions.checkNotNull(
      localClassDeclarationStatement.localClass.acceptInternal(processorImpl),
          "Field \"localClass\" in class \"LocalClassDeclarationStatement\" cannot be null");
  }
}
