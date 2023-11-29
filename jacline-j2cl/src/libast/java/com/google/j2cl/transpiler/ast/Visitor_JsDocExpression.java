package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_JsDocExpression {

  public static Node visit(Processor processor, JsDocExpression jsDocExpression) {
    Node result = jsDocExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, jsDocExpression);

    try {
      if (processorImpl.shouldProcessJsDocExpression(jsDocExpression)) {
        processorImpl.pushParent(jsDocExpression);
        visitMembers(processorImpl, jsDocExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessJsDocExpression(jsDocExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), jsDocExpression, e);
    }

    popContext(processor, jsDocExpression);
    return result;
  }

  static void pushContext(Processor processor, JsDocExpression jsDocExpression) {
    Visitor_Expression.pushContext(processor, jsDocExpression);
  }

  static void popContext(Processor processor, JsDocExpression jsDocExpression) {
    Visitor_Expression.popContext(processor, jsDocExpression);
  }

  static void visitMembers(Processor processor, JsDocExpression jsDocExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, jsDocExpression);
      jsDocExpression.expression = (Expression) Preconditions.checkNotNull(
      jsDocExpression.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"JsDocExpression\" cannot be null");
  }
}
