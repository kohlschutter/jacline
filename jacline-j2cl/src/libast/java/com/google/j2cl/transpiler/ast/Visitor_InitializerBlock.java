package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_InitializerBlock {

  public static Node visit(Processor processor, InitializerBlock initializerBlock) {
    Node result = initializerBlock;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, initializerBlock);

    try {
      if (processorImpl.shouldProcessInitializerBlock(initializerBlock)) {
        processorImpl.pushParent(initializerBlock);
        visitMembers(processorImpl, initializerBlock);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessInitializerBlock(initializerBlock);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), initializerBlock, e);
    }

    popContext(processor, initializerBlock);
    return result;
  }

  static void pushContext(Processor processor, InitializerBlock initializerBlock) {
    Visitor_Member.pushContext(processor, initializerBlock);
  }

  static void popContext(Processor processor, InitializerBlock initializerBlock) {
    Visitor_Member.popContext(processor, initializerBlock);
  }

  static void visitMembers(Processor processor, InitializerBlock initializerBlock) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Member.visitMembers(processorImpl, initializerBlock);
      initializerBlock.body = (Block) Preconditions.checkNotNull(
      initializerBlock.body.acceptInternal(processorImpl),
          "Field \"body\" in class \"InitializerBlock\" cannot be null");
      initializerBlock.methodDescriptor = (MethodDescriptor) Preconditions.checkNotNull(
      initializerBlock.methodDescriptor.acceptInternal(processorImpl),
          "Field \"methodDescriptor\" in class \"InitializerBlock\" cannot be null");
  }
}
