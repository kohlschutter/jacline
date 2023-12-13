package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_UnionTypeReference {

  public static TypeReference visit(Processor processor, UnionTypeReference unionTypeReference) {
    TypeReference result = unionTypeReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, unionTypeReference);

    try {
      if (processorImpl.shouldProcessUnionTypeReference(unionTypeReference)) {
        processorImpl.pushParent(unionTypeReference);
        visitMembers(processorImpl, unionTypeReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessUnionTypeReference(unionTypeReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), unionTypeReference, e);
    }

    popContext(processor, unionTypeReference);
    return result;
  }

  static void pushContext(Processor processor, UnionTypeReference unionTypeReference) {
    Visitor_TypeReference.pushContext(processor, unionTypeReference);
  }

  static void popContext(Processor processor, UnionTypeReference unionTypeReference) {
    Visitor_TypeReference.popContext(processor, unionTypeReference);
  }

  static void visitMembers(Processor processor, UnionTypeReference unionTypeReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeReference.visitMembers(processorImpl, unionTypeReference);
      ListVisitor.visit(
          unionTypeReference.types,
          n -> (TypeReference) n.acceptInternal(processorImpl));
  }
}
