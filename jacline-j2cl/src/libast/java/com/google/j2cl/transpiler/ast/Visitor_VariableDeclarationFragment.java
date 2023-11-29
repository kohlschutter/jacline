package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_VariableDeclarationFragment {

  public static Node visit(Processor processor, VariableDeclarationFragment variableDeclarationFragment) {
    Node result = variableDeclarationFragment;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, variableDeclarationFragment);

    try {
      if (processorImpl.shouldProcessVariableDeclarationFragment(variableDeclarationFragment)) {
        processorImpl.pushParent(variableDeclarationFragment);
        visitMembers(processorImpl, variableDeclarationFragment);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessVariableDeclarationFragment(variableDeclarationFragment);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), variableDeclarationFragment, e);
    }

    popContext(processor, variableDeclarationFragment);
    return result;
  }

  static void pushContext(Processor processor, VariableDeclarationFragment variableDeclarationFragment) {
    Visitor_Node.pushContext(processor, variableDeclarationFragment);
  }

  static void popContext(Processor processor, VariableDeclarationFragment variableDeclarationFragment) {
    Visitor_Node.popContext(processor, variableDeclarationFragment);
  }

  static void visitMembers(Processor processor, VariableDeclarationFragment variableDeclarationFragment) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, variableDeclarationFragment);
      variableDeclarationFragment.variable = (Variable) Preconditions.checkNotNull(
      variableDeclarationFragment.variable.acceptInternal(processorImpl),
          "Field \"variable\" in class \"VariableDeclarationFragment\" cannot be null");
    if (variableDeclarationFragment.initializer != null) {
      variableDeclarationFragment.initializer = (Expression) variableDeclarationFragment.initializer.acceptInternal(processorImpl);
    }
  }
}
