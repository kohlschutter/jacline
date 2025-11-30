package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_JsAwaitExpression {

  public static Node visit(Processor processor, JsAwaitExpression jsAwaitExpression) {
    Node result = jsAwaitExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, jsAwaitExpression);

    try {
      if (processorImpl.shouldProcessJsAwaitExpression(jsAwaitExpression)) {
        processorImpl.pushParent(jsAwaitExpression);
        visitMembers(processorImpl, jsAwaitExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessJsAwaitExpression(jsAwaitExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), jsAwaitExpression, e);
    }

    popContext(processor, jsAwaitExpression);
    return result;
  }

  static void pushContext(Processor processor, JsAwaitExpression jsAwaitExpression) {
    Visitor_Expression.pushContext(processor, jsAwaitExpression);
  }

  static void popContext(Processor processor, JsAwaitExpression jsAwaitExpression) {
    Visitor_Expression.popContext(processor, jsAwaitExpression);
  }

  static void visitMembers(Processor processor, JsAwaitExpression jsAwaitExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, jsAwaitExpression);
      jsAwaitExpression.expression = (Expression) Preconditions.checkNotNull(
      jsAwaitExpression.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"JsAwaitExpression\" cannot be null");
      jsAwaitExpression.typeDescriptor = (TypeDescriptor) Preconditions.checkNotNull(
      jsAwaitExpression.typeDescriptor.acceptInternal(processorImpl),
          "Field \"typeDescriptor\" in class \"JsAwaitExpression\" cannot be null");
  }
}
