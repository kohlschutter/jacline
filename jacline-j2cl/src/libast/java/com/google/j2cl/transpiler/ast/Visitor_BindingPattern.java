package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_BindingPattern {

  public static Node visit(Processor processor, BindingPattern bindingPattern) {
    Node result = bindingPattern;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, bindingPattern);

    try {
      if (processorImpl.shouldProcessBindingPattern(bindingPattern)) {
        processorImpl.pushParent(bindingPattern);
        visitMembers(processorImpl, bindingPattern);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessBindingPattern(bindingPattern);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), bindingPattern, e);
    }

    popContext(processor, bindingPattern);
    return result;
  }

  static void pushContext(Processor processor, BindingPattern bindingPattern) {
    Visitor_Pattern.pushContext(processor, bindingPattern);
  }

  static void popContext(Processor processor, BindingPattern bindingPattern) {
    Visitor_Pattern.popContext(processor, bindingPattern);
  }

  static void visitMembers(Processor processor, BindingPattern bindingPattern) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Pattern.visitMembers(processorImpl, bindingPattern);
      bindingPattern.variable = (Variable) Preconditions.checkNotNull(
      bindingPattern.variable.acceptInternal(processorImpl),
          "Field \"variable\" in class \"BindingPattern\" cannot be null");
  }
}
