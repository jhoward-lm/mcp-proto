// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/client/v1/capabilities.proto
// Protobuf Java Version: 4.29.3

package org.mcp.client.model;

public final class CapabilitiesProto {
  private CapabilitiesProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      CapabilitiesProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_client_v1_ClientCapabilities_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_client_v1_ClientCapabilities_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_client_v1_ClientCapabilities_ExperimentalEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_client_v1_ClientCapabilities_ExperimentalEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_client_v1_ClientCapabilities_Roots_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_client_v1_ClientCapabilities_Roots_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n mcp/client/v1/capabilities.proto\022\rmcp." +
      "client.v1\032\034google/protobuf/struct.proto\"" +
      "\242\003\n\022ClientCapabilities\022W\n\014experimental\030\001" +
      " \003(\01323.mcp.client.v1.ClientCapabilities." +
      "ExperimentalEntryR\014experimental\0229\n\013elici" +
      "tation\030\002 \001(\0132\027.google.protobuf.StructR\013e" +
      "licitation\022=\n\005roots\030\003 \001(\0132\'.mcp.client.v" +
      "1.ClientCapabilities.RootsR\005roots\0223\n\010sam" +
      "pling\030\004 \001(\0132\027.google.protobuf.StructR\010sa" +
      "mpling\032X\n\021ExperimentalEntry\022\020\n\003key\030\001 \001(\t" +
      "R\003key\022-\n\005value\030\002 \001(\0132\027.google.protobuf.S" +
      "tructR\005value:\0028\001\032*\n\005Roots\022!\n\014list_change" +
      "d\030\001 \001(\010R\013listChangedB\221\001\n\024org.mcp.client." +
      "modelB\021CapabilitiesProtoH\001P\001Z\016pkg/mcp/cl" +
      "ient\242\002\003MCX\252\002\rMcp.Client.V1\312\002\rMcp\\Client\\" +
      "V1\342\002\031Mcp\\Client\\V1\\GPBMetadata\352\002\017Mcp::Cl" +
      "ient::V1b\010editionsp\350\007"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_mcp_client_v1_ClientCapabilities_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mcp_client_v1_ClientCapabilities_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_client_v1_ClientCapabilities_descriptor,
        new java.lang.String[] { "Experimental", "Elicitation", "Roots", "Sampling", });
    internal_static_mcp_client_v1_ClientCapabilities_ExperimentalEntry_descriptor =
      internal_static_mcp_client_v1_ClientCapabilities_descriptor.getNestedTypes().get(0);
    internal_static_mcp_client_v1_ClientCapabilities_ExperimentalEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_client_v1_ClientCapabilities_ExperimentalEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_mcp_client_v1_ClientCapabilities_Roots_descriptor =
      internal_static_mcp_client_v1_ClientCapabilities_descriptor.getNestedTypes().get(1);
    internal_static_mcp_client_v1_ClientCapabilities_Roots_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_client_v1_ClientCapabilities_Roots_descriptor,
        new java.lang.String[] { "ListChanged", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
