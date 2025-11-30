package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_JsConstructorReference {

  public static Node visit(Processor processor, JsConstructorReference jsConstructorReference) {
    Node result = jsConstructorReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, jsConstructorReference);

    try {
      if (processorImpl.shouldProcessJsConstructorReference(jsConstructorReference)) {
        processorImpl.pushParent(jsConstructorReference);
        visitMembers(processorImpl, jsConstructorReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessJsConstructorReference(jsConstructorReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), jsConstructorReference, e);
    }

    popContext(processor, jsConstructorReference);
    return result;
  }

  static void pushContext(Processor processor, JsConstructorReference jsConstructorReference) {
    Visitor_Expression.pushContext(processor, jsConstructorReference);
  }

  static void popContext(Processor processor, JsConstructorReference jsConstructorReference) {
    Visitor_Expression.popContext(processor, jsConstructorReference);
  }

  static void visitMembers(Processor processor, JsConstructorReference jsConstructorReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, jsConstructorReference);
  }
}
