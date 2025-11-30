package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_FieldDeclarationStatement {

  public static Node visit(Processor processor, FieldDeclarationStatement fieldDeclarationStatement) {
    Node result = fieldDeclarationStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, fieldDeclarationStatement);

    try {
      if (processorImpl.shouldProcessFieldDeclarationStatement(fieldDeclarationStatement)) {
        processorImpl.pushParent(fieldDeclarationStatement);
        visitMembers(processorImpl, fieldDeclarationStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessFieldDeclarationStatement(fieldDeclarationStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), fieldDeclarationStatement, e);
    }

    popContext(processor, fieldDeclarationStatement);
    return result;
  }

  static void pushContext(Processor processor, FieldDeclarationStatement fieldDeclarationStatement) {
    Visitor_Statement.pushContext(processor, fieldDeclarationStatement);
  }

  static void popContext(Processor processor, FieldDeclarationStatement fieldDeclarationStatement) {
    Visitor_Statement.popContext(processor, fieldDeclarationStatement);
  }

  static void visitMembers(Processor processor, FieldDeclarationStatement fieldDeclarationStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, fieldDeclarationStatement);
      fieldDeclarationStatement.expression = (Expression) Preconditions.checkNotNull(
      fieldDeclarationStatement.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"FieldDeclarationStatement\" cannot be null");
      fieldDeclarationStatement.fieldDescriptor = (FieldDescriptor) Preconditions.checkNotNull(
      fieldDeclarationStatement.fieldDescriptor.acceptInternal(processorImpl),
          "Field \"fieldDescriptor\" in class \"FieldDeclarationStatement\" cannot be null");
  }
}
