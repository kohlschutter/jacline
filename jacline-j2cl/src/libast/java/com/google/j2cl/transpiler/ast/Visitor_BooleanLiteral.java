package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_BooleanLiteral {

  public static Node visit(Processor processor, BooleanLiteral booleanLiteral) {
    Node result = booleanLiteral;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, booleanLiteral);

    try {
      if (processorImpl.shouldProcessBooleanLiteral(booleanLiteral)) {
        processorImpl.pushParent(booleanLiteral);
        visitMembers(processorImpl, booleanLiteral);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessBooleanLiteral(booleanLiteral);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), booleanLiteral, e);
    }

    popContext(processor, booleanLiteral);
    return result;
  }

  static void pushContext(Processor processor, BooleanLiteral booleanLiteral) {
    Visitor_Literal.pushContext(processor, booleanLiteral);
  }

  static void popContext(Processor processor, BooleanLiteral booleanLiteral) {
    Visitor_Literal.popContext(processor, booleanLiteral);
  }

  static void visitMembers(Processor processor, BooleanLiteral booleanLiteral) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Literal.visitMembers(processorImpl, booleanLiteral);
  }
}
