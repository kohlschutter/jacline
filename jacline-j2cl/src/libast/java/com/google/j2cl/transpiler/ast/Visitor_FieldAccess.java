package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_FieldAccess {

  public static Node visit(Processor processor, FieldAccess fieldAccess) {
    Node result = fieldAccess;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, fieldAccess);

    try {
      if (processorImpl.shouldProcessFieldAccess(fieldAccess)) {
        processorImpl.pushParent(fieldAccess);
        visitMembers(processorImpl, fieldAccess);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessFieldAccess(fieldAccess);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), fieldAccess, e);
    }

    popContext(processor, fieldAccess);
    return result;
  }

  static void pushContext(Processor processor, FieldAccess fieldAccess) {
    Visitor_MemberReference.pushContext(processor, fieldAccess);
  }

  static void popContext(Processor processor, FieldAccess fieldAccess) {
    Visitor_MemberReference.popContext(processor, fieldAccess);
  }

  static void visitMembers(Processor processor, FieldAccess fieldAccess) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_MemberReference.visitMembers(processorImpl, fieldAccess);
  }
}
