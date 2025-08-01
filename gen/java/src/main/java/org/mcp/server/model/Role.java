// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/common.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

/**
 * <pre>
 * The sender or recipient of messages and data in a conversation.
 * </pre>
 *
 * Protobuf enum {@code mcp.server.v1.Role}
 */
public enum Role
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified role.
   * </pre>
   *
   * <code>ROLE_UNSPECIFIED = 0;</code>
   */
  ROLE_UNSPECIFIED(0),
  /**
   * <pre>
   * A user-originated message.
   * </pre>
   *
   * <code>ROLE_USER = 1 [(.mcp.server.v1.string_name) = "user"];</code>
   */
  ROLE_USER(1),
  /**
   * <pre>
   * An assistant-originated message.
   * </pre>
   *
   * <code>ROLE_ASSISTANT = 2 [(.mcp.server.v1.string_name) = "assistant"];</code>
   */
  ROLE_ASSISTANT(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      Role.class.getName());
  }
  /**
   * <pre>
   * Unspecified role.
   * </pre>
   *
   * <code>ROLE_UNSPECIFIED = 0;</code>
   */
  public static final int ROLE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * A user-originated message.
   * </pre>
   *
   * <code>ROLE_USER = 1 [(.mcp.server.v1.string_name) = "user"];</code>
   */
  public static final int ROLE_USER_VALUE = 1;
  /**
   * <pre>
   * An assistant-originated message.
   * </pre>
   *
   * <code>ROLE_ASSISTANT = 2 [(.mcp.server.v1.string_name) = "assistant"];</code>
   */
  public static final int ROLE_ASSISTANT_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Role valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Role forNumber(int value) {
    switch (value) {
      case 0: return ROLE_UNSPECIFIED;
      case 1: return ROLE_USER;
      case 2: return ROLE_ASSISTANT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Role>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Role> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Role>() {
          public Role findValueByNumber(int number) {
            return Role.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.mcp.server.model.CommonProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final Role[] VALUES = values();

  public static Role valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Role(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:mcp.server.v1.Role)
}

