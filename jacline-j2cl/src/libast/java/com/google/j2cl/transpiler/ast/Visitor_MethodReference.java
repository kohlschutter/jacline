package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_MethodReference {

  public static Node visit(Processor processor, MethodReference methodReference) {
    Node result = methodReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, methodReference);

    try {
      if (processorImpl.shouldProcessMethodReference(methodReference)) {
        processorImpl.pushParent(methodReference);
        visitMembers(processorImpl, methodReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMethodReference(methodReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), methodReference, e);
    }

    popContext(processor, methodReference);
    return result;
  }

  static void pushContext(Processor processor, MethodReference methodReference) {
    Visitor_Expression.pushContext(processor, methodReference);
  }

  static void popContext(Processor processor, MethodReference methodReference) {
    Visitor_Expression.popContext(processor, methodReference);
  }

  static void visitMembers(Processor processor, MethodReference methodReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, methodReference);
    if (methodReference.qualifier != null) {
      methodReference.qualifier = (Expression) methodReference.qualifier.acceptInternal(processorImpl);
    }
  }
}
