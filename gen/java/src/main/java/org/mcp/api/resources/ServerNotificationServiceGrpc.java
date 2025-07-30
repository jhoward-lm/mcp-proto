package org.mcp.api.resources;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service describing notifications sent by the server.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ServerNotificationServiceGrpc {

  private ServerNotificationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mcp.api.v1.ServerNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mcp.server.v1.CancelledNotification,
      com.google.protobuf.Empty> getCancelledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancelled",
      requestType = com.mcp.server.v1.CancelledNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.server.v1.CancelledNotification,
      com.google.protobuf.Empty> getCancelledMethod() {
    io.grpc.MethodDescriptor<com.mcp.server.v1.CancelledNotification, com.google.protobuf.Empty> getCancelledMethod;
    if ((getCancelledMethod = ServerNotificationServiceGrpc.getCancelledMethod) == null) {
      synchronized (ServerNotificationServiceGrpc.class) {
        if ((getCancelledMethod = ServerNotificationServiceGrpc.getCancelledMethod) == null) {
          ServerNotificationServiceGrpc.getCancelledMethod = getCancelledMethod =
              io.grpc.MethodDescriptor.<com.mcp.server.v1.CancelledNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancelled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.CancelledNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerNotificationServiceMethodDescriptorSupplier("Cancelled"))
              .build();
        }
      }
    }
    return getCancelledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.server.v1.LoggingMessageNotification,
      com.google.protobuf.Empty> getMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Message",
      requestType = com.mcp.server.v1.LoggingMessageNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.server.v1.LoggingMessageNotification,
      com.google.protobuf.Empty> getMessageMethod() {
    io.grpc.MethodDescriptor<com.mcp.server.v1.LoggingMessageNotification, com.google.protobuf.Empty> getMessageMethod;
    if ((getMessageMethod = ServerNotificationServiceGrpc.getMessageMethod) == null) {
      synchronized (ServerNotificationServiceGrpc.class) {
        if ((getMessageMethod = ServerNotificationServiceGrpc.getMessageMethod) == null) {
          ServerNotificationServiceGrpc.getMessageMethod = getMessageMethod =
              io.grpc.MethodDescriptor.<com.mcp.server.v1.LoggingMessageNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Message"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.LoggingMessageNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerNotificationServiceMethodDescriptorSupplier("Message"))
              .build();
        }
      }
    }
    return getMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.server.v1.ProgressNotification,
      com.google.protobuf.Empty> getProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Progress",
      requestType = com.mcp.server.v1.ProgressNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.server.v1.ProgressNotification,
      com.google.protobuf.Empty> getProgressMethod() {
    io.grpc.MethodDescriptor<com.mcp.server.v1.ProgressNotification, com.google.protobuf.Empty> getProgressMethod;
    if ((getProgressMethod = ServerNotificationServiceGrpc.getProgressMethod) == null) {
      synchronized (ServerNotificationServiceGrpc.class) {
        if ((getProgressMethod = ServerNotificationServiceGrpc.getProgressMethod) == null) {
          ServerNotificationServiceGrpc.getProgressMethod = getProgressMethod =
              io.grpc.MethodDescriptor.<com.mcp.server.v1.ProgressNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Progress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.ProgressNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerNotificationServiceMethodDescriptorSupplier("Progress"))
              .build();
        }
      }
    }
    return getProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.server.v1.PromptListChangedNotification,
      com.google.protobuf.Empty> getPromptListChangedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PromptListChanged",
      requestType = com.mcp.server.v1.PromptListChangedNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.server.v1.PromptListChangedNotification,
      com.google.protobuf.Empty> getPromptListChangedMethod() {
    io.grpc.MethodDescriptor<com.mcp.server.v1.PromptListChangedNotification, com.google.protobuf.Empty> getPromptListChangedMethod;
    if ((getPromptListChangedMethod = ServerNotificationServiceGrpc.getPromptListChangedMethod) == null) {
      synchronized (ServerNotificationServiceGrpc.class) {
        if ((getPromptListChangedMethod = ServerNotificationServiceGrpc.getPromptListChangedMethod) == null) {
          ServerNotificationServiceGrpc.getPromptListChangedMethod = getPromptListChangedMethod =
              io.grpc.MethodDescriptor.<com.mcp.server.v1.PromptListChangedNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PromptListChanged"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.PromptListChangedNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerNotificationServiceMethodDescriptorSupplier("PromptListChanged"))
              .build();
        }
      }
    }
    return getPromptListChangedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.server.v1.ResourceListChangedNotification,
      com.google.protobuf.Empty> getResourceListChangedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceListChanged",
      requestType = com.mcp.server.v1.ResourceListChangedNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.server.v1.ResourceListChangedNotification,
      com.google.protobuf.Empty> getResourceListChangedMethod() {
    io.grpc.MethodDescriptor<com.mcp.server.v1.ResourceListChangedNotification, com.google.protobuf.Empty> getResourceListChangedMethod;
    if ((getResourceListChangedMethod = ServerNotificationServiceGrpc.getResourceListChangedMethod) == null) {
      synchronized (ServerNotificationServiceGrpc.class) {
        if ((getResourceListChangedMethod = ServerNotificationServiceGrpc.getResourceListChangedMethod) == null) {
          ServerNotificationServiceGrpc.getResourceListChangedMethod = getResourceListChangedMethod =
              io.grpc.MethodDescriptor.<com.mcp.server.v1.ResourceListChangedNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceListChanged"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.ResourceListChangedNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerNotificationServiceMethodDescriptorSupplier("ResourceListChanged"))
              .build();
        }
      }
    }
    return getResourceListChangedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.server.v1.ResourceUpdatedNotification,
      com.google.protobuf.Empty> getResourceUpdatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceUpdated",
      requestType = com.mcp.server.v1.ResourceUpdatedNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.server.v1.ResourceUpdatedNotification,
      com.google.protobuf.Empty> getResourceUpdatedMethod() {
    io.grpc.MethodDescriptor<com.mcp.server.v1.ResourceUpdatedNotification, com.google.protobuf.Empty> getResourceUpdatedMethod;
    if ((getResourceUpdatedMethod = ServerNotificationServiceGrpc.getResourceUpdatedMethod) == null) {
      synchronized (ServerNotificationServiceGrpc.class) {
        if ((getResourceUpdatedMethod = ServerNotificationServiceGrpc.getResourceUpdatedMethod) == null) {
          ServerNotificationServiceGrpc.getResourceUpdatedMethod = getResourceUpdatedMethod =
              io.grpc.MethodDescriptor.<com.mcp.server.v1.ResourceUpdatedNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceUpdated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.ResourceUpdatedNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerNotificationServiceMethodDescriptorSupplier("ResourceUpdated"))
              .build();
        }
      }
    }
    return getResourceUpdatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mcp.server.v1.ToolListChangedNotification,
      com.google.protobuf.Empty> getToolListChangedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToolListChanged",
      requestType = com.mcp.server.v1.ToolListChangedNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcp.server.v1.ToolListChangedNotification,
      com.google.protobuf.Empty> getToolListChangedMethod() {
    io.grpc.MethodDescriptor<com.mcp.server.v1.ToolListChangedNotification, com.google.protobuf.Empty> getToolListChangedMethod;
    if ((getToolListChangedMethod = ServerNotificationServiceGrpc.getToolListChangedMethod) == null) {
      synchronized (ServerNotificationServiceGrpc.class) {
        if ((getToolListChangedMethod = ServerNotificationServiceGrpc.getToolListChangedMethod) == null) {
          ServerNotificationServiceGrpc.getToolListChangedMethod = getToolListChangedMethod =
              io.grpc.MethodDescriptor.<com.mcp.server.v1.ToolListChangedNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToolListChanged"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcp.server.v1.ToolListChangedNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServerNotificationServiceMethodDescriptorSupplier("ToolListChanged"))
              .build();
        }
      }
    }
    return getToolListChangedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerNotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerNotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerNotificationServiceStub>() {
        @java.lang.Override
        public ServerNotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerNotificationServiceStub(channel, callOptions);
        }
      };
    return ServerNotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ServerNotificationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerNotificationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerNotificationServiceBlockingV2Stub>() {
        @java.lang.Override
        public ServerNotificationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerNotificationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ServerNotificationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerNotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerNotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerNotificationServiceBlockingStub>() {
        @java.lang.Override
        public ServerNotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerNotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return ServerNotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerNotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerNotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerNotificationServiceFutureStub>() {
        @java.lang.Override
        public ServerNotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerNotificationServiceFutureStub(channel, callOptions);
        }
      };
    return ServerNotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service describing notifications sent by the server.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    default void cancelled(com.mcp.server.v1.CancelledNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelledMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a log message to the client.
     * </pre>
     */
    default void message(com.mcp.server.v1.LoggingMessageNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    default void progress(com.mcp.server.v1.ProgressNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify that the list of prompts has changed.
     * </pre>
     */
    default void promptListChanged(com.mcp.server.v1.PromptListChangedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPromptListChangedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify that the list of resources has changed.
     * </pre>
     */
    default void resourceListChanged(com.mcp.server.v1.ResourceListChangedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceListChangedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify that a specific resource has been updated.
     * </pre>
     */
    default void resourceUpdated(com.mcp.server.v1.ResourceUpdatedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceUpdatedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify that the list of tools has changed.
     * </pre>
     */
    default void toolListChanged(com.mcp.server.v1.ToolListChangedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToolListChangedMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServerNotificationService.
   * <pre>
   * Service describing notifications sent by the server.
   * </pre>
   */
  public static abstract class ServerNotificationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServerNotificationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServerNotificationService.
   * <pre>
   * Service describing notifications sent by the server.
   * </pre>
   */
  public static final class ServerNotificationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServerNotificationServiceStub> {
    private ServerNotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerNotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerNotificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    public void cancelled(com.mcp.server.v1.CancelledNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a log message to the client.
     * </pre>
     */
    public void message(com.mcp.server.v1.LoggingMessageNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    public void progress(com.mcp.server.v1.ProgressNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify that the list of prompts has changed.
     * </pre>
     */
    public void promptListChanged(com.mcp.server.v1.PromptListChangedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPromptListChangedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify that the list of resources has changed.
     * </pre>
     */
    public void resourceListChanged(com.mcp.server.v1.ResourceListChangedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceListChangedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify that a specific resource has been updated.
     * </pre>
     */
    public void resourceUpdated(com.mcp.server.v1.ResourceUpdatedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceUpdatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify that the list of tools has changed.
     * </pre>
     */
    public void toolListChanged(com.mcp.server.v1.ToolListChangedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToolListChangedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServerNotificationService.
   * <pre>
   * Service describing notifications sent by the server.
   * </pre>
   */
  public static final class ServerNotificationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ServerNotificationServiceBlockingV2Stub> {
    private ServerNotificationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerNotificationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerNotificationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    public com.google.protobuf.Empty cancelled(com.mcp.server.v1.CancelledNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCancelledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a log message to the client.
     * </pre>
     */
    public com.google.protobuf.Empty message(com.mcp.server.v1.LoggingMessageNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    public com.google.protobuf.Empty progress(com.mcp.server.v1.ProgressNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that the list of prompts has changed.
     * </pre>
     */
    public com.google.protobuf.Empty promptListChanged(com.mcp.server.v1.PromptListChangedNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPromptListChangedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that the list of resources has changed.
     * </pre>
     */
    public com.google.protobuf.Empty resourceListChanged(com.mcp.server.v1.ResourceListChangedNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getResourceListChangedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that a specific resource has been updated.
     * </pre>
     */
    public com.google.protobuf.Empty resourceUpdated(com.mcp.server.v1.ResourceUpdatedNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getResourceUpdatedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that the list of tools has changed.
     * </pre>
     */
    public com.google.protobuf.Empty toolListChanged(com.mcp.server.v1.ToolListChangedNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getToolListChangedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ServerNotificationService.
   * <pre>
   * Service describing notifications sent by the server.
   * </pre>
   */
  public static final class ServerNotificationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServerNotificationServiceBlockingStub> {
    private ServerNotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerNotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerNotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    public com.google.protobuf.Empty cancelled(com.mcp.server.v1.CancelledNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a log message to the client.
     * </pre>
     */
    public com.google.protobuf.Empty message(com.mcp.server.v1.LoggingMessageNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    public com.google.protobuf.Empty progress(com.mcp.server.v1.ProgressNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that the list of prompts has changed.
     * </pre>
     */
    public com.google.protobuf.Empty promptListChanged(com.mcp.server.v1.PromptListChangedNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPromptListChangedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that the list of resources has changed.
     * </pre>
     */
    public com.google.protobuf.Empty resourceListChanged(com.mcp.server.v1.ResourceListChangedNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceListChangedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that a specific resource has been updated.
     * </pre>
     */
    public com.google.protobuf.Empty resourceUpdated(com.mcp.server.v1.ResourceUpdatedNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceUpdatedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that the list of tools has changed.
     * </pre>
     */
    public com.google.protobuf.Empty toolListChanged(com.mcp.server.v1.ToolListChangedNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToolListChangedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServerNotificationService.
   * <pre>
   * Service describing notifications sent by the server.
   * </pre>
   */
  public static final class ServerNotificationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServerNotificationServiceFutureStub> {
    private ServerNotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerNotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerNotificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelled(
        com.mcp.server.v1.CancelledNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a log message to the client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> message(
        com.mcp.server.v1.LoggingMessageNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> progress(
        com.mcp.server.v1.ProgressNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify that the list of prompts has changed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> promptListChanged(
        com.mcp.server.v1.PromptListChangedNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPromptListChangedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify that the list of resources has changed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resourceListChanged(
        com.mcp.server.v1.ResourceListChangedNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceListChangedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify that a specific resource has been updated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resourceUpdated(
        com.mcp.server.v1.ResourceUpdatedNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceUpdatedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify that the list of tools has changed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> toolListChanged(
        com.mcp.server.v1.ToolListChangedNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToolListChangedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CANCELLED = 0;
  private static final int METHODID_MESSAGE = 1;
  private static final int METHODID_PROGRESS = 2;
  private static final int METHODID_PROMPT_LIST_CHANGED = 3;
  private static final int METHODID_RESOURCE_LIST_CHANGED = 4;
  private static final int METHODID_RESOURCE_UPDATED = 5;
  private static final int METHODID_TOOL_LIST_CHANGED = 6;

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
        case METHODID_CANCELLED:
          serviceImpl.cancelled((com.mcp.server.v1.CancelledNotification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_MESSAGE:
          serviceImpl.message((com.mcp.server.v1.LoggingMessageNotification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PROGRESS:
          serviceImpl.progress((com.mcp.server.v1.ProgressNotification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PROMPT_LIST_CHANGED:
          serviceImpl.promptListChanged((com.mcp.server.v1.PromptListChangedNotification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESOURCE_LIST_CHANGED:
          serviceImpl.resourceListChanged((com.mcp.server.v1.ResourceListChangedNotification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESOURCE_UPDATED:
          serviceImpl.resourceUpdated((com.mcp.server.v1.ResourceUpdatedNotification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TOOL_LIST_CHANGED:
          serviceImpl.toolListChanged((com.mcp.server.v1.ToolListChangedNotification) request,
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
          getCancelledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.server.v1.CancelledNotification,
              com.google.protobuf.Empty>(
                service, METHODID_CANCELLED)))
        .addMethod(
          getMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.server.v1.LoggingMessageNotification,
              com.google.protobuf.Empty>(
                service, METHODID_MESSAGE)))
        .addMethod(
          getProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.server.v1.ProgressNotification,
              com.google.protobuf.Empty>(
                service, METHODID_PROGRESS)))
        .addMethod(
          getPromptListChangedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.server.v1.PromptListChangedNotification,
              com.google.protobuf.Empty>(
                service, METHODID_PROMPT_LIST_CHANGED)))
        .addMethod(
          getResourceListChangedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.server.v1.ResourceListChangedNotification,
              com.google.protobuf.Empty>(
                service, METHODID_RESOURCE_LIST_CHANGED)))
        .addMethod(
          getResourceUpdatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.server.v1.ResourceUpdatedNotification,
              com.google.protobuf.Empty>(
                service, METHODID_RESOURCE_UPDATED)))
        .addMethod(
          getToolListChangedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcp.server.v1.ToolListChangedNotification,
              com.google.protobuf.Empty>(
                service, METHODID_TOOL_LIST_CHANGED)))
        .build();
  }

  private static abstract class ServerNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerNotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.mcp.api.resources.ServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerNotificationService");
    }
  }

  private static final class ServerNotificationServiceFileDescriptorSupplier
      extends ServerNotificationServiceBaseDescriptorSupplier {
    ServerNotificationServiceFileDescriptorSupplier() {}
  }

  private static final class ServerNotificationServiceMethodDescriptorSupplier
      extends ServerNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServerNotificationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServerNotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerNotificationServiceFileDescriptorSupplier())
              .addMethod(getCancelledMethod())
              .addMethod(getMessageMethod())
              .addMethod(getProgressMethod())
              .addMethod(getPromptListChangedMethod())
              .addMethod(getResourceListChangedMethod())
              .addMethod(getResourceUpdatedMethod())
              .addMethod(getToolListChangedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
