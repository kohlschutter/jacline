package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ArrayTypeReference {

  public static TypeReference visit(Processor processor, ArrayTypeReference arrayTypeReference) {
    TypeReference result = arrayTypeReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, arrayTypeReference);

    try {
      if (processorImpl.shouldProcessArrayTypeReference(arrayTypeReference)) {
        processorImpl.pushParent(arrayTypeReference);
        visitMembers(processorImpl, arrayTypeReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessArrayTypeReference(arrayTypeReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), arrayTypeReference, e);
    }

    popContext(processor, arrayTypeReference);
    return result;
  }

  static void pushContext(Processor processor, ArrayTypeReference arrayTypeReference) {
    Visitor_TypeReference.pushContext(processor, arrayTypeReference);
  }

  static void popContext(Processor processor, ArrayTypeReference arrayTypeReference) {
    Visitor_TypeReference.popContext(processor, arrayTypeReference);
  }

  static void visitMembers(Processor processor, ArrayTypeReference arrayTypeReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeReference.visitMembers(processorImpl, arrayTypeReference);
      arrayTypeReference.arrayType = (TypeReference) Preconditions.checkNotNull(
      arrayTypeReference.arrayType.acceptInternal(processorImpl),
          "Field \"arrayType\" in class \"ArrayTypeReference\" cannot be null");
  }
}
