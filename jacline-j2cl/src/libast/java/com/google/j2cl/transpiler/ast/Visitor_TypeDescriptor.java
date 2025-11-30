package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_TypeDescriptor {

  public static TypeDescriptor visit(Processor processor, TypeDescriptor typeDescriptor) {
    TypeDescriptor result = typeDescriptor;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, typeDescriptor);

    try {
      if (processorImpl.shouldProcessTypeDescriptor(typeDescriptor)) {
        processorImpl.pushParent(typeDescriptor);
        visitMembers(processorImpl, typeDescriptor);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessTypeDescriptor(typeDescriptor);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), typeDescriptor, e);
    }

    popContext(processor, typeDescriptor);
    return result;
  }

  static void pushContext(Processor processor, TypeDescriptor typeDescriptor) {
  }

  static void popContext(Processor processor, TypeDescriptor typeDescriptor) {
  }

  static void visitMembers(Processor processor, TypeDescriptor typeDescriptor) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
  }
}
