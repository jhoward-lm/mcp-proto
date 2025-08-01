// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/results.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

public interface InitializeResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mcp.server.v1.InitializeResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The version of the Model Context Protocol that the server wants to use.
   * </pre>
   *
   * <code>string protocol_version = 1 [json_name = "protocolVersion"];</code>
   * @return Whether the protocolVersion field is set.
   */
  boolean hasProtocolVersion();
  /**
   * <pre>
   * The version of the Model Context Protocol that the server wants to use.
   * </pre>
   *
   * <code>string protocol_version = 1 [json_name = "protocolVersion"];</code>
   * @return The protocolVersion.
   */
  java.lang.String getProtocolVersion();
  /**
   * <pre>
   * The version of the Model Context Protocol that the server wants to use.
   * </pre>
   *
   * <code>string protocol_version = 1 [json_name = "protocolVersion"];</code>
   * @return The bytes for protocolVersion.
   */
  com.google.protobuf.ByteString
      getProtocolVersionBytes();

  /**
   * <pre>
   * Capabilities that a server may support.
   * </pre>
   *
   * <code>.mcp.server.v1.ServerCapabilities capabilities = 2 [json_name = "capabilities"];</code>
   * @return Whether the capabilities field is set.
   */
  boolean hasCapabilities();
  /**
   * <pre>
   * Capabilities that a server may support.
   * </pre>
   *
   * <code>.mcp.server.v1.ServerCapabilities capabilities = 2 [json_name = "capabilities"];</code>
   * @return The capabilities.
   */
  org.mcp.server.model.ServerCapabilities getCapabilities();
  /**
   * <pre>
   * Capabilities that a server may support.
   * </pre>
   *
   * <code>.mcp.server.v1.ServerCapabilities capabilities = 2 [json_name = "capabilities"];</code>
   */
  org.mcp.server.model.ServerCapabilitiesOrBuilder getCapabilitiesOrBuilder();

  /**
   * <pre>
   * Describes the name and version of the server implementation.
   * </pre>
   *
   * <code>.mcp.server.v1.Implementation server_info = 3 [json_name = "serverInfo"];</code>
   * @return Whether the serverInfo field is set.
   */
  boolean hasServerInfo();
  /**
   * <pre>
   * Describes the name and version of the server implementation.
   * </pre>
   *
   * <code>.mcp.server.v1.Implementation server_info = 3 [json_name = "serverInfo"];</code>
   * @return The serverInfo.
   */
  org.mcp.server.model.Implementation getServerInfo();
  /**
   * <pre>
   * Describes the name and version of the server implementation.
   * </pre>
   *
   * <code>.mcp.server.v1.Implementation server_info = 3 [json_name = "serverInfo"];</code>
   */
  org.mcp.server.model.ImplementationOrBuilder getServerInfoOrBuilder();

  /**
   * <pre>
   * Instructions describing how to use the server and its features.
   * </pre>
   *
   * <code>string instructions = 4 [json_name = "instructions"];</code>
   * @return Whether the instructions field is set.
   */
  boolean hasInstructions();
  /**
   * <pre>
   * Instructions describing how to use the server and its features.
   * </pre>
   *
   * <code>string instructions = 4 [json_name = "instructions"];</code>
   * @return The instructions.
   */
  java.lang.String getInstructions();
  /**
   * <pre>
   * Instructions describing how to use the server and its features.
   * </pre>
   *
   * <code>string instructions = 4 [json_name = "instructions"];</code>
   * @return The bytes for instructions.
   */
  com.google.protobuf.ByteString
      getInstructionsBytes();
}
