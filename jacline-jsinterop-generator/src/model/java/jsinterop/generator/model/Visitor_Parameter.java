package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Parameter {

  public static Parameter visit(Processor processor, Parameter parameter) {
    Parameter result = parameter;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, parameter);

    try {
      if (processorImpl.shouldProcessParameter(parameter)) {
        processorImpl.pushParent(parameter);
        visitMembers(processorImpl, parameter);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessParameter(parameter);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), parameter, e);
    }

    popContext(processor, parameter);
    return result;
  }

  static void pushContext(Processor processor, Parameter parameter) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    processorImpl.pushParameter(parameter);
  }

  static void popContext(Processor processor, Parameter parameter) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Preconditions.checkState(processorImpl.popParameter() == parameter);
  }

  static void visitMembers(Processor processor, Parameter parameter) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
      parameter.type = (TypeReference) Preconditions.checkNotNull(
      parameter.type.acceptInternal(processorImpl),
          "Field \"type\" in class \"Parameter\" cannot be null");
  }
}
