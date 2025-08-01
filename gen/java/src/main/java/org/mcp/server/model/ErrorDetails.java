// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/common.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

/**
 * <pre>
 * Details of an error in a JSON-RPC error response.
 * </pre>
 *
 * Protobuf type {@code mcp.server.v1.ErrorDetails}
 */
public final class ErrorDetails extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:mcp.server.v1.ErrorDetails)
    ErrorDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ErrorDetails.class.getName());
  }
  // Use ErrorDetails.newBuilder() to construct.
  private ErrorDetails(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ErrorDetails() {
    message_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mcp.server.model.CommonProto.internal_static_mcp_server_v1_ErrorDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mcp.server.model.CommonProto.internal_static_mcp_server_v1_ErrorDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mcp.server.model.ErrorDetails.class, org.mcp.server.model.ErrorDetails.Builder.class);
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_ = 0;
  /**
   * <pre>
   * The error type that occurred.
   * </pre>
   *
   * <code>int32 code = 1 [json_name = "code"];</code>
   * @return Whether the code field is set.
   */
  @java.lang.Override
  public boolean hasCode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The error type that occurred.
   * </pre>
   *
   * <code>int32 code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  @java.lang.Override
  public int getCode() {
    return code_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * A short description of the error.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * A short description of the error.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A short description of the error.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.Value data_;
  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.Value getData() {
    return data_ == null ? com.google.protobuf.Value.getDefaultInstance() : data_;
  }
  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ValueOrBuilder getDataOrBuilder() {
    return data_ == null ? com.google.protobuf.Value.getDefaultInstance() : data_;
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
      output.writeInt32(1, code_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, message_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getData());
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
        .computeInt32Size(1, code_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, message_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getData());
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
    if (!(obj instanceof org.mcp.server.model.ErrorDetails)) {
      return super.equals(obj);
    }
    org.mcp.server.model.ErrorDetails other = (org.mcp.server.model.ErrorDetails) obj;

    if (hasCode() != other.hasCode()) return false;
    if (hasCode()) {
      if (getCode()
          != other.getCode()) return false;
    }
    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
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
    if (hasCode()) {
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode();
    }
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mcp.server.model.ErrorDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mcp.server.model.ErrorDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mcp.server.model.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mcp.server.model.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mcp.server.model.ErrorDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mcp.server.model.ErrorDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mcp.server.model.ErrorDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.mcp.server.model.ErrorDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.mcp.server.model.ErrorDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.mcp.server.model.ErrorDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mcp.server.model.ErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.mcp.server.model.ErrorDetails parseFrom(
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
  public static Builder newBuilder(org.mcp.server.model.ErrorDetails prototype) {
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
   * Details of an error in a JSON-RPC error response.
   * </pre>
   *
   * Protobuf type {@code mcp.server.v1.ErrorDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mcp.server.v1.ErrorDetails)
      org.mcp.server.model.ErrorDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mcp.server.model.CommonProto.internal_static_mcp_server_v1_ErrorDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mcp.server.model.CommonProto.internal_static_mcp_server_v1_ErrorDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mcp.server.model.ErrorDetails.class, org.mcp.server.model.ErrorDetails.Builder.class);
    }

    // Construct using org.mcp.server.model.ErrorDetails.newBuilder()
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
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      code_ = 0;
      message_ = "";
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
      return org.mcp.server.model.CommonProto.internal_static_mcp_server_v1_ErrorDetails_descriptor;
    }

    @java.lang.Override
    public org.mcp.server.model.ErrorDetails getDefaultInstanceForType() {
      return org.mcp.server.model.ErrorDetails.getDefaultInstance();
    }

    @java.lang.Override
    public org.mcp.server.model.ErrorDetails build() {
      org.mcp.server.model.ErrorDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mcp.server.model.ErrorDetails buildPartial() {
      org.mcp.server.model.ErrorDetails result = new org.mcp.server.model.ErrorDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mcp.server.model.ErrorDetails result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.data_ = dataBuilder_ == null
            ? data_
            : dataBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mcp.server.model.ErrorDetails) {
        return mergeFrom((org.mcp.server.model.ErrorDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mcp.server.model.ErrorDetails other) {
      if (other == org.mcp.server.model.ErrorDetails.getDefaultInstance()) return this;
      if (other.hasCode()) {
        setCode(other.getCode());
      }
      if (other.hasMessage()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 8: {
              code_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int code_ ;
    /**
     * <pre>
     * The error type that occurred.
     * </pre>
     *
     * <code>int32 code = 1 [json_name = "code"];</code>
     * @return Whether the code field is set.
     */
    @java.lang.Override
    public boolean hasCode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The error type that occurred.
     * </pre>
     *
     * <code>int32 code = 1 [json_name = "code"];</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }
    /**
     * <pre>
     * The error type that occurred.
     * </pre>
     *
     * <code>int32 code = 1 [json_name = "code"];</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(int value) {

      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error type that occurred.
     * </pre>
     *
     * <code>int32 code = 1 [json_name = "code"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * A short description of the error.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A short description of the error.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A short description of the error.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A short description of the error.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A short description of the error.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A short description of the error.
     * </pre>
     *
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Value data_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> dataBuilder_;
    /**
     * <pre>
     * Additional information about the error.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
     * @return Whether the data field is set.
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Additional information about the error.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
     * @return The data.
     */
    public com.google.protobuf.Value getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.google.protobuf.Value.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Additional information about the error.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
     */
    public Builder setData(com.google.protobuf.Value value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
      } else {
        dataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional information about the error.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
     */
    public Builder setData(
        com.google.protobuf.Value.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional information about the error.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
     */
    public Builder mergeData(com.google.protobuf.Value value) {
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          data_ != null &&
          data_ != com.google.protobuf.Value.getDefaultInstance()) {
          getDataBuilder().mergeFrom(value);
        } else {
          data_ = value;
        }
      } else {
        dataBuilder_.mergeFrom(value);
      }
      if (data_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Additional information about the error.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000004);
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
     * Additional information about the error.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
     */
    public com.google.protobuf.Value.Builder getDataBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Additional information about the error.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
     */
    public com.google.protobuf.ValueOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.google.protobuf.Value.getDefaultInstance() : data_;
      }
    }
    /**
     * <pre>
     * Additional information about the error.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 3 [json_name = "data"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:mcp.server.v1.ErrorDetails)
  }

  // @@protoc_insertion_point(class_scope:mcp.server.v1.ErrorDetails)
  private static final org.mcp.server.model.ErrorDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mcp.server.model.ErrorDetails();
  }

  public static org.mcp.server.model.ErrorDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorDetails>
      PARSER = new com.google.protobuf.AbstractParser<ErrorDetails>() {
    @java.lang.Override
    public ErrorDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<ErrorDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mcp.server.model.ErrorDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

