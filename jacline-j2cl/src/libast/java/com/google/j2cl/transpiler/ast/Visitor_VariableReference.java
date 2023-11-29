package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_VariableReference {

  public static Node visit(Processor processor, VariableReference variableReference) {
    Node result = variableReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, variableReference);

    try {
      if (processorImpl.shouldProcessVariableReference(variableReference)) {
        processorImpl.pushParent(variableReference);
        visitMembers(processorImpl, variableReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessVariableReference(variableReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), variableReference, e);
    }

    popContext(processor, variableReference);
    return result;
  }

  static void pushContext(Processor processor, VariableReference variableReference) {
    Visitor_Expression.pushContext(processor, variableReference);
  }

  static void popContext(Processor processor, VariableReference variableReference) {
    Visitor_Expression.popContext(processor, variableReference);
  }

  static void visitMembers(Processor processor, VariableReference variableReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, variableReference);
  }
}
