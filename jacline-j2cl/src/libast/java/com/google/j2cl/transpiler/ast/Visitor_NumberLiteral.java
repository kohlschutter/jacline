package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_NumberLiteral {

  public static Node visit(Processor processor, NumberLiteral numberLiteral) {
    Node result = numberLiteral;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, numberLiteral);

    try {
      if (processorImpl.shouldProcessNumberLiteral(numberLiteral)) {
        processorImpl.pushParent(numberLiteral);
        visitMembers(processorImpl, numberLiteral);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessNumberLiteral(numberLiteral);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), numberLiteral, e);
    }

    popContext(processor, numberLiteral);
    return result;
  }

  static void pushContext(Processor processor, NumberLiteral numberLiteral) {
    Visitor_Literal.pushContext(processor, numberLiteral);
  }

  static void popContext(Processor processor, NumberLiteral numberLiteral) {
    Visitor_Literal.popContext(processor, numberLiteral);
  }

  static void visitMembers(Processor processor, NumberLiteral numberLiteral) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Literal.visitMembers(processorImpl, numberLiteral);
  }
}
