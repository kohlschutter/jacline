package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_CompilationUnit {

  public static Node visit(Processor processor, CompilationUnit compilationUnit) {
    Node result = compilationUnit;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, compilationUnit);

    try {
      if (processorImpl.shouldProcessCompilationUnit(compilationUnit)) {
        processorImpl.pushParent(compilationUnit);
        visitMembers(processorImpl, compilationUnit);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessCompilationUnit(compilationUnit);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), compilationUnit, e);
    }

    popContext(processor, compilationUnit);
    return result;
  }

  static void pushContext(Processor processor, CompilationUnit compilationUnit) {
    Visitor_Node.pushContext(processor, compilationUnit);
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    processorImpl.pushCompilationUnit(compilationUnit);
  }

  static void popContext(Processor processor, CompilationUnit compilationUnit) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Preconditions.checkState(processorImpl.popCompilationUnit() == compilationUnit);
    Visitor_Node.popContext(processor, compilationUnit);
  }

  static void visitMembers(Processor processor, CompilationUnit compilationUnit) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, compilationUnit);
      ListVisitor.visit(
          compilationUnit.types,
          n -> (Type) n.acceptInternal(processorImpl));
  }
}
