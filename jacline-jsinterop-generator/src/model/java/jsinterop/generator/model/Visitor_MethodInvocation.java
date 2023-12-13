package jsinterop.generator.model;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_MethodInvocation {

  public static Expression visit(Processor processor, MethodInvocation methodInvocation) {
    Expression result = methodInvocation;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, methodInvocation);

    try {
      if (processorImpl.shouldProcessMethodInvocation(methodInvocation)) {
        processorImpl.pushParent(methodInvocation);
        visitMembers(processorImpl, methodInvocation);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessMethodInvocation(methodInvocation);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), methodInvocation, e);
    }

    popContext(processor, methodInvocation);
    return result;
  }

  static void pushContext(Processor processor, MethodInvocation methodInvocation) {
    Visitor_Expression.pushContext(processor, methodInvocation);
  }

  static void popContext(Processor processor, MethodInvocation methodInvocation) {
    Visitor_Expression.popContext(processor, methodInvocation);
  }

  static void visitMembers(Processor processor, MethodInvocation methodInvocation) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Expression.visitMembers(processorImpl, methodInvocation);
    if (methodInvocation.invocationTarget != null) {
      methodInvocation.invocationTarget = (Expression) methodInvocation.invocationTarget.acceptInternal(processorImpl);
    }
      ListVisitor.visit(
          methodInvocation.argumentTypes,
          n -> (TypeReference) n.acceptInternal(processorImpl));
      ListVisitor.visit(
          methodInvocation.arguments,
          n -> (Expression) n.acceptInternal(processorImpl));
      ListVisitor.visit(
          methodInvocation.localTypeArguments,
          n -> (TypeReference) n.acceptInternal(processorImpl));
  }
}
