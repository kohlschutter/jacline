package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_StringLiteral {

  public static Node visit(Processor processor, StringLiteral stringLiteral) {
    Node result = stringLiteral;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, stringLiteral);

    try {
      if (processorImpl.shouldProcessStringLiteral(stringLiteral)) {
        processorImpl.pushParent(stringLiteral);
        visitMembers(processorImpl, stringLiteral);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessStringLiteral(stringLiteral);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), stringLiteral, e);
    }

    popContext(processor, stringLiteral);
    return result;
  }

  static void pushContext(Processor processor, StringLiteral stringLiteral) {
    Visitor_Literal.pushContext(processor, stringLiteral);
  }

  static void popContext(Processor processor, StringLiteral stringLiteral) {
    Visitor_Literal.popContext(processor, stringLiteral);
  }

  static void visitMembers(Processor processor, StringLiteral stringLiteral) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Literal.visitMembers(processorImpl, stringLiteral);
  }
}
