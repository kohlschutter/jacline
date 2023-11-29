package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Variable {

  public static Node visit(Processor processor, Variable variable) {
    Node result = variable;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, variable);

    try {
      if (processorImpl.shouldProcessVariable(variable)) {
        processorImpl.pushParent(variable);
        visitMembers(processorImpl, variable);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessVariable(variable);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), variable, e);
    }

    popContext(processor, variable);
    return result;
  }

  static void pushContext(Processor processor, Variable variable) {
    Visitor_NameDeclaration.pushContext(processor, variable);
  }

  static void popContext(Processor processor, Variable variable) {
    Visitor_NameDeclaration.popContext(processor, variable);
  }

  static void visitMembers(Processor processor, Variable variable) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_NameDeclaration.visitMembers(processorImpl, variable);
  }
}
