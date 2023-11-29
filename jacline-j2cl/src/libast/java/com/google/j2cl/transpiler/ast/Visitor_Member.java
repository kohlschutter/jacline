package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Member {

  public static Node visit(Processor processor, Member member) {
    Node result = member;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, member);

    try {
      if (processorImpl.shouldProcessMember(member)) {
        processorImpl.pushParent(member);
        visitMembers(processorImpl, member);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMember(member);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), member, e);
    }

    popContext(processor, member);
    return result;
  }

  static void pushContext(Processor processor, Member member) {
    Visitor_Node.pushContext(processor, member);
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    processorImpl.pushMember(member);
  }

  static void popContext(Processor processor, Member member) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Preconditions.checkState(processorImpl.popMember() == member);
    Visitor_Node.popContext(processor, member);
  }

  static void visitMembers(Processor processor, Member member) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Node.visitMembers(processorImpl, member);
  }
}
