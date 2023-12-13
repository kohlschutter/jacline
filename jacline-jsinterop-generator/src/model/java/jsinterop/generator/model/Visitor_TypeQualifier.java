package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_TypeQualifier {

  public static Expression visit(Processor processor, TypeQualifier typeQualifier) {
    Expression result = typeQualifier;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, typeQualifier);

    try {
      if (processorImpl.shouldProcessTypeQualifier(typeQualifier)) {
        processorImpl.pushParent(typeQualifier);
        visitMembers(processorImpl, typeQualifier);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessTypeQualifier(typeQualifier);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), typeQualifier, e);
    }

    popContext(processor, typeQualifier);
    return result;
  }

  static void pushContext(Processor processor, TypeQualifier typeQualifier) {
    Visitor_Expression.pushContext(processor, typeQualifier);
  }

  static void popContext(Processor processor, TypeQualifier typeQualifier) {
    Visitor_Expression.popContext(processor, typeQualifier);
  }

  static void visitMembers(Processor processor, TypeQualifier typeQualifier) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, typeQualifier);
      typeQualifier.type = (TypeReference) Preconditions.checkNotNull(
      typeQualifier.type.acceptInternal(processorImpl),
          "Field \"type\" in class \"TypeQualifier\" cannot be null");
  }
}
