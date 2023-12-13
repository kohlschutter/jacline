package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_WildcardTypeReference {

  public static TypeReference visit(Processor processor, WildcardTypeReference wildcardTypeReference) {
    TypeReference result = wildcardTypeReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, wildcardTypeReference);

    try {
      if (processorImpl.shouldProcessWildcardTypeReference(wildcardTypeReference)) {
        processorImpl.pushParent(wildcardTypeReference);
        visitMembers(processorImpl, wildcardTypeReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessWildcardTypeReference(wildcardTypeReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), wildcardTypeReference, e);
    }

    popContext(processor, wildcardTypeReference);
    return result;
  }

  static void pushContext(Processor processor, WildcardTypeReference wildcardTypeReference) {
    Visitor_TypeReference.pushContext(processor, wildcardTypeReference);
  }

  static void popContext(Processor processor, WildcardTypeReference wildcardTypeReference) {
    Visitor_TypeReference.popContext(processor, wildcardTypeReference);
  }

  static void visitMembers(Processor processor, WildcardTypeReference wildcardTypeReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeReference.visitMembers(processorImpl, wildcardTypeReference);
  }
}
