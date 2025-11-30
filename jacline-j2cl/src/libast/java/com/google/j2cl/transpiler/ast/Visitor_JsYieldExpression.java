package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_JsYieldExpression {

  public static Node visit(Processor processor, JsYieldExpression jsYieldExpression) {
    Node result = jsYieldExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, jsYieldExpression);

    try {
      if (processorImpl.shouldProcessJsYieldExpression(jsYieldExpression)) {
        processorImpl.pushParent(jsYieldExpression);
        visitMembers(processorImpl, jsYieldExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessJsYieldExpression(jsYieldExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), jsYieldExpression, e);
    }

    popContext(processor, jsYieldExpression);
    return result;
  }

  static void pushContext(Processor processor, JsYieldExpression jsYieldExpression) {
    Visitor_Expression.pushContext(processor, jsYieldExpression);
  }

  static void popContext(Processor processor, JsYieldExpression jsYieldExpression) {
    Visitor_Expression.popContext(processor, jsYieldExpression);
  }

  static void visitMembers(Processor processor, JsYieldExpression jsYieldExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, jsYieldExpression);
    if (jsYieldExpression.expression != null) {
      jsYieldExpression.expression = (Expression) jsYieldExpression.expression.acceptInternal(processorImpl);
    }
      jsYieldExpression.typeDescriptor = (TypeDescriptor) Preconditions.checkNotNull(
      jsYieldExpression.typeDescriptor.acceptInternal(processorImpl),
          "Field \"typeDescriptor\" in class \"JsYieldExpression\" cannot be null");
  }
}
