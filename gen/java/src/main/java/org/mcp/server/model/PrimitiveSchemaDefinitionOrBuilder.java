// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/requests.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

public interface PrimitiveSchemaDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mcp.server.v1.PrimitiveSchemaDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Boolean schema.
   * </pre>
   *
   * <code>.mcp.server.v1.BooleanSchema boolean_schema = 1 [json_name = "booleanSchema"];</code>
   * @return Whether the booleanSchema field is set.
   */
  boolean hasBooleanSchema();
  /**
   * <pre>
   * Boolean schema.
   * </pre>
   *
   * <code>.mcp.server.v1.BooleanSchema boolean_schema = 1 [json_name = "booleanSchema"];</code>
   * @return The booleanSchema.
   */
  org.mcp.server.model.BooleanSchema getBooleanSchema();
  /**
   * <pre>
   * Boolean schema.
   * </pre>
   *
   * <code>.mcp.server.v1.BooleanSchema boolean_schema = 1 [json_name = "booleanSchema"];</code>
   */
  org.mcp.server.model.BooleanSchemaOrBuilder getBooleanSchemaOrBuilder();

  /**
   * <pre>
   * Enum schema.
   * </pre>
   *
   * <code>.mcp.server.v1.EnumSchema enum_schema = 2 [json_name = "enumSchema"];</code>
   * @return Whether the enumSchema field is set.
   */
  boolean hasEnumSchema();
  /**
   * <pre>
   * Enum schema.
   * </pre>
   *
   * <code>.mcp.server.v1.EnumSchema enum_schema = 2 [json_name = "enumSchema"];</code>
   * @return The enumSchema.
   */
  org.mcp.server.model.EnumSchema getEnumSchema();
  /**
   * <pre>
   * Enum schema.
   * </pre>
   *
   * <code>.mcp.server.v1.EnumSchema enum_schema = 2 [json_name = "enumSchema"];</code>
   */
  org.mcp.server.model.EnumSchemaOrBuilder getEnumSchemaOrBuilder();

  /**
   * <pre>
   * Number schema.
   * </pre>
   *
   * <code>.mcp.server.v1.NumberSchema number_schema = 3 [json_name = "numberSchema"];</code>
   * @return Whether the numberSchema field is set.
   */
  boolean hasNumberSchema();
  /**
   * <pre>
   * Number schema.
   * </pre>
   *
   * <code>.mcp.server.v1.NumberSchema number_schema = 3 [json_name = "numberSchema"];</code>
   * @return The numberSchema.
   */
  org.mcp.server.model.NumberSchema getNumberSchema();
  /**
   * <pre>
   * Number schema.
   * </pre>
   *
   * <code>.mcp.server.v1.NumberSchema number_schema = 3 [json_name = "numberSchema"];</code>
   */
  org.mcp.server.model.NumberSchemaOrBuilder getNumberSchemaOrBuilder();

  /**
   * <pre>
   * String schema.
   * </pre>
   *
   * <code>.mcp.server.v1.StringSchema string_schema = 4 [json_name = "stringSchema"];</code>
   * @return Whether the stringSchema field is set.
   */
  boolean hasStringSchema();
  /**
   * <pre>
   * String schema.
   * </pre>
   *
   * <code>.mcp.server.v1.StringSchema string_schema = 4 [json_name = "stringSchema"];</code>
   * @return The stringSchema.
   */
  org.mcp.server.model.StringSchema getStringSchema();
  /**
   * <pre>
   * String schema.
   * </pre>
   *
   * <code>.mcp.server.v1.StringSchema string_schema = 4 [json_name = "stringSchema"];</code>
   */
  org.mcp.server.model.StringSchemaOrBuilder getStringSchemaOrBuilder();

  org.mcp.server.model.PrimitiveSchemaDefinition.DefinitionCase getDefinitionCase();
}
