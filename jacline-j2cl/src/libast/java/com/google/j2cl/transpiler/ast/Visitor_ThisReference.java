package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ThisReference {

  public static Node visit(Processor processor, ThisReference thisReference) {
    Node result = thisReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, thisReference);

    try {
      if (processorImpl.shouldProcessThisReference(thisReference)) {
        processorImpl.pushParent(thisReference);
        visitMembers(processorImpl, thisReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessThisReference(thisReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), thisReference, e);
    }

    popContext(processor, thisReference);
    return result;
  }

  static void pushContext(Processor processor, ThisReference thisReference) {
    Visitor_ThisOrSuperReference.pushContext(processor, thisReference);
  }

  static void popContext(Processor processor, ThisReference thisReference) {
    Visitor_ThisOrSuperReference.popContext(processor, thisReference);
  }

  static void visitMembers(Processor processor, ThisReference thisReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_ThisOrSuperReference.visitMembers(processorImpl, thisReference);
  }
}
