package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_UnionTypeDescriptor {

  public static TypeDescriptor visit(Processor processor, UnionTypeDescriptor unionTypeDescriptor) {
    TypeDescriptor result = unionTypeDescriptor;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, unionTypeDescriptor);

    try {
      if (processorImpl.shouldProcessUnionTypeDescriptor(unionTypeDescriptor)) {
        processorImpl.pushParent(unionTypeDescriptor);
        visitMembers(processorImpl, unionTypeDescriptor);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessUnionTypeDescriptor(unionTypeDescriptor);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), unionTypeDescriptor, e);
    }

    popContext(processor, unionTypeDescriptor);
    return result;
  }

  static void pushContext(Processor processor, UnionTypeDescriptor unionTypeDescriptor) {
    Visitor_TypeDescriptor.pushContext(processor, unionTypeDescriptor);
  }

  static void popContext(Processor processor, UnionTypeDescriptor unionTypeDescriptor) {
    Visitor_TypeDescriptor.popContext(processor, unionTypeDescriptor);
  }

  static void visitMembers(Processor processor, UnionTypeDescriptor unionTypeDescriptor) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeDescriptor.visitMembers(processorImpl, unionTypeDescriptor);
  }
}
