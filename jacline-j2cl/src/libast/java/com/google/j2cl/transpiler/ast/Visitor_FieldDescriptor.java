package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_FieldDescriptor {

  public static MemberDescriptor visit(Processor processor, FieldDescriptor fieldDescriptor) {
    MemberDescriptor result = fieldDescriptor;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, fieldDescriptor);

    try {
      if (processorImpl.shouldProcessFieldDescriptor(fieldDescriptor)) {
        processorImpl.pushParent(fieldDescriptor);
        visitMembers(processorImpl, fieldDescriptor);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessFieldDescriptor(fieldDescriptor);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), fieldDescriptor, e);
    }

    popContext(processor, fieldDescriptor);
    return result;
  }

  static void pushContext(Processor processor, FieldDescriptor fieldDescriptor) {
    Visitor_MemberDescriptor.pushContext(processor, fieldDescriptor);
  }

  static void popContext(Processor processor, FieldDescriptor fieldDescriptor) {
    Visitor_MemberDescriptor.popContext(processor, fieldDescriptor);
  }

  static void visitMembers(Processor processor, FieldDescriptor fieldDescriptor) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_MemberDescriptor.visitMembers(processorImpl, fieldDescriptor);
  }
}
