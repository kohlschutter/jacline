package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_MethodCall {

  public static Node visit(Processor processor, MethodCall methodCall) {
    Node result = methodCall;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, methodCall);

    try {
      if (processorImpl.shouldProcessMethodCall(methodCall)) {
        processorImpl.pushParent(methodCall);
        visitMembers(processorImpl, methodCall);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMethodCall(methodCall);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), methodCall, e);
    }

    popContext(processor, methodCall);
    return result;
  }

  static void pushContext(Processor processor, MethodCall methodCall) {
    Visitor_Invocation.pushContext(processor, methodCall);
  }

  static void popContext(Processor processor, MethodCall methodCall) {
    Visitor_Invocation.popContext(processor, methodCall);
  }

  static void visitMembers(Processor processor, MethodCall methodCall) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Invocation.visitMembers(processorImpl, methodCall);
  }
}
