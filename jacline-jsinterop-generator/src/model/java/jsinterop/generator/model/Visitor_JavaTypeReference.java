package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_JavaTypeReference {

  public static TypeReference visit(Processor processor, JavaTypeReference javaTypeReference) {
    TypeReference result = javaTypeReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, javaTypeReference);

    try {
      if (processorImpl.shouldProcessJavaTypeReference(javaTypeReference)) {
        processorImpl.pushParent(javaTypeReference);
        visitMembers(processorImpl, javaTypeReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessJavaTypeReference(javaTypeReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), javaTypeReference, e);
    }

    popContext(processor, javaTypeReference);
    return result;
  }

  static void pushContext(Processor processor, JavaTypeReference javaTypeReference) {
    Visitor_AbstractTypeReference.pushContext(processor, javaTypeReference);
  }

  static void popContext(Processor processor, JavaTypeReference javaTypeReference) {
    Visitor_AbstractTypeReference.popContext(processor, javaTypeReference);
  }

  static void visitMembers(Processor processor, JavaTypeReference javaTypeReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_AbstractTypeReference.visitMembers(processorImpl, javaTypeReference);
  }
}
