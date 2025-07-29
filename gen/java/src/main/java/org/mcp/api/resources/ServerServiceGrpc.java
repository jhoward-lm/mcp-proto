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
  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.CallToolRequest,
      org.mcp.server.resources.CallToolResult> getCallToolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallTool",
      requestType = org.mcp.client.resources.CallToolRequest.class,
      responseType = org.mcp.server.resources.CallToolResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.CallToolRequest,
      org.mcp.server.resources.CallToolResult> getCallToolMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.CallToolRequest, org.mcp.server.resources.CallToolResult> getCallToolMethod;
    if ((getCallToolMethod = ServerServiceGrpc.getCallToolMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getCallToolMethod = ServerServiceGrpc.getCallToolMethod) == null) {
          ServerServiceGrpc.getCallToolMethod = getCallToolMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.CallToolRequest, org.mcp.server.resources.CallToolResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallTool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.CallToolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.CallToolResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("CallTool"))
              .build();
        }
      }
    }
    return getCallToolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.CompleteRequest,
      org.mcp.server.resources.CompleteResult> getCompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Complete",
      requestType = org.mcp.client.resources.CompleteRequest.class,
      responseType = org.mcp.server.resources.CompleteResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.CompleteRequest,
      org.mcp.server.resources.CompleteResult> getCompleteMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.CompleteRequest, org.mcp.server.resources.CompleteResult> getCompleteMethod;
    if ((getCompleteMethod = ServerServiceGrpc.getCompleteMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getCompleteMethod = ServerServiceGrpc.getCompleteMethod) == null) {
          ServerServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.CompleteRequest, org.mcp.server.resources.CompleteResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.CompleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.CompleteResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Complete"))
              .build();
        }
      }
    }
    return getCompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.GetPromptRequest,
      org.mcp.server.resources.GetPromptResult> getGetPromptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrompt",
      requestType = org.mcp.client.resources.GetPromptRequest.class,
      responseType = org.mcp.server.resources.GetPromptResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.GetPromptRequest,
      org.mcp.server.resources.GetPromptResult> getGetPromptMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.GetPromptRequest, org.mcp.server.resources.GetPromptResult> getGetPromptMethod;
    if ((getGetPromptMethod = ServerServiceGrpc.getGetPromptMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getGetPromptMethod = ServerServiceGrpc.getGetPromptMethod) == null) {
          ServerServiceGrpc.getGetPromptMethod = getGetPromptMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.GetPromptRequest, org.mcp.server.resources.GetPromptResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrompt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.GetPromptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.GetPromptResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("GetPrompt"))
              .build();
        }
      }
    }
    return getGetPromptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.InitializeRequest,
      org.mcp.server.resources.InitializeResult> getInitializeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Initialize",
      requestType = org.mcp.client.resources.InitializeRequest.class,
      responseType = org.mcp.server.resources.InitializeResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.InitializeRequest,
      org.mcp.server.resources.InitializeResult> getInitializeMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.InitializeRequest, org.mcp.server.resources.InitializeResult> getInitializeMethod;
    if ((getInitializeMethod = ServerServiceGrpc.getInitializeMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getInitializeMethod = ServerServiceGrpc.getInitializeMethod) == null) {
          ServerServiceGrpc.getInitializeMethod = getInitializeMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.InitializeRequest, org.mcp.server.resources.InitializeResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Initialize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.InitializeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.InitializeResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Initialize"))
              .build();
        }
      }
    }
    return getInitializeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.ListPromptsRequest,
      org.mcp.server.resources.ListPromptsResult> getListPromptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPrompts",
      requestType = org.mcp.client.resources.ListPromptsRequest.class,
      responseType = org.mcp.server.resources.ListPromptsResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.ListPromptsRequest,
      org.mcp.server.resources.ListPromptsResult> getListPromptsMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.ListPromptsRequest, org.mcp.server.resources.ListPromptsResult> getListPromptsMethod;
    if ((getListPromptsMethod = ServerServiceGrpc.getListPromptsMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListPromptsMethod = ServerServiceGrpc.getListPromptsMethod) == null) {
          ServerServiceGrpc.getListPromptsMethod = getListPromptsMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.ListPromptsRequest, org.mcp.server.resources.ListPromptsResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPrompts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.ListPromptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.ListPromptsResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ListPrompts"))
              .build();
        }
      }
    }
    return getListPromptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.ListResourcesRequest,
      org.mcp.server.resources.ListResourcesResult> getListResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResources",
      requestType = org.mcp.client.resources.ListResourcesRequest.class,
      responseType = org.mcp.server.resources.ListResourcesResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.ListResourcesRequest,
      org.mcp.server.resources.ListResourcesResult> getListResourcesMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.ListResourcesRequest, org.mcp.server.resources.ListResourcesResult> getListResourcesMethod;
    if ((getListResourcesMethod = ServerServiceGrpc.getListResourcesMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListResourcesMethod = ServerServiceGrpc.getListResourcesMethod) == null) {
          ServerServiceGrpc.getListResourcesMethod = getListResourcesMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.ListResourcesRequest, org.mcp.server.resources.ListResourcesResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.ListResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.ListResourcesResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ListResources"))
              .build();
        }
      }
    }
    return getListResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.ListResourceTemplatesRequest,
      org.mcp.server.resources.ListResourceTemplatesResult> getListResourceTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResourceTemplates",
      requestType = org.mcp.client.resources.ListResourceTemplatesRequest.class,
      responseType = org.mcp.server.resources.ListResourceTemplatesResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.ListResourceTemplatesRequest,
      org.mcp.server.resources.ListResourceTemplatesResult> getListResourceTemplatesMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.ListResourceTemplatesRequest, org.mcp.server.resources.ListResourceTemplatesResult> getListResourceTemplatesMethod;
    if ((getListResourceTemplatesMethod = ServerServiceGrpc.getListResourceTemplatesMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListResourceTemplatesMethod = ServerServiceGrpc.getListResourceTemplatesMethod) == null) {
          ServerServiceGrpc.getListResourceTemplatesMethod = getListResourceTemplatesMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.ListResourceTemplatesRequest, org.mcp.server.resources.ListResourceTemplatesResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResourceTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.ListResourceTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.ListResourceTemplatesResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ListResourceTemplates"))
              .build();
        }
      }
    }
    return getListResourceTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.ListToolsRequest,
      org.mcp.server.resources.ListToolsResult> getListToolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTools",
      requestType = org.mcp.client.resources.ListToolsRequest.class,
      responseType = org.mcp.server.resources.ListToolsResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.ListToolsRequest,
      org.mcp.server.resources.ListToolsResult> getListToolsMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.ListToolsRequest, org.mcp.server.resources.ListToolsResult> getListToolsMethod;
    if ((getListToolsMethod = ServerServiceGrpc.getListToolsMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getListToolsMethod = ServerServiceGrpc.getListToolsMethod) == null) {
          ServerServiceGrpc.getListToolsMethod = getListToolsMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.ListToolsRequest, org.mcp.server.resources.ListToolsResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.ListToolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.ListToolsResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ListTools"))
              .build();
        }
      }
    }
    return getListToolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.PingRequest,
      com.google.protobuf.Empty> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = org.mcp.client.resources.PingRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.PingRequest,
      com.google.protobuf.Empty> getPingMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.PingRequest, com.google.protobuf.Empty> getPingMethod;
    if ((getPingMethod = ServerServiceGrpc.getPingMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getPingMethod = ServerServiceGrpc.getPingMethod) == null) {
          ServerServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.PingRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.ReadResourceRequest,
      org.mcp.server.resources.ReadResourceResult> getReadResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadResource",
      requestType = org.mcp.client.resources.ReadResourceRequest.class,
      responseType = org.mcp.server.resources.ReadResourceResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.ReadResourceRequest,
      org.mcp.server.resources.ReadResourceResult> getReadResourceMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.ReadResourceRequest, org.mcp.server.resources.ReadResourceResult> getReadResourceMethod;
    if ((getReadResourceMethod = ServerServiceGrpc.getReadResourceMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getReadResourceMethod = ServerServiceGrpc.getReadResourceMethod) == null) {
          ServerServiceGrpc.getReadResourceMethod = getReadResourceMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.ReadResourceRequest, org.mcp.server.resources.ReadResourceResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.ReadResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.ReadResourceResult.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("ReadResource"))
              .build();
        }
      }
    }
    return getReadResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.SetLevelRequest,
      com.google.protobuf.Empty> getSetLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLevel",
      requestType = org.mcp.client.resources.SetLevelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.SetLevelRequest,
      com.google.protobuf.Empty> getSetLevelMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.SetLevelRequest, com.google.protobuf.Empty> getSetLevelMethod;
    if ((getSetLevelMethod = ServerServiceGrpc.getSetLevelMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getSetLevelMethod = ServerServiceGrpc.getSetLevelMethod) == null) {
          ServerServiceGrpc.getSetLevelMethod = getSetLevelMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.SetLevelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.SetLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("SetLevel"))
              .build();
        }
      }
    }
    return getSetLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.SubscribeRequest,
      com.google.protobuf.Empty> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = org.mcp.client.resources.SubscribeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.SubscribeRequest,
      com.google.protobuf.Empty> getSubscribeMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.SubscribeRequest, com.google.protobuf.Empty> getSubscribeMethod;
    if ((getSubscribeMethod = ServerServiceGrpc.getSubscribeMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getSubscribeMethod = ServerServiceGrpc.getSubscribeMethod) == null) {
          ServerServiceGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.SubscribeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerServiceMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.UnsubscribeRequest,
      com.google.protobuf.Empty> getUnsubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unsubscribe",
      requestType = org.mcp.client.resources.UnsubscribeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.UnsubscribeRequest,
      com.google.protobuf.Empty> getUnsubscribeMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.UnsubscribeRequest, com.google.protobuf.Empty> getUnsubscribeMethod;
    if ((getUnsubscribeMethod = ServerServiceGrpc.getUnsubscribeMethod) == null) {
      synchronized (ServerServiceGrpc.class) {
        if ((getUnsubscribeMethod = ServerServiceGrpc.getUnsubscribeMethod) == null) {
          ServerServiceGrpc.getUnsubscribeMethod = getUnsubscribeMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.UnsubscribeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unsubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.UnsubscribeRequest.getDefaultInstance()))
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
    default void callTool(org.mcp.client.resources.CallToolRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.CallToolResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallToolMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    default void complete(org.mcp.client.resources.CompleteRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.CompleteResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    default void getPrompt(org.mcp.client.resources.GetPromptRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.GetPromptResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPromptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    default void initialize(org.mcp.client.resources.InitializeRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.InitializeResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    default void listPrompts(org.mcp.client.resources.ListPromptsRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ListPromptsResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPromptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    default void listResources(org.mcp.client.resources.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ListResourcesResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    default void listResourceTemplates(org.mcp.client.resources.ListResourceTemplatesRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ListResourceTemplatesResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourceTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    default void listTools(org.mcp.client.resources.ListToolsRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ListToolsResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListToolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    default void ping(org.mcp.client.resources.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    default void readResource(org.mcp.client.resources.ReadResourceRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ReadResourceResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    default void setLevel(org.mcp.client.resources.SetLevelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetLevelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    default void subscribe(org.mcp.client.resources.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    default void unsubscribe(org.mcp.client.resources.UnsubscribeRequest request,
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
    public void callTool(org.mcp.client.resources.CallToolRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.CallToolResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallToolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    public void complete(org.mcp.client.resources.CompleteRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.CompleteResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    public void getPrompt(org.mcp.client.resources.GetPromptRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.GetPromptResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPromptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    public void initialize(org.mcp.client.resources.InitializeRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.InitializeResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    public void listPrompts(org.mcp.client.resources.ListPromptsRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ListPromptsResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPromptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    public void listResources(org.mcp.client.resources.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ListResourcesResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    public void listResourceTemplates(org.mcp.client.resources.ListResourceTemplatesRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ListResourceTemplatesResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResourceTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    public void listTools(org.mcp.client.resources.ListToolsRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ListToolsResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListToolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public void ping(org.mcp.client.resources.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    public void readResource(org.mcp.client.resources.ReadResourceRequest request,
        io.grpc.stub.StreamObserver<org.mcp.server.resources.ReadResourceResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    public void setLevel(org.mcp.client.resources.SetLevelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    public void subscribe(org.mcp.client.resources.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    public void unsubscribe(org.mcp.client.resources.UnsubscribeRequest request,
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
    public org.mcp.server.resources.CallToolResult callTool(org.mcp.client.resources.CallToolRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCallToolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    public org.mcp.server.resources.CompleteResult complete(org.mcp.client.resources.CompleteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCompleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    public org.mcp.server.resources.GetPromptResult getPrompt(org.mcp.client.resources.GetPromptRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    public org.mcp.server.resources.InitializeResult initialize(org.mcp.client.resources.InitializeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getInitializeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    public org.mcp.server.resources.ListPromptsResult listPrompts(org.mcp.client.resources.ListPromptsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListPromptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    public org.mcp.server.resources.ListResourcesResult listResources(org.mcp.client.resources.ListResourcesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    public org.mcp.server.resources.ListResourceTemplatesResult listResourceTemplates(org.mcp.client.resources.ListResourceTemplatesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListResourceTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    public org.mcp.server.resources.ListToolsResult listTools(org.mcp.client.resources.ListToolsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListToolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public com.google.protobuf.Empty ping(org.mcp.client.resources.PingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    public org.mcp.server.resources.ReadResourceResult readResource(org.mcp.client.resources.ReadResourceRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReadResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    public com.google.protobuf.Empty setLevel(org.mcp.client.resources.SetLevelRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetLevelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    public com.google.protobuf.Empty subscribe(org.mcp.client.resources.SubscribeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    public com.google.protobuf.Empty unsubscribe(org.mcp.client.resources.UnsubscribeRequest request) throws io.grpc.StatusException {
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
    public org.mcp.server.resources.CallToolResult callTool(org.mcp.client.resources.CallToolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallToolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    public org.mcp.server.resources.CompleteResult complete(org.mcp.client.resources.CompleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    public org.mcp.server.resources.GetPromptResult getPrompt(org.mcp.client.resources.GetPromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    public org.mcp.server.resources.InitializeResult initialize(org.mcp.client.resources.InitializeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    public org.mcp.server.resources.ListPromptsResult listPrompts(org.mcp.client.resources.ListPromptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPromptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    public org.mcp.server.resources.ListResourcesResult listResources(org.mcp.client.resources.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    public org.mcp.server.resources.ListResourceTemplatesResult listResourceTemplates(org.mcp.client.resources.ListResourceTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResourceTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    public org.mcp.server.resources.ListToolsResult listTools(org.mcp.client.resources.ListToolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListToolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public com.google.protobuf.Empty ping(org.mcp.client.resources.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    public org.mcp.server.resources.ReadResourceResult readResource(org.mcp.client.resources.ReadResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    public com.google.protobuf.Empty setLevel(org.mcp.client.resources.SetLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetLevelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    public com.google.protobuf.Empty subscribe(org.mcp.client.resources.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    public com.google.protobuf.Empty unsubscribe(org.mcp.client.resources.UnsubscribeRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.server.resources.CallToolResult> callTool(
        org.mcp.client.resources.CallToolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallToolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ask for completion options.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.server.resources.CompleteResult> complete(
        org.mcp.client.resources.CompleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a single prompt by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.server.resources.GetPromptResult> getPrompt(
        org.mcp.client.resources.GetPromptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPromptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initiate the connection with the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.server.resources.InitializeResult> initialize(
        org.mcp.client.resources.InitializeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available prompts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.server.resources.ListPromptsResult> listPrompts(
        org.mcp.client.resources.ListPromptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPromptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available resources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.server.resources.ListResourcesResult> listResources(
        org.mcp.client.resources.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available resource templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.server.resources.ListResourceTemplatesResult> listResourceTemplates(
        org.mcp.client.resources.ListResourceTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResourceTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available tools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.server.resources.ListToolsResult> listTools(
        org.mcp.client.resources.ListToolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListToolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> ping(
        org.mcp.client.resources.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Read a specific resource by URI.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.server.resources.ReadResourceResult> readResource(
        org.mcp.client.resources.ReadResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the minimum log level for notifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setLevel(
        org.mcp.client.resources.SetLevelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetLevelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request resources/updated notifications for a resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> subscribe(
        org.mcp.client.resources.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request cancellation of resources/updated notifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unsubscribe(
        org.mcp.client.resources.UnsubscribeRequest request) {
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
          serviceImpl.callTool((org.mcp.client.resources.CallToolRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.server.resources.CallToolResult>) responseObserver);
          break;
        case METHODID_COMPLETE:
          serviceImpl.complete((org.mcp.client.resources.CompleteRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.server.resources.CompleteResult>) responseObserver);
          break;
        case METHODID_GET_PROMPT:
          serviceImpl.getPrompt((org.mcp.client.resources.GetPromptRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.server.resources.GetPromptResult>) responseObserver);
          break;
        case METHODID_INITIALIZE:
          serviceImpl.initialize((org.mcp.client.resources.InitializeRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.server.resources.InitializeResult>) responseObserver);
          break;
        case METHODID_LIST_PROMPTS:
          serviceImpl.listPrompts((org.mcp.client.resources.ListPromptsRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.server.resources.ListPromptsResult>) responseObserver);
          break;
        case METHODID_LIST_RESOURCES:
          serviceImpl.listResources((org.mcp.client.resources.ListResourcesRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.server.resources.ListResourcesResult>) responseObserver);
          break;
        case METHODID_LIST_RESOURCE_TEMPLATES:
          serviceImpl.listResourceTemplates((org.mcp.client.resources.ListResourceTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.server.resources.ListResourceTemplatesResult>) responseObserver);
          break;
        case METHODID_LIST_TOOLS:
          serviceImpl.listTools((org.mcp.client.resources.ListToolsRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.server.resources.ListToolsResult>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((org.mcp.client.resources.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_READ_RESOURCE:
          serviceImpl.readResource((org.mcp.client.resources.ReadResourceRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.server.resources.ReadResourceResult>) responseObserver);
          break;
        case METHODID_SET_LEVEL:
          serviceImpl.setLevel((org.mcp.client.resources.SetLevelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((org.mcp.client.resources.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNSUBSCRIBE:
          serviceImpl.unsubscribe((org.mcp.client.resources.UnsubscribeRequest) request,
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
              org.mcp.client.resources.CallToolRequest,
              org.mcp.server.resources.CallToolResult>(
                service, METHODID_CALL_TOOL)))
        .addMethod(
          getCompleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.CompleteRequest,
              org.mcp.server.resources.CompleteResult>(
                service, METHODID_COMPLETE)))
        .addMethod(
          getGetPromptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.GetPromptRequest,
              org.mcp.server.resources.GetPromptResult>(
                service, METHODID_GET_PROMPT)))
        .addMethod(
          getInitializeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.InitializeRequest,
              org.mcp.server.resources.InitializeResult>(
                service, METHODID_INITIALIZE)))
        .addMethod(
          getListPromptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.ListPromptsRequest,
              org.mcp.server.resources.ListPromptsResult>(
                service, METHODID_LIST_PROMPTS)))
        .addMethod(
          getListResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.ListResourcesRequest,
              org.mcp.server.resources.ListResourcesResult>(
                service, METHODID_LIST_RESOURCES)))
        .addMethod(
          getListResourceTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.ListResourceTemplatesRequest,
              org.mcp.server.resources.ListResourceTemplatesResult>(
                service, METHODID_LIST_RESOURCE_TEMPLATES)))
        .addMethod(
          getListToolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.ListToolsRequest,
              org.mcp.server.resources.ListToolsResult>(
                service, METHODID_LIST_TOOLS)))
        .addMethod(
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.PingRequest,
              com.google.protobuf.Empty>(
                service, METHODID_PING)))
        .addMethod(
          getReadResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.ReadResourceRequest,
              org.mcp.server.resources.ReadResourceResult>(
                service, METHODID_READ_RESOURCE)))
        .addMethod(
          getSetLevelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.SetLevelRequest,
              com.google.protobuf.Empty>(
                service, METHODID_SET_LEVEL)))
        .addMethod(
          getSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.SubscribeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_SUBSCRIBE)))
        .addMethod(
          getUnsubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.UnsubscribeRequest,
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
