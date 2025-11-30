package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Pattern {

  public static Node visit(Processor processor, Pattern pattern) {
    Node result = pattern;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, pattern);

    try {
      if (processorImpl.shouldProcessPattern(pattern)) {
        processorImpl.pushParent(pattern);
        visitMembers(processorImpl, pattern);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessPattern(pattern);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), pattern, e);
    }

    popContext(processor, pattern);
    return result;
  }

  static void pushContext(Processor processor, Pattern pattern) {
    Visitor_Node.pushContext(processor, pattern);
  }

  static void popContext(Processor processor, Pattern pattern) {
    Visitor_Node.popContext(processor, pattern);
  }

  static void visitMembers(Processor processor, Pattern pattern) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, pattern);
  }
}
