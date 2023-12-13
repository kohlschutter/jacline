package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ExpressionStatement {

  public static Statement visit(Processor processor, ExpressionStatement expressionStatement) {
    Statement result = expressionStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, expressionStatement);

    try {
      if (processorImpl.shouldProcessExpressionStatement(expressionStatement)) {
        processorImpl.pushParent(expressionStatement);
        visitMembers(processorImpl, expressionStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessExpressionStatement(expressionStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), expressionStatement, e);
    }

    popContext(processor, expressionStatement);
    return result;
  }

  static void pushContext(Processor processor, ExpressionStatement expressionStatement) {
    Visitor_Statement.pushContext(processor, expressionStatement);
  }

  static void popContext(Processor processor, ExpressionStatement expressionStatement) {
    Visitor_Statement.popContext(processor, expressionStatement);
  }

  static void visitMembers(Processor processor, ExpressionStatement expressionStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, expressionStatement);
      expressionStatement.expression = (Expression) Preconditions.checkNotNull(
      expressionStatement.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"ExpressionStatement\" cannot be null");
  }
}
