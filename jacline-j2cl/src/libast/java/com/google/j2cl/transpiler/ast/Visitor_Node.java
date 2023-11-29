package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Node {

  public static Node visit(Processor processor, Node node) {
    Node result = node;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, node);

    try {
      if (processorImpl.shouldProcessNode(node)) {
        processorImpl.pushParent(node);
        visitMembers(processorImpl, node);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessNode(node);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), node, e);
    }

    popContext(processor, node);
    return result;
  }

  static void pushContext(Processor processor, Node node) {
  }

  static void popContext(Processor processor, Node node) {
  }

  static void visitMembers(Processor processor, Node node) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
  }
}
