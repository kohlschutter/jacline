package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ArrayLiteral {

  public static Node visit(Processor processor, ArrayLiteral arrayLiteral) {
    Node result = arrayLiteral;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, arrayLiteral);

    try {
      if (processorImpl.shouldProcessArrayLiteral(arrayLiteral)) {
        processorImpl.pushParent(arrayLiteral);
        visitMembers(processorImpl, arrayLiteral);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessArrayLiteral(arrayLiteral);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), arrayLiteral, e);
    }

    popContext(processor, arrayLiteral);
    return result;
  }

  static void pushContext(Processor processor, ArrayLiteral arrayLiteral) {
    Visitor_Expression.pushContext(processor, arrayLiteral);
  }

  static void popContext(Processor processor, ArrayLiteral arrayLiteral) {
    Visitor_Expression.popContext(processor, arrayLiteral);
  }

  static void visitMembers(Processor processor, ArrayLiteral arrayLiteral) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, arrayLiteral);
      ListVisitor.visit(
          arrayLiteral.valueExpressions,
          n -> (Expression) n.acceptInternal(processorImpl));
  }
}
