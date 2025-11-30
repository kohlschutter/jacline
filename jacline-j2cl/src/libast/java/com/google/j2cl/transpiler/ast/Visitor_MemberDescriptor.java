package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_MemberDescriptor {

  public static MemberDescriptor visit(Processor processor, MemberDescriptor memberDescriptor) {
    MemberDescriptor result = memberDescriptor;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, memberDescriptor);

    try {
      if (processorImpl.shouldProcessMemberDescriptor(memberDescriptor)) {
        processorImpl.pushParent(memberDescriptor);
        visitMembers(processorImpl, memberDescriptor);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMemberDescriptor(memberDescriptor);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), memberDescriptor, e);
    }

    popContext(processor, memberDescriptor);
    return result;
  }

  static void pushContext(Processor processor, MemberDescriptor memberDescriptor) {
  }

  static void popContext(Processor processor, MemberDescriptor memberDescriptor) {
  }

  static void visitMembers(Processor processor, MemberDescriptor memberDescriptor) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
  }
}
