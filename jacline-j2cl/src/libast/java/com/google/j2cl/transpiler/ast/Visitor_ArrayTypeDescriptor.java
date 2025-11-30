package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ArrayTypeDescriptor {

  public static TypeDescriptor visit(Processor processor, ArrayTypeDescriptor arrayTypeDescriptor) {
    TypeDescriptor result = arrayTypeDescriptor;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, arrayTypeDescriptor);

    try {
      if (processorImpl.shouldProcessArrayTypeDescriptor(arrayTypeDescriptor)) {
        processorImpl.pushParent(arrayTypeDescriptor);
        visitMembers(processorImpl, arrayTypeDescriptor);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessArrayTypeDescriptor(arrayTypeDescriptor);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), arrayTypeDescriptor, e);
    }

    popContext(processor, arrayTypeDescriptor);
    return result;
  }

  static void pushContext(Processor processor, ArrayTypeDescriptor arrayTypeDescriptor) {
    Visitor_TypeDescriptor.pushContext(processor, arrayTypeDescriptor);
  }

  static void popContext(Processor processor, ArrayTypeDescriptor arrayTypeDescriptor) {
    Visitor_TypeDescriptor.popContext(processor, arrayTypeDescriptor);
  }

  static void visitMembers(Processor processor, ArrayTypeDescriptor arrayTypeDescriptor) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeDescriptor.visitMembers(processorImpl, arrayTypeDescriptor);
  }
}
