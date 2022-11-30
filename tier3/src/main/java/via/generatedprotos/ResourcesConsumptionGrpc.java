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
      via.generatedprotos.ListWaterUsage> getGetWaterUsagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterUsages",
      requestType = via.generatedprotos.Empty.class,
      responseType = via.generatedprotos.ListWaterUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListWaterUsage> getGetWaterUsagesMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.Empty, via.generatedprotos.ListWaterUsage> getGetWaterUsagesMethod;
    if ((getGetWaterUsagesMethod = ResourcesConsumptionGrpc.getGetWaterUsagesMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getGetWaterUsagesMethod = ResourcesConsumptionGrpc.getGetWaterUsagesMethod) == null) {
          ResourcesConsumptionGrpc.getGetWaterUsagesMethod = getGetWaterUsagesMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.Empty, via.generatedprotos.ListWaterUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaterUsages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListWaterUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("GetWaterUsages"))
              .build();
        }
      }
    }
    return getGetWaterUsagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListElectricityUsage> getGetElectricityUsagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectricityUsages",
      requestType = via.generatedprotos.Empty.class,
      responseType = via.generatedprotos.ListElectricityUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListElectricityUsage> getGetElectricityUsagesMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.Empty, via.generatedprotos.ListElectricityUsage> getGetElectricityUsagesMethod;
    if ((getGetElectricityUsagesMethod = ResourcesConsumptionGrpc.getGetElectricityUsagesMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getGetElectricityUsagesMethod = ResourcesConsumptionGrpc.getGetElectricityUsagesMethod) == null) {
          ResourcesConsumptionGrpc.getGetElectricityUsagesMethod = getGetElectricityUsagesMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.Empty, via.generatedprotos.ListElectricityUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectricityUsages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListElectricityUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("GetElectricityUsages"))
              .build();
        }
      }
    }
    return getGetElectricityUsagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.WaterUsage,
      via.generatedprotos.WaterUsage> getUpdateWaterUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWaterUsage",
      requestType = via.generatedprotos.WaterUsage.class,
      responseType = via.generatedprotos.WaterUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.WaterUsage,
      via.generatedprotos.WaterUsage> getUpdateWaterUsageMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.WaterUsage, via.generatedprotos.WaterUsage> getUpdateWaterUsageMethod;
    if ((getUpdateWaterUsageMethod = ResourcesConsumptionGrpc.getUpdateWaterUsageMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getUpdateWaterUsageMethod = ResourcesConsumptionGrpc.getUpdateWaterUsageMethod) == null) {
          ResourcesConsumptionGrpc.getUpdateWaterUsageMethod = getUpdateWaterUsageMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.WaterUsage, via.generatedprotos.WaterUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWaterUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("UpdateWaterUsage"))
              .build();
        }
      }
    }
    return getUpdateWaterUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsage,
      via.generatedprotos.ElectricityUsage> getUpdateElectricityUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateElectricityUsage",
      requestType = via.generatedprotos.ElectricityUsage.class,
      responseType = via.generatedprotos.ElectricityUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsage,
      via.generatedprotos.ElectricityUsage> getUpdateElectricityUsageMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsage, via.generatedprotos.ElectricityUsage> getUpdateElectricityUsageMethod;
    if ((getUpdateElectricityUsageMethod = ResourcesConsumptionGrpc.getUpdateElectricityUsageMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getUpdateElectricityUsageMethod = ResourcesConsumptionGrpc.getUpdateElectricityUsageMethod) == null) {
          ResourcesConsumptionGrpc.getUpdateElectricityUsageMethod = getUpdateElectricityUsageMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ElectricityUsage, via.generatedprotos.ElectricityUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateElectricityUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("UpdateElectricityUsage"))
              .build();
        }
      }
    }
    return getUpdateElectricityUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteWaterUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWaterUsage",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteWaterUsageMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.Empty> getDeleteWaterUsageMethod;
    if ((getDeleteWaterUsageMethod = ResourcesConsumptionGrpc.getDeleteWaterUsageMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getDeleteWaterUsageMethod = ResourcesConsumptionGrpc.getDeleteWaterUsageMethod) == null) {
          ResourcesConsumptionGrpc.getDeleteWaterUsageMethod = getDeleteWaterUsageMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWaterUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("DeleteWaterUsage"))
              .build();
        }
      }
    }
    return getDeleteWaterUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteElectricityUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteElectricityUsage",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.Empty> getDeleteElectricityUsageMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.Empty> getDeleteElectricityUsageMethod;
    if ((getDeleteElectricityUsageMethod = ResourcesConsumptionGrpc.getDeleteElectricityUsageMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getDeleteElectricityUsageMethod = ResourcesConsumptionGrpc.getDeleteElectricityUsageMethod) == null) {
          ResourcesConsumptionGrpc.getDeleteElectricityUsageMethod = getDeleteElectricityUsageMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteElectricityUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("DeleteElectricityUsage"))
              .build();
        }
      }
    }
    return getDeleteElectricityUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.WaterUsage> getGetWaterUsageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterUsageById",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.WaterUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.WaterUsage> getGetWaterUsageByIdMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.WaterUsage> getGetWaterUsageByIdMethod;
    if ((getGetWaterUsageByIdMethod = ResourcesConsumptionGrpc.getGetWaterUsageByIdMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getGetWaterUsageByIdMethod = ResourcesConsumptionGrpc.getGetWaterUsageByIdMethod) == null) {
          ResourcesConsumptionGrpc.getGetWaterUsageByIdMethod = getGetWaterUsageByIdMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.WaterUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaterUsageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("GetWaterUsageById"))
              .build();
        }
      }
    }
    return getGetWaterUsageByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.ElectricityUsage> getGetElectricityUsageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectricityUsageById",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.ElectricityUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.ElectricityUsage> getGetElectricityUsageByIdMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.ElectricityUsage> getGetElectricityUsageByIdMethod;
    if ((getGetElectricityUsageByIdMethod = ResourcesConsumptionGrpc.getGetElectricityUsageByIdMethod) == null) {
      synchronized (ResourcesConsumptionGrpc.class) {
        if ((getGetElectricityUsageByIdMethod = ResourcesConsumptionGrpc.getGetElectricityUsageByIdMethod) == null) {
          ResourcesConsumptionGrpc.getGetElectricityUsageByIdMethod = getGetElectricityUsageByIdMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.ElectricityUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectricityUsageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsage.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesConsumptionMethodDescriptorSupplier("GetElectricityUsageById"))
              .build();
        }
      }
    }
    return getGetElectricityUsageByIdMethod;
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
    public void getWaterUsages(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaterUsagesMethod(), responseObserver);
    }

    /**
     */
    public void getElectricityUsages(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectricityUsagesMethod(), responseObserver);
    }

    /**
     */
    public void updateWaterUsage(via.generatedprotos.WaterUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWaterUsageMethod(), responseObserver);
    }

    /**
     */
    public void updateElectricityUsage(via.generatedprotos.ElectricityUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateElectricityUsageMethod(), responseObserver);
    }

    /**
     */
    public void deleteWaterUsage(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWaterUsageMethod(), responseObserver);
    }

    /**
     */
    public void deleteElectricityUsage(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteElectricityUsageMethod(), responseObserver);
    }

    /**
     */
    public void getWaterUsageById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaterUsageByIdMethod(), responseObserver);
    }

    /**
     */
    public void getElectricityUsageById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectricityUsageByIdMethod(), responseObserver);
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
            getGetWaterUsagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.Empty,
                via.generatedprotos.ListWaterUsage>(
                  this, METHODID_GET_WATER_USAGES)))
          .addMethod(
            getGetElectricityUsagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.Empty,
                via.generatedprotos.ListElectricityUsage>(
                  this, METHODID_GET_ELECTRICITY_USAGES)))
          .addMethod(
            getUpdateWaterUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.WaterUsage,
                via.generatedprotos.WaterUsage>(
                  this, METHODID_UPDATE_WATER_USAGE)))
          .addMethod(
            getUpdateElectricityUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ElectricityUsage,
                via.generatedprotos.ElectricityUsage>(
                  this, METHODID_UPDATE_ELECTRICITY_USAGE)))
          .addMethod(
            getDeleteWaterUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.Empty>(
                  this, METHODID_DELETE_WATER_USAGE)))
          .addMethod(
            getDeleteElectricityUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.Empty>(
                  this, METHODID_DELETE_ELECTRICITY_USAGE)))
          .addMethod(
            getGetWaterUsageByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.WaterUsage>(
                  this, METHODID_GET_WATER_USAGE_BY_ID)))
          .addMethod(
            getGetElectricityUsageByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.ElectricityUsage>(
                  this, METHODID_GET_ELECTRICITY_USAGE_BY_ID)))
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
    public void getWaterUsages(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaterUsagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getElectricityUsages(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectricityUsagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWaterUsage(via.generatedprotos.WaterUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWaterUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateElectricityUsage(via.generatedprotos.ElectricityUsage request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateElectricityUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWaterUsage(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWaterUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteElectricityUsage(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteElectricityUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWaterUsageById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaterUsageByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getElectricityUsageById(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectricityUsageByIdMethod(), getCallOptions()), request, responseObserver);
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
    public via.generatedprotos.ListWaterUsage getWaterUsages(via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaterUsagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ListElectricityUsage getElectricityUsages(via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectricityUsagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.WaterUsage updateWaterUsage(via.generatedprotos.WaterUsage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWaterUsageMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ElectricityUsage updateElectricityUsage(via.generatedprotos.ElectricityUsage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateElectricityUsageMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.Empty deleteWaterUsage(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWaterUsageMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.Empty deleteElectricityUsage(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteElectricityUsageMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.WaterUsage getWaterUsageById(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaterUsageByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ElectricityUsage getElectricityUsageById(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectricityUsageByIdMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListWaterUsage> getWaterUsages(
        via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaterUsagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListElectricityUsage> getElectricityUsages(
        via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectricityUsagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.WaterUsage> updateWaterUsage(
        via.generatedprotos.WaterUsage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWaterUsageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ElectricityUsage> updateElectricityUsage(
        via.generatedprotos.ElectricityUsage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateElectricityUsageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.Empty> deleteWaterUsage(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWaterUsageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.Empty> deleteElectricityUsage(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteElectricityUsageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.WaterUsage> getWaterUsageById(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaterUsageByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ElectricityUsage> getElectricityUsageById(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectricityUsageByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG_ELECTRICITY_USAGE = 0;
  private static final int METHODID_LOG_WATER_USAGE = 1;
  private static final int METHODID_GET_WATER_USAGES = 2;
  private static final int METHODID_GET_ELECTRICITY_USAGES = 3;
  private static final int METHODID_UPDATE_WATER_USAGE = 4;
  private static final int METHODID_UPDATE_ELECTRICITY_USAGE = 5;
  private static final int METHODID_DELETE_WATER_USAGE = 6;
  private static final int METHODID_DELETE_ELECTRICITY_USAGE = 7;
  private static final int METHODID_GET_WATER_USAGE_BY_ID = 8;
  private static final int METHODID_GET_ELECTRICITY_USAGE_BY_ID = 9;

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
        case METHODID_GET_WATER_USAGES:
          serviceImpl.getWaterUsages((via.generatedprotos.Empty) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsage>) responseObserver);
          break;
        case METHODID_GET_ELECTRICITY_USAGES:
          serviceImpl.getElectricityUsages((via.generatedprotos.Empty) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsage>) responseObserver);
          break;
        case METHODID_UPDATE_WATER_USAGE:
          serviceImpl.updateWaterUsage((via.generatedprotos.WaterUsage) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsage>) responseObserver);
          break;
        case METHODID_UPDATE_ELECTRICITY_USAGE:
          serviceImpl.updateElectricityUsage((via.generatedprotos.ElectricityUsage) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsage>) responseObserver);
          break;
        case METHODID_DELETE_WATER_USAGE:
          serviceImpl.deleteWaterUsage((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ELECTRICITY_USAGE:
          serviceImpl.deleteElectricityUsage((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.Empty>) responseObserver);
          break;
        case METHODID_GET_WATER_USAGE_BY_ID:
          serviceImpl.getWaterUsageById((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsage>) responseObserver);
          break;
        case METHODID_GET_ELECTRICITY_USAGE_BY_ID:
          serviceImpl.getElectricityUsageById((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsage>) responseObserver);
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
              .addMethod(getGetWaterUsagesMethod())
              .addMethod(getGetElectricityUsagesMethod())
              .addMethod(getUpdateWaterUsageMethod())
              .addMethod(getUpdateElectricityUsageMethod())
              .addMethod(getDeleteWaterUsageMethod())
              .addMethod(getDeleteElectricityUsageMethod())
              .addMethod(getGetWaterUsageByIdMethod())
              .addMethod(getGetElectricityUsageByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
