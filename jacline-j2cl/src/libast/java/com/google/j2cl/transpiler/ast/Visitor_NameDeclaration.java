package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_NameDeclaration {

  public static Node visit(Processor processor, NameDeclaration nameDeclaration) {
    Node result = nameDeclaration;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, nameDeclaration);

    try {
      if (processorImpl.shouldProcessNameDeclaration(nameDeclaration)) {
        processorImpl.pushParent(nameDeclaration);
        visitMembers(processorImpl, nameDeclaration);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessNameDeclaration(nameDeclaration);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), nameDeclaration, e);
    }

    popContext(processor, nameDeclaration);
    return result;
  }

  static void pushContext(Processor processor, NameDeclaration nameDeclaration) {
    Visitor_Node.pushContext(processor, nameDeclaration);
  }

  static void popContext(Processor processor, NameDeclaration nameDeclaration) {
    Visitor_Node.popContext(processor, nameDeclaration);
  }

  static void visitMembers(Processor processor, NameDeclaration nameDeclaration) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, nameDeclaration);
  }
}
