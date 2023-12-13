package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Field {

  public static Entity visit(Processor processor, Field field) {
    Entity result = field;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, field);

    try {
      if (processorImpl.shouldProcessField(field)) {
        processorImpl.pushParent(field);
        visitMembers(processorImpl, field);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessField(field);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), field, e);
    }

    popContext(processor, field);
    return result;
  }

  static void pushContext(Processor processor, Field field) {
    Visitor_Entity.pushContext(processor, field);
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    processorImpl.pushField(field);
  }

  static void popContext(Processor processor, Field field) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Preconditions.checkState(processorImpl.popField() == field);
    Visitor_Entity.popContext(processor, field);
  }

  static void visitMembers(Processor processor, Field field) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Entity.visitMembers(processorImpl, field);
      field.type = (TypeReference) Preconditions.checkNotNull(
      field.type.acceptInternal(processorImpl),
          "Field \"type\" in class \"Field\" cannot be null");
  }
}
