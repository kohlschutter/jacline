package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_NewArray {

  public static Node visit(Processor processor, NewArray newArray) {
    Node result = newArray;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, newArray);

    try {
      if (processorImpl.shouldProcessNewArray(newArray)) {
        processorImpl.pushParent(newArray);
        visitMembers(processorImpl, newArray);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessNewArray(newArray);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), newArray, e);
    }

    popContext(processor, newArray);
    return result;
  }

  static void pushContext(Processor processor, NewArray newArray) {
    Visitor_Expression.pushContext(processor, newArray);
  }

  static void popContext(Processor processor, NewArray newArray) {
    Visitor_Expression.popContext(processor, newArray);
  }

  static void visitMembers(Processor processor, NewArray newArray) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, newArray);
      ListVisitor.visit(
          newArray.dimensionExpressions,
          n -> (Expression) n.acceptInternal(processorImpl));
    if (newArray.initializer != null) {
      newArray.initializer = (Expression) newArray.initializer.acceptInternal(processorImpl);
    }
  }
}
