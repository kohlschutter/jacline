package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_VariableDeclarationExpression {

  public static Node visit(Processor processor, VariableDeclarationExpression variableDeclarationExpression) {
    Node result = variableDeclarationExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, variableDeclarationExpression);

    try {
      if (processorImpl.shouldProcessVariableDeclarationExpression(variableDeclarationExpression)) {
        processorImpl.pushParent(variableDeclarationExpression);
        visitMembers(processorImpl, variableDeclarationExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessVariableDeclarationExpression(variableDeclarationExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), variableDeclarationExpression, e);
    }

    popContext(processor, variableDeclarationExpression);
    return result;
  }

  static void pushContext(Processor processor, VariableDeclarationExpression variableDeclarationExpression) {
    Visitor_Expression.pushContext(processor, variableDeclarationExpression);
  }

  static void popContext(Processor processor, VariableDeclarationExpression variableDeclarationExpression) {
    Visitor_Expression.popContext(processor, variableDeclarationExpression);
  }

  static void visitMembers(Processor processor, VariableDeclarationExpression variableDeclarationExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, variableDeclarationExpression);
      ListVisitor.visit(
          variableDeclarationExpression.fragments,
          n -> (VariableDeclarationFragment) n.acceptInternal(processorImpl));
  }
}
