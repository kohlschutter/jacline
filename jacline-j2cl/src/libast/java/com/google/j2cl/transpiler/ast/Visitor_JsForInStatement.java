package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_JsForInStatement {

  public static Node visit(Processor processor, JsForInStatement jsForInStatement) {
    Node result = jsForInStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, jsForInStatement);

    try {
      if (processorImpl.shouldProcessJsForInStatement(jsForInStatement)) {
        processorImpl.pushParent(jsForInStatement);
        visitMembers(processorImpl, jsForInStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessJsForInStatement(jsForInStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), jsForInStatement, e);
    }

    popContext(processor, jsForInStatement);
    return result;
  }

  static void pushContext(Processor processor, JsForInStatement jsForInStatement) {
    Visitor_LoopStatement.pushContext(processor, jsForInStatement);
  }

  static void popContext(Processor processor, JsForInStatement jsForInStatement) {
    Visitor_LoopStatement.popContext(processor, jsForInStatement);
  }

  static void visitMembers(Processor processor, JsForInStatement jsForInStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_LoopStatement.visitMembers(processorImpl, jsForInStatement);
      jsForInStatement.loopVariable = (Variable) Preconditions.checkNotNull(
      jsForInStatement.loopVariable.acceptInternal(processorImpl),
          "Field \"loopVariable\" in class \"JsForInStatement\" cannot be null");
      jsForInStatement.iterableExpression = (Expression) Preconditions.checkNotNull(
      jsForInStatement.iterableExpression.acceptInternal(processorImpl),
          "Field \"iterableExpression\" in class \"JsForInStatement\" cannot be null");
      jsForInStatement.body = (Statement) Preconditions.checkNotNull(
      jsForInStatement.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"JsForInStatement\" cannot be null");
  }
}
