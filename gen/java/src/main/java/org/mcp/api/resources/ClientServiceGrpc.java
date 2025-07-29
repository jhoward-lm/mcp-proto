package org.mcp.api.resources;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service describing available methods exposed by an MCP client.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mcp.api.v1.ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.mcp.server.resources.ElicitRequest,
      org.mcp.client.resources.ElicitResult> getCreateElicitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateElicitation",
      requestType = org.mcp.server.resources.ElicitRequest.class,
      responseType = org.mcp.client.resources.ElicitResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.server.resources.ElicitRequest,
      org.mcp.client.resources.ElicitResult> getCreateElicitationMethod() {
    io.grpc.MethodDescriptor<org.mcp.server.resources.ElicitRequest, org.mcp.client.resources.ElicitResult> getCreateElicitationMethod;
    if ((getCreateElicitationMethod = ClientServiceGrpc.getCreateElicitationMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateElicitationMethod = ClientServiceGrpc.getCreateElicitationMethod) == null) {
          ClientServiceGrpc.getCreateElicitationMethod = getCreateElicitationMethod =
              io.grpc.MethodDescriptor.<org.mcp.server.resources.ElicitRequest, org.mcp.client.resources.ElicitResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateElicitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.ElicitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.ElicitResult.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateElicitation"))
              .build();
        }
      }
    }
    return getCreateElicitationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.server.resources.CreateMessageRequest,
      org.mcp.client.resources.CreateMessageResult> getCreateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMessage",
      requestType = org.mcp.server.resources.CreateMessageRequest.class,
      responseType = org.mcp.client.resources.CreateMessageResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.server.resources.CreateMessageRequest,
      org.mcp.client.resources.CreateMessageResult> getCreateMessageMethod() {
    io.grpc.MethodDescriptor<org.mcp.server.resources.CreateMessageRequest, org.mcp.client.resources.CreateMessageResult> getCreateMessageMethod;
    if ((getCreateMessageMethod = ClientServiceGrpc.getCreateMessageMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateMessageMethod = ClientServiceGrpc.getCreateMessageMethod) == null) {
          ClientServiceGrpc.getCreateMessageMethod = getCreateMessageMethod =
              io.grpc.MethodDescriptor.<org.mcp.server.resources.CreateMessageRequest, org.mcp.client.resources.CreateMessageResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.CreateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.CreateMessageResult.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateMessage"))
              .build();
        }
      }
    }
    return getCreateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.server.resources.ListRootsRequest,
      org.mcp.client.resources.ListRootsResult> getListRootsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoots",
      requestType = org.mcp.server.resources.ListRootsRequest.class,
      responseType = org.mcp.client.resources.ListRootsResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.server.resources.ListRootsRequest,
      org.mcp.client.resources.ListRootsResult> getListRootsMethod() {
    io.grpc.MethodDescriptor<org.mcp.server.resources.ListRootsRequest, org.mcp.client.resources.ListRootsResult> getListRootsMethod;
    if ((getListRootsMethod = ClientServiceGrpc.getListRootsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getListRootsMethod = ClientServiceGrpc.getListRootsMethod) == null) {
          ClientServiceGrpc.getListRootsMethod = getListRootsMethod =
              io.grpc.MethodDescriptor.<org.mcp.server.resources.ListRootsRequest, org.mcp.client.resources.ListRootsResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.ListRootsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.client.resources.ListRootsResult.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ListRoots"))
              .build();
        }
      }
    }
    return getListRootsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.mcp.server.resources.PingRequest,
      com.google.protobuf.Empty> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = org.mcp.server.resources.PingRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.mcp.server.resources.PingRequest,
      com.google.protobuf.Empty> getPingMethod() {
    io.grpc.MethodDescriptor<org.mcp.server.resources.PingRequest, com.google.protobuf.Empty> getPingMethod;
    if ((getPingMethod = ClientServiceGrpc.getPingMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getPingMethod = ClientServiceGrpc.getPingMethod) == null) {
          ClientServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<org.mcp.server.resources.PingRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mcp.server.resources.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub>() {
        @java.lang.Override
        public ClientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceStub(channel, callOptions);
        }
      };
    return ClientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ClientServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingV2Stub>() {
        @java.lang.Override
        public ClientServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ClientServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub>() {
        @java.lang.Override
        public ClientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceBlockingStub(channel, callOptions);
        }
      };
    return ClientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub>() {
        @java.lang.Override
        public ClientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceFutureStub(channel, callOptions);
        }
      };
    return ClientServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service describing available methods exposed by an MCP client.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Elicit additional information from the user.
     * </pre>
     */
    default void createElicitation(org.mcp.server.resources.ElicitRequest request,
        io.grpc.stub.StreamObserver<org.mcp.client.resources.ElicitResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateElicitationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Instruct the client to sample an LLM and return its message.
     * </pre>
     */
    default void createMessage(org.mcp.server.resources.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<org.mcp.client.resources.CreateMessageResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request the client to list roots.
     * </pre>
     */
    default void listRoots(org.mcp.server.resources.ListRootsRequest request,
        io.grpc.stub.StreamObserver<org.mcp.client.resources.ListRootsResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRootsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    default void ping(org.mcp.server.resources.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClientService.
   * <pre>
   * Service describing available methods exposed by an MCP client.
   * </pre>
   */
  public static abstract class ClientServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClientServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClientService.
   * <pre>
   * Service describing available methods exposed by an MCP client.
   * </pre>
   */
  public static final class ClientServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClientServiceStub> {
    private ClientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Elicit additional information from the user.
     * </pre>
     */
    public void createElicitation(org.mcp.server.resources.ElicitRequest request,
        io.grpc.stub.StreamObserver<org.mcp.client.resources.ElicitResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateElicitationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Instruct the client to sample an LLM and return its message.
     * </pre>
     */
    public void createMessage(org.mcp.server.resources.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<org.mcp.client.resources.CreateMessageResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request the client to list roots.
     * </pre>
     */
    public void listRoots(org.mcp.server.resources.ListRootsRequest request,
        io.grpc.stub.StreamObserver<org.mcp.client.resources.ListRootsResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRootsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public void ping(org.mcp.server.resources.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClientService.
   * <pre>
   * Service describing available methods exposed by an MCP client.
   * </pre>
   */
  public static final class ClientServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ClientServiceBlockingV2Stub> {
    private ClientServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Elicit additional information from the user.
     * </pre>
     */
    public org.mcp.client.resources.ElicitResult createElicitation(org.mcp.server.resources.ElicitRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateElicitationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Instruct the client to sample an LLM and return its message.
     * </pre>
     */
    public org.mcp.client.resources.CreateMessageResult createMessage(org.mcp.server.resources.CreateMessageRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request the client to list roots.
     * </pre>
     */
    public org.mcp.client.resources.ListRootsResult listRoots(org.mcp.server.resources.ListRootsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListRootsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public com.google.protobuf.Empty ping(org.mcp.server.resources.PingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ClientService.
   * <pre>
   * Service describing available methods exposed by an MCP client.
   * </pre>
   */
  public static final class ClientServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Elicit additional information from the user.
     * </pre>
     */
    public org.mcp.client.resources.ElicitResult createElicitation(org.mcp.server.resources.ElicitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateElicitationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Instruct the client to sample an LLM and return its message.
     * </pre>
     */
    public org.mcp.client.resources.CreateMessageResult createMessage(org.mcp.server.resources.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request the client to list roots.
     * </pre>
     */
    public org.mcp.client.resources.ListRootsResult listRoots(org.mcp.server.resources.ListRootsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRootsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public com.google.protobuf.Empty ping(org.mcp.server.resources.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClientService.
   * <pre>
   * Service describing available methods exposed by an MCP client.
   * </pre>
   */
  public static final class ClientServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Elicit additional information from the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.client.resources.ElicitResult> createElicitation(
        org.mcp.server.resources.ElicitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateElicitationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Instruct the client to sample an LLM and return its message.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.client.resources.CreateMessageResult> createMessage(
        org.mcp.server.resources.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request the client to list roots.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mcp.client.resources.ListRootsResult> listRoots(
        org.mcp.server.resources.ListRootsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRootsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ping the other party to check if it is still alive.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> ping(
        org.mcp.server.resources.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ELICITATION = 0;
  private static final int METHODID_CREATE_MESSAGE = 1;
  private static final int METHODID_LIST_ROOTS = 2;
  private static final int METHODID_PING = 3;

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
        case METHODID_CREATE_ELICITATION:
          serviceImpl.createElicitation((org.mcp.server.resources.ElicitRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.client.resources.ElicitResult>) responseObserver);
          break;
        case METHODID_CREATE_MESSAGE:
          serviceImpl.createMessage((org.mcp.server.resources.CreateMessageRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.client.resources.CreateMessageResult>) responseObserver);
          break;
        case METHODID_LIST_ROOTS:
          serviceImpl.listRoots((org.mcp.server.resources.ListRootsRequest) request,
              (io.grpc.stub.StreamObserver<org.mcp.client.resources.ListRootsResult>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((org.mcp.server.resources.PingRequest) request,
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
          getCreateElicitationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.server.resources.ElicitRequest,
              org.mcp.client.resources.ElicitResult>(
                service, METHODID_CREATE_ELICITATION)))
        .addMethod(
          getCreateMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.server.resources.CreateMessageRequest,
              org.mcp.client.resources.CreateMessageResult>(
                service, METHODID_CREATE_MESSAGE)))
        .addMethod(
          getListRootsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.server.resources.ListRootsRequest,
              org.mcp.client.resources.ListRootsResult>(
                service, METHODID_LIST_ROOTS)))
        .addMethod(
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.mcp.server.resources.PingRequest,
              com.google.protobuf.Empty>(
                service, METHODID_PING)))
        .build();
  }

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.mcp.api.resources.ClientProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClientServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getCreateElicitationMethod())
              .addMethod(getCreateMessageMethod())
              .addMethod(getListRootsMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
