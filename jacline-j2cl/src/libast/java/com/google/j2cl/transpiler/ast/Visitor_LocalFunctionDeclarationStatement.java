package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_LocalFunctionDeclarationStatement {

  public static Node visit(Processor processor, LocalFunctionDeclarationStatement localFunctionDeclarationStatement) {
    Node result = localFunctionDeclarationStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, localFunctionDeclarationStatement);

    try {
      if (processorImpl.shouldProcessLocalFunctionDeclarationStatement(localFunctionDeclarationStatement)) {
        processorImpl.pushParent(localFunctionDeclarationStatement);
        visitMembers(processorImpl, localFunctionDeclarationStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessLocalFunctionDeclarationStatement(localFunctionDeclarationStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), localFunctionDeclarationStatement, e);
    }

    popContext(processor, localFunctionDeclarationStatement);
    return result;
  }

  static void pushContext(Processor processor, LocalFunctionDeclarationStatement localFunctionDeclarationStatement) {
    Visitor_Statement.pushContext(processor, localFunctionDeclarationStatement);
  }

  static void popContext(Processor processor, LocalFunctionDeclarationStatement localFunctionDeclarationStatement) {
    Visitor_Statement.popContext(processor, localFunctionDeclarationStatement);
  }

  static void visitMembers(Processor processor, LocalFunctionDeclarationStatement localFunctionDeclarationStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, localFunctionDeclarationStatement);
      localFunctionDeclarationStatement.methodDescriptor = (MethodDescriptor) Preconditions.checkNotNull(
      localFunctionDeclarationStatement.methodDescriptor.acceptInternal(processorImpl),
          "Field \"methodDescriptor\" in class \"LocalFunctionDeclarationStatement\" cannot be null");
      ListVisitor.visit(
          localFunctionDeclarationStatement.parameters,
          n -> (Variable) n.acceptInternal(processorImpl));
      localFunctionDeclarationStatement.body = (Block) Preconditions.checkNotNull(
      localFunctionDeclarationStatement.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"LocalFunctionDeclarationStatement\" cannot be null");
  }
}
