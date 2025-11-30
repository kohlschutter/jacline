package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_TypeDeclaration {

  public static TypeDeclaration visit(Processor processor, TypeDeclaration typeDeclaration) {
    TypeDeclaration result = typeDeclaration;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, typeDeclaration);

    try {
      if (processorImpl.shouldProcessTypeDeclaration(typeDeclaration)) {
        processorImpl.pushParent(typeDeclaration);
        visitMembers(processorImpl, typeDeclaration);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessTypeDeclaration(typeDeclaration);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), typeDeclaration, e);
    }

    popContext(processor, typeDeclaration);
    return result;
  }

  static void pushContext(Processor processor, TypeDeclaration typeDeclaration) {
  }

  static void popContext(Processor processor, TypeDeclaration typeDeclaration) {
  }

  static void visitMembers(Processor processor, TypeDeclaration typeDeclaration) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
  }
}
