package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ArrayLength {

  public static Node visit(Processor processor, ArrayLength arrayLength) {
    Node result = arrayLength;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, arrayLength);

    try {
      if (processorImpl.shouldProcessArrayLength(arrayLength)) {
        processorImpl.pushParent(arrayLength);
        visitMembers(processorImpl, arrayLength);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessArrayLength(arrayLength);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), arrayLength, e);
    }

    popContext(processor, arrayLength);
    return result;
  }

  static void pushContext(Processor processor, ArrayLength arrayLength) {
    Visitor_Expression.pushContext(processor, arrayLength);
  }

  static void popContext(Processor processor, ArrayLength arrayLength) {
    Visitor_Expression.popContext(processor, arrayLength);
  }

  static void visitMembers(Processor processor, ArrayLength arrayLength) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, arrayLength);
      arrayLength.arrayExpression = (Expression) Preconditions.checkNotNull(
      arrayLength.arrayExpression.acceptInternal(processorImpl),
          "Field \"arrayExpression\" in class \"ArrayLength\" cannot be null");
  }
}
