package via.generatedprotos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: definitions.proto")
public final class ResourcesConsumptionGrpc {

  private ResourcesConsumptionGrpc() {}

  public static final String SERVICE_NAME = "generatedprotos.ResourcesConsumption";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsage,
      via.generatedprotos.ElectricityUsage> getLogElectricityUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogElectricityUsage",
      requestType = via.generatedprotos.ElectricityUsage.class,
      responseType = via.generatedprotos.ElectricityUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsage,
      via.generatedprotos.ElectricityUsage> getLogElectricityUsageMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsage, via.generatedprotos.ElectricityUsage> getLogElectricityUsageMethod;
    if ((getLogElectricityUsageMethod = ResourcesConsumptionGrpc.getLogElectricityUsageMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getLogElectricityUsageMethod = ResourcesConsumptionGrpc.getLogElectricityUsageMethod) == null) {
          ResourcesConsumptionGrpc.getLogElectricityUsageMethod = getLogElectricityUsageMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ElectricityUsage, via.generatedprotos.ElectricityUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogElectricityUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("LogElectricityUsage"))
              .build();
        }
      }
    }
    return getLogElectricityUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.WaterUsage,
      via.generatedprotos.WaterUsage> getLogWaterUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogWaterUsage",
      requestType = via.generatedprotos.WaterUsage.class,
      responseType = via.generatedprotos.WaterUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.WaterUsage,
      via.generatedprotos.WaterUsage> getLogWaterUsageMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.WaterUsage, via.generatedprotos.WaterUsage> getLogWaterUsageMethod;
    if ((getLogWaterUsageMethod = ResourcesConsumptionGrpc.getLogWaterUsageMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getLogWaterUsageMethod = ResourcesConsumptionGrpc.getLogWaterUsageMethod) == null) {
          ResourcesConsumptionGrpc.getLogWaterUsageMethod = getLogWaterUsageMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.WaterUsage, via.generatedprotos.WaterUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogWaterUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("LogWaterUsage"))
              .build();
        }
      }
    }
    return getLogWaterUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListWaterUsage> getGetWaterUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterUsage",
      requestType = via.generatedprotos.Empty.class,
      responseType = via.generatedprotos.ListWaterUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListWaterUsage> getGetWaterUsageMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.Empty, via.generatedprotos.ListWaterUsage> getGetWaterUsageMethod;
    if ((getGetWaterUsageMethod = ResourcesConsumptionGrpc.getGetWaterUsageMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getGetWaterUsageMethod = ResourcesConsumptionGrpc.getGetWaterUsageMethod) == null) {
          ResourcesConsumptionGrpc.getGetWaterUsageMethod = getGetWaterUsageMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.Empty, via.generatedprotos.ListWaterUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaterUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListWaterUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("GetWaterUsage"))
              .build();
        }
      }
    }
    return getGetWaterUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListElectricityUsage> getGetElectricityUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectricityUsage",
      requestType = via.generatedprotos.Empty.class,
      responseType = via.generatedprotos.ListElectricityUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListElectricityUsage> getGetElectricityUsageMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.Empty, via.generatedprotos.ListElectricityUsage> getGetElectricityUsageMethod;
    if ((getGetElectricityUsageMethod = ResourcesConsumptionGrpc.getGetElectricityUsageMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getGetElectricityUsageMethod = ResourcesConsumptionGrpc.getGetElectricityUsageMethod) == null) {
          ResourcesConsumptionGrpc.getGetElectricityUsageMethod = getGetElectricityUsageMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.Empty, via.generatedprotos.ListElectricityUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectricityUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListElectricityUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("GetElectricityUsage"))
              .build();
        }
      }
    }
    return getGetElectricityUsageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourcesConsumptionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourcesConsumptionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourcesConsumptionStub>() {
        @java.lang.Override
        public ResourcesConsumptionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourcesConsumptionStub(channel, callOptions);
        }
      };
    return ResourcesConsumptionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourcesConsumptionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourcesConsumptionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourcesConsumptionBlockingStub>() {
        @java.lang.Override
        public ResourcesConsumptionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourcesConsumptionBlockingStub(channel, callOptions);
        }
      };
    return ResourcesConsumptionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourcesConsumptionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourcesConsumptionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourcesConsumptionFutureStub>() {
        @java.lang.Override
        public ResourcesConsumptionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourcesConsumptionFutureStub(channel, callOptions);
        }
      };
    return ResourcesConsumptionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ResourcesConsumptionImplBase implements io.grpc.BindableService {

    /**
     */
    public void logElectricityUsage(via.generatedprotos.ElectricityUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogElectricityUsageMethod(), responseObserver);
    }

    /**
     */
    public void logWaterUsage(via.generatedprotos.WaterUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogWaterUsageMethod(), responseObserver);
    }

    /**
     */
    public void getWaterUsage(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaterUsageMethod(), responseObserver);
    }

    /**
     */
    public void getElectricityUsage(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectricityUsageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogElectricityUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ElectricityUsage,
                via.generatedprotos.ElectricityUsage>(
                  this, METHODID_LOG_ELECTRICITY_USAGE)))
          .addMethod(
            getLogWaterUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.WaterUsage,
                via.generatedprotos.WaterUsage>(
                  this, METHODID_LOG_WATER_USAGE)))
          .addMethod(
            getGetWaterUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.Empty,
                via.generatedprotos.ListWaterUsage>(
                  this, METHODID_GET_WATER_USAGE)))
          .addMethod(
            getGetElectricityUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.Empty,
                via.generatedprotos.ListElectricityUsage>(
                  this, METHODID_GET_ELECTRICITY_USAGE)))
          .build();
    }
  }

  /**
   */
  public static final class ResourcesConsumptionStub extends io.grpc.stub.AbstractAsyncStub<ResourcesConsumptionStub> {
    private ResourcesConsumptionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcesConsumptionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourcesConsumptionStub(channel, callOptions);
    }

    /**
     */
    public void logElectricityUsage(via.generatedprotos.ElectricityUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogElectricityUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logWaterUsage(via.generatedprotos.WaterUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogWaterUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWaterUsage(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaterUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getElectricityUsage(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectricityUsageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ResourcesConsumptionBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourcesConsumptionBlockingStub> {
    private ResourcesConsumptionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcesConsumptionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourcesConsumptionBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.generatedprotos.ElectricityUsage logElectricityUsage(via.generatedprotos.ElectricityUsage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogElectricityUsageMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.WaterUsage logWaterUsage(via.generatedprotos.WaterUsage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogWaterUsageMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ListWaterUsage getWaterUsage(via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaterUsageMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ListElectricityUsage getElectricityUsage(via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectricityUsageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ResourcesConsumptionFutureStub extends io.grpc.stub.AbstractFutureStub<ResourcesConsumptionFutureStub> {
    private ResourcesConsumptionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcesConsumptionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourcesConsumptionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ElectricityUsage> logElectricityUsage(
        via.generatedprotos.ElectricityUsage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogElectricityUsageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.WaterUsage> logWaterUsage(
        via.generatedprotos.WaterUsage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogWaterUsageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListWaterUsage> getWaterUsage(
        via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaterUsageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListElectricityUsage> getElectricityUsage(
        via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectricityUsageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG_ELECTRICITY_USAGE = 0;
  private static final int METHODID_LOG_WATER_USAGE = 1;
  private static final int METHODID_GET_WATER_USAGE = 2;
  private static final int METHODID_GET_ELECTRICITY_USAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourcesConsumptionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourcesConsumptionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG_ELECTRICITY_USAGE:
          serviceImpl.logElectricityUsage((via.generatedprotos.ElectricityUsage) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsage>) responseObserver);
          break;
        case METHODID_LOG_WATER_USAGE:
          serviceImpl.logWaterUsage((via.generatedprotos.WaterUsage) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsage>) responseObserver);
          break;
        case METHODID_GET_WATER_USAGE:
          serviceImpl.getWaterUsage((via.generatedprotos.Empty) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsage>) responseObserver);
          break;
        case METHODID_GET_ELECTRICITY_USAGE:
          serviceImpl.getElectricityUsage((via.generatedprotos.Empty) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsage>) responseObserver);
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

  private static abstract class ResourcesConsumptionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourcesConsumptionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.generatedprotos.Definitions.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourcesConsumption");
    }
  }

  private static final class ResourcesConsumptionFileDescriptorSupplier
      extends ResourcesConsumptionBaseDescriptorSupplier {
    ResourcesConsumptionFileDescriptorSupplier() {}
  }

  private static final class ResourcesConsumptionMethodDescriptorSupplier
      extends ResourcesConsumptionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourcesConsumptionMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourcesConsumptionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourcesConsumptionFileDescriptorSupplier())
              .addMethod(getLogElectricityUsageMethod())
              .addMethod(getLogWaterUsageMethod())
              .addMethod(getGetWaterUsageMethod())
              .addMethod(getGetElectricityUsageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
