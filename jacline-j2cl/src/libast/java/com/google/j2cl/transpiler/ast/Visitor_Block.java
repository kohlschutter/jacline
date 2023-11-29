package com.google.j2cl.transpiler.ast;

import com.google.common.base.Preconditions;
import com.google.j2cl.common.visitor.ListVisitor;
import com.google.j2cl.common.visitor.Processor;
import com.google.j2cl.common.visitor.ProcessorError;

public class Visitor_Block {

  public static Node visit(Processor processor, Block block) {
    Node result = block;

    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    pushContext(processor, block);

    try {
      if (processorImpl.shouldProcessBlock(block)) {
        processorImpl.pushParent(block);
        visitMembers(processorImpl, block);
        processorImpl.popParent();
      }
      result = processorImpl.postProcessBlock(block);
    } catch (RuntimeException|Error e) {
      if (e instanceof ProcessorError) {
        throw e;
      }
      throw new ProcessorError(processorImpl.getCurrentContext(), block, e);
    }

    popContext(processor, block);
    return result;
  }

  static void pushContext(Processor processor, Block block) {
    Visitor_Statement.pushContext(processor, block);
  }

  static void popContext(Processor processor, Block block) {
    Visitor_Statement.popContext(processor, block);
  }

  static void visitMembers(Processor processor, Block block) {
    ProcessorPrivate processorImpl = (ProcessorPrivate) processor;
    Visitor_Statement.visitMembers(processorImpl, block);
      ListVisitor.visit(
          block.statements,
          n -> (Statement) n.acceptInternal(processorImpl));
  }
}
