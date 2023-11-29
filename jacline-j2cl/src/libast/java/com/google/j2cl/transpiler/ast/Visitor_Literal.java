package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Literal {

  public static Node visit(Processor processor, Literal literal) {
    Node result = literal;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, literal);

    try {
      if (processorImpl.shouldProcessLiteral(literal)) {
        processorImpl.pushParent(literal);
        visitMembers(processorImpl, literal);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessLiteral(literal);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), literal, e);
    }

    popContext(processor, literal);
    return result;
  }

  static void pushContext(Processor processor, Literal literal) {
    Visitor_Expression.pushContext(processor, literal);
  }

  static void popContext(Processor processor, Literal literal) {
    Visitor_Expression.popContext(processor, literal);
  }

  static void visitMembers(Processor processor, Literal literal) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, literal);
  }
}
