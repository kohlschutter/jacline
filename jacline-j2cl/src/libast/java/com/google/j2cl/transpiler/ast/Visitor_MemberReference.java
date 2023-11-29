package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_MemberReference {

  public static Node visit(Processor processor, MemberReference memberReference) {
    Node result = memberReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, memberReference);

    try {
      if (processorImpl.shouldProcessMemberReference(memberReference)) {
        processorImpl.pushParent(memberReference);
        visitMembers(processorImpl, memberReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMemberReference(memberReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), memberReference, e);
    }

    popContext(processor, memberReference);
    return result;
  }

  static void pushContext(Processor processor, MemberReference memberReference) {
    Visitor_Expression.pushContext(processor, memberReference);
  }

  static void popContext(Processor processor, MemberReference memberReference) {
    Visitor_Expression.popContext(processor, memberReference);
  }

  static void visitMembers(Processor processor, MemberReference memberReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, memberReference);
    if (memberReference.qualifier != null) {
      memberReference.qualifier = (Expression) memberReference.qualifier.acceptInternal(processorImpl);
    }
  }
}
