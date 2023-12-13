package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_PredefinedTypeReference {

  public static TypeReference visit(Processor processor, PredefinedTypeReference predefinedTypeReference) {
    TypeReference result = predefinedTypeReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, predefinedTypeReference);

    try {
      if (processorImpl.shouldProcessPredefinedTypeReference(predefinedTypeReference)) {
        processorImpl.pushParent(predefinedTypeReference);
        visitMembers(processorImpl, predefinedTypeReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessPredefinedTypeReference(predefinedTypeReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), predefinedTypeReference, e);
    }

    popContext(processor, predefinedTypeReference);
    return result;
  }

  static void pushContext(Processor processor, PredefinedTypeReference predefinedTypeReference) {
    Visitor_TypeReference.pushContext(processor, predefinedTypeReference);
  }

  static void popContext(Processor processor, PredefinedTypeReference predefinedTypeReference) {
    Visitor_TypeReference.popContext(processor, predefinedTypeReference);
  }

  static void visitMembers(Processor processor, PredefinedTypeReference predefinedTypeReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_TypeReference.visitMembers(processorImpl, predefinedTypeReference);
  }
}
