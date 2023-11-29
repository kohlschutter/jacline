package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Library {

  public static Node visit(Processor processor, Library library) {
    Node result = library;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, library);

    try {
      if (processorImpl.shouldProcessLibrary(library)) {
        processorImpl.pushParent(library);
        visitMembers(processorImpl, library);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessLibrary(library);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), library, e);
    }

    popContext(processor, library);
    return result;
  }

  static void pushContext(Processor processor, Library library) {
    Visitor_Node.pushContext(processor, library);
  }

  static void popContext(Processor processor, Library library) {
    Visitor_Node.popContext(processor, library);
  }

  static void visitMembers(Processor processor, Library library) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, library);
      ListVisitor.visit(
          library.compilationUnits,
          n -> (CompilationUnit) n.acceptInternal(processorImpl));
  }
}
