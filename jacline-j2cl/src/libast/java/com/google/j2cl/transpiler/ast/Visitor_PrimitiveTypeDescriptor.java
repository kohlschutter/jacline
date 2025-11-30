package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_PrimitiveTypeDescriptor {

  public static TypeDescriptor visit(Processor processor, PrimitiveTypeDescriptor primitiveTypeDescriptor) {
    TypeDescriptor result = primitiveTypeDescriptor;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, primitiveTypeDescriptor);

    try {
      if (processorImpl.shouldProcessPrimitiveTypeDescriptor(primitiveTypeDescriptor)) {
        processorImpl.pushParent(primitiveTypeDescriptor);
        visitMembers(processorImpl, primitiveTypeDescriptor);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessPrimitiveTypeDescriptor(primitiveTypeDescriptor);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), primitiveTypeDescriptor, e);
    }

    popContext(processor, primitiveTypeDescriptor);
    return result;
  }

  static void pushContext(Processor processor, PrimitiveTypeDescriptor primitiveTypeDescriptor) {
    Visitor_TypeDescriptor.pushContext(processor, primitiveTypeDescriptor);
  }

  static void popContext(Processor processor, PrimitiveTypeDescriptor primitiveTypeDescriptor) {
    Visitor_TypeDescriptor.popContext(processor, primitiveTypeDescriptor);
  }

  static void visitMembers(Processor processor, PrimitiveTypeDescriptor primitiveTypeDescriptor) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeDescriptor.visitMembers(processorImpl, primitiveTypeDescriptor);
  }
}
