// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/json_rpc.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

public interface JSONRPCNotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mcp.server.v1.JSONRPCNotification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The JSON-RPC version.
   * </pre>
   *
   * <code>string jsonrpc = 1 [json_name = "jsonrpc"];</code>
   * @return Whether the jsonrpc field is set.
   */
  boolean hasJsonrpc();
  /**
   * <pre>
   * The JSON-RPC version.
   * </pre>
   *
   * <code>string jsonrpc = 1 [json_name = "jsonrpc"];</code>
   * @return The jsonrpc.
   */
  java.lang.String getJsonrpc();
  /**
   * <pre>
   * The JSON-RPC version.
   * </pre>
   *
   * <code>string jsonrpc = 1 [json_name = "jsonrpc"];</code>
   * @return The bytes for jsonrpc.
   */
  com.google.protobuf.ByteString
      getJsonrpcBytes();

  /**
   * <pre>
   * The method to invoke.
   * </pre>
   *
   * <code>string method = 2 [json_name = "method"];</code>
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   * <pre>
   * The method to invoke.
   * </pre>
   *
   * <code>string method = 2 [json_name = "method"];</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <pre>
   * The method to invoke.
   * </pre>
   *
   * <code>string method = 2 [json_name = "method"];</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <pre>
   * The notification parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 3 [json_name = "params"];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * The notification parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 3 [json_name = "params"];</code>
   * @return The params.
   */
  com.google.protobuf.Struct getParams();
  /**
   * <pre>
   * The notification parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 3 [json_name = "params"];</code>
   */
  com.google.protobuf.StructOrBuilder getParamsOrBuilder();
}
