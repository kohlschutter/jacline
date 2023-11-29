package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_JsDocCastExpression {

  public static Node visit(Processor processor, JsDocCastExpression jsDocCastExpression) {
    Node result = jsDocCastExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, jsDocCastExpression);

    try {
      if (processorImpl.shouldProcessJsDocCastExpression(jsDocCastExpression)) {
        processorImpl.pushParent(jsDocCastExpression);
        visitMembers(processorImpl, jsDocCastExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessJsDocCastExpression(jsDocCastExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), jsDocCastExpression, e);
    }

    popContext(processor, jsDocCastExpression);
    return result;
  }

  static void pushContext(Processor processor, JsDocCastExpression jsDocCastExpression) {
    Visitor_Expression.pushContext(processor, jsDocCastExpression);
  }

  static void popContext(Processor processor, JsDocCastExpression jsDocCastExpression) {
    Visitor_Expression.popContext(processor, jsDocCastExpression);
  }

  static void visitMembers(Processor processor, JsDocCastExpression jsDocCastExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, jsDocCastExpression);
      jsDocCastExpression.expression = (Expression) Preconditions.checkNotNull(
      jsDocCastExpression.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"JsDocCastExpression\" cannot be null");
  }
}
