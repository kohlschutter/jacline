package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ThisOrSuperReference {

  public static Node visit(Processor processor, ThisOrSuperReference thisOrSuperReference) {
    Node result = thisOrSuperReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, thisOrSuperReference);

    try {
      if (processorImpl.shouldProcessThisOrSuperReference(thisOrSuperReference)) {
        processorImpl.pushParent(thisOrSuperReference);
        visitMembers(processorImpl, thisOrSuperReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessThisOrSuperReference(thisOrSuperReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), thisOrSuperReference, e);
    }

    popContext(processor, thisOrSuperReference);
    return result;
  }

  static void pushContext(Processor processor, ThisOrSuperReference thisOrSuperReference) {
    Visitor_Expression.pushContext(processor, thisOrSuperReference);
  }

  static void popContext(Processor processor, ThisOrSuperReference thisOrSuperReference) {
    Visitor_Expression.popContext(processor, thisOrSuperReference);
  }

  static void visitMembers(Processor processor, ThisOrSuperReference thisOrSuperReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, thisOrSuperReference);
  }
}
