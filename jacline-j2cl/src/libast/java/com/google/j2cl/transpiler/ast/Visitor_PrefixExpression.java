package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_PrefixExpression {

  public static Node visit(Processor processor, PrefixExpression prefixExpression) {
    Node result = prefixExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, prefixExpression);

    try {
      if (processorImpl.shouldProcessPrefixExpression(prefixExpression)) {
        processorImpl.pushParent(prefixExpression);
        visitMembers(processorImpl, prefixExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessPrefixExpression(prefixExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), prefixExpression, e);
    }

    popContext(processor, prefixExpression);
    return result;
  }

  static void pushContext(Processor processor, PrefixExpression prefixExpression) {
    Visitor_UnaryExpression.pushContext(processor, prefixExpression);
  }

  static void popContext(Processor processor, PrefixExpression prefixExpression) {
    Visitor_UnaryExpression.popContext(processor, prefixExpression);
  }

  static void visitMembers(Processor processor, PrefixExpression prefixExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_UnaryExpression.visitMembers(processorImpl, prefixExpression);
  }
}
