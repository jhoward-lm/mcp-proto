// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/results.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

public interface ListToolsResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mcp.server.v1.ListToolsResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Pagination result.
   * </pre>
   *
   * <code>.mcp.server.v1.PaginatedResult next_cursor = 1 [json_name = "nextCursor"];</code>
   * @return Whether the nextCursor field is set.
   */
  boolean hasNextCursor();
  /**
   * <pre>
   * Pagination result.
   * </pre>
   *
   * <code>.mcp.server.v1.PaginatedResult next_cursor = 1 [json_name = "nextCursor"];</code>
   * @return The nextCursor.
   */
  org.mcp.server.model.PaginatedResult getNextCursor();
  /**
   * <pre>
   * Pagination result.
   * </pre>
   *
   * <code>.mcp.server.v1.PaginatedResult next_cursor = 1 [json_name = "nextCursor"];</code>
   */
  org.mcp.server.model.PaginatedResultOrBuilder getNextCursorOrBuilder();

  /**
   * <pre>
   * The list of available tools.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.ListToolsResult.Tool tools = 2 [json_name = "tools"];</code>
   */
  java.util.List<org.mcp.server.model.ListToolsResult.Tool> 
      getToolsList();
  /**
   * <pre>
   * The list of available tools.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.ListToolsResult.Tool tools = 2 [json_name = "tools"];</code>
   */
  org.mcp.server.model.ListToolsResult.Tool getTools(int index);
  /**
   * <pre>
   * The list of available tools.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.ListToolsResult.Tool tools = 2 [json_name = "tools"];</code>
   */
  int getToolsCount();
  /**
   * <pre>
   * The list of available tools.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.ListToolsResult.Tool tools = 2 [json_name = "tools"];</code>
   */
  java.util.List<? extends org.mcp.server.model.ListToolsResult.ToolOrBuilder> 
      getToolsOrBuilderList();
  /**
   * <pre>
   * The list of available tools.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.ListToolsResult.Tool tools = 2 [json_name = "tools"];</code>
   */
  org.mcp.server.model.ListToolsResult.ToolOrBuilder getToolsOrBuilder(
      int index);
}
