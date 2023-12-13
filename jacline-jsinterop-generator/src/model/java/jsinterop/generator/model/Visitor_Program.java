package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Program {

  public static Program visit(Processor processor, Program program) {
    Program result = program;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, program);

    try {
      if (processorImpl.shouldProcessProgram(program)) {
        processorImpl.pushParent(program);
        visitMembers(processorImpl, program);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessProgram(program);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), program, e);
    }

    popContext(processor, program);
    return result;
  }

  static void pushContext(Processor processor, Program program) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    processorImpl.pushProgram(program);
  }

  static void popContext(Processor processor, Program program) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Preconditions.checkState(processorImpl.popProgram() == program);
  }

  static void visitMembers(Processor processor, Program program) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
      ListVisitor.visit(
          program.types,
          n -> (Type) n.acceptInternal(processorImpl));
  }
}
