// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/client/v1/common.proto
// Protobuf Java Version: 4.29.3

package org.mcp.client.model;

public interface ErrorDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mcp.client.v1.ErrorDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The error type that occurred.
   * </pre>
   *
   * <code>int32 code = 1 [json_name = "code"];</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * The error type that occurred.
   * </pre>
   *
   * <code>int32 code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  int getCode();

  /**
   * <pre>
   * A short description of the error.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * A short description of the error.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * A short description of the error.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.Value getData();
  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
   */
  com.google.protobuf.ValueOrBuilder getDataOrBuilder();
}
