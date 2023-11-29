package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Statement {

  public static Node visit(Processor processor, Statement statement) {
    Node result = statement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, statement);

    try {
      if (processorImpl.shouldProcessStatement(statement)) {
        processorImpl.pushParent(statement);
        visitMembers(processorImpl, statement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessStatement(statement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), statement, e);
    }

    popContext(processor, statement);
    return result;
  }

  static void pushContext(Processor processor, Statement statement) {
    Visitor_Node.pushContext(processor, statement);
  }

  static void popContext(Processor processor, Statement statement) {
    Visitor_Node.popContext(processor, statement);
  }

  static void visitMembers(Processor processor, Statement statement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, statement);
  }
}
