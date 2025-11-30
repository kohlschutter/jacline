package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_DeclaredTypeDescriptor {

  public static TypeDescriptor visit(Processor processor, DeclaredTypeDescriptor declaredTypeDescriptor) {
    TypeDescriptor result = declaredTypeDescriptor;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, declaredTypeDescriptor);

    try {
      if (processorImpl.shouldProcessDeclaredTypeDescriptor(declaredTypeDescriptor)) {
        processorImpl.pushParent(declaredTypeDescriptor);
        visitMembers(processorImpl, declaredTypeDescriptor);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessDeclaredTypeDescriptor(declaredTypeDescriptor);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), declaredTypeDescriptor, e);
    }

    popContext(processor, declaredTypeDescriptor);
    return result;
  }

  static void pushContext(Processor processor, DeclaredTypeDescriptor declaredTypeDescriptor) {
    Visitor_TypeDescriptor.pushContext(processor, declaredTypeDescriptor);
  }

  static void popContext(Processor processor, DeclaredTypeDescriptor declaredTypeDescriptor) {
    Visitor_TypeDescriptor.popContext(processor, declaredTypeDescriptor);
  }

  static void visitMembers(Processor processor, DeclaredTypeDescriptor declaredTypeDescriptor) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeDescriptor.visitMembers(processorImpl, declaredTypeDescriptor);
  }
}
