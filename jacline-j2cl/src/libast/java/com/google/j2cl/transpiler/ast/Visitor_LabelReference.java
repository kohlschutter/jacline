package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_LabelReference {

  public static Node visit(Processor processor, LabelReference labelReference) {
    Node result = labelReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, labelReference);

    try {
      if (processorImpl.shouldProcessLabelReference(labelReference)) {
        processorImpl.pushParent(labelReference);
        visitMembers(processorImpl, labelReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessLabelReference(labelReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), labelReference, e);
    }

    popContext(processor, labelReference);
    return result;
  }

  static void pushContext(Processor processor, LabelReference labelReference) {
    Visitor_Node.pushContext(processor, labelReference);
  }

  static void popContext(Processor processor, LabelReference labelReference) {
    Visitor_Node.popContext(processor, labelReference);
  }

  static void visitMembers(Processor processor, LabelReference labelReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, labelReference);
  }
}
