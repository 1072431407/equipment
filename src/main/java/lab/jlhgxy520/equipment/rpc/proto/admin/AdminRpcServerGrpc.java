package lab.jlhgxy520.equipment.rpc.proto.admin;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.0)",
    comments = "Source: admin.proto")
public final class AdminRpcServerGrpc {

  private AdminRpcServerGrpc() {}

  public static final String SERVICE_NAME = "lab.jlhgxy520.equipment.rpc.proto.admin.AdminRpcServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse> getAdminAddEquipmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adminAddEquipment",
      requestType = lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse> getAdminAddEquipmentMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest, lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse> getAdminAddEquipmentMethod;
    if ((getAdminAddEquipmentMethod = AdminRpcServerGrpc.getAdminAddEquipmentMethod) == null) {
      synchronized (AdminRpcServerGrpc.class) {
        if ((getAdminAddEquipmentMethod = AdminRpcServerGrpc.getAdminAddEquipmentMethod) == null) {
          AdminRpcServerGrpc.getAdminAddEquipmentMethod = getAdminAddEquipmentMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest, lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adminAddEquipment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminRpcServerMethodDescriptorSupplier("adminAddEquipment"))
              .build();
        }
      }
    }
    return getAdminAddEquipmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse> getAdminRemoveEquipmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adminRemoveEquipment",
      requestType = lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse> getAdminRemoveEquipmentMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest, lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse> getAdminRemoveEquipmentMethod;
    if ((getAdminRemoveEquipmentMethod = AdminRpcServerGrpc.getAdminRemoveEquipmentMethod) == null) {
      synchronized (AdminRpcServerGrpc.class) {
        if ((getAdminRemoveEquipmentMethod = AdminRpcServerGrpc.getAdminRemoveEquipmentMethod) == null) {
          AdminRpcServerGrpc.getAdminRemoveEquipmentMethod = getAdminRemoveEquipmentMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest, lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adminRemoveEquipment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminRpcServerMethodDescriptorSupplier("adminRemoveEquipment"))
              .build();
        }
      }
    }
    return getAdminRemoveEquipmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse> getAdminGetEquipmentListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adminGetEquipmentList",
      requestType = lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse> getAdminGetEquipmentListMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest, lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse> getAdminGetEquipmentListMethod;
    if ((getAdminGetEquipmentListMethod = AdminRpcServerGrpc.getAdminGetEquipmentListMethod) == null) {
      synchronized (AdminRpcServerGrpc.class) {
        if ((getAdminGetEquipmentListMethod = AdminRpcServerGrpc.getAdminGetEquipmentListMethod) == null) {
          AdminRpcServerGrpc.getAdminGetEquipmentListMethod = getAdminGetEquipmentListMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest, lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adminGetEquipmentList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminRpcServerMethodDescriptorSupplier("adminGetEquipmentList"))
              .build();
        }
      }
    }
    return getAdminGetEquipmentListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse> getAdminAddClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adminAddClass",
      requestType = lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse> getAdminAddClassMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest, lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse> getAdminAddClassMethod;
    if ((getAdminAddClassMethod = AdminRpcServerGrpc.getAdminAddClassMethod) == null) {
      synchronized (AdminRpcServerGrpc.class) {
        if ((getAdminAddClassMethod = AdminRpcServerGrpc.getAdminAddClassMethod) == null) {
          AdminRpcServerGrpc.getAdminAddClassMethod = getAdminAddClassMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest, lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adminAddClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminRpcServerMethodDescriptorSupplier("adminAddClass"))
              .build();
        }
      }
    }
    return getAdminAddClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse> getAdminRemoveClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adminRemoveClass",
      requestType = lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse> getAdminRemoveClassMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest, lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse> getAdminRemoveClassMethod;
    if ((getAdminRemoveClassMethod = AdminRpcServerGrpc.getAdminRemoveClassMethod) == null) {
      synchronized (AdminRpcServerGrpc.class) {
        if ((getAdminRemoveClassMethod = AdminRpcServerGrpc.getAdminRemoveClassMethod) == null) {
          AdminRpcServerGrpc.getAdminRemoveClassMethod = getAdminRemoveClassMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest, lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adminRemoveClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminRpcServerMethodDescriptorSupplier("adminRemoveClass"))
              .build();
        }
      }
    }
    return getAdminRemoveClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse> getAdminGetClassListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adminGetClassList",
      requestType = lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse> getAdminGetClassListMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest, lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse> getAdminGetClassListMethod;
    if ((getAdminGetClassListMethod = AdminRpcServerGrpc.getAdminGetClassListMethod) == null) {
      synchronized (AdminRpcServerGrpc.class) {
        if ((getAdminGetClassListMethod = AdminRpcServerGrpc.getAdminGetClassListMethod) == null) {
          AdminRpcServerGrpc.getAdminGetClassListMethod = getAdminGetClassListMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest, lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adminGetClassList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminRpcServerMethodDescriptorSupplier("adminGetClassList"))
              .build();
        }
      }
    }
    return getAdminGetClassListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse> getAdminGetTeacherListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adminGetTeacherList",
      requestType = lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse> getAdminGetTeacherListMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest, lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse> getAdminGetTeacherListMethod;
    if ((getAdminGetTeacherListMethod = AdminRpcServerGrpc.getAdminGetTeacherListMethod) == null) {
      synchronized (AdminRpcServerGrpc.class) {
        if ((getAdminGetTeacherListMethod = AdminRpcServerGrpc.getAdminGetTeacherListMethod) == null) {
          AdminRpcServerGrpc.getAdminGetTeacherListMethod = getAdminGetTeacherListMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest, lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adminGetTeacherList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminRpcServerMethodDescriptorSupplier("adminGetTeacherList"))
              .build();
        }
      }
    }
    return getAdminGetTeacherListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse> getAdminRemoveTeacherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adminRemoveTeacher",
      requestType = lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest,
      lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse> getAdminRemoveTeacherMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest, lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse> getAdminRemoveTeacherMethod;
    if ((getAdminRemoveTeacherMethod = AdminRpcServerGrpc.getAdminRemoveTeacherMethod) == null) {
      synchronized (AdminRpcServerGrpc.class) {
        if ((getAdminRemoveTeacherMethod = AdminRpcServerGrpc.getAdminRemoveTeacherMethod) == null) {
          AdminRpcServerGrpc.getAdminRemoveTeacherMethod = getAdminRemoveTeacherMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest, lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adminRemoveTeacher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminRpcServerMethodDescriptorSupplier("adminRemoveTeacher"))
              .build();
        }
      }
    }
    return getAdminRemoveTeacherMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminRpcServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminRpcServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminRpcServerStub>() {
        @java.lang.Override
        public AdminRpcServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminRpcServerStub(channel, callOptions);
        }
      };
    return AdminRpcServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminRpcServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminRpcServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminRpcServerBlockingStub>() {
        @java.lang.Override
        public AdminRpcServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminRpcServerBlockingStub(channel, callOptions);
        }
      };
    return AdminRpcServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminRpcServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminRpcServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminRpcServerFutureStub>() {
        @java.lang.Override
        public AdminRpcServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminRpcServerFutureStub(channel, callOptions);
        }
      };
    return AdminRpcServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AdminRpcServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void adminAddEquipment(lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminAddEquipmentMethod(), responseObserver);
    }

    /**
     */
    public void adminRemoveEquipment(lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminRemoveEquipmentMethod(), responseObserver);
    }

    /**
     */
    public void adminGetEquipmentList(lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminGetEquipmentListMethod(), responseObserver);
    }

    /**
     */
    public void adminAddClass(lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminAddClassMethod(), responseObserver);
    }

    /**
     */
    public void adminRemoveClass(lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminRemoveClassMethod(), responseObserver);
    }

    /**
     */
    public void adminGetClassList(lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminGetClassListMethod(), responseObserver);
    }

    /**
     */
    public void adminGetTeacherList(lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminGetTeacherListMethod(), responseObserver);
    }

    /**
     */
    public void adminRemoveTeacher(lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminRemoveTeacherMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAdminAddEquipmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest,
                lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse>(
                  this, METHODID_ADMIN_ADD_EQUIPMENT)))
          .addMethod(
            getAdminRemoveEquipmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest,
                lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse>(
                  this, METHODID_ADMIN_REMOVE_EQUIPMENT)))
          .addMethod(
            getAdminGetEquipmentListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest,
                lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse>(
                  this, METHODID_ADMIN_GET_EQUIPMENT_LIST)))
          .addMethod(
            getAdminAddClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest,
                lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse>(
                  this, METHODID_ADMIN_ADD_CLASS)))
          .addMethod(
            getAdminRemoveClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest,
                lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse>(
                  this, METHODID_ADMIN_REMOVE_CLASS)))
          .addMethod(
            getAdminGetClassListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest,
                lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse>(
                  this, METHODID_ADMIN_GET_CLASS_LIST)))
          .addMethod(
            getAdminGetTeacherListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest,
                lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse>(
                  this, METHODID_ADMIN_GET_TEACHER_LIST)))
          .addMethod(
            getAdminRemoveTeacherMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest,
                lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse>(
                  this, METHODID_ADMIN_REMOVE_TEACHER)))
          .build();
    }
  }

  /**
   */
  public static final class AdminRpcServerStub extends io.grpc.stub.AbstractAsyncStub<AdminRpcServerStub> {
    private AdminRpcServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminRpcServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminRpcServerStub(channel, callOptions);
    }

    /**
     */
    public void adminAddEquipment(lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdminAddEquipmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adminRemoveEquipment(lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdminRemoveEquipmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adminGetEquipmentList(lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAdminGetEquipmentListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adminAddClass(lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdminAddClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adminRemoveClass(lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdminRemoveClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adminGetClassList(lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAdminGetClassListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adminGetTeacherList(lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAdminGetTeacherListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adminRemoveTeacher(lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdminRemoveTeacherMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdminRpcServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdminRpcServerBlockingStub> {
    private AdminRpcServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminRpcServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminRpcServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse adminAddEquipment(lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdminAddEquipmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse adminRemoveEquipment(lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdminRemoveEquipmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse> adminGetEquipmentList(
        lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAdminGetEquipmentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse adminAddClass(lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdminAddClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse adminRemoveClass(lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdminRemoveClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse> adminGetClassList(
        lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAdminGetClassListMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse> adminGetTeacherList(
        lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAdminGetTeacherListMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse adminRemoveTeacher(lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdminRemoveTeacherMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdminRpcServerFutureStub extends io.grpc.stub.AbstractFutureStub<AdminRpcServerFutureStub> {
    private AdminRpcServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminRpcServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminRpcServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse> adminAddEquipment(
        lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdminAddEquipmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse> adminRemoveEquipment(
        lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdminRemoveEquipmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse> adminAddClass(
        lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdminAddClassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse> adminRemoveClass(
        lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdminRemoveClassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse> adminRemoveTeacher(
        lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdminRemoveTeacherMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADMIN_ADD_EQUIPMENT = 0;
  private static final int METHODID_ADMIN_REMOVE_EQUIPMENT = 1;
  private static final int METHODID_ADMIN_GET_EQUIPMENT_LIST = 2;
  private static final int METHODID_ADMIN_ADD_CLASS = 3;
  private static final int METHODID_ADMIN_REMOVE_CLASS = 4;
  private static final int METHODID_ADMIN_GET_CLASS_LIST = 5;
  private static final int METHODID_ADMIN_GET_TEACHER_LIST = 6;
  private static final int METHODID_ADMIN_REMOVE_TEACHER = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdminRpcServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdminRpcServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADMIN_ADD_EQUIPMENT:
          serviceImpl.adminAddEquipment((lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.addEquipmentResponse>) responseObserver);
          break;
        case METHODID_ADMIN_REMOVE_EQUIPMENT:
          serviceImpl.adminRemoveEquipment((lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.removeEquipmentResponse>) responseObserver);
          break;
        case METHODID_ADMIN_GET_EQUIPMENT_LIST:
          serviceImpl.adminGetEquipmentList((lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse>) responseObserver);
          break;
        case METHODID_ADMIN_ADD_CLASS:
          serviceImpl.adminAddClass((lab.jlhgxy520.equipment.rpc.proto.admin.addClassRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.addClassResponse>) responseObserver);
          break;
        case METHODID_ADMIN_REMOVE_CLASS:
          serviceImpl.adminRemoveClass((lab.jlhgxy520.equipment.rpc.proto.admin.removeClassRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse>) responseObserver);
          break;
        case METHODID_ADMIN_GET_CLASS_LIST:
          serviceImpl.adminGetClassList((lab.jlhgxy520.equipment.rpc.proto.admin.getClassRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse>) responseObserver);
          break;
        case METHODID_ADMIN_GET_TEACHER_LIST:
          serviceImpl.adminGetTeacherList((lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.getTeacherResponse>) responseObserver);
          break;
        case METHODID_ADMIN_REMOVE_TEACHER:
          serviceImpl.adminRemoveTeacher((lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.admin.removeTeacherResponse>) responseObserver);
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

  private static abstract class AdminRpcServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdminRpcServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lab.jlhgxy520.equipment.rpc.proto.admin.AdminProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdminRpcServer");
    }
  }

  private static final class AdminRpcServerFileDescriptorSupplier
      extends AdminRpcServerBaseDescriptorSupplier {
    AdminRpcServerFileDescriptorSupplier() {}
  }

  private static final class AdminRpcServerMethodDescriptorSupplier
      extends AdminRpcServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdminRpcServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdminRpcServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminRpcServerFileDescriptorSupplier())
              .addMethod(getAdminAddEquipmentMethod())
              .addMethod(getAdminRemoveEquipmentMethod())
              .addMethod(getAdminGetEquipmentListMethod())
              .addMethod(getAdminAddClassMethod())
              .addMethod(getAdminRemoveClassMethod())
              .addMethod(getAdminGetClassListMethod())
              .addMethod(getAdminGetTeacherListMethod())
              .addMethod(getAdminRemoveTeacherMethod())
              .build();
        }
      }
    }
    return result;
  }
}
