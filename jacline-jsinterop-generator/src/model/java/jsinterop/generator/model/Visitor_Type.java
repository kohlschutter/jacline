package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Type {

  public static Entity visit(Processor processor, Type type) {
    Entity result = type;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, type);

    try {
      if (processorImpl.shouldProcessType(type)) {
        processorImpl.pushParent(type);
        visitMembers(processorImpl, type);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessType(type);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), type, e);
    }

    popContext(processor, type);
    return result;
  }

  static void pushContext(Processor processor, Type type) {
    Visitor_Entity.pushContext(processor, type);
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    processorImpl.pushType(type);
  }

  static void popContext(Processor processor, Type type) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Preconditions.checkState(processorImpl.popType() == type);
    Visitor_Entity.popContext(processor, type);
  }

  static void visitMembers(Processor processor, Type type) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Entity.visitMembers(processorImpl, type);
      ListVisitor.visit(
          type.extendedTypes,
          n -> (TypeReference) n.acceptInternal(processorImpl));
      ListVisitor.visit(
          type.implementedTypes,
          n -> (TypeReference) n.acceptInternal(processorImpl));
      ListVisitor.visit(
          type.innerTypes,
          n -> (Type) n.acceptInternal(processorImpl));
      ListVisitor.visit(
          type.fields,
          n -> (Field) n.acceptInternal(processorImpl));
      ListVisitor.visit(
          type.constructors,
          n -> (Method) n.acceptInternal(processorImpl));
      ListVisitor.visit(
          type.methods,
          n -> (Method) n.acceptInternal(processorImpl));
  }
}
