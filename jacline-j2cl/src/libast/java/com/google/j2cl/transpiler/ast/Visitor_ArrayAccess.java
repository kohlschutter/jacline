package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ArrayAccess {

  public static Node visit(Processor processor, ArrayAccess arrayAccess) {
    Node result = arrayAccess;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, arrayAccess);

    try {
      if (processorImpl.shouldProcessArrayAccess(arrayAccess)) {
        processorImpl.pushParent(arrayAccess);
        visitMembers(processorImpl, arrayAccess);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessArrayAccess(arrayAccess);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), arrayAccess, e);
    }

    popContext(processor, arrayAccess);
    return result;
  }

  static void pushContext(Processor processor, ArrayAccess arrayAccess) {
    Visitor_Expression.pushContext(processor, arrayAccess);
  }

  static void popContext(Processor processor, ArrayAccess arrayAccess) {
    Visitor_Expression.popContext(processor, arrayAccess);
  }

  static void visitMembers(Processor processor, ArrayAccess arrayAccess) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, arrayAccess);
      arrayAccess.arrayExpression = (Expression) Preconditions.checkNotNull(
      arrayAccess.arrayExpression.acceptInternal(processorImpl),
          "Field \"arrayExpression\" in class \"ArrayAccess\" cannot be null");
      arrayAccess.indexExpression = (Expression) Preconditions.checkNotNull(
      arrayAccess.indexExpression.acceptInternal(processorImpl),
          "Field \"indexExpression\" in class \"ArrayAccess\" cannot be null");
  }
}
