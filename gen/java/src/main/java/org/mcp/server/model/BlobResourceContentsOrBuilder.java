// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/results.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

public interface BlobResourceContentsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mcp.server.v1.BlobResourceContents)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URI of this resource.
   * </pre>
   *
   * <code>string uri = 1 [json_name = "uri"];</code>
   * @return Whether the uri field is set.
   */
  boolean hasUri();
  /**
   * <pre>
   * The URI of this resource.
   * </pre>
   *
   * <code>string uri = 1 [json_name = "uri"];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * The URI of this resource.
   * </pre>
   *
   * <code>string uri = 1 [json_name = "uri"];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * The MIME type of this resource, if known.
   * </pre>
   *
   * <code>string mime_type = 2 [json_name = "mimeType"];</code>
   * @return Whether the mimeType field is set.
   */
  boolean hasMimeType();
  /**
   * <pre>
   * The MIME type of this resource, if known.
   * </pre>
   *
   * <code>string mime_type = 2 [json_name = "mimeType"];</code>
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   * <pre>
   * The MIME type of this resource, if known.
   * </pre>
   *
   * <code>string mime_type = 2 [json_name = "mimeType"];</code>
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString
      getMimeTypeBytes();

  /**
   * <pre>
   * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
   * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
   * </pre>
   *
   * <code>.google.protobuf.Struct _meta = 3 [json_name = "Meta"];</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <pre>
   * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
   * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
   * </pre>
   *
   * <code>.google.protobuf.Struct _meta = 3 [json_name = "Meta"];</code>
   * @return The meta.
   */
  com.google.protobuf.Struct getMeta();
  /**
   * <pre>
   * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
   * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
   * </pre>
   *
   * <code>.google.protobuf.Struct _meta = 3 [json_name = "Meta"];</code>
   */
  com.google.protobuf.StructOrBuilder getMetaOrBuilder();

  /**
   * <pre>
   * A base64-encoded string representing the binary data of the item.
   * </pre>
   *
   * <code>string blob = 4 [json_name = "blob"];</code>
   * @return Whether the blob field is set.
   */
  boolean hasBlob();
  /**
   * <pre>
   * A base64-encoded string representing the binary data of the item.
   * </pre>
   *
   * <code>string blob = 4 [json_name = "blob"];</code>
   * @return The blob.
   */
  java.lang.String getBlob();
  /**
   * <pre>
   * A base64-encoded string representing the binary data of the item.
   * </pre>
   *
   * <code>string blob = 4 [json_name = "blob"];</code>
   * @return The bytes for blob.
   */
  com.google.protobuf.ByteString
      getBlobBytes();
}
