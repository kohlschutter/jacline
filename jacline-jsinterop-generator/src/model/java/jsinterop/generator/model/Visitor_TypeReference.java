package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_TypeReference {

  public static TypeReference visit(Processor processor, TypeReference typeReference) {
    TypeReference result = typeReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, typeReference);

    try {
      if (processorImpl.shouldProcessTypeReference(typeReference)) {
        processorImpl.pushParent(typeReference);
        visitMembers(processorImpl, typeReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessTypeReference(typeReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), typeReference, e);
    }

    popContext(processor, typeReference);
    return result;
  }

  static void pushContext(Processor processor, TypeReference typeReference) {
  }

  static void popContext(Processor processor, TypeReference typeReference) {
  }

  static void visitMembers(Processor processor, TypeReference typeReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
  }
}
