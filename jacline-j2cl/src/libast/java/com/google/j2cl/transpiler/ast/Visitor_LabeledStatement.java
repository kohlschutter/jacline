package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_LabeledStatement {

  public static Node visit(Processor processor, LabeledStatement labeledStatement) {
    Node result = labeledStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, labeledStatement);

    try {
      if (processorImpl.shouldProcessLabeledStatement(labeledStatement)) {
        processorImpl.pushParent(labeledStatement);
        visitMembers(processorImpl, labeledStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessLabeledStatement(labeledStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), labeledStatement, e);
    }

    popContext(processor, labeledStatement);
    return result;
  }

  static void pushContext(Processor processor, LabeledStatement labeledStatement) {
    Visitor_Statement.pushContext(processor, labeledStatement);
  }

  static void popContext(Processor processor, LabeledStatement labeledStatement) {
    Visitor_Statement.popContext(processor, labeledStatement);
  }

  static void visitMembers(Processor processor, LabeledStatement labeledStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, labeledStatement);
      labeledStatement.label = (Label) Preconditions.checkNotNull(
      labeledStatement.label.acceptInternal(processorImpl),
          "Field \"label\" in class \"LabeledStatement\" cannot be null");
      labeledStatement.statement = (Statement) Preconditions.checkNotNull(
      labeledStatement.statement.acceptInternal(processorImpl),
          "Field \"statement\" in class \"LabeledStatement\" cannot be null");
  }
}
