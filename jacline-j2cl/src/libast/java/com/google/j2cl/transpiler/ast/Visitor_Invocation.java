package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Invocation {

  public static Node visit(Processor processor, Invocation invocation) {
    Node result = invocation;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, invocation);

    try {
      if (processorImpl.shouldProcessInvocation(invocation)) {
        processorImpl.pushParent(invocation);
        visitMembers(processorImpl, invocation);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessInvocation(invocation);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), invocation, e);
    }

    popContext(processor, invocation);
    return result;
  }

  static void pushContext(Processor processor, Invocation invocation) {
    Visitor_MemberReference.pushContext(processor, invocation);
  }

  static void popContext(Processor processor, Invocation invocation) {
    Visitor_MemberReference.popContext(processor, invocation);
  }

  static void visitMembers(Processor processor, Invocation invocation) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_MemberReference.visitMembers(processorImpl, invocation);
      ListVisitor.visit(
          invocation.arguments,
          n -> (Expression) n.acceptInternal(processorImpl));
  }
}
