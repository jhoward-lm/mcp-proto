// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/client/v1/common.proto
// Protobuf Java Version: 4.29.3

package org.mcp.client.model;

/**
 * <pre>
 * A successful (non-error) response payload for JSON-RPC.
 * </pre>
 *
 * Protobuf type {@code mcp.client.v1.Result}
 */
public final class Result extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:mcp.client.v1.Result)
    ResultOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      Result.class.getName());
  }
  // Use Result.newBuilder() to construct.
  private Result(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Result() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mcp.client.model.CommonProto.internal_static_mcp_client_v1_Result_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mcp.client.model.CommonProto.internal_static_mcp_client_v1_Result_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mcp.client.model.Result.class, org.mcp.client.model.Result.Builder.class);
  }

  private int bitField0_;
  public static final int _META_FIELD_NUMBER = 1;
  private com.google.protobuf.Struct Meta_;
  /**
   * <pre>
   * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
   * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
   * </pre>
   *
   * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
   * @return Whether the meta field is set.
   */
  @java.lang.Override
  public boolean hasMeta() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
   * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
   * </pre>
   *
   * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
   * @return The meta.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getMeta() {
    return Meta_ == null ? com.google.protobuf.Struct.getDefaultInstance() : Meta_;
  }
  /**
   * <pre>
   * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
   * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
   * </pre>
   *
   * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getMetaOrBuilder() {
    return Meta_ == null ? com.google.protobuf.Struct.getDefaultInstance() : Meta_;
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct data_;
  /**
   * <pre>
   * The result value.
   * </pre>
   *
   * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The result value.
   * </pre>
   *
   * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getData() {
    return data_ == null ? com.google.protobuf.Struct.getDefaultInstance() : data_;
  }
  /**
   * <pre>
   * The result value.
   * </pre>
   *
   * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getDataOrBuilder() {
    return data_ == null ? com.google.protobuf.Struct.getDefaultInstance() : data_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getMeta());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMeta());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getData());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mcp.client.model.Result)) {
      return super.equals(obj);
    }
    org.mcp.client.model.Result other = (org.mcp.client.model.Result) obj;

    if (hasMeta() != other.hasMeta()) return false;
    if (hasMeta()) {
      if (!getMeta()
          .equals(other.getMeta())) return false;
    }
    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMeta()) {
      hash = (37 * hash) + _META_FIELD_NUMBER;
      hash = (53 * hash) + getMeta().hashCode();
    }
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mcp.client.model.Result parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mcp.client.model.Result parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mcp.client.model.Result parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mcp.client.model.Result parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mcp.client.model.Result parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mcp.client.model.Result parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mcp.client.model.Result parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.mcp.client.model.Result parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.mcp.client.model.Result parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.mcp.client.model.Result parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mcp.client.model.Result parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.mcp.client.model.Result parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mcp.client.model.Result prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A successful (non-error) response payload for JSON-RPC.
   * </pre>
   *
   * Protobuf type {@code mcp.client.v1.Result}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mcp.client.v1.Result)
      org.mcp.client.model.ResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mcp.client.model.CommonProto.internal_static_mcp_client_v1_Result_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mcp.client.model.CommonProto.internal_static_mcp_client_v1_Result_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mcp.client.model.Result.class, org.mcp.client.model.Result.Builder.class);
    }

    // Construct using org.mcp.client.model.Result.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getMetaFieldBuilder();
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      Meta_ = null;
      if (MetaBuilder_ != null) {
        MetaBuilder_.dispose();
        MetaBuilder_ = null;
      }
      data_ = null;
      if (dataBuilder_ != null) {
        dataBuilder_.dispose();
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mcp.client.model.CommonProto.internal_static_mcp_client_v1_Result_descriptor;
    }

    @java.lang.Override
    public org.mcp.client.model.Result getDefaultInstanceForType() {
      return org.mcp.client.model.Result.getDefaultInstance();
    }

    @java.lang.Override
    public org.mcp.client.model.Result build() {
      org.mcp.client.model.Result result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mcp.client.model.Result buildPartial() {
      org.mcp.client.model.Result result = new org.mcp.client.model.Result(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mcp.client.model.Result result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.Meta_ = MetaBuilder_ == null
            ? Meta_
            : MetaBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.data_ = dataBuilder_ == null
            ? data_
            : dataBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mcp.client.model.Result) {
        return mergeFrom((org.mcp.client.model.Result)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mcp.client.model.Result other) {
      if (other == org.mcp.client.model.Result.getDefaultInstance()) return this;
      if (other.hasMeta()) {
        mergeMeta(other.getMeta());
      }
      if (other.hasData()) {
        mergeData(other.getData());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getMetaFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Struct Meta_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> MetaBuilder_;
    /**
     * <pre>
     * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
     * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
     * </pre>
     *
     * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
     * @return Whether the meta field is set.
     */
    public boolean hasMeta() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
     * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
     * </pre>
     *
     * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
     * @return The meta.
     */
    public com.google.protobuf.Struct getMeta() {
      if (MetaBuilder_ == null) {
        return Meta_ == null ? com.google.protobuf.Struct.getDefaultInstance() : Meta_;
      } else {
        return MetaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
     * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
     * </pre>
     *
     * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
     */
    public Builder setMeta(com.google.protobuf.Struct value) {
      if (MetaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        Meta_ = value;
      } else {
        MetaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
     * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
     * </pre>
     *
     * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
     */
    public Builder setMeta(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (MetaBuilder_ == null) {
        Meta_ = builderForValue.build();
      } else {
        MetaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
     * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
     * </pre>
     *
     * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
     */
    public Builder mergeMeta(com.google.protobuf.Struct value) {
      if (MetaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          Meta_ != null &&
          Meta_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getMetaBuilder().mergeFrom(value);
        } else {
          Meta_ = value;
        }
      } else {
        MetaBuilder_.mergeFrom(value);
      }
      if (Meta_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
     * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
     * </pre>
     *
     * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
     */
    public Builder clearMeta() {
      bitField0_ = (bitField0_ & ~0x00000001);
      Meta_ = null;
      if (MetaBuilder_ != null) {
        MetaBuilder_.dispose();
        MetaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
     * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
     * </pre>
     *
     * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
     */
    public com.google.protobuf.Struct.Builder getMetaBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
     * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
     * </pre>
     *
     * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
     */
    public com.google.protobuf.StructOrBuilder getMetaOrBuilder() {
      if (MetaBuilder_ != null) {
        return MetaBuilder_.getMessageOrBuilder();
      } else {
        return Meta_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : Meta_;
      }
    }
    /**
     * <pre>
     * buf:lint:ignore FIELD_LOWER_SNAKE_CASE
     * See [specification/2025-06-18/basic/index#general-fields] for notes on _meta usage.
     * </pre>
     *
     * <code>.google.protobuf.Struct _meta = 1 [json_name = "Meta"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getMetaFieldBuilder() {
      if (MetaBuilder_ == null) {
        MetaBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getMeta(),
                getParentForChildren(),
                isClean());
        Meta_ = null;
      }
      return MetaBuilder_;
    }

    private com.google.protobuf.Struct data_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> dataBuilder_;
    /**
     * <pre>
     * The result value.
     * </pre>
     *
     * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
     * @return Whether the data field is set.
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The result value.
     * </pre>
     *
     * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
     * @return The data.
     */
    public com.google.protobuf.Struct getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.google.protobuf.Struct.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The result value.
     * </pre>
     *
     * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
     */
    public Builder setData(com.google.protobuf.Struct value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
      } else {
        dataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The result value.
     * </pre>
     *
     * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
     */
    public Builder setData(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The result value.
     * </pre>
     *
     * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
     */
    public Builder mergeData(com.google.protobuf.Struct value) {
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          data_ != null &&
          data_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getDataBuilder().mergeFrom(value);
        } else {
          data_ = value;
        }
      } else {
        dataBuilder_.mergeFrom(value);
      }
      if (data_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The result value.
     * </pre>
     *
     * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      data_ = null;
      if (dataBuilder_ != null) {
        dataBuilder_.dispose();
        dataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The result value.
     * </pre>
     *
     * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
     */
    public com.google.protobuf.Struct.Builder getDataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The result value.
     * </pre>
     *
     * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
     */
    public com.google.protobuf.StructOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : data_;
      }
    }
    /**
     * <pre>
     * The result value.
     * </pre>
     *
     * <code>.google.protobuf.Struct data = 2 [json_name = "data"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:mcp.client.v1.Result)
  }

  // @@protoc_insertion_point(class_scope:mcp.client.v1.Result)
  private static final org.mcp.client.model.Result DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mcp.client.model.Result();
  }

  public static org.mcp.client.model.Result getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Result>
      PARSER = new com.google.protobuf.AbstractParser<Result>() {
    @java.lang.Override
    public Result parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Result> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Result> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mcp.client.model.Result getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

