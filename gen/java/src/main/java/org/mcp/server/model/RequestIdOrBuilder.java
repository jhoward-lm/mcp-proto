// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/common.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

public interface RequestIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mcp.server.v1.RequestId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * String representation of the request ID.
   * </pre>
   *
   * <code>string string_id = 1 [json_name = "stringId"];</code>
   * @return Whether the stringId field is set.
   */
  boolean hasStringId();
  /**
   * <pre>
   * String representation of the request ID.
   * </pre>
   *
   * <code>string string_id = 1 [json_name = "stringId"];</code>
   * @return The stringId.
   */
  java.lang.String getStringId();
  /**
   * <pre>
   * String representation of the request ID.
   * </pre>
   *
   * <code>string string_id = 1 [json_name = "stringId"];</code>
   * @return The bytes for stringId.
   */
  com.google.protobuf.ByteString
      getStringIdBytes();

  /**
   * <pre>
   * Numeric representation of the request ID.
   * </pre>
   *
   * <code>int64 int_id = 2 [json_name = "intId"];</code>
   * @return Whether the intId field is set.
   */
  boolean hasIntId();
  /**
   * <pre>
   * Numeric representation of the request ID.
   * </pre>
   *
   * <code>int64 int_id = 2 [json_name = "intId"];</code>
   * @return The intId.
   */
  long getIntId();

  org.mcp.server.model.RequestId.ValueCase getValueCase();
}
