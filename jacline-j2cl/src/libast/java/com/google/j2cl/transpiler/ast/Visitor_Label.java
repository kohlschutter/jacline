package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Label {

  public static Node visit(Processor processor, Label label) {
    Node result = label;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, label);

    try {
      if (processorImpl.shouldProcessLabel(label)) {
        processorImpl.pushParent(label);
        visitMembers(processorImpl, label);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessLabel(label);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), label, e);
    }

    popContext(processor, label);
    return result;
  }

  static void pushContext(Processor processor, Label label) {
    Visitor_NameDeclaration.pushContext(processor, label);
  }

  static void popContext(Processor processor, Label label) {
    Visitor_NameDeclaration.popContext(processor, label);
  }

  static void visitMembers(Processor processor, Label label) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_NameDeclaration.visitMembers(processorImpl, label);
  }
}
