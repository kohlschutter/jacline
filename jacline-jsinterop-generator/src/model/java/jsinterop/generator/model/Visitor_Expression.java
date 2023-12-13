package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Expression {

  public static Expression visit(Processor processor, Expression expression) {
    Expression result = expression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, expression);

    try {
      if (processorImpl.shouldProcessExpression(expression)) {
        processorImpl.pushParent(expression);
        visitMembers(processorImpl, expression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessExpression(expression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), expression, e);
    }

    popContext(processor, expression);
    return result;
  }

  static void pushContext(Processor processor, Expression expression) {
  }

  static void popContext(Processor processor, Expression expression) {
  }

  static void visitMembers(Processor processor, Expression expression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
  }
}
