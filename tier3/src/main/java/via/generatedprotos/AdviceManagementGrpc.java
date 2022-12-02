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
  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.WaterUsageAdvice,
      via.generatedprotos.WaterUsageAdvice> getCreateWaterUsageAdviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWaterUsageAdvice",
      requestType = via.generatedprotos.WaterUsageAdvice.class,
      responseType = via.generatedprotos.WaterUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.WaterUsageAdvice,
      via.generatedprotos.WaterUsageAdvice> getCreateWaterUsageAdviceMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.WaterUsageAdvice, via.generatedprotos.WaterUsageAdvice> getCreateWaterUsageAdviceMethod;
    if ((getCreateWaterUsageAdviceMethod = AdviceManagementGrpc.getCreateWaterUsageAdviceMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getCreateWaterUsageAdviceMethod = AdviceManagementGrpc.getCreateWaterUsageAdviceMethod) == null) {
          AdviceManagementGrpc.getCreateWaterUsageAdviceMethod = getCreateWaterUsageAdviceMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.WaterUsageAdvice, via.generatedprotos.WaterUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWaterUsageAdvice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsageAdvice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.WaterUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("CreateWaterUsageAdvice"))
              .build();
        }
      }
    }
    return getCreateWaterUsageAdviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsageAdvice,
      via.generatedprotos.ElectricityUsageAdvice> getCreateElectricityUsageAdviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateElectricityUsageAdvice",
      requestType = via.generatedprotos.ElectricityUsageAdvice.class,
      responseType = via.generatedprotos.ElectricityUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsageAdvice,
      via.generatedprotos.ElectricityUsageAdvice> getCreateElectricityUsageAdviceMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ElectricityUsageAdvice, via.generatedprotos.ElectricityUsageAdvice> getCreateElectricityUsageAdviceMethod;
    if ((getCreateElectricityUsageAdviceMethod = AdviceManagementGrpc.getCreateElectricityUsageAdviceMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getCreateElectricityUsageAdviceMethod = AdviceManagementGrpc.getCreateElectricityUsageAdviceMethod) == null) {
          AdviceManagementGrpc.getCreateElectricityUsageAdviceMethod = getCreateElectricityUsageAdviceMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ElectricityUsageAdvice, via.generatedprotos.ElectricityUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateElectricityUsageAdvice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsageAdvice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ElectricityUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("CreateElectricityUsageAdvice"))
              .build();
        }
      }
    }
    return getCreateElectricityUsageAdviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListWaterUsageAdvice> getGetWaterUsageAdvicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterUsageAdvices",
      requestType = via.generatedprotos.Empty.class,
      responseType = via.generatedprotos.ListWaterUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListWaterUsageAdvice> getGetWaterUsageAdvicesMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.Empty, via.generatedprotos.ListWaterUsageAdvice> getGetWaterUsageAdvicesMethod;
    if ((getGetWaterUsageAdvicesMethod = AdviceManagementGrpc.getGetWaterUsageAdvicesMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getGetWaterUsageAdvicesMethod = AdviceManagementGrpc.getGetWaterUsageAdvicesMethod) == null) {
          AdviceManagementGrpc.getGetWaterUsageAdvicesMethod = getGetWaterUsageAdvicesMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.Empty, via.generatedprotos.ListWaterUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaterUsageAdvices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListWaterUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("GetWaterUsageAdvices"))
              .build();
        }
      }
    }
    return getGetWaterUsageAdvicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListElectricityUsageAdvice> getGetElectricityUsageAdvicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectricityUsageAdvices",
      requestType = via.generatedprotos.Empty.class,
      responseType = via.generatedprotos.ListElectricityUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.Empty,
      via.generatedprotos.ListElectricityUsageAdvice> getGetElectricityUsageAdvicesMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.Empty, via.generatedprotos.ListElectricityUsageAdvice> getGetElectricityUsageAdvicesMethod;
    if ((getGetElectricityUsageAdvicesMethod = AdviceManagementGrpc.getGetElectricityUsageAdvicesMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getGetElectricityUsageAdvicesMethod = AdviceManagementGrpc.getGetElectricityUsageAdvicesMethod) == null) {
          AdviceManagementGrpc.getGetElectricityUsageAdvicesMethod = getGetElectricityUsageAdvicesMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.Empty, via.generatedprotos.ListElectricityUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectricityUsageAdvices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListElectricityUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("GetElectricityUsageAdvices"))
              .build();
        }
      }
    }
    return getGetElectricityUsageAdvicesMethod;
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

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.ListWaterUsageAdvice> getGetWaterAdvicesByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaterAdvicesByUserId",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.ListWaterUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.ListWaterUsageAdvice> getGetWaterAdvicesByUserIdMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.ListWaterUsageAdvice> getGetWaterAdvicesByUserIdMethod;
    if ((getGetWaterAdvicesByUserIdMethod = AdviceManagementGrpc.getGetWaterAdvicesByUserIdMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getGetWaterAdvicesByUserIdMethod = AdviceManagementGrpc.getGetWaterAdvicesByUserIdMethod) == null) {
          AdviceManagementGrpc.getGetWaterAdvicesByUserIdMethod = getGetWaterAdvicesByUserIdMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.ListWaterUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaterAdvicesByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListWaterUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("GetWaterAdvicesByUserId"))
              .build();
        }
      }
    }
    return getGetWaterAdvicesByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.ListElectricityUsageAdvice> getGetElectricityAdvicesByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectricityAdvicesByUserId",
      requestType = via.generatedprotos.ID.class,
      responseType = via.generatedprotos.ListElectricityUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.ID,
      via.generatedprotos.ListElectricityUsageAdvice> getGetElectricityAdvicesByUserIdMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.ID, via.generatedprotos.ListElectricityUsageAdvice> getGetElectricityAdvicesByUserIdMethod;
    if ((getGetElectricityAdvicesByUserIdMethod = AdviceManagementGrpc.getGetElectricityAdvicesByUserIdMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getGetElectricityAdvicesByUserIdMethod = AdviceManagementGrpc.getGetElectricityAdvicesByUserIdMethod) == null) {
          AdviceManagementGrpc.getGetElectricityAdvicesByUserIdMethod = getGetElectricityAdvicesByUserIdMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.ID, via.generatedprotos.ListElectricityUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectricityAdvicesByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListElectricityUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("GetElectricityAdvicesByUserId"))
              .build();
        }
      }
    }
    return getGetElectricityAdvicesByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.AdviceCreation,
      via.generatedprotos.ListWaterUsageAdvice> getAssignWaterUsageAdviceToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignWaterUsageAdviceToUser",
      requestType = via.generatedprotos.AdviceCreation.class,
      responseType = via.generatedprotos.ListWaterUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.AdviceCreation,
      via.generatedprotos.ListWaterUsageAdvice> getAssignWaterUsageAdviceToUserMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.AdviceCreation, via.generatedprotos.ListWaterUsageAdvice> getAssignWaterUsageAdviceToUserMethod;
    if ((getAssignWaterUsageAdviceToUserMethod = AdviceManagementGrpc.getAssignWaterUsageAdviceToUserMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getAssignWaterUsageAdviceToUserMethod = AdviceManagementGrpc.getAssignWaterUsageAdviceToUserMethod) == null) {
          AdviceManagementGrpc.getAssignWaterUsageAdviceToUserMethod = getAssignWaterUsageAdviceToUserMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.AdviceCreation, via.generatedprotos.ListWaterUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignWaterUsageAdviceToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.AdviceCreation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListWaterUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("AssignWaterUsageAdviceToUser"))
              .build();
        }
      }
    }
    return getAssignWaterUsageAdviceToUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.generatedprotos.AdviceCreation,
      via.generatedprotos.ListElectricityUsageAdvice> getAssignElectricityUsageAdviceToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignElectricityUsageAdviceToUser",
      requestType = via.generatedprotos.AdviceCreation.class,
      responseType = via.generatedprotos.ListElectricityUsageAdvice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.generatedprotos.AdviceCreation,
      via.generatedprotos.ListElectricityUsageAdvice> getAssignElectricityUsageAdviceToUserMethod() {
    io.grpc.MethodDescriptor<via.generatedprotos.AdviceCreation, via.generatedprotos.ListElectricityUsageAdvice> getAssignElectricityUsageAdviceToUserMethod;
    if ((getAssignElectricityUsageAdviceToUserMethod = AdviceManagementGrpc.getAssignElectricityUsageAdviceToUserMethod) == null) {
      synchronized (AdviceManagementGrpc.class) {
        if ((getAssignElectricityUsageAdviceToUserMethod = AdviceManagementGrpc.getAssignElectricityUsageAdviceToUserMethod) == null) {
          AdviceManagementGrpc.getAssignElectricityUsageAdviceToUserMethod = getAssignElectricityUsageAdviceToUserMethod =
              io.grpc.MethodDescriptor.<via.generatedprotos.AdviceCreation, via.generatedprotos.ListElectricityUsageAdvice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignElectricityUsageAdviceToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.AdviceCreation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.generatedprotos.ListElectricityUsageAdvice.getDefaultInstance()))
              .setSchemaDescriptor(new AdviceManagementMethodDescriptorSupplier("AssignElectricityUsageAdviceToUser"))
              .build();
        }
      }
    }
    return getAssignElectricityUsageAdviceToUserMethod;
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
    public void createWaterUsageAdvice(via.generatedprotos.WaterUsageAdvice request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWaterUsageAdviceMethod(), responseObserver);
    }

    /**
     */
    public void createElectricityUsageAdvice(via.generatedprotos.ElectricityUsageAdvice request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateElectricityUsageAdviceMethod(), responseObserver);
    }

    /**
     */
    public void getWaterUsageAdvices(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaterUsageAdvicesMethod(), responseObserver);
    }

    /**
     */
    public void getElectricityUsageAdvices(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectricityUsageAdvicesMethod(), responseObserver);
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

    /**
     */
    public void getWaterAdvicesByUserId(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaterAdvicesByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void getElectricityAdvicesByUserId(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectricityAdvicesByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void assignWaterUsageAdviceToUser(via.generatedprotos.AdviceCreation request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignWaterUsageAdviceToUserMethod(), responseObserver);
    }

    /**
     */
    public void assignElectricityUsageAdviceToUser(via.generatedprotos.AdviceCreation request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignElectricityUsageAdviceToUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateWaterUsageAdviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.WaterUsageAdvice,
                via.generatedprotos.WaterUsageAdvice>(
                  this, METHODID_CREATE_WATER_USAGE_ADVICE)))
          .addMethod(
            getCreateElectricityUsageAdviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ElectricityUsageAdvice,
                via.generatedprotos.ElectricityUsageAdvice>(
                  this, METHODID_CREATE_ELECTRICITY_USAGE_ADVICE)))
          .addMethod(
            getGetWaterUsageAdvicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.Empty,
                via.generatedprotos.ListWaterUsageAdvice>(
                  this, METHODID_GET_WATER_USAGE_ADVICES)))
          .addMethod(
            getGetElectricityUsageAdvicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.Empty,
                via.generatedprotos.ListElectricityUsageAdvice>(
                  this, METHODID_GET_ELECTRICITY_USAGE_ADVICES)))
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
          .addMethod(
            getGetWaterAdvicesByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.ListWaterUsageAdvice>(
                  this, METHODID_GET_WATER_ADVICES_BY_USER_ID)))
          .addMethod(
            getGetElectricityAdvicesByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.ID,
                via.generatedprotos.ListElectricityUsageAdvice>(
                  this, METHODID_GET_ELECTRICITY_ADVICES_BY_USER_ID)))
          .addMethod(
            getAssignWaterUsageAdviceToUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.AdviceCreation,
                via.generatedprotos.ListWaterUsageAdvice>(
                  this, METHODID_ASSIGN_WATER_USAGE_ADVICE_TO_USER)))
          .addMethod(
            getAssignElectricityUsageAdviceToUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.generatedprotos.AdviceCreation,
                via.generatedprotos.ListElectricityUsageAdvice>(
                  this, METHODID_ASSIGN_ELECTRICITY_USAGE_ADVICE_TO_USER)))
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
    public void createWaterUsageAdvice(via.generatedprotos.WaterUsageAdvice request,
        io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWaterUsageAdviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createElectricityUsageAdvice(via.generatedprotos.ElectricityUsageAdvice request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateElectricityUsageAdviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWaterUsageAdvices(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaterUsageAdvicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getElectricityUsageAdvices(via.generatedprotos.Empty request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectricityUsageAdvicesMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void getWaterAdvicesByUserId(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaterAdvicesByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getElectricityAdvicesByUserId(via.generatedprotos.ID request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectricityAdvicesByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignWaterUsageAdviceToUser(via.generatedprotos.AdviceCreation request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignWaterUsageAdviceToUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignElectricityUsageAdviceToUser(via.generatedprotos.AdviceCreation request,
        io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsageAdvice> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignElectricityUsageAdviceToUserMethod(), getCallOptions()), request, responseObserver);
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
    public via.generatedprotos.WaterUsageAdvice createWaterUsageAdvice(via.generatedprotos.WaterUsageAdvice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWaterUsageAdviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ElectricityUsageAdvice createElectricityUsageAdvice(via.generatedprotos.ElectricityUsageAdvice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateElectricityUsageAdviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ListWaterUsageAdvice getWaterUsageAdvices(via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaterUsageAdvicesMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ListElectricityUsageAdvice getElectricityUsageAdvices(via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectricityUsageAdvicesMethod(), getCallOptions(), request);
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

    /**
     */
    public via.generatedprotos.ListWaterUsageAdvice getWaterAdvicesByUserId(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaterAdvicesByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ListElectricityUsageAdvice getElectricityAdvicesByUserId(via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectricityAdvicesByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ListWaterUsageAdvice assignWaterUsageAdviceToUser(via.generatedprotos.AdviceCreation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignWaterUsageAdviceToUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.generatedprotos.ListElectricityUsageAdvice assignElectricityUsageAdviceToUser(via.generatedprotos.AdviceCreation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignElectricityUsageAdviceToUserMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.WaterUsageAdvice> createWaterUsageAdvice(
        via.generatedprotos.WaterUsageAdvice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWaterUsageAdviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ElectricityUsageAdvice> createElectricityUsageAdvice(
        via.generatedprotos.ElectricityUsageAdvice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateElectricityUsageAdviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListWaterUsageAdvice> getWaterUsageAdvices(
        via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaterUsageAdvicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListElectricityUsageAdvice> getElectricityUsageAdvices(
        via.generatedprotos.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectricityUsageAdvicesMethod(), getCallOptions()), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListWaterUsageAdvice> getWaterAdvicesByUserId(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaterAdvicesByUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListElectricityUsageAdvice> getElectricityAdvicesByUserId(
        via.generatedprotos.ID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectricityAdvicesByUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListWaterUsageAdvice> assignWaterUsageAdviceToUser(
        via.generatedprotos.AdviceCreation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignWaterUsageAdviceToUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.generatedprotos.ListElectricityUsageAdvice> assignElectricityUsageAdviceToUser(
        via.generatedprotos.AdviceCreation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignElectricityUsageAdviceToUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WATER_USAGE_ADVICE = 0;
  private static final int METHODID_CREATE_ELECTRICITY_USAGE_ADVICE = 1;
  private static final int METHODID_GET_WATER_USAGE_ADVICES = 2;
  private static final int METHODID_GET_ELECTRICITY_USAGE_ADVICES = 3;
  private static final int METHODID_UPDATE_WATER_USAGE_ADVICE = 4;
  private static final int METHODID_UPDATE_ELECTRICITY_USAGE_ADVICE = 5;
  private static final int METHODID_DELETE_WATER_USAGE_ADVICE = 6;
  private static final int METHODID_DELETE_ELECTRICITY_USAGE_ADVICE = 7;
  private static final int METHODID_GET_WATER_USAGE_ADVICE_BY_ID = 8;
  private static final int METHODID_GET_ELECTRICITY_USAGE_ADVICE_BY_ID = 9;
  private static final int METHODID_GET_WATER_ADVICES_BY_USER_ID = 10;
  private static final int METHODID_GET_ELECTRICITY_ADVICES_BY_USER_ID = 11;
  private static final int METHODID_ASSIGN_WATER_USAGE_ADVICE_TO_USER = 12;
  private static final int METHODID_ASSIGN_ELECTRICITY_USAGE_ADVICE_TO_USER = 13;

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
        case METHODID_CREATE_WATER_USAGE_ADVICE:
          serviceImpl.createWaterUsageAdvice((via.generatedprotos.WaterUsageAdvice) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.WaterUsageAdvice>) responseObserver);
          break;
        case METHODID_CREATE_ELECTRICITY_USAGE_ADVICE:
          serviceImpl.createElectricityUsageAdvice((via.generatedprotos.ElectricityUsageAdvice) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ElectricityUsageAdvice>) responseObserver);
          break;
        case METHODID_GET_WATER_USAGE_ADVICES:
          serviceImpl.getWaterUsageAdvices((via.generatedprotos.Empty) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsageAdvice>) responseObserver);
          break;
        case METHODID_GET_ELECTRICITY_USAGE_ADVICES:
          serviceImpl.getElectricityUsageAdvices((via.generatedprotos.Empty) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsageAdvice>) responseObserver);
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
        case METHODID_GET_WATER_ADVICES_BY_USER_ID:
          serviceImpl.getWaterAdvicesByUserId((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsageAdvice>) responseObserver);
          break;
        case METHODID_GET_ELECTRICITY_ADVICES_BY_USER_ID:
          serviceImpl.getElectricityAdvicesByUserId((via.generatedprotos.ID) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsageAdvice>) responseObserver);
          break;
        case METHODID_ASSIGN_WATER_USAGE_ADVICE_TO_USER:
          serviceImpl.assignWaterUsageAdviceToUser((via.generatedprotos.AdviceCreation) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListWaterUsageAdvice>) responseObserver);
          break;
        case METHODID_ASSIGN_ELECTRICITY_USAGE_ADVICE_TO_USER:
          serviceImpl.assignElectricityUsageAdviceToUser((via.generatedprotos.AdviceCreation) request,
              (io.grpc.stub.StreamObserver<via.generatedprotos.ListElectricityUsageAdvice>) responseObserver);
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
              .addMethod(getCreateWaterUsageAdviceMethod())
              .addMethod(getCreateElectricityUsageAdviceMethod())
              .addMethod(getGetWaterUsageAdvicesMethod())
              .addMethod(getGetElectricityUsageAdvicesMethod())
              .addMethod(getUpdateWaterUsageAdviceMethod())
              .addMethod(getUpdateElectricityUsageAdviceMethod())
              .addMethod(getDeleteWaterUsageAdviceMethod())
              .addMethod(getDeleteElectricityUsageAdviceMethod())
              .addMethod(getGetWaterUsageAdviceByIdMethod())
              .addMethod(getGetElectricityUsageAdviceByIdMethod())
              .addMethod(getGetWaterAdvicesByUserIdMethod())
              .addMethod(getGetElectricityAdvicesByUserIdMethod())
              .addMethod(getAssignWaterUsageAdviceToUserMethod())
              .addMethod(getAssignElectricityUsageAdviceToUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
