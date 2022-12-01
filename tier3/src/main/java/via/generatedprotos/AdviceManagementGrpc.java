package via.generatedprotos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: definitions.proto")
public final class AdviceManagementGrpc {

  private AdviceManagementGrpc() {}

  public static final String SERVICE_NAME = "generatedprotos.AdviceManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.WaterUsage,
      via.generatedprotos.WaterUsageAdvice> getGetWaterUsageAdviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterUsageAdvice",
      requestType = via.generatedprotos.WaterUsage.class,
      responseType = via.generatedprotos.WaterUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.WaterUsage,
      via.generatedprotos.WaterUsageAdvice> getGetWaterUsageAdviceMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.WaterUsage, via.generatedprotos.WaterUsageAdvice> getGetWaterUsageAdviceMethod;
    if ((getGetWaterUsageAdviceMethod = AdviceManagementGrpc.getGetWaterUsageAdviceMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getGetWaterUsageAdviceMethod = AdviceManagementGrpc.getGetWaterUsageAdviceMethod) == null) {
          AdviceManagementGrpc.getGetWaterUsageAdviceMethod = getGetWaterUsageAdviceMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.WaterUsage, via.generatedprotos.WaterUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaterUsageAdvice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("GetWaterUsageAdvice"))
              .build();
        }
      }
    }
    return getGetWaterUsageAdviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsage,
      via.generatedprotos.ElectricityUsageAdvice> getGetElectricityUsageAdviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectricityUsageAdvice",
      requestType = via.generatedprotos.ElectricityUsage.class,
      responseType = via.generatedprotos.ElectricityUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsage,
      via.generatedprotos.ElectricityUsageAdvice> getGetElectricityUsageAdviceMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsage, via.generatedprotos.ElectricityUsageAdvice> getGetElectricityUsageAdviceMethod;
    if ((getGetElectricityUsageAdviceMethod = AdviceManagementGrpc.getGetElectricityUsageAdviceMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getGetElectricityUsageAdviceMethod = AdviceManagementGrpc.getGetElectricityUsageAdviceMethod) == null) {
          AdviceManagementGrpc.getGetElectricityUsageAdviceMethod = getGetElectricityUsageAdviceMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ElectricityUsage, via.generatedprotos.ElectricityUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectricityUsageAdvice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("GetElectricityUsageAdvice"))
              .build();
        }
      }
    }
    return getGetElectricityUsageAdviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.WaterUsageAdvice,
      via.generatedprotos.WaterUsageAdvice> getUpdateWaterUsageAdviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWaterUsageAdvice",
      requestType = via.generatedprotos.WaterUsageAdvice.class,
      responseType = via.generatedprotos.WaterUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.WaterUsageAdvice,
      via.generatedprotos.WaterUsageAdvice> getUpdateWaterUsageAdviceMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.WaterUsageAdvice, via.generatedprotos.WaterUsageAdvice> getUpdateWaterUsageAdviceMethod;
    if ((getUpdateWaterUsageAdviceMethod = AdviceManagementGrpc.getUpdateWaterUsageAdviceMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getUpdateWaterUsageAdviceMethod = AdviceManagementGrpc.getUpdateWaterUsageAdviceMethod) == null) {
          AdviceManagementGrpc.getUpdateWaterUsageAdviceMethod = getUpdateWaterUsageAdviceMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.WaterUsageAdvice, via.generatedprotos.WaterUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWaterUsageAdvice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsageAdvice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("UpdateWaterUsageAdvice"))
              .build();
        }
      }
    }
    return getUpdateWaterUsageAdviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsageAdvice,
      via.generatedprotos.ElectricityUsageAdvice> getUpdateElectricityUsageAdviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateElectricityUsageAdvice",
      requestType = via.generatedprotos.ElectricityUsageAdvice.class,
      responseType = via.generatedprotos.ElectricityUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsageAdvice,
      via.generatedprotos.ElectricityUsageAdvice> getUpdateElectricityUsageAdviceMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsageAdvice, via.generatedprotos.ElectricityUsageAdvice> getUpdateElectricityUsageAdviceMethod;
    if ((getUpdateElectricityUsageAdviceMethod = AdviceManagementGrpc.getUpdateElectricityUsageAdviceMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getUpdateElectricityUsageAdviceMethod = AdviceManagementGrpc.getUpdateElectricityUsageAdviceMethod) == null) {
          AdviceManagementGrpc.getUpdateElectricityUsageAdviceMethod = getUpdateElectricityUsageAdviceMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ElectricityUsageAdvice, via.generatedprotos.ElectricityUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateElectricityUsageAdvice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsageAdvice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("UpdateElectricityUsageAdvice"))
              .build();
        }
      }
    }
    return getUpdateElectricityUsageAdviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteWaterUsageAdviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWaterUsageAdvice",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteWaterUsageAdviceMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.Empty> getDeleteWaterUsageAdviceMethod;
    if ((getDeleteWaterUsageAdviceMethod = AdviceManagementGrpc.getDeleteWaterUsageAdviceMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getDeleteWaterUsageAdviceMethod = AdviceManagementGrpc.getDeleteWaterUsageAdviceMethod) == null) {
          AdviceManagementGrpc.getDeleteWaterUsageAdviceMethod = getDeleteWaterUsageAdviceMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWaterUsageAdvice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("DeleteWaterUsageAdvice"))
              .build();
        }
      }
    }
    return getDeleteWaterUsageAdviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteElectricityUsageAdviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteElectricityUsageAdvice",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteElectricityUsageAdviceMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.Empty> getDeleteElectricityUsageAdviceMethod;
    if ((getDeleteElectricityUsageAdviceMethod = AdviceManagementGrpc.getDeleteElectricityUsageAdviceMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getDeleteElectricityUsageAdviceMethod = AdviceManagementGrpc.getDeleteElectricityUsageAdviceMethod) == null) {
          AdviceManagementGrpc.getDeleteElectricityUsageAdviceMethod = getDeleteElectricityUsageAdviceMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteElectricityUsageAdvice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("DeleteElectricityUsageAdvice"))
              .build();
        }
      }
    }
    return getDeleteElectricityUsageAdviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.WaterUsageAdvice> getGetWaterUsageAdviceByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterUsageAdviceById",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.WaterUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.WaterUsageAdvice> getGetWaterUsageAdviceByIdMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.WaterUsageAdvice> getGetWaterUsageAdviceByIdMethod;
    if ((getGetWaterUsageAdviceByIdMethod = AdviceManagementGrpc.getGetWaterUsageAdviceByIdMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getGetWaterUsageAdviceByIdMethod = AdviceManagementGrpc.getGetWaterUsageAdviceByIdMethod) == null) {
          AdviceManagementGrpc.getGetWaterUsageAdviceByIdMethod = getGetWaterUsageAdviceByIdMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.WaterUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaterUsageAdviceById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("GetWaterUsageAdviceById"))
              .build();
        }
      }
    }
    return getGetWaterUsageAdviceByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.ElectricityUsageAdvice> getGetElectricityUsageAdviceByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectricityUsageAdviceById",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.ElectricityUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.ElectricityUsageAdvice> getGetElectricityUsageAdviceByIdMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.ElectricityUsageAdvice> getGetElectricityUsageAdviceByIdMethod;
    if ((getGetElectricityUsageAdviceByIdMethod = AdviceManagementGrpc.getGetElectricityUsageAdviceByIdMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getGetElectricityUsageAdviceByIdMethod = AdviceManagementGrpc.getGetElectricityUsageAdviceByIdMethod) == null) {
          AdviceManagementGrpc.getGetElectricityUsageAdviceByIdMethod = getGetElectricityUsageAdviceByIdMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.ElectricityUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectricityUsageAdviceById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("GetElectricityUsageAdviceById"))
              .build();
        }
      }
    }
    return getGetElectricityUsageAdviceByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdviceManagementStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdviceManagementStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdviceManagementStub>() {
        @java.lang.Override
        public AdviceManagementStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdviceManagementStub(channel, callOptions);
        }
      };
    return AdviceManagementStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdviceManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdviceManagementBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdviceManagementBlockingStub>() {
        @java.lang.Override
        public AdviceManagementBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdviceManagementBlockingStub(channel, callOptions);
        }
      };
    return AdviceManagementBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdviceManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdviceManagementFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdviceManagementFutureStub>() {
        @java.lang.Override
        public AdviceManagementFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdviceManagementFutureStub(channel, callOptions);
        }
      };
    return AdviceManagementFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AdviceManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWaterUsageAdvice(via.generatedprotos.WaterUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaterUsageAdviceMethod(), responseObserver);
    }

    /**
     */
    public void getElectricityUsageAdvice(via.generatedprotos.ElectricityUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectricityUsageAdviceMethod(), responseObserver);
    }

    /**
     */
    public void updateWaterUsageAdvice(via.generatedprotos.WaterUsageAdvice request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWaterUsageAdviceMethod(), responseObserver);
    }

    /**
     */
    public void updateElectricityUsageAdvice(via.generatedprotos.ElectricityUsageAdvice request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateElectricityUsageAdviceMethod(), responseObserver);
    }

    /**
     */
    public void deleteWaterUsageAdvice(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWaterUsageAdviceMethod(), responseObserver);
    }

    /**
     */
    public void deleteElectricityUsageAdvice(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteElectricityUsageAdviceMethod(), responseObserver);
    }

    /**
     */
    public void getWaterUsageAdviceById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaterUsageAdviceByIdMethod(), responseObserver);
    }

    /**
     */
    public void getElectricityUsageAdviceById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectricityUsageAdviceByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWaterUsageAdviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.WaterUsage,
                via.generatedprotos.WaterUsageAdvice>(
                  this, METHODID_GET_WATER_USAGE_ADVICE)))
          .addMethod(
            getGetElectricityUsageAdviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ElectricityUsage,
                via.generatedprotos.ElectricityUsageAdvice>(
                  this, METHODID_GET_ELECTRICITY_USAGE_ADVICE)))
          .addMethod(
            getUpdateWaterUsageAdviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.WaterUsageAdvice,
                via.generatedprotos.WaterUsageAdvice>(
                  this, METHODID_UPDATE_WATER_USAGE_ADVICE)))
          .addMethod(
            getUpdateElectricityUsageAdviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ElectricityUsageAdvice,
                via.generatedprotos.ElectricityUsageAdvice>(
                  this, METHODID_UPDATE_ELECTRICITY_USAGE_ADVICE)))
          .addMethod(
            getDeleteWaterUsageAdviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.Empty>(
                  this, METHODID_DELETE_WATER_USAGE_ADVICE)))
          .addMethod(
            getDeleteElectricityUsageAdviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.Empty>(
                  this, METHODID_DELETE_ELECTRICITY_USAGE_ADVICE)))
          .addMethod(
            getGetWaterUsageAdviceByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.WaterUsageAdvice>(
                  this, METHODID_GET_WATER_USAGE_ADVICE_BY_ID)))
          .addMethod(
            getGetElectricityUsageAdviceByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.ElectricityUsageAdvice>(
                  this, METHODID_GET_ELECTRICITY_USAGE_ADVICE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class AdviceManagementStub extends io.grpc.stub.AbstractAsyncStub<AdviceManagementStub> {
    private AdviceManagementStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdviceManagementStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdviceManagementStub(channel, callOptions);
    }

    /**
     */
    public void getWaterUsageAdvice(via.generatedprotos.WaterUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaterUsageAdviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getElectricityUsageAdvice(via.generatedprotos.ElectricityUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectricityUsageAdviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWaterUsageAdvice(via.generatedprotos.WaterUsageAdvice request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWaterUsageAdviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateElectricityUsageAdvice(via.generatedprotos.ElectricityUsageAdvice request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateElectricityUsageAdviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWaterUsageAdvice(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWaterUsageAdviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteElectricityUsageAdvice(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteElectricityUsageAdviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWaterUsageAdviceById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaterUsageAdviceByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getElectricityUsageAdviceById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectricityUsageAdviceByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdviceManagementBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdviceManagementBlockingStub> {
    private AdviceManagementBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdviceManagementBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdviceManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.generatedprotos.WaterUsageAdvice getWaterUsageAdvice(via.generatedprotos.WaterUsage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaterUsageAdviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ElectricityUsageAdvice getElectricityUsageAdvice(via.generatedprotos.ElectricityUsage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectricityUsageAdviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.WaterUsageAdvice updateWaterUsageAdvice(via.generatedprotos.WaterUsageAdvice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWaterUsageAdviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ElectricityUsageAdvice updateElectricityUsageAdvice(via.generatedprotos.ElectricityUsageAdvice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateElectricityUsageAdviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.Empty deleteWaterUsageAdvice(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWaterUsageAdviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.Empty deleteElectricityUsageAdvice(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteElectricityUsageAdviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.WaterUsageAdvice getWaterUsageAdviceById(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaterUsageAdviceByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ElectricityUsageAdvice getElectricityUsageAdviceById(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectricityUsageAdviceByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdviceManagementFutureStub extends io.grpc.stub.AbstractFutureStub<AdviceManagementFutureStub> {
    private AdviceManagementFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdviceManagementFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdviceManagementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.WaterUsageAdvice> getWaterUsageAdvice(
        via.generatedprotos.WaterUsage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaterUsageAdviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ElectricityUsageAdvice> getElectricityUsageAdvice(
        via.generatedprotos.ElectricityUsage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectricityUsageAdviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.WaterUsageAdvice> updateWaterUsageAdvice(
        via.generatedprotos.WaterUsageAdvice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWaterUsageAdviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ElectricityUsageAdvice> updateElectricityUsageAdvice(
        via.generatedprotos.ElectricityUsageAdvice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateElectricityUsageAdviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.Empty> deleteWaterUsageAdvice(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWaterUsageAdviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.Empty> deleteElectricityUsageAdvice(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteElectricityUsageAdviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.WaterUsageAdvice> getWaterUsageAdviceById(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaterUsageAdviceByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ElectricityUsageAdvice> getElectricityUsageAdviceById(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectricityUsageAdviceByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WATER_USAGE_ADVICE = 0;
  private static final int METHODID_GET_ELECTRICITY_USAGE_ADVICE = 1;
  private static final int METHODID_UPDATE_WATER_USAGE_ADVICE = 2;
  private static final int METHODID_UPDATE_ELECTRICITY_USAGE_ADVICE = 3;
  private static final int METHODID_DELETE_WATER_USAGE_ADVICE = 4;
  private static final int METHODID_DELETE_ELECTRICITY_USAGE_ADVICE = 5;
  private static final int METHODID_GET_WATER_USAGE_ADVICE_BY_ID = 6;
  private static final int METHODID_GET_ELECTRICITY_USAGE_ADVICE_BY_ID = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdviceManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdviceManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WATER_USAGE_ADVICE:
          serviceImpl.getWaterUsageAdvice((via.generatedprotos.WaterUsage) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice>) responseObserver);
          break;
        case METHODID_GET_ELECTRICITY_USAGE_ADVICE:
          serviceImpl.getElectricityUsageAdvice((via.generatedprotos.ElectricityUsage) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice>) responseObserver);
          break;
        case METHODID_UPDATE_WATER_USAGE_ADVICE:
          serviceImpl.updateWaterUsageAdvice((via.generatedprotos.WaterUsageAdvice) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice>) responseObserver);
          break;
        case METHODID_UPDATE_ELECTRICITY_USAGE_ADVICE:
          serviceImpl.updateElectricityUsageAdvice((via.generatedprotos.ElectricityUsageAdvice) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice>) responseObserver);
          break;
        case METHODID_DELETE_WATER_USAGE_ADVICE:
          serviceImpl.deleteWaterUsageAdvice((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ELECTRICITY_USAGE_ADVICE:
          serviceImpl.deleteElectricityUsageAdvice((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.Empty>) responseObserver);
          break;
        case METHODID_GET_WATER_USAGE_ADVICE_BY_ID:
          serviceImpl.getWaterUsageAdviceById((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice>) responseObserver);
          break;
        case METHODID_GET_ELECTRICITY_USAGE_ADVICE_BY_ID:
          serviceImpl.getElectricityUsageAdviceById((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice>) responseObserver);
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

  private static abstract class AdviceManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdviceManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.generatedprotos.Definitions.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdviceManagement");
    }
  }

  private static final class AdviceManagementFileDescriptorSupplier
      extends AdviceManagementBaseDescriptorSupplier {
    AdviceManagementFileDescriptorSupplier() {}
  }

  private static final class AdviceManagementMethodDescriptorSupplier
      extends AdviceManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdviceManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdviceManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdviceManagementFileDescriptorSupplier())
              .addMethod(getGetWaterUsageAdviceMethod())
              .addMethod(getGetElectricityUsageAdviceMethod())
              .addMethod(getUpdateWaterUsageAdviceMethod())
              .addMethod(getUpdateElectricityUsageAdviceMethod())
              .addMethod(getDeleteWaterUsageAdviceMethod())
              .addMethod(getDeleteElectricityUsageAdviceMethod())
              .addMethod(getGetWaterUsageAdviceByIdMethod())
              .addMethod(getGetElectricityUsageAdviceByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
