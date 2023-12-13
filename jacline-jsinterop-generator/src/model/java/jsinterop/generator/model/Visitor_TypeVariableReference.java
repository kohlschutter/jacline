package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_TypeVariableReference {

  public static TypeReference visit(Processor processor, TypeVariableReference typeVariableReference) {
    TypeReference result = typeVariableReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, typeVariableReference);

    try {
      if (processorImpl.shouldProcessTypeVariableReference(typeVariableReference)) {
        processorImpl.pushParent(typeVariableReference);
        visitMembers(processorImpl, typeVariableReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessTypeVariableReference(typeVariableReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), typeVariableReference, e);
    }

    popContext(processor, typeVariableReference);
    return result;
  }

  static void pushContext(Processor processor, TypeVariableReference typeVariableReference) {
    Visitor_AbstractTypeReference.pushContext(processor, typeVariableReference);
  }

  static void popContext(Processor processor, TypeVariableReference typeVariableReference) {
    Visitor_AbstractTypeReference.popContext(processor, typeVariableReference);
  }

  static void visitMembers(Processor processor, TypeVariableReference typeVariableReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_AbstractTypeReference.visitMembers(processorImpl, typeVariableReference);
      typeVariableReference.upperBound = (TypeReference) Preconditions.checkNotNull(
      typeVariableReference.upperBound.acceptInternal(processorImpl),
          "Field \"upperBound\" in class \"TypeVariableReference\" cannot be null");
  }
}
