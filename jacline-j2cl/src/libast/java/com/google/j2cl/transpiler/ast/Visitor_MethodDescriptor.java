package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_MethodDescriptor {

  public static MemberDescriptor visit(Processor processor, MethodDescriptor methodDescriptor) {
    MemberDescriptor result = methodDescriptor;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, methodDescriptor);

    try {
      if (processorImpl.shouldProcessMethodDescriptor(methodDescriptor)) {
        processorImpl.pushParent(methodDescriptor);
        visitMembers(processorImpl, methodDescriptor);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMethodDescriptor(methodDescriptor);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), methodDescriptor, e);
    }

    popContext(processor, methodDescriptor);
    return result;
  }

  static void pushContext(Processor processor, MethodDescriptor methodDescriptor) {
    Visitor_MemberDescriptor.pushContext(processor, methodDescriptor);
  }

  static void popContext(Processor processor, MethodDescriptor methodDescriptor) {
    Visitor_MemberDescriptor.popContext(processor, methodDescriptor);
  }

  static void visitMembers(Processor processor, MethodDescriptor methodDescriptor) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_MemberDescriptor.visitMembers(processorImpl, methodDescriptor);
  }
}
