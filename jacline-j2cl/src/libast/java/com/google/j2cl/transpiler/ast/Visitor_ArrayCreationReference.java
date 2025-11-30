package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ArrayCreationReference {

  public static Node visit(Processor processor, ArrayCreationReference arrayCreationReference) {
    Node result = arrayCreationReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, arrayCreationReference);

    try {
      if (processorImpl.shouldProcessArrayCreationReference(arrayCreationReference)) {
        processorImpl.pushParent(arrayCreationReference);
        visitMembers(processorImpl, arrayCreationReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessArrayCreationReference(arrayCreationReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), arrayCreationReference, e);
    }

    popContext(processor, arrayCreationReference);
    return result;
  }

  static void pushContext(Processor processor, ArrayCreationReference arrayCreationReference) {
    Visitor_Expression.pushContext(processor, arrayCreationReference);
  }

  static void popContext(Processor processor, ArrayCreationReference arrayCreationReference) {
    Visitor_Expression.popContext(processor, arrayCreationReference);
  }

  static void visitMembers(Processor processor, ArrayCreationReference arrayCreationReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, arrayCreationReference);
      arrayCreationReference.targetTypeDescriptor = (ArrayTypeDescriptor) Preconditions.checkNotNull(
      arrayCreationReference.targetTypeDescriptor.acceptInternal(processorImpl),
          "Field \"targetTypeDescriptor\" in class \"ArrayCreationReference\" cannot be null");
      arrayCreationReference.interfaceMethodDescriptor = (MethodDescriptor) Preconditions.checkNotNull(
      arrayCreationReference.interfaceMethodDescriptor.acceptInternal(processorImpl),
          "Field \"interfaceMethodDescriptor\" in class \"ArrayCreationReference\" cannot be null");
  }
}
