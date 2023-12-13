package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_ReturnStatement {

  public static Statement visit(Processor processor, ReturnStatement returnStatement) {
    Statement result = returnStatement;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, returnStatement);

    try {
      if (processorImpl.shouldProcessReturnStatement(returnStatement)) {
        processorImpl.pushParent(returnStatement);
        visitMembers(processorImpl, returnStatement);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessReturnStatement(returnStatement);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), returnStatement, e);
    }

    popContext(processor, returnStatement);
    return result;
  }

  static void pushContext(Processor processor, ReturnStatement returnStatement) {
    Visitor_Statement.pushContext(processor, returnStatement);
  }

  static void popContext(Processor processor, ReturnStatement returnStatement) {
    Visitor_Statement.popContext(processor, returnStatement);
  }

  static void visitMembers(Processor processor, ReturnStatement returnStatement) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, returnStatement);
      returnStatement.expression = (Expression) Preconditions.checkNotNull(
      returnStatement.expression.acceptInternal(processorImpl),
          "Field \"expression\" in class \"ReturnStatement\" cannot be null");
  }
}
