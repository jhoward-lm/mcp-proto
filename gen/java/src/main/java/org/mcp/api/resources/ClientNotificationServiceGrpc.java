package org.mcp.api.resources;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service describing notifications sent by the client.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientNotificationServiceGrpc {

  private ClientNotificationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mcp.api.v1.ClientNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.CancelledNotification,
      com.google.protobuf.Empty> getCancelledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancelled",
      requestType = org.mcp.client.resources.CancelledNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.CancelledNotification,
      com.google.protobuf.Empty> getCancelledMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.CancelledNotification, com.google.protobuf.Empty> getCancelledMethod;
    if ((getCancelledMethod = ClientNotificationServiceGrpc.getCancelledMethod) == null) {
      synchronized (ClientNotificationServiceGrpc.class) {
        if ((getCancelledMethod = ClientNotificationServiceGrpc.getCancelledMethod) == null) {
          ClientNotificationServiceGrpc.getCancelledMethod = getCancelledMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.CancelledNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancelled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.CancelledNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientNotificationServiceMethodDescriptorSupplier("Cancelled"))
              .build();
        }
      }
    }
    return getCancelledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.InitializedNotification,
      com.google.protobuf.Empty> getInitializedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Initialized",
      requestType = org.mcp.client.resources.InitializedNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.InitializedNotification,
      com.google.protobuf.Empty> getInitializedMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.InitializedNotification, com.google.protobuf.Empty> getInitializedMethod;
    if ((getInitializedMethod = ClientNotificationServiceGrpc.getInitializedMethod) == null) {
      synchronized (ClientNotificationServiceGrpc.class) {
        if ((getInitializedMethod = ClientNotificationServiceGrpc.getInitializedMethod) == null) {
          ClientNotificationServiceGrpc.getInitializedMethod = getInitializedMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.InitializedNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Initialized"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.InitializedNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientNotificationServiceMethodDescriptorSupplier("Initialized"))
              .build();
        }
      }
    }
    return getInitializedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.ProgressNotification,
      com.google.protobuf.Empty> getProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Progress",
      requestType = org.mcp.client.resources.ProgressNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.ProgressNotification,
      com.google.protobuf.Empty> getProgressMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.ProgressNotification, com.google.protobuf.Empty> getProgressMethod;
    if ((getProgressMethod = ClientNotificationServiceGrpc.getProgressMethod) == null) {
      synchronized (ClientNotificationServiceGrpc.class) {
        if ((getProgressMethod = ClientNotificationServiceGrpc.getProgressMethod) == null) {
          ClientNotificationServiceGrpc.getProgressMethod = getProgressMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.ProgressNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Progress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.ProgressNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientNotificationServiceMethodDescriptorSupplier("Progress"))
              .build();
        }
      }
    }
    return getProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.client.resources.RootsListChangedNotification,
      com.google.protobuf.Empty> getRootsListChangedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RootsListChanged",
      requestType = org.mcp.client.resources.RootsListChangedNotification.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.client.resources.RootsListChangedNotification,
      com.google.protobuf.Empty> getRootsListChangedMethod() {
    io.grpc.MethodDescriptor<org.mcp.client.resources.RootsListChangedNotification, com.google.protobuf.Empty> getRootsListChangedMethod;
    if ((getRootsListChangedMethod = ClientNotificationServiceGrpc.getRootsListChangedMethod) == null) {
      synchronized (ClientNotificationServiceGrpc.class) {
        if ((getRootsListChangedMethod = ClientNotificationServiceGrpc.getRootsListChangedMethod) == null) {
          ClientNotificationServiceGrpc.getRootsListChangedMethod = getRootsListChangedMethod =
              io.grpc.MethodDescriptor.<org.mcp.client.resources.RootsListChangedNotification, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RootsListChanged"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.RootsListChangedNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientNotificationServiceMethodDescriptorSupplier("RootsListChanged"))
              .build();
        }
      }
    }
    return getRootsListChangedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientNotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientNotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientNotificationServiceStub>() {
        @java.lang.Override
        public ClientNotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientNotificationServiceStub(channel, callOptions);
        }
      };
    return ClientNotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ClientNotificationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientNotificationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientNotificationServiceBlockingV2Stub>() {
        @java.lang.Override
        public ClientNotificationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientNotificationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ClientNotificationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientNotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientNotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientNotificationServiceBlockingStub>() {
        @java.lang.Override
        public ClientNotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientNotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return ClientNotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientNotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientNotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientNotificationServiceFutureStub>() {
        @java.lang.Override
        public ClientNotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientNotificationServiceFutureStub(channel, callOptions);
        }
      };
    return ClientNotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service describing notifications sent by the client.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    default void cancelled(org.mcp.client.resources.CancelledNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelledMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify the server that initialization has finished.
     * </pre>
     */
    default void initialized(org.mcp.client.resources.InitializedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    default void progress(org.mcp.client.resources.ProgressNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify that the list of roots has changed.
     * </pre>
     */
    default void rootsListChanged(org.mcp.client.resources.RootsListChangedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRootsListChangedMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClientNotificationService.
   * <pre>
   * Service describing notifications sent by the client.
   * </pre>
   */
  public static abstract class ClientNotificationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClientNotificationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClientNotificationService.
   * <pre>
   * Service describing notifications sent by the client.
   * </pre>
   */
  public static final class ClientNotificationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClientNotificationServiceStub> {
    private ClientNotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientNotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientNotificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    public void cancelled(org.mcp.client.resources.CancelledNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify the server that initialization has finished.
     * </pre>
     */
    public void initialized(org.mcp.client.resources.InitializedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    public void progress(org.mcp.client.resources.ProgressNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify that the list of roots has changed.
     * </pre>
     */
    public void rootsListChanged(org.mcp.client.resources.RootsListChangedNotification request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRootsListChangedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClientNotificationService.
   * <pre>
   * Service describing notifications sent by the client.
   * </pre>
   */
  public static final class ClientNotificationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ClientNotificationServiceBlockingV2Stub> {
    private ClientNotificationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientNotificationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientNotificationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    public com.google.protobuf.Empty cancelled(org.mcp.client.resources.CancelledNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCancelledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify the server that initialization has finished.
     * </pre>
     */
    public com.google.protobuf.Empty initialized(org.mcp.client.resources.InitializedNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getInitializedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    public com.google.protobuf.Empty progress(org.mcp.client.resources.ProgressNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that the list of roots has changed.
     * </pre>
     */
    public com.google.protobuf.Empty rootsListChanged(org.mcp.client.resources.RootsListChangedNotification request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRootsListChangedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ClientNotificationService.
   * <pre>
   * Service describing notifications sent by the client.
   * </pre>
   */
  public static final class ClientNotificationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClientNotificationServiceBlockingStub> {
    private ClientNotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientNotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientNotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    public com.google.protobuf.Empty cancelled(org.mcp.client.resources.CancelledNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify the server that initialization has finished.
     * </pre>
     */
    public com.google.protobuf.Empty initialized(org.mcp.client.resources.InitializedNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    public com.google.protobuf.Empty progress(org.mcp.client.resources.ProgressNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify that the list of roots has changed.
     * </pre>
     */
    public com.google.protobuf.Empty rootsListChanged(org.mcp.client.resources.RootsListChangedNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRootsListChangedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClientNotificationService.
   * <pre>
   * Service describing notifications sent by the client.
   * </pre>
   */
  public static final class ClientNotificationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClientNotificationServiceFutureStub> {
    private ClientNotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientNotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientNotificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Notify that a previously-issued request is being cancelled.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelled(
        org.mcp.client.resources.CancelledNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify the server that initialization has finished.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> initialized(
        org.mcp.client.resources.InitializedNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a progress notification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> progress(
        org.mcp.client.resources.ProgressNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify that the list of roots has changed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> rootsListChanged(
        org.mcp.client.resources.RootsListChangedNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRootsListChangedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CANCELLED = 0;
  private static final int METHODID_INITIALIZED = 1;
  private static final int METHODID_PROGRESS = 2;
  private static final int METHODID_ROOTS_LIST_CHANGED = 3;

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
          serviceImpl.cancelled((org.mcp.client.resources.CancelledNotification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INITIALIZED:
          serviceImpl.initialized((org.mcp.client.resources.InitializedNotification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PROGRESS:
          serviceImpl.progress((org.mcp.client.resources.ProgressNotification) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ROOTS_LIST_CHANGED:
          serviceImpl.rootsListChanged((org.mcp.client.resources.RootsListChangedNotification) request,
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
              org.mcp.client.resources.CancelledNotification,
              com.google.protobuf.Empty>(
                service, METHODID_CANCELLED)))
        .addMethod(
          getInitializedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.InitializedNotification,
              com.google.protobuf.Empty>(
                service, METHODID_INITIALIZED)))
        .addMethod(
          getProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.ProgressNotification,
              com.google.protobuf.Empty>(
                service, METHODID_PROGRESS)))
        .addMethod(
          getRootsListChangedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.client.resources.RootsListChangedNotification,
              com.google.protobuf.Empty>(
                service, METHODID_ROOTS_LIST_CHANGED)))
        .build();
  }

  private static abstract class ClientNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientNotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.mcp.api.resources.ClientProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientNotificationService");
    }
  }

  private static final class ClientNotificationServiceFileDescriptorSupplier
      extends ClientNotificationServiceBaseDescriptorSupplier {
    ClientNotificationServiceFileDescriptorSupplier() {}
  }

  private static final class ClientNotificationServiceMethodDescriptorSupplier
      extends ClientNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClientNotificationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClientNotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientNotificationServiceFileDescriptorSupplier())
              .addMethod(getCancelledMethod())
              .addMethod(getInitializedMethod())
              .addMethod(getProgressMethod())
              .addMethod(getRootsListChangedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
