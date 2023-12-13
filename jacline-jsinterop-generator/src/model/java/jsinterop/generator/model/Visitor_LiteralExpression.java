package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_LiteralExpression {

  public static Expression visit(Processor processor, LiteralExpression literalExpression) {
    Expression result = literalExpression;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, literalExpression);

    try {
      if (processorImpl.shouldProcessLiteralExpression(literalExpression)) {
        processorImpl.pushParent(literalExpression);
        visitMembers(processorImpl, literalExpression);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessLiteralExpression(literalExpression);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), literalExpression, e);
    }

    popContext(processor, literalExpression);
    return result;
  }

  static void pushContext(Processor processor, LiteralExpression literalExpression) {
    Visitor_Expression.pushContext(processor, literalExpression);
  }

  static void popContext(Processor processor, LiteralExpression literalExpression) {
    Visitor_Expression.popContext(processor, literalExpression);
  }

  static void visitMembers(Processor processor, LiteralExpression literalExpression) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, literalExpression);
  }
}
