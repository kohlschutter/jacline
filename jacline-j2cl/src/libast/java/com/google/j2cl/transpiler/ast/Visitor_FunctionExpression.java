package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_FunctionExpression {

  public static Node visit(Processor processor, FunctionExpression functionExpression) {
    Node result = functionExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, functionExpression);

    try {
      if (processorImpl.shouldProcessFunctionExpression(functionExpression)) {
        processorImpl.pushParent(functionExpression);
        visitMembers(processorImpl, functionExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessFunctionExpression(functionExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), functionExpression, e);
    }

    popContext(processor, functionExpression);
    return result;
  }

  static void pushContext(Processor processor, FunctionExpression functionExpression) {
    Visitor_Expression.pushContext(processor, functionExpression);
  }

  static void popContext(Processor processor, FunctionExpression functionExpression) {
    Visitor_Expression.popContext(processor, functionExpression);
  }

  static void visitMembers(Processor processor, FunctionExpression functionExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, functionExpression);
      ListVisitor.visit(
          functionExpression.parameters,
          n -> (Variable) n.acceptInternal(processorImpl));
      functionExpression.body = (Block) Preconditions.checkNotNull(
      functionExpression.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"FunctionExpression\" cannot be null");
      functionExpression.typeDescriptor = (TypeDescriptor) Preconditions.checkNotNull(
      functionExpression.typeDescriptor.acceptInternal(processorImpl),
          "Field \"typeDescriptor\" in class \"FunctionExpression\" cannot be null");
  }
}
