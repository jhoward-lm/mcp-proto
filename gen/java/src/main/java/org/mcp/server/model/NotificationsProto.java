// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mcp/server/v1/notifications.proto
// Protobuf Java Version: 4.29.3

package org.mcp.server.model;

public final class NotificationsProto {
  private NotificationsProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      NotificationsProto.class.getName());
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
    internal_static_mcp_server_v1_CancelledNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_CancelledNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_CancelledNotification_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_CancelledNotification_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_LoggingMessageNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_LoggingMessageNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_LoggingMessageNotification_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_LoggingMessageNotification_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_ProgressNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_ProgressNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_ProgressNotification_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_ProgressNotification_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_PromptListChangedNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_PromptListChangedNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_ResourceListChangedNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_ResourceListChangedNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_ResourceUpdatedNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_ResourceUpdatedNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_ResourceUpdatedNotification_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_ResourceUpdatedNotification_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mcp_server_v1_ToolListChangedNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_mcp_server_v1_ToolListChangedNotification_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!mcp/server/v1/notifications.proto\022\rmcp" +
      ".server.v1\032\034google/protobuf/struct.proto" +
      "\032\032mcp/server/v1/common.proto\"\350\001\n\025Cancell" +
      "edNotification\022/\n\006method\030\001 \001(\t:\027notifica" +
      "tions/cancelledR\006method\022C\n\006params\030\002 \001(\0132" +
      "+.mcp.server.v1.CancelledNotification.Pa" +
      "ramsR\006params\032Y\n\006Params\0227\n\nrequest_id\030\001 \001" +
      "(\0132\030.mcp.server.v1.RequestIdR\trequestId\022" +
      "\026\n\006reason\030\002 \001(\tR\006reason\"\226\002\n\032LoggingMessa" +
      "geNotification\022-\n\006method\030\001 \001(\t:\025notifica" +
      "tions/messageR\006method\022H\n\006params\030\002 \001(\01320." +
      "mcp.server.v1.LoggingMessageNotification" +
      ".ParamsR\006params\032\177\n\006Params\0221\n\005level\030\001 \001(\016" +
      "2\033.mcp.server.v1.LoggingLevelR\005level\022\026\n\006" +
      "logger\030\002 \001(\tR\006logger\022*\n\004data\030\003 \001(\0132\026.goo" +
      "gle.protobuf.ValueR\004data\"\246\002\n\024ProgressNot" +
      "ification\022.\n\006method\030\001 \001(\t:\026notifications" +
      "/progressR\006method\022B\n\006params\030\002 \001(\0132*.mcp." +
      "server.v1.ProgressNotification.ParamsR\006p" +
      "arams\032\231\001\n\006Params\022C\n\016progress_token\030\001 \001(\013" +
      "2\034.mcp.server.v1.ProgressTokenR\rprogress" +
      "Token\022\032\n\010progress\030\002 \001(\001R\010progress\022\024\n\005tot" +
      "al\030\003 \001(\001R\005total\022\030\n\007message\030\004 \001(\tR\007messag" +
      "e\"[\n\035PromptListChangedNotification\022:\n\006me" +
      "thod\030\001 \001(\t:\"notifications/prompts/list_c" +
      "hangedR\006method\"_\n\037ResourceListChangedNot" +
      "ification\022<\n\006method\030\001 \001(\t:$notifications" +
      "/resources/list_changedR\006method\"\275\001\n\033Reso" +
      "urceUpdatedNotification\0227\n\006method\030\001 \001(\t:" +
      "\037notifications/resources/updatedR\006method" +
      "\022I\n\006params\030\002 \001(\01321.mcp.server.v1.Resourc" +
      "eUpdatedNotification.ParamsR\006params\032\032\n\006P" +
      "arams\022\020\n\003uri\030\001 \001(\tR\003uri\"W\n\033ToolListChang" +
      "edNotification\0228\n\006method\030\001 \001(\t: notifica" +
      "tions/tools/list_changedR\006methodB\222\001\n\024org" +
      ".mcp.server.modelB\022NotificationsProtoH\001P" +
      "\001Z\016pkg/mcp/server\242\002\003MSX\252\002\rMcp.Server.V1\312" +
      "\002\rMcp\\Server\\V1\342\002\031Mcp\\Server\\V1\\GPBMetad" +
      "ata\352\002\017Mcp::Server::V1b\010editionsp\350\007"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          org.mcp.server.model.CommonProto.getDescriptor(),
        });
    internal_static_mcp_server_v1_CancelledNotification_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mcp_server_v1_CancelledNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_CancelledNotification_descriptor,
        new java.lang.String[] { "Method", "Params", });
    internal_static_mcp_server_v1_CancelledNotification_Params_descriptor =
      internal_static_mcp_server_v1_CancelledNotification_descriptor.getNestedTypes().get(0);
    internal_static_mcp_server_v1_CancelledNotification_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_CancelledNotification_Params_descriptor,
        new java.lang.String[] { "RequestId", "Reason", });
    internal_static_mcp_server_v1_LoggingMessageNotification_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_mcp_server_v1_LoggingMessageNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_LoggingMessageNotification_descriptor,
        new java.lang.String[] { "Method", "Params", });
    internal_static_mcp_server_v1_LoggingMessageNotification_Params_descriptor =
      internal_static_mcp_server_v1_LoggingMessageNotification_descriptor.getNestedTypes().get(0);
    internal_static_mcp_server_v1_LoggingMessageNotification_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_LoggingMessageNotification_Params_descriptor,
        new java.lang.String[] { "Level", "Logger", "Data", });
    internal_static_mcp_server_v1_ProgressNotification_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_mcp_server_v1_ProgressNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_ProgressNotification_descriptor,
        new java.lang.String[] { "Method", "Params", });
    internal_static_mcp_server_v1_ProgressNotification_Params_descriptor =
      internal_static_mcp_server_v1_ProgressNotification_descriptor.getNestedTypes().get(0);
    internal_static_mcp_server_v1_ProgressNotification_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_ProgressNotification_Params_descriptor,
        new java.lang.String[] { "ProgressToken", "Progress", "Total", "Message", });
    internal_static_mcp_server_v1_PromptListChangedNotification_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_mcp_server_v1_PromptListChangedNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_PromptListChangedNotification_descriptor,
        new java.lang.String[] { "Method", });
    internal_static_mcp_server_v1_ResourceListChangedNotification_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_mcp_server_v1_ResourceListChangedNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_ResourceListChangedNotification_descriptor,
        new java.lang.String[] { "Method", });
    internal_static_mcp_server_v1_ResourceUpdatedNotification_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_mcp_server_v1_ResourceUpdatedNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_ResourceUpdatedNotification_descriptor,
        new java.lang.String[] { "Method", "Params", });
    internal_static_mcp_server_v1_ResourceUpdatedNotification_Params_descriptor =
      internal_static_mcp_server_v1_ResourceUpdatedNotification_descriptor.getNestedTypes().get(0);
    internal_static_mcp_server_v1_ResourceUpdatedNotification_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_ResourceUpdatedNotification_Params_descriptor,
        new java.lang.String[] { "Uri", });
    internal_static_mcp_server_v1_ToolListChangedNotification_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_mcp_server_v1_ToolListChangedNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_mcp_server_v1_ToolListChangedNotification_descriptor,
        new java.lang.String[] { "Method", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.StructProto.getDescriptor();
    org.mcp.server.model.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
