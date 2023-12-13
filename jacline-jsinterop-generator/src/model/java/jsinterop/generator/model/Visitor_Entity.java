package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Entity {

  public static Entity visit(Processor processor, Entity entity) {
    Entity result = entity;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, entity);

    try {
      if (processorImpl.shouldProcessEntity(entity)) {
        processorImpl.pushParent(entity);
        visitMembers(processorImpl, entity);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessEntity(entity);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), entity, e);
    }

    popContext(processor, entity);
    return result;
  }

  static void pushContext(Processor processor, Entity entity) {
  }

  static void popContext(Processor processor, Entity entity) {
  }

  static void visitMembers(Processor processor, Entity entity) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
  }
}
