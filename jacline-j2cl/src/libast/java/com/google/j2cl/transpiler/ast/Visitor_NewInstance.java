package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_NewInstance {

  public static Node visit(Processor processor, NewInstance newInstance) {
    Node result = newInstance;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, newInstance);

    try {
      if (processorImpl.shouldProcessNewInstance(newInstance)) {
        processorImpl.pushParent(newInstance);
        visitMembers(processorImpl, newInstance);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessNewInstance(newInstance);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), newInstance, e);
    }

    popContext(processor, newInstance);
    return result;
  }

  static void pushContext(Processor processor, NewInstance newInstance) {
    Visitor_Invocation.pushContext(processor, newInstance);
  }

  static void popContext(Processor processor, NewInstance newInstance) {
    Visitor_Invocation.popContext(processor, newInstance);
  }

  static void visitMembers(Processor processor, NewInstance newInstance) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Invocation.visitMembers(processorImpl, newInstance);
    if (newInstance.anonymousInnerClass != null) {
      newInstance.anonymousInnerClass = (Type) newInstance.anonymousInnerClass.acceptInternal(processorImpl);
    }
  }
}
