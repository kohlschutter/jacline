package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_YieldStatement {

  public static Node visit(Processor processor, YieldStatement yieldStatement) {
    Node result = yieldStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, yieldStatement);

    try {
      if (processorImpl.shouldProcessYieldStatement(yieldStatement)) {
        processorImpl.pushParent(yieldStatement);
        visitMembers(processorImpl, yieldStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessYieldStatement(yieldStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), yieldStatement, e);
    }

    popContext(processor, yieldStatement);
    return result;
  }

  static void pushContext(Processor processor, YieldStatement yieldStatement) {
    Visitor_Statement.pushContext(processor, yieldStatement);
  }

  static void popContext(Processor processor, YieldStatement yieldStatement) {
    Visitor_Statement.popContext(processor, yieldStatement);
  }

  static void visitMembers(Processor processor, YieldStatement yieldStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, yieldStatement);
      yieldStatement.expression = (Expression) Preconditions.checkNotNull(
      yieldStatement.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"YieldStatement\" cannot be null");
    if (yieldStatement.labelReference != null) {
      yieldStatement.labelReference = (LabelReference) yieldStatement.labelReference.acceptInternal(processorImpl);
    }
  }
}
