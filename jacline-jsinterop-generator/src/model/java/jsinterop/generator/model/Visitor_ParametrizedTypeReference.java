package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ParametrizedTypeReference {

  public static TypeReference visit(Processor processor, ParametrizedTypeReference parametrizedTypeReference) {
    TypeReference result = parametrizedTypeReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, parametrizedTypeReference);

    try {
      if (processorImpl.shouldProcessParametrizedTypeReference(parametrizedTypeReference)) {
        processorImpl.pushParent(parametrizedTypeReference);
        visitMembers(processorImpl, parametrizedTypeReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessParametrizedTypeReference(parametrizedTypeReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), parametrizedTypeReference, e);
    }

    popContext(processor, parametrizedTypeReference);
    return result;
  }

  static void pushContext(Processor processor, ParametrizedTypeReference parametrizedTypeReference) {
    Visitor_AbstractTypeReference.pushContext(processor, parametrizedTypeReference);
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    processorImpl.pushParametrizedTypeReference(parametrizedTypeReference);
  }

  static void popContext(Processor processor, ParametrizedTypeReference parametrizedTypeReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Preconditions.checkState(processorImpl.popParametrizedTypeReference() == parametrizedTypeReference);
    Visitor_AbstractTypeReference.popContext(processor, parametrizedTypeReference);
  }

  static void visitMembers(Processor processor, ParametrizedTypeReference parametrizedTypeReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_AbstractTypeReference.visitMembers(processorImpl, parametrizedTypeReference);
      parametrizedTypeReference.mainType = (TypeReference) Preconditions.checkNotNull(
      parametrizedTypeReference.mainType.acceptInternal(processorImpl),
          "Field \"mainType\" in class \"ParametrizedTypeReference\" cannot be null");
      ListVisitor.visit(
          parametrizedTypeReference.actualTypeArguments,
          n -> (TypeReference) n.acceptInternal(processorImpl));
  }
}
