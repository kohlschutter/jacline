package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_NullLiteral {

  public static Node visit(Processor processor, NullLiteral nullLiteral) {
    Node result = nullLiteral;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, nullLiteral);

    try {
      if (processorImpl.shouldProcessNullLiteral(nullLiteral)) {
        processorImpl.pushParent(nullLiteral);
        visitMembers(processorImpl, nullLiteral);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessNullLiteral(nullLiteral);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), nullLiteral, e);
    }

    popContext(processor, nullLiteral);
    return result;
  }

  static void pushContext(Processor processor, NullLiteral nullLiteral) {
    Visitor_Literal.pushContext(processor, nullLiteral);
  }

  static void popContext(Processor processor, NullLiteral nullLiteral) {
    Visitor_Literal.popContext(processor, nullLiteral);
  }

  static void visitMembers(Processor processor, NullLiteral nullLiteral) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Literal.visitMembers(processorImpl, nullLiteral);
  }
}
