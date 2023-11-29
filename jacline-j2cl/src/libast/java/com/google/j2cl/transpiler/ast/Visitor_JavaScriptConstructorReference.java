package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_JavaScriptConstructorReference {

  public static Node visit(Processor processor, JavaScriptConstructorReference javaScriptConstructorReference) {
    Node result = javaScriptConstructorReference;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, javaScriptConstructorReference);

    try {
      if (processorImpl.shouldProcessJavaScriptConstructorReference(javaScriptConstructorReference)) {
        processorImpl.pushParent(javaScriptConstructorReference);
        visitMembers(processorImpl, javaScriptConstructorReference);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessJavaScriptConstructorReference(javaScriptConstructorReference);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), javaScriptConstructorReference, e);
    }

    popContext(processor, javaScriptConstructorReference);
    return result;
  }

  static void pushContext(Processor processor, JavaScriptConstructorReference javaScriptConstructorReference) {
    Visitor_Expression.pushContext(processor, javaScriptConstructorReference);
  }

  static void popContext(Processor processor, JavaScriptConstructorReference javaScriptConstructorReference) {
    Visitor_Expression.popContext(processor, javaScriptConstructorReference);
  }

  static void visitMembers(Processor processor, JavaScriptConstructorReference javaScriptConstructorReference) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, javaScriptConstructorReference);
  }
}
