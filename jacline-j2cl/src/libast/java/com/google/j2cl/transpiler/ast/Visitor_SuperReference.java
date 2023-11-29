package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_SuperReference {

  public static Node visit(Processor processor, SuperReference superReference) {
    Node result = superReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, superReference);

    try {
      if (processorImpl.shouldProcessSuperReference(superReference)) {
        processorImpl.pushParent(superReference);
        visitMembers(processorImpl, superReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessSuperReference(superReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), superReference, e);
    }

    popContext(processor, superReference);
    return result;
  }

  static void pushContext(Processor processor, SuperReference superReference) {
    Visitor_ThisOrSuperReference.pushContext(processor, superReference);
  }

  static void popContext(Processor processor, SuperReference superReference) {
    Visitor_ThisOrSuperReference.popContext(processor, superReference);
  }

  static void visitMembers(Processor processor, SuperReference superReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_ThisOrSuperReference.visitMembers(processorImpl, superReference);
  }
}
