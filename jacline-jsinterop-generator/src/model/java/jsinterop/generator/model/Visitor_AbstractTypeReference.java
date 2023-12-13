package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_AbstractTypeReference {

  public static TypeReference visit(Processor processor, AbstractTypeReference abstractTypeReference) {
    TypeReference result = abstractTypeReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, abstractTypeReference);

    try {
      if (processorImpl.shouldProcessAbstractTypeReference(abstractTypeReference)) {
        processorImpl.pushParent(abstractTypeReference);
        visitMembers(processorImpl, abstractTypeReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessAbstractTypeReference(abstractTypeReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), abstractTypeReference, e);
    }

    popContext(processor, abstractTypeReference);
    return result;
  }

  static void pushContext(Processor processor, AbstractTypeReference abstractTypeReference) {
    Visitor_TypeReference.pushContext(processor, abstractTypeReference);
  }

  static void popContext(Processor processor, AbstractTypeReference abstractTypeReference) {
    Visitor_TypeReference.popContext(processor, abstractTypeReference);
  }

  static void visitMembers(Processor processor, AbstractTypeReference abstractTypeReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeReference.visitMembers(processorImpl, abstractTypeReference);
  }
}
