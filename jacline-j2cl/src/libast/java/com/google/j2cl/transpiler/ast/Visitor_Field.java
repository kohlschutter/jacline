package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Field {

  public static Node visit(Processor processor, Field field) {
    Node result = field;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, field);

    try {
      if (processorImpl.shouldProcessField(field)) {
        processorImpl.pushParent(field);
        visitMembers(processorImpl, field);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessField(field);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), field, e);
    }

    popContext(processor, field);
    return result;
  }

  static void pushContext(Processor processor, Field field) {
    Visitor_Member.pushContext(processor, field);
  }

  static void popContext(Processor processor, Field field) {
    Visitor_Member.popContext(processor, field);
  }

  static void visitMembers(Processor processor, Field field) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Member.visitMembers(processorImpl, field);
      field.fieldDescriptor = (FieldDescriptor) Preconditions.checkNotNull(
      field.fieldDescriptor.acceptInternal(processorImpl),
          "Field \"fieldDescriptor\" in class \"Field\" cannot be null");
    if (field.initializer != null) {
      field.initializer = (Expression) field.initializer.acceptInternal(processorImpl);
    }
  }
}
