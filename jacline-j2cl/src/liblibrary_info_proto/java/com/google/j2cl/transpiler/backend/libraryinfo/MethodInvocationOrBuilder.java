// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transpiler/java/com/google/j2cl/transpiler/backend/libraryinfo/library_info.proto

package com.google.j2cl.transpiler.backend.libraryinfo;

public interface MethodInvocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:j2cl.MethodInvocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string method = 1;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <code>string method = 1;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <code>int32 enclosing_type = 2;</code>
   * @return The enclosingType.
   */
  int getEnclosingType();
}
