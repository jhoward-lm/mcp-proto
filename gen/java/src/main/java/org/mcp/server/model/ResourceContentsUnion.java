// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/results.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

/**
 * <pre>
 * A union of possible ResourceContents types.
 * </pre>
 *
 * Protobuf type {@code mcp.server.v1.ResourceContentsUnion}
 */
public final class ResourceContentsUnion extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:mcp.server.v1.ResourceContentsUnion)
    ResourceContentsUnionOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ResourceContentsUnion.class.getName());
  }
  // Use ResourceContentsUnion.newBuilder() to construct.
  private ResourceContentsUnion(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ResourceContentsUnion() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mcp.server.model.ResultsProto.internal_static_mcp_server_v1_ResourceContentsUnion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mcp.server.model.ResultsProto.internal_static_mcp_server_v1_ResourceContentsUnion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mcp.server.model.ResourceContentsUnion.class, org.mcp.server.model.ResourceContentsUnion.Builder.class);
  }

  private int contentsCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object contents_;
  public enum ContentsCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TEXT(1),
    BLOB(2),
    CONTENTS_NOT_SET(0);
    private final int value;
    private ContentsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ContentsCase valueOf(int value) {
      return forNumber(value);
    }

    public static ContentsCase forNumber(int value) {
      switch (value) {
        case 1: return TEXT;
        case 2: return BLOB;
        case 0: return CONTENTS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ContentsCase
  getContentsCase() {
    return ContentsCase.forNumber(
        contentsCase_);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The text variant of resource contents.
   * </pre>
   *
   * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return contentsCase_ == 1;
  }
  /**
   * <pre>
   * The text variant of resource contents.
   * </pre>
   *
   * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
   * @return The text.
   */
  @java.lang.Override
  public org.mcp.server.model.TextResourceContents getText() {
    if (contentsCase_ == 1) {
       return (org.mcp.server.model.TextResourceContents) contents_;
    }
    return org.mcp.server.model.TextResourceContents.getDefaultInstance();
  }
  /**
   * <pre>
   * The text variant of resource contents.
   * </pre>
   *
   * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
   */
  @java.lang.Override
  public org.mcp.server.model.TextResourceContentsOrBuilder getTextOrBuilder() {
    if (contentsCase_ == 1) {
       return (org.mcp.server.model.TextResourceContents) contents_;
    }
    return org.mcp.server.model.TextResourceContents.getDefaultInstance();
  }

  public static final int BLOB_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The binary variant of resource contents.
   * </pre>
   *
   * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
   * @return Whether the blob field is set.
   */
  @java.lang.Override
  public boolean hasBlob() {
    return contentsCase_ == 2;
  }
  /**
   * <pre>
   * The binary variant of resource contents.
   * </pre>
   *
   * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
   * @return The blob.
   */
  @java.lang.Override
  public org.mcp.server.model.BlobResourceContents getBlob() {
    if (contentsCase_ == 2) {
       return (org.mcp.server.model.BlobResourceContents) contents_;
    }
    return org.mcp.server.model.BlobResourceContents.getDefaultInstance();
  }
  /**
   * <pre>
   * The binary variant of resource contents.
   * </pre>
   *
   * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
   */
  @java.lang.Override
  public org.mcp.server.model.BlobResourceContentsOrBuilder getBlobOrBuilder() {
    if (contentsCase_ == 2) {
       return (org.mcp.server.model.BlobResourceContents) contents_;
    }
    return org.mcp.server.model.BlobResourceContents.getDefaultInstance();
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
    if (contentsCase_ == 1) {
      output.writeMessage(1, (org.mcp.server.model.TextResourceContents) contents_);
    }
    if (contentsCase_ == 2) {
      output.writeMessage(2, (org.mcp.server.model.BlobResourceContents) contents_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contentsCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.mcp.server.model.TextResourceContents) contents_);
    }
    if (contentsCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.mcp.server.model.BlobResourceContents) contents_);
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
    if (!(obj instanceof org.mcp.server.model.ResourceContentsUnion)) {
      return super.equals(obj);
    }
    org.mcp.server.model.ResourceContentsUnion other = (org.mcp.server.model.ResourceContentsUnion) obj;

    if (!getContentsCase().equals(other.getContentsCase())) return false;
    switch (contentsCase_) {
      case 1:
        if (!getText()
            .equals(other.getText())) return false;
        break;
      case 2:
        if (!getBlob()
            .equals(other.getBlob())) return false;
        break;
      case 0:
      default:
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
    switch (contentsCase_) {
      case 1:
        hash = (37 * hash) + TEXT_FIELD_NUMBER;
        hash = (53 * hash) + getText().hashCode();
        break;
      case 2:
        hash = (37 * hash) + BLOB_FIELD_NUMBER;
        hash = (53 * hash) + getBlob().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mcp.server.model.ResourceContentsUnion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mcp.server.model.ResourceContentsUnion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mcp.server.model.ResourceContentsUnion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mcp.server.model.ResourceContentsUnion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mcp.server.model.ResourceContentsUnion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mcp.server.model.ResourceContentsUnion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mcp.server.model.ResourceContentsUnion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.mcp.server.model.ResourceContentsUnion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.mcp.server.model.ResourceContentsUnion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.mcp.server.model.ResourceContentsUnion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mcp.server.model.ResourceContentsUnion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.mcp.server.model.ResourceContentsUnion parseFrom(
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
  public static Builder newBuilder(org.mcp.server.model.ResourceContentsUnion prototype) {
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
   * A union of possible ResourceContents types.
   * </pre>
   *
   * Protobuf type {@code mcp.server.v1.ResourceContentsUnion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mcp.server.v1.ResourceContentsUnion)
      org.mcp.server.model.ResourceContentsUnionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mcp.server.model.ResultsProto.internal_static_mcp_server_v1_ResourceContentsUnion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mcp.server.model.ResultsProto.internal_static_mcp_server_v1_ResourceContentsUnion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mcp.server.model.ResourceContentsUnion.class, org.mcp.server.model.ResourceContentsUnion.Builder.class);
    }

    // Construct using org.mcp.server.model.ResourceContentsUnion.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (textBuilder_ != null) {
        textBuilder_.clear();
      }
      if (blobBuilder_ != null) {
        blobBuilder_.clear();
      }
      contentsCase_ = 0;
      contents_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mcp.server.model.ResultsProto.internal_static_mcp_server_v1_ResourceContentsUnion_descriptor;
    }

    @java.lang.Override
    public org.mcp.server.model.ResourceContentsUnion getDefaultInstanceForType() {
      return org.mcp.server.model.ResourceContentsUnion.getDefaultInstance();
    }

    @java.lang.Override
    public org.mcp.server.model.ResourceContentsUnion build() {
      org.mcp.server.model.ResourceContentsUnion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mcp.server.model.ResourceContentsUnion buildPartial() {
      org.mcp.server.model.ResourceContentsUnion result = new org.mcp.server.model.ResourceContentsUnion(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mcp.server.model.ResourceContentsUnion result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(org.mcp.server.model.ResourceContentsUnion result) {
      result.contentsCase_ = contentsCase_;
      result.contents_ = this.contents_;
      if (contentsCase_ == 1 &&
          textBuilder_ != null) {
        result.contents_ = textBuilder_.build();
      }
      if (contentsCase_ == 2 &&
          blobBuilder_ != null) {
        result.contents_ = blobBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mcp.server.model.ResourceContentsUnion) {
        return mergeFrom((org.mcp.server.model.ResourceContentsUnion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mcp.server.model.ResourceContentsUnion other) {
      if (other == org.mcp.server.model.ResourceContentsUnion.getDefaultInstance()) return this;
      switch (other.getContentsCase()) {
        case TEXT: {
          mergeText(other.getText());
          break;
        }
        case BLOB: {
          mergeBlob(other.getBlob());
          break;
        }
        case CONTENTS_NOT_SET: {
          break;
        }
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
                  getTextFieldBuilder().getBuilder(),
                  extensionRegistry);
              contentsCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBlobFieldBuilder().getBuilder(),
                  extensionRegistry);
              contentsCase_ = 2;
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
    private int contentsCase_ = 0;
    private java.lang.Object contents_;
    public ContentsCase
        getContentsCase() {
      return ContentsCase.forNumber(
          contentsCase_);
    }

    public Builder clearContents() {
      contentsCase_ = 0;
      contents_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        org.mcp.server.model.TextResourceContents, org.mcp.server.model.TextResourceContents.Builder, org.mcp.server.model.TextResourceContentsOrBuilder> textBuilder_;
    /**
     * <pre>
     * The text variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return contentsCase_ == 1;
    }
    /**
     * <pre>
     * The text variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
     * @return The text.
     */
    @java.lang.Override
    public org.mcp.server.model.TextResourceContents getText() {
      if (textBuilder_ == null) {
        if (contentsCase_ == 1) {
          return (org.mcp.server.model.TextResourceContents) contents_;
        }
        return org.mcp.server.model.TextResourceContents.getDefaultInstance();
      } else {
        if (contentsCase_ == 1) {
          return textBuilder_.getMessage();
        }
        return org.mcp.server.model.TextResourceContents.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The text variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
     */
    public Builder setText(org.mcp.server.model.TextResourceContents value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contents_ = value;
        onChanged();
      } else {
        textBuilder_.setMessage(value);
      }
      contentsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The text variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
     */
    public Builder setText(
        org.mcp.server.model.TextResourceContents.Builder builderForValue) {
      if (textBuilder_ == null) {
        contents_ = builderForValue.build();
        onChanged();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }
      contentsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The text variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
     */
    public Builder mergeText(org.mcp.server.model.TextResourceContents value) {
      if (textBuilder_ == null) {
        if (contentsCase_ == 1 &&
            contents_ != org.mcp.server.model.TextResourceContents.getDefaultInstance()) {
          contents_ = org.mcp.server.model.TextResourceContents.newBuilder((org.mcp.server.model.TextResourceContents) contents_)
              .mergeFrom(value).buildPartial();
        } else {
          contents_ = value;
        }
        onChanged();
      } else {
        if (contentsCase_ == 1) {
          textBuilder_.mergeFrom(value);
        } else {
          textBuilder_.setMessage(value);
        }
      }
      contentsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The text variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
     */
    public Builder clearText() {
      if (textBuilder_ == null) {
        if (contentsCase_ == 1) {
          contentsCase_ = 0;
          contents_ = null;
          onChanged();
        }
      } else {
        if (contentsCase_ == 1) {
          contentsCase_ = 0;
          contents_ = null;
        }
        textBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The text variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
     */
    public org.mcp.server.model.TextResourceContents.Builder getTextBuilder() {
      return getTextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The text variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
     */
    @java.lang.Override
    public org.mcp.server.model.TextResourceContentsOrBuilder getTextOrBuilder() {
      if ((contentsCase_ == 1) && (textBuilder_ != null)) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        if (contentsCase_ == 1) {
          return (org.mcp.server.model.TextResourceContents) contents_;
        }
        return org.mcp.server.model.TextResourceContents.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The text variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.TextResourceContents text = 1 [json_name = "text"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.mcp.server.model.TextResourceContents, org.mcp.server.model.TextResourceContents.Builder, org.mcp.server.model.TextResourceContentsOrBuilder> 
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        if (!(contentsCase_ == 1)) {
          contents_ = org.mcp.server.model.TextResourceContents.getDefaultInstance();
        }
        textBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.mcp.server.model.TextResourceContents, org.mcp.server.model.TextResourceContents.Builder, org.mcp.server.model.TextResourceContentsOrBuilder>(
                (org.mcp.server.model.TextResourceContents) contents_,
                getParentForChildren(),
                isClean());
        contents_ = null;
      }
      contentsCase_ = 1;
      onChanged();
      return textBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        org.mcp.server.model.BlobResourceContents, org.mcp.server.model.BlobResourceContents.Builder, org.mcp.server.model.BlobResourceContentsOrBuilder> blobBuilder_;
    /**
     * <pre>
     * The binary variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
     * @return Whether the blob field is set.
     */
    @java.lang.Override
    public boolean hasBlob() {
      return contentsCase_ == 2;
    }
    /**
     * <pre>
     * The binary variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
     * @return The blob.
     */
    @java.lang.Override
    public org.mcp.server.model.BlobResourceContents getBlob() {
      if (blobBuilder_ == null) {
        if (contentsCase_ == 2) {
          return (org.mcp.server.model.BlobResourceContents) contents_;
        }
        return org.mcp.server.model.BlobResourceContents.getDefaultInstance();
      } else {
        if (contentsCase_ == 2) {
          return blobBuilder_.getMessage();
        }
        return org.mcp.server.model.BlobResourceContents.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The binary variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
     */
    public Builder setBlob(org.mcp.server.model.BlobResourceContents value) {
      if (blobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contents_ = value;
        onChanged();
      } else {
        blobBuilder_.setMessage(value);
      }
      contentsCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The binary variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
     */
    public Builder setBlob(
        org.mcp.server.model.BlobResourceContents.Builder builderForValue) {
      if (blobBuilder_ == null) {
        contents_ = builderForValue.build();
        onChanged();
      } else {
        blobBuilder_.setMessage(builderForValue.build());
      }
      contentsCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The binary variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
     */
    public Builder mergeBlob(org.mcp.server.model.BlobResourceContents value) {
      if (blobBuilder_ == null) {
        if (contentsCase_ == 2 &&
            contents_ != org.mcp.server.model.BlobResourceContents.getDefaultInstance()) {
          contents_ = org.mcp.server.model.BlobResourceContents.newBuilder((org.mcp.server.model.BlobResourceContents) contents_)
              .mergeFrom(value).buildPartial();
        } else {
          contents_ = value;
        }
        onChanged();
      } else {
        if (contentsCase_ == 2) {
          blobBuilder_.mergeFrom(value);
        } else {
          blobBuilder_.setMessage(value);
        }
      }
      contentsCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The binary variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
     */
    public Builder clearBlob() {
      if (blobBuilder_ == null) {
        if (contentsCase_ == 2) {
          contentsCase_ = 0;
          contents_ = null;
          onChanged();
        }
      } else {
        if (contentsCase_ == 2) {
          contentsCase_ = 0;
          contents_ = null;
        }
        blobBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The binary variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
     */
    public org.mcp.server.model.BlobResourceContents.Builder getBlobBuilder() {
      return getBlobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The binary variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
     */
    @java.lang.Override
    public org.mcp.server.model.BlobResourceContentsOrBuilder getBlobOrBuilder() {
      if ((contentsCase_ == 2) && (blobBuilder_ != null)) {
        return blobBuilder_.getMessageOrBuilder();
      } else {
        if (contentsCase_ == 2) {
          return (org.mcp.server.model.BlobResourceContents) contents_;
        }
        return org.mcp.server.model.BlobResourceContents.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The binary variant of resource contents.
     * </pre>
     *
     * <code>.mcp.server.v1.BlobResourceContents blob = 2 [json_name = "blob"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.mcp.server.model.BlobResourceContents, org.mcp.server.model.BlobResourceContents.Builder, org.mcp.server.model.BlobResourceContentsOrBuilder> 
        getBlobFieldBuilder() {
      if (blobBuilder_ == null) {
        if (!(contentsCase_ == 2)) {
          contents_ = org.mcp.server.model.BlobResourceContents.getDefaultInstance();
        }
        blobBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.mcp.server.model.BlobResourceContents, org.mcp.server.model.BlobResourceContents.Builder, org.mcp.server.model.BlobResourceContentsOrBuilder>(
                (org.mcp.server.model.BlobResourceContents) contents_,
                getParentForChildren(),
                isClean());
        contents_ = null;
      }
      contentsCase_ = 2;
      onChanged();
      return blobBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:mcp.server.v1.ResourceContentsUnion)
  }

  // @@protoc_insertion_point(class_scope:mcp.server.v1.ResourceContentsUnion)
  private static final org.mcp.server.model.ResourceContentsUnion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mcp.server.model.ResourceContentsUnion();
  }

  public static org.mcp.server.model.ResourceContentsUnion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceContentsUnion>
      PARSER = new com.google.protobuf.AbstractParser<ResourceContentsUnion>() {
    @java.lang.Override
    public ResourceContentsUnion parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceContentsUnion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceContentsUnion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mcp.server.model.ResourceContentsUnion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

