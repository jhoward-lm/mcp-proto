// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/content.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

public interface AnnotationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mcp.server.v1.Annotations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Describes who the intended customer of this object or data is.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.Role audience = 1 [json_name = "audience"];</code>
   * @return A list containing the audience.
   */
  java.util.List<org.mcp.server.model.Role> getAudienceList();
  /**
   * <pre>
   * Describes who the intended customer of this object or data is.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.Role audience = 1 [json_name = "audience"];</code>
   * @return The count of audience.
   */
  int getAudienceCount();
  /**
   * <pre>
   * Describes who the intended customer of this object or data is.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.Role audience = 1 [json_name = "audience"];</code>
   * @param index The index of the element to return.
   * @return The audience at the given index.
   */
  org.mcp.server.model.Role getAudience(int index);
  /**
   * <pre>
   * Describes who the intended customer of this object or data is.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.Role audience = 1 [json_name = "audience"];</code>
   * @return A list containing the enum numeric values on the wire for audience.
   */
  java.util.List<java.lang.Integer>
  getAudienceValueList();
  /**
   * <pre>
   * Describes who the intended customer of this object or data is.
   * </pre>
   *
   * <code>repeated .mcp.server.v1.Role audience = 1 [json_name = "audience"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of audience at the given index.
   */
  int getAudienceValue(int index);

  /**
   * <pre>
   * Describes how important this data is for operating the server.
   * </pre>
   *
   * <code>double priority = 2 [json_name = "priority"];</code>
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <pre>
   * Describes how important this data is for operating the server.
   * </pre>
   *
   * <code>double priority = 2 [json_name = "priority"];</code>
   * @return The priority.
   */
  double getPriority();

  /**
   * <pre>
   * The moment the resource was last modified, as an ISO 8601 formatted string.
   * </pre>
   *
   * <code>string last_modified = 3 [json_name = "lastModified"];</code>
   * @return Whether the lastModified field is set.
   */
  boolean hasLastModified();
  /**
   * <pre>
   * The moment the resource was last modified, as an ISO 8601 formatted string.
   * </pre>
   *
   * <code>string last_modified = 3 [json_name = "lastModified"];</code>
   * @return The lastModified.
   */
  java.lang.String getLastModified();
  /**
   * <pre>
   * The moment the resource was last modified, as an ISO 8601 formatted string.
   * </pre>
   *
   * <code>string last_modified = 3 [json_name = "lastModified"];</code>
   * @return The bytes for lastModified.
   */
  com.google.protobuf.ByteString
      getLastModifiedBytes();
}
