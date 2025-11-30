package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_TypeLiteral {

  public static Node visit(Processor processor, TypeLiteral typeLiteral) {
    Node result = typeLiteral;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, typeLiteral);

    try {
      if (processorImpl.shouldProcessTypeLiteral(typeLiteral)) {
        processorImpl.pushParent(typeLiteral);
        visitMembers(processorImpl, typeLiteral);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessTypeLiteral(typeLiteral);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), typeLiteral, e);
    }

    popContext(processor, typeLiteral);
    return result;
  }

  static void pushContext(Processor processor, TypeLiteral typeLiteral) {
    Visitor_Literal.pushContext(processor, typeLiteral);
  }

  static void popContext(Processor processor, TypeLiteral typeLiteral) {
    Visitor_Literal.popContext(processor, typeLiteral);
  }

  static void visitMembers(Processor processor, TypeLiteral typeLiteral) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Literal.visitMembers(processorImpl, typeLiteral);
      typeLiteral.referencedTypeDescriptor = (TypeDescriptor) Preconditions.checkNotNull(
      typeLiteral.referencedTypeDescriptor.acceptInternal(processorImpl),
          "Field \"referencedTypeDescriptor\" in class \"TypeLiteral\" cannot be null");
  }
}
