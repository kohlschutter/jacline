package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Method {

  public static Entity visit(Processor processor, Method method) {
    Entity result = method;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, method);

    try {
      if (processorImpl.shouldProcessMethod(method)) {
        processorImpl.pushParent(method);
        visitMembers(processorImpl, method);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMethod(method);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), method, e);
    }

    popContext(processor, method);
    return result;
  }

  static void pushContext(Processor processor, Method method) {
    Visitor_Entity.pushContext(processor, method);
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    processorImpl.pushMethod(method);
  }

  static void popContext(Processor processor, Method method) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Preconditions.checkState(processorImpl.popMethod() == method);
    Visitor_Entity.popContext(processor, method);
  }

  static void visitMembers(Processor processor, Method method) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Entity.visitMembers(processorImpl, method);
    if (method.returnType != null) {
      method.returnType = (TypeReference) method.returnType.acceptInternal(processorImpl);
    }
      ListVisitor.visit(
          method.parameters,
          n -> (Parameter) n.acceptInternal(processorImpl));
    if (method.body != null) {
      method.body = (Statement) method.body.acceptInternal(processorImpl);
    }
  }
}
