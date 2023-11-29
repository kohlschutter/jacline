package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Method {

  public static Node visit(Processor processor, Method method) {
    Node result = method;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, method);

    try {
      if (processorImpl.shouldProcessMethod(method)) {
        processorImpl.pushParent(method);
        visitMembers(processorImpl, method);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMethod(method);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), method, e);
    }

    popContext(processor, method);
    return result;
  }

  static void pushContext(Processor processor, Method method) {
    Visitor_Member.pushContext(processor, method);
  }

  static void popContext(Processor processor, Method method) {
    Visitor_Member.popContext(processor, method);
  }

  static void visitMembers(Processor processor, Method method) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Member.visitMembers(processorImpl, method);
      ListVisitor.visit(
          method.parameters,
          n -> (Variable) n.acceptInternal(processorImpl));
      method.body = (Block) Preconditions.checkNotNull(
      method.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"Method\" cannot be null");
  }
}
