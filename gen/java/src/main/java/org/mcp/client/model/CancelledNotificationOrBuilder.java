// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/client/v1/notifications.proto
// Protobuf Java Version: 4.29.3

package org.mcp.client.model;

public interface CancelledNotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mcp.client.v1.CancelledNotification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The method name.
   * </pre>
   *
   * <code>string method = 1 [default = "notifications/cancelled", json_name = "method"];</code>
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   * <pre>
   * The method name.
   * </pre>
   *
   * <code>string method = 1 [default = "notifications/cancelled", json_name = "method"];</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <pre>
   * The method name.
   * </pre>
   *
   * <code>string method = 1 [default = "notifications/cancelled", json_name = "method"];</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <pre>
   * Parameters for the cancellation notification.
   * </pre>
   *
   * <code>.mcp.client.v1.CancelledNotification.Params params = 2 [json_name = "params"];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * Parameters for the cancellation notification.
   * </pre>
   *
   * <code>.mcp.client.v1.CancelledNotification.Params params = 2 [json_name = "params"];</code>
   * @return The params.
   */
  org.mcp.client.model.CancelledNotification.Params getParams();
  /**
   * <pre>
   * Parameters for the cancellation notification.
   * </pre>
   *
   * <code>.mcp.client.v1.CancelledNotification.Params params = 2 [json_name = "params"];</code>
   */
  org.mcp.client.model.CancelledNotification.ParamsOrBuilder getParamsOrBuilder();
}
