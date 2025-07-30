package org.mcp.api.resources;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service describing available methods exposed by an MCP server.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ServerServiceGrpc {

  private ServerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mcp.api.v1.ServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.CallToolRequest,
      com.mcp.server.v1.CallToolResult> getCallToolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallTool",
      requestType = com.mcp.client.v1.CallToolRequest.class,
      responseType = com.mcp.server.v1.CallToolResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.CallToolRequest,
      com.mcp.server.v1.CallToolResult> getCallToolMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.CallToolRequest, com.mcp.server.v1.CallToolResult> getCallToolMethod;
    if ((getCallToolMethod = ServerServiceGrpc.getCallToolMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getCallToolMethod = ServerServiceGrpc.getCallToolMethod) == null) {
          ServerServiceGrpc.getCallToolMethod = getCallToolMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.CallToolRequest, com.mcp.server.v1.CallToolResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallTool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.CallToolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.CallToolResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("CallTool"))
              .build();
        }
      }
    }
    return getCallToolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.CompleteRequest,
      com.mcp.server.v1.CompleteResult> getCompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Complete",
      requestType = com.mcp.client.v1.CompleteRequest.class,
      responseType = com.mcp.server.v1.CompleteResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.CompleteRequest,
      com.mcp.server.v1.CompleteResult> getCompleteMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.CompleteRequest, com.mcp.server.v1.CompleteResult> getCompleteMethod;
    if ((getCompleteMethod = ServerServiceGrpc.getCompleteMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getCompleteMethod = ServerServiceGrpc.getCompleteMethod) == null) {
          ServerServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.CompleteRequest, com.mcp.server.v1.CompleteResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.CompleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.CompleteResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Complete"))
              .build();
        }
      }
    }
    return getCompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.GetPromptRequest,
      com.mcp.server.v1.GetPromptResult> getGetPromptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrompt",
      requestType = com.mcp.client.v1.GetPromptRequest.class,
      responseType = com.mcp.server.v1.GetPromptResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.GetPromptRequest,
      com.mcp.server.v1.GetPromptResult> getGetPromptMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.GetPromptRequest, com.mcp.server.v1.GetPromptResult> getGetPromptMethod;
    if ((getGetPromptMethod = ServerServiceGrpc.getGetPromptMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getGetPromptMethod = ServerServiceGrpc.getGetPromptMethod) == null) {
          ServerServiceGrpc.getGetPromptMethod = getGetPromptMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.GetPromptRequest, com.mcp.server.v1.GetPromptResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrompt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.GetPromptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.GetPromptResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("GetPrompt"))
              .build();
        }
      }
    }
    return getGetPromptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.InitializeRequest,
      com.mcp.server.v1.InitializeResult> getInitializeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Initialize",
      requestType = com.mcp.client.v1.InitializeRequest.class,
      responseType = com.mcp.server.v1.InitializeResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.InitializeRequest,
      com.mcp.server.v1.InitializeResult> getInitializeMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.InitializeRequest, com.mcp.server.v1.InitializeResult> getInitializeMethod;
    if ((getInitializeMethod = ServerServiceGrpc.getInitializeMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getInitializeMethod = ServerServiceGrpc.getInitializeMethod) == null) {
          ServerServiceGrpc.getInitializeMethod = getInitializeMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.InitializeRequest, com.mcp.server.v1.InitializeResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Initialize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.InitializeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.InitializeResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Initialize"))
              .build();
        }
      }
    }
    return getInitializeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.ListPromptsRequest,
      com.mcp.server.v1.ListPromptsResult> getListPromptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPrompts",
      requestType = com.mcp.client.v1.ListPromptsRequest.class,
      responseType = com.mcp.server.v1.ListPromptsResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.ListPromptsRequest,
      com.mcp.server.v1.ListPromptsResult> getListPromptsMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.ListPromptsRequest, com.mcp.server.v1.ListPromptsResult> getListPromptsMethod;
    if ((getListPromptsMethod = ServerServiceGrpc.getListPromptsMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListPromptsMethod = ServerServiceGrpc.getListPromptsMethod) == null) {
          ServerServiceGrpc.getListPromptsMethod = getListPromptsMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.ListPromptsRequest, com.mcp.server.v1.ListPromptsResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPrompts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.ListPromptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.ListPromptsResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ListPrompts"))
              .build();
        }
      }
    }
    return getListPromptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.ListResourcesRequest,
      com.mcp.server.v1.ListResourcesResult> getListResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResources",
      requestType = com.mcp.client.v1.ListResourcesRequest.class,
      responseType = com.mcp.server.v1.ListResourcesResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.ListResourcesRequest,
      com.mcp.server.v1.ListResourcesResult> getListResourcesMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.ListResourcesRequest, com.mcp.server.v1.ListResourcesResult> getListResourcesMethod;
    if ((getListResourcesMethod = ServerServiceGrpc.getListResourcesMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListResourcesMethod = ServerServiceGrpc.getListResourcesMethod) == null) {
          ServerServiceGrpc.getListResourcesMethod = getListResourcesMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.ListResourcesRequest, com.mcp.server.v1.ListResourcesResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.ListResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.ListResourcesResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ListResources"))
              .build();
        }
      }
    }
    return getListResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.ListResourceTemplatesRequest,
      com.mcp.server.v1.ListResourceTemplatesResult> getListResourceTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResourceTemplates",
      requestType = com.mcp.client.v1.ListResourceTemplatesRequest.class,
      responseType = com.mcp.server.v1.ListResourceTemplatesResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.ListResourceTemplatesRequest,
      com.mcp.server.v1.ListResourceTemplatesResult> getListResourceTemplatesMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.ListResourceTemplatesRequest, com.mcp.server.v1.ListResourceTemplatesResult> getListResourceTemplatesMethod;
    if ((getListResourceTemplatesMethod = ServerServiceGrpc.getListResourceTemplatesMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListResourceTemplatesMethod = ServerServiceGrpc.getListResourceTemplatesMethod) == null) {
          ServerServiceGrpc.getListResourceTemplatesMethod = getListResourceTemplatesMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.ListResourceTemplatesRequest, com.mcp.server.v1.ListResourceTemplatesResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResourceTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.ListResourceTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.ListResourceTemplatesResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ListResourceTemplates"))
              .build();
        }
      }
    }
    return getListResourceTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.ListToolsRequest,
      com.mcp.server.v1.ListToolsResult> getListToolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTools",
      requestType = com.mcp.client.v1.ListToolsRequest.class,
      responseType = com.mcp.server.v1.ListToolsResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.ListToolsRequest,
      com.mcp.server.v1.ListToolsResult> getListToolsMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.ListToolsRequest, com.mcp.server.v1.ListToolsResult> getListToolsMethod;
    if ((getListToolsMethod = ServerServiceGrpc.getListToolsMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListToolsMethod = ServerServiceGrpc.getListToolsMethod) == null) {
          ServerServiceGrpc.getListToolsMethod = getListToolsMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.ListToolsRequest, com.mcp.server.v1.ListToolsResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.ListToolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.ListToolsResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ListTools"))
              .build();
        }
      }
    }
    return getListToolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.PingRequest,
      com.google.protobuf.Empty> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.mcp.client.v1.PingRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.PingRequest,
      com.google.protobuf.Empty> getPingMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.PingRequest, com.google.protobuf.Empty> getPingMethod;
    if ((getPingMethod = ServerServiceGrpc.getPingMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getPingMethod = ServerServiceGrpc.getPingMethod) == null) {
          ServerServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.PingRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.ReadResourceRequest,
      com.mcp.server.v1.ReadResourceResult> getReadResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadResource",
      requestType = com.mcp.client.v1.ReadResourceRequest.class,
      responseType = com.mcp.server.v1.ReadResourceResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.ReadResourceRequest,
      com.mcp.server.v1.ReadResourceResult> getReadResourceMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.ReadResourceRequest, com.mcp.server.v1.ReadResourceResult> getReadResourceMethod;
    if ((getReadResourceMethod = ServerServiceGrpc.getReadResourceMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getReadResourceMethod = ServerServiceGrpc.getReadResourceMethod) == null) {
          ServerServiceGrpc.getReadResourceMethod = getReadResourceMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.ReadResourceRequest, com.mcp.server.v1.ReadResourceResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.ReadResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.ReadResourceResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ReadResource"))
              .build();
        }
      }
    }
    return getReadResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.SetLevelRequest,
      com.google.protobuf.Empty> getSetLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLevel",
      requestType = com.mcp.client.v1.SetLevelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.SetLevelRequest,
      com.google.protobuf.Empty> getSetLevelMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.SetLevelRequest, com.google.protobuf.Empty> getSetLevelMethod;
    if ((getSetLevelMethod = ServerServiceGrpc.getSetLevelMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getSetLevelMethod = ServerServiceGrpc.getSetLevelMethod) == null) {
          ServerServiceGrpc.getSetLevelMethod = getSetLevelMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.SetLevelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.SetLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("SetLevel"))
              .build();
        }
      }
    }
    return getSetLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.SubscribeRequest,
      com.google.protobuf.Empty> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = com.mcp.client.v1.SubscribeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.SubscribeRequest,
      com.google.protobuf.Empty> getSubscribeMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.SubscribeRequest, com.google.protobuf.Empty> getSubscribeMethod;
    if ((getSubscribeMethod = ServerServiceGrpc.getSubscribeMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getSubscribeMethod = ServerServiceGrpc.getSubscribeMethod) == null) {
          ServerServiceGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.SubscribeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.client.v1.UnsubscribeRequest,
      com.google.protobuf.Empty> getUnsubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unsubscribe",
      requestType = com.mcp.client.v1.UnsubscribeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.client.v1.UnsubscribeRequest,
      com.google.protobuf.Empty> getUnsubscribeMethod() {
    io.grpc.MethodDescriptor<com.mcp.client.v1.UnsubscribeRequest, com.google.protobuf.Empty> getUnsubscribeMethod;
    if ((getUnsubscribeMethod = ServerServiceGrpc.getUnsubscribeMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getUnsubscribeMethod = ServerServiceGrpc.getUnsubscribeMethod) == null) {
          ServerServiceGrpc.getUnsubscribeMethod = getUnsubscribeMethod =
              io.grpc.MethodDescriptor.<com.mcp.client.v1.UnsubscribeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unsubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.client.v1.UnsubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Unsubscribe"))
              .build();
        }
      }
    }
    return getUnsubscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerServiceStub>() {
        @java.lang.Override
        public ServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerServiceStub(channel, callOptions);
        }
      };
    return ServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ServerServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerServiceBlockingV2Stub>() {
        @java.lang.Override
        public ServerServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ServerServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerServiceBlockingStub>() {
        @java.lang.Override
        public ServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerServiceBlockingStub(channel, callOptions);
        }
      };
    return ServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerServiceFutureStub>() {
        @java.lang.Override
        public ServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerServiceFutureStub(channel, callOptions);
        }
      };
    return ServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service describing available methods exposed by an MCP server.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Invoke a tool by name.
     * </pre>
     */
    default void callTool(com.mcp.client.v1.CallToolRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.CallToolResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallToolMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    default void complete(com.mcp.client.v1.CompleteRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.CompleteResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    default void getPrompt(com.mcp.client.v1.GetPromptRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.GetPromptResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPromptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    default void initialize(com.mcp.client.v1.InitializeRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.InitializeResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    default void listPrompts(com.mcp.client.v1.ListPromptsRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ListPromptsResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPromptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    default void listResources(com.mcp.client.v1.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ListResourcesResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    default void listResourceTemplates(com.mcp.client.v1.ListResourceTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ListResourceTemplatesResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourceTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    default void listTools(com.mcp.client.v1.ListToolsRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ListToolsResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListToolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    default void ping(com.mcp.client.v1.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    default void readResource(com.mcp.client.v1.ReadResourceRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ReadResourceResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    default void setLevel(com.mcp.client.v1.SetLevelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetLevelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    default void subscribe(com.mcp.client.v1.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    default void unsubscribe(com.mcp.client.v1.UnsubscribeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnsubscribeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServerService.
   * <pre>
   * Service describing available methods exposed by an MCP server.
   * </pre>
   */
  public static abstract class ServerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServerService.
   * <pre>
   * Service describing available methods exposed by an MCP server.
   * </pre>
   */
  public static final class ServerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServerServiceStub> {
    private ServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Invoke a tool by name.
     * </pre>
     */
    public void callTool(com.mcp.client.v1.CallToolRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.CallToolResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallToolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    public void complete(com.mcp.client.v1.CompleteRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.CompleteResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    public void getPrompt(com.mcp.client.v1.GetPromptRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.GetPromptResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPromptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    public void initialize(com.mcp.client.v1.InitializeRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.InitializeResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    public void listPrompts(com.mcp.client.v1.ListPromptsRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ListPromptsResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPromptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    public void listResources(com.mcp.client.v1.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ListResourcesResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    public void listResourceTemplates(com.mcp.client.v1.ListResourceTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ListResourceTemplatesResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResourceTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    public void listTools(com.mcp.client.v1.ListToolsRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ListToolsResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListToolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public void ping(com.mcp.client.v1.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    public void readResource(com.mcp.client.v1.ReadResourceRequest request,
        io.grpc.stub.StreamObserver<com.mcp.server.v1.ReadResourceResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    public void setLevel(com.mcp.client.v1.SetLevelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    public void subscribe(com.mcp.client.v1.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    public void unsubscribe(com.mcp.client.v1.UnsubscribeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsubscribeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServerService.
   * <pre>
   * Service describing available methods exposed by an MCP server.
   * </pre>
   */
  public static final class ServerServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ServerServiceBlockingV2Stub> {
    private ServerServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Invoke a tool by name.
     * </pre>
     */
    public com.mcp.server.v1.CallToolResult callTool(com.mcp.client.v1.CallToolRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCallToolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    public com.mcp.server.v1.CompleteResult complete(com.mcp.client.v1.CompleteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCompleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    public com.mcp.server.v1.GetPromptResult getPrompt(com.mcp.client.v1.GetPromptRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    public com.mcp.server.v1.InitializeResult initialize(com.mcp.client.v1.InitializeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getInitializeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    public com.mcp.server.v1.ListPromptsResult listPrompts(com.mcp.client.v1.ListPromptsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListPromptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    public com.mcp.server.v1.ListResourcesResult listResources(com.mcp.client.v1.ListResourcesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    public com.mcp.server.v1.ListResourceTemplatesResult listResourceTemplates(com.mcp.client.v1.ListResourceTemplatesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListResourceTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    public com.mcp.server.v1.ListToolsResult listTools(com.mcp.client.v1.ListToolsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListToolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public com.google.protobuf.Empty ping(com.mcp.client.v1.PingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    public com.mcp.server.v1.ReadResourceResult readResource(com.mcp.client.v1.ReadResourceRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReadResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    public com.google.protobuf.Empty setLevel(com.mcp.client.v1.SetLevelRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetLevelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    public com.google.protobuf.Empty subscribe(com.mcp.client.v1.SubscribeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    public com.google.protobuf.Empty unsubscribe(com.mcp.client.v1.UnsubscribeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUnsubscribeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ServerService.
   * <pre>
   * Service describing available methods exposed by an MCP server.
   * </pre>
   */
  public static final class ServerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServerServiceBlockingStub> {
    private ServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Invoke a tool by name.
     * </pre>
     */
    public com.mcp.server.v1.CallToolResult callTool(com.mcp.client.v1.CallToolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallToolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    public com.mcp.server.v1.CompleteResult complete(com.mcp.client.v1.CompleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    public com.mcp.server.v1.GetPromptResult getPrompt(com.mcp.client.v1.GetPromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    public com.mcp.server.v1.InitializeResult initialize(com.mcp.client.v1.InitializeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    public com.mcp.server.v1.ListPromptsResult listPrompts(com.mcp.client.v1.ListPromptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPromptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    public com.mcp.server.v1.ListResourcesResult listResources(com.mcp.client.v1.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    public com.mcp.server.v1.ListResourceTemplatesResult listResourceTemplates(com.mcp.client.v1.ListResourceTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResourceTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    public com.mcp.server.v1.ListToolsResult listTools(com.mcp.client.v1.ListToolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListToolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public com.google.protobuf.Empty ping(com.mcp.client.v1.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    public com.mcp.server.v1.ReadResourceResult readResource(com.mcp.client.v1.ReadResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    public com.google.protobuf.Empty setLevel(com.mcp.client.v1.SetLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetLevelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    public com.google.protobuf.Empty subscribe(com.mcp.client.v1.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    public com.google.protobuf.Empty unsubscribe(com.mcp.client.v1.UnsubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsubscribeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServerService.
   * <pre>
   * Service describing available methods exposed by an MCP server.
   * </pre>
   */
  public static final class ServerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServerServiceFutureStub> {
    private ServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Invoke a tool by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcp.server.v1.CallToolResult> callTool(
        com.mcp.client.v1.CallToolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallToolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcp.server.v1.CompleteResult> complete(
        com.mcp.client.v1.CompleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcp.server.v1.GetPromptResult> getPrompt(
        com.mcp.client.v1.GetPromptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPromptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcp.server.v1.InitializeResult> initialize(
        com.mcp.client.v1.InitializeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcp.server.v1.ListPromptsResult> listPrompts(
        com.mcp.client.v1.ListPromptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPromptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcp.server.v1.ListResourcesResult> listResources(
        com.mcp.client.v1.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcp.server.v1.ListResourceTemplatesResult> listResourceTemplates(
        com.mcp.client.v1.ListResourceTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResourceTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcp.server.v1.ListToolsResult> listTools(
        com.mcp.client.v1.ListToolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListToolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> ping(
        com.mcp.client.v1.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcp.server.v1.ReadResourceResult> readResource(
        com.mcp.client.v1.ReadResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setLevel(
        com.mcp.client.v1.SetLevelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetLevelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> subscribe(
        com.mcp.client.v1.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unsubscribe(
        com.mcp.client.v1.UnsubscribeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsubscribeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALL_TOOL = 0;
  private static final int METHODID_COMPLETE = 1;
  private static final int METHODID_GET_PROMPT = 2;
  private static final int METHODID_INITIALIZE = 3;
  private static final int METHODID_LIST_PROMPTS = 4;
  private static final int METHODID_LIST_RESOURCES = 5;
  private static final int METHODID_LIST_RESOURCE_TEMPLATES = 6;
  private static final int METHODID_LIST_TOOLS = 7;
  private static final int METHODID_PING = 8;
  private static final int METHODID_READ_RESOURCE = 9;
  private static final int METHODID_SET_LEVEL = 10;
  private static final int METHODID_SUBSCRIBE = 11;
  private static final int METHODID_UNSUBSCRIBE = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALL_TOOL:
          serviceImpl.callTool((com.mcp.client.v1.CallToolRequest) request,
              (io.grpc.stub.StreamObserver<com.mcp.server.v1.CallToolResult>) responseObserver);
          break;
        case METHODID_COMPLETE:
          serviceImpl.complete((com.mcp.client.v1.CompleteRequest) request,
              (io.grpc.stub.StreamObserver<com.mcp.server.v1.CompleteResult>) responseObserver);
          break;
        case METHODID_GET_PROMPT:
          serviceImpl.getPrompt((com.mcp.client.v1.GetPromptRequest) request,
              (io.grpc.stub.StreamObserver<com.mcp.server.v1.GetPromptResult>) responseObserver);
          break;
        case METHODID_INITIALIZE:
          serviceImpl.initialize((com.mcp.client.v1.InitializeRequest) request,
              (io.grpc.stub.StreamObserver<com.mcp.server.v1.InitializeResult>) responseObserver);
          break;
        case METHODID_LIST_PROMPTS:
          serviceImpl.listPrompts((com.mcp.client.v1.ListPromptsRequest) request,
              (io.grpc.stub.StreamObserver<com.mcp.server.v1.ListPromptsResult>) responseObserver);
          break;
        case METHODID_LIST_RESOURCES:
          serviceImpl.listResources((com.mcp.client.v1.ListResourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.mcp.server.v1.ListResourcesResult>) responseObserver);
          break;
        case METHODID_LIST_RESOURCE_TEMPLATES:
          serviceImpl.listResourceTemplates((com.mcp.client.v1.ListResourceTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.mcp.server.v1.ListResourceTemplatesResult>) responseObserver);
          break;
        case METHODID_LIST_TOOLS:
          serviceImpl.listTools((com.mcp.client.v1.ListToolsRequest) request,
              (io.grpc.stub.StreamObserver<com.mcp.server.v1.ListToolsResult>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((com.mcp.client.v1.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_READ_RESOURCE:
          serviceImpl.readResource((com.mcp.client.v1.ReadResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.mcp.server.v1.ReadResourceResult>) responseObserver);
          break;
        case METHODID_SET_LEVEL:
          serviceImpl.setLevel((com.mcp.client.v1.SetLevelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((com.mcp.client.v1.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNSUBSCRIBE:
          serviceImpl.unsubscribe((com.mcp.client.v1.UnsubscribeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCallToolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.CallToolRequest,
              com.mcp.server.v1.CallToolResult>(
                service, METHODID_CALL_TOOL)))
        .addMethod(
          getCompleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.CompleteRequest,
              com.mcp.server.v1.CompleteResult>(
                service, METHODID_COMPLETE)))
        .addMethod(
          getGetPromptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.GetPromptRequest,
              com.mcp.server.v1.GetPromptResult>(
                service, METHODID_GET_PROMPT)))
        .addMethod(
          getInitializeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.InitializeRequest,
              com.mcp.server.v1.InitializeResult>(
                service, METHODID_INITIALIZE)))
        .addMethod(
          getListPromptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.ListPromptsRequest,
              com.mcp.server.v1.ListPromptsResult>(
                service, METHODID_LIST_PROMPTS)))
        .addMethod(
          getListResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.ListResourcesRequest,
              com.mcp.server.v1.ListResourcesResult>(
                service, METHODID_LIST_RESOURCES)))
        .addMethod(
          getListResourceTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.ListResourceTemplatesRequest,
              com.mcp.server.v1.ListResourceTemplatesResult>(
                service, METHODID_LIST_RESOURCE_TEMPLATES)))
        .addMethod(
          getListToolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.ListToolsRequest,
              com.mcp.server.v1.ListToolsResult>(
                service, METHODID_LIST_TOOLS)))
        .addMethod(
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.PingRequest,
              com.google.protobuf.Empty>(
                service, METHODID_PING)))
        .addMethod(
          getReadResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.ReadResourceRequest,
              com.mcp.server.v1.ReadResourceResult>(
                service, METHODID_READ_RESOURCE)))
        .addMethod(
          getSetLevelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.SetLevelRequest,
              com.google.protobuf.Empty>(
                service, METHODID_SET_LEVEL)))
        .addMethod(
          getSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.SubscribeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_SUBSCRIBE)))
        .addMethod(
          getUnsubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.client.v1.UnsubscribeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UNSUBSCRIBE)))
        .build();
  }

  private static abstract class ServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.mcp.api.resources.ServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerService");
    }
  }

  private static final class ServerServiceFileDescriptorSupplier
      extends ServerServiceBaseDescriptorSupplier {
    ServerServiceFileDescriptorSupplier() {}
  }

  private static final class ServerServiceMethodDescriptorSupplier
      extends ServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServerServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerServiceFileDescriptorSupplier())
              .addMethod(getCallToolMethod())
              .addMethod(getCompleteMethod())
              .addMethod(getGetPromptMethod())
              .addMethod(getInitializeMethod())
              .addMethod(getListPromptsMethod())
              .addMethod(getListResourcesMethod())
              .addMethod(getListResourceTemplatesMethod())
              .addMethod(getListToolsMethod())
              .addMethod(getPingMethod())
              .addMethod(getReadResourceMethod())
              .addMethod(getSetLevelMethod())
              .addMethod(getSubscribeMethod())
              .addMethod(getUnsubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
