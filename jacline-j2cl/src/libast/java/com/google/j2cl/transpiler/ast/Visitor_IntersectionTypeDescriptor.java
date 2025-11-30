package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_IntersectionTypeDescriptor {

  public static TypeDescriptor visit(Processor processor, IntersectionTypeDescriptor intersectionTypeDescriptor) {
    TypeDescriptor result = intersectionTypeDescriptor;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, intersectionTypeDescriptor);

    try {
      if (processorImpl.shouldProcessIntersectionTypeDescriptor(intersectionTypeDescriptor)) {
        processorImpl.pushParent(intersectionTypeDescriptor);
        visitMembers(processorImpl, intersectionTypeDescriptor);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessIntersectionTypeDescriptor(intersectionTypeDescriptor);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), intersectionTypeDescriptor, e);
    }

    popContext(processor, intersectionTypeDescriptor);
    return result;
  }

  static void pushContext(Processor processor, IntersectionTypeDescriptor intersectionTypeDescriptor) {
    Visitor_TypeDescriptor.pushContext(processor, intersectionTypeDescriptor);
  }

  static void popContext(Processor processor, IntersectionTypeDescriptor intersectionTypeDescriptor) {
    Visitor_TypeDescriptor.popContext(processor, intersectionTypeDescriptor);
  }

  static void visitMembers(Processor processor, IntersectionTypeDescriptor intersectionTypeDescriptor) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeDescriptor.visitMembers(processorImpl, intersectionTypeDescriptor);
  }
}
