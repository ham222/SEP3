package via.generatedprotos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: definitions.proto")
public final class UserManagementGrpc {

  private UserManagementGrpc() {}

  public static final String SERVICE_NAME = "generatedprotos.UserManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.User,
      via.generatedprotos.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = via.generatedprotos.User.class,
      responseType = via.generatedprotos.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.User,
      via.generatedprotos.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.User, via.generatedprotos.User> getCreateUserMethod;
    if ((getCreateUserMethod = UserManagementGrpc.getCreateUserMethod) == null) {
      synchronized (UserManagementGrpc.class) {
        if ((getCreateUserMethod = UserManagementGrpc.getCreateUserMethod) == null) {
          UserManagementGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.User, via.generatedprotos.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListUsers> getGetUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsers",
      requestType = via.generatedprotos.Empty.class,
      responseType = via.generatedprotos.ListUsers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListUsers> getGetUsersMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.Empty, via.generatedprotos.ListUsers> getGetUsersMethod;
    if ((getGetUsersMethod = UserManagementGrpc.getGetUsersMethod) == null) {
      synchronized (UserManagementGrpc.class) {
        if ((getGetUsersMethod = UserManagementGrpc.getGetUsersMethod) == null) {
          UserManagementGrpc.getGetUsersMethod = getGetUsersMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.Empty, via.generatedprotos.ListUsers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListUsers.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementMethodDescriptorSupplier("GetUsers"))
              .build();
        }
      }
    }
    return getGetUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.User> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserById",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.User> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.User> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = UserManagementGrpc.getGetUserByIdMethod) == null) {
      synchronized (UserManagementGrpc.class) {
        if ((getGetUserByIdMethod = UserManagementGrpc.getGetUserByIdMethod) == null) {
          UserManagementGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementMethodDescriptorSupplier("GetUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.User,
      via.generatedprotos.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = via.generatedprotos.User.class,
      responseType = via.generatedprotos.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.User,
      via.generatedprotos.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.User, via.generatedprotos.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserManagementGrpc.getUpdateUserMethod) == null) {
      synchronized (UserManagementGrpc.class) {
        if ((getUpdateUserMethod = UserManagementGrpc.getUpdateUserMethod) == null) {
          UserManagementGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.User, via.generatedprotos.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserManagementGrpc.getDeleteUserMethod) == null) {
      synchronized (UserManagementGrpc.class) {
        if ((getDeleteUserMethod = UserManagementGrpc.getDeleteUserMethod) == null) {
          UserManagementGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserManagementStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserManagementStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserManagementStub>() {
        @java.lang.Override
        public UserManagementStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserManagementStub(channel, callOptions);
        }
      };
    return UserManagementStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserManagementBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserManagementBlockingStub>() {
        @java.lang.Override
        public UserManagementBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserManagementBlockingStub(channel, callOptions);
        }
      };
    return UserManagementBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserManagementFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserManagementFutureStub>() {
        @java.lang.Override
        public UserManagementFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserManagementFutureStub(channel, callOptions);
        }
      };
    return UserManagementFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(via.generatedprotos.User request,
        io.grpc.stub.StreamObserver<via.generatedprotos.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void getUsers(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListUsers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersMethod(), responseObserver);
    }

    /**
     */
    public void getUserById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(via.generatedprotos.User request,
        io.grpc.stub.StreamObserver<via.generatedprotos.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.User,
                via.generatedprotos.User>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getGetUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.Empty,
                via.generatedprotos.ListUsers>(
                  this, METHODID_GET_USERS)))
          .addMethod(
            getGetUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.User>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.User,
                via.generatedprotos.User>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.Empty>(
                  this, METHODID_DELETE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserManagementStub extends io.grpc.stub.AbstractAsyncStub<UserManagementStub> {
    private UserManagementStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagementStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserManagementStub(channel, callOptions);
    }

    /**
     */
    public void createUser(via.generatedprotos.User request,
        io.grpc.stub.StreamObserver<via.generatedprotos.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsers(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListUsers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(via.generatedprotos.User request,
        io.grpc.stub.StreamObserver<via.generatedprotos.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserManagementBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserManagementBlockingStub> {
    private UserManagementBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagementBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.generatedprotos.User createUser(via.generatedprotos.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ListUsers getUsers(via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.User getUserById(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.User updateUser(via.generatedprotos.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.Empty deleteUser(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserManagementFutureStub extends io.grpc.stub.AbstractFutureStub<UserManagementFutureStub> {
    private UserManagementFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagementFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserManagementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.User> createUser(
        via.generatedprotos.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListUsers> getUsers(
        via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.User> getUserById(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.User> updateUser(
        via.generatedprotos.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.Empty> deleteUser(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USERS = 1;
  private static final int METHODID_GET_USER_BY_ID = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((via.generatedprotos.User) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.User>) responseObserver);
          break;
        case METHODID_GET_USERS:
          serviceImpl.getUsers((via.generatedprotos.Empty) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListUsers>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((via.generatedprotos.User) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.User>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.Empty>) responseObserver);
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

  private static abstract class UserManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.generatedprotos.Definitions.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserManagement");
    }
  }

  private static final class UserManagementFileDescriptorSupplier
      extends UserManagementBaseDescriptorSupplier {
    UserManagementFileDescriptorSupplier() {}
  }

  private static final class UserManagementMethodDescriptorSupplier
      extends UserManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserManagementFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUsersMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
