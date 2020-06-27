package lab.jlhgxy520.equipment.rpc.proto.teacher;

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
    comments = "Source: teacher.proto")
public final class TeacherRpcServerGrpc {

  private TeacherRpcServerGrpc() {}

  public static final String SERVICE_NAME = "lab.jlhgxy520.equipment.rpc.proto.teacher.TeacherRpcServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest,
      lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse> getGetLaboratoryListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLaboratoryList",
      requestType = lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest,
      lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse> getGetLaboratoryListMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest, lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse> getGetLaboratoryListMethod;
    if ((getGetLaboratoryListMethod = TeacherRpcServerGrpc.getGetLaboratoryListMethod) == null) {
      synchronized (TeacherRpcServerGrpc.class) {
        if ((getGetLaboratoryListMethod = TeacherRpcServerGrpc.getGetLaboratoryListMethod) == null) {
          TeacherRpcServerGrpc.getGetLaboratoryListMethod = getGetLaboratoryListMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest, lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLaboratoryList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeacherRpcServerMethodDescriptorSupplier("getLaboratoryList"))
              .build();
        }
      }
    }
    return getGetLaboratoryListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest,
      lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse> getGetEquipmentListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEquipmentList",
      requestType = lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest,
      lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse> getGetEquipmentListMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest, lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse> getGetEquipmentListMethod;
    if ((getGetEquipmentListMethod = TeacherRpcServerGrpc.getGetEquipmentListMethod) == null) {
      synchronized (TeacherRpcServerGrpc.class) {
        if ((getGetEquipmentListMethod = TeacherRpcServerGrpc.getGetEquipmentListMethod) == null) {
          TeacherRpcServerGrpc.getGetEquipmentListMethod = getGetEquipmentListMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest, lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEquipmentList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeacherRpcServerMethodDescriptorSupplier("getEquipmentList"))
              .build();
        }
      }
    }
    return getGetEquipmentListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse> getAttendClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "attendClass",
      requestType = lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse> getAttendClassMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest, lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse> getAttendClassMethod;
    if ((getAttendClassMethod = TeacherRpcServerGrpc.getAttendClassMethod) == null) {
      synchronized (TeacherRpcServerGrpc.class) {
        if ((getAttendClassMethod = TeacherRpcServerGrpc.getAttendClassMethod) == null) {
          TeacherRpcServerGrpc.getAttendClassMethod = getAttendClassMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest, lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "attendClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeacherRpcServerMethodDescriptorSupplier("attendClass"))
              .build();
        }
      }
    }
    return getAttendClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse> getFinishClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "finishClass",
      requestType = lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse> getFinishClassMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest, lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse> getFinishClassMethod;
    if ((getFinishClassMethod = TeacherRpcServerGrpc.getFinishClassMethod) == null) {
      synchronized (TeacherRpcServerGrpc.class) {
        if ((getFinishClassMethod = TeacherRpcServerGrpc.getFinishClassMethod) == null) {
          TeacherRpcServerGrpc.getFinishClassMethod = getFinishClassMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest, lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "finishClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TeacherRpcServerMethodDescriptorSupplier("finishClass"))
              .build();
        }
      }
    }
    return getFinishClassMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeacherRpcServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeacherRpcServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeacherRpcServerStub>() {
        @java.lang.Override
        public TeacherRpcServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeacherRpcServerStub(channel, callOptions);
        }
      };
    return TeacherRpcServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeacherRpcServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeacherRpcServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeacherRpcServerBlockingStub>() {
        @java.lang.Override
        public TeacherRpcServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeacherRpcServerBlockingStub(channel, callOptions);
        }
      };
    return TeacherRpcServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeacherRpcServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeacherRpcServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeacherRpcServerFutureStub>() {
        @java.lang.Override
        public TeacherRpcServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeacherRpcServerFutureStub(channel, callOptions);
        }
      };
    return TeacherRpcServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TeacherRpcServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLaboratoryList(lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLaboratoryListMethod(), responseObserver);
    }

    /**
     */
    public void getEquipmentList(lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEquipmentListMethod(), responseObserver);
    }

    /**
     */
    public void attendClass(lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAttendClassMethod(), responseObserver);
    }

    /**
     */
    public void finishClass(lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFinishClassMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLaboratoryListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest,
                lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse>(
                  this, METHODID_GET_LABORATORY_LIST)))
          .addMethod(
            getGetEquipmentListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest,
                lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse>(
                  this, METHODID_GET_EQUIPMENT_LIST)))
          .addMethod(
            getAttendClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest,
                lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse>(
                  this, METHODID_ATTEND_CLASS)))
          .addMethod(
            getFinishClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest,
                lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse>(
                  this, METHODID_FINISH_CLASS)))
          .build();
    }
  }

  /**
   */
  public static final class TeacherRpcServerStub extends io.grpc.stub.AbstractAsyncStub<TeacherRpcServerStub> {
    private TeacherRpcServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherRpcServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeacherRpcServerStub(channel, callOptions);
    }

    /**
     */
    public void getLaboratoryList(lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetLaboratoryListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEquipmentList(lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetEquipmentListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void attendClass(lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAttendClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishClass(lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinishClassMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TeacherRpcServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<TeacherRpcServerBlockingStub> {
    private TeacherRpcServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherRpcServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeacherRpcServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse> getLaboratoryList(
        lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetLaboratoryListMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse> getEquipmentList(
        lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetEquipmentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse attendClass(lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getAttendClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse finishClass(lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getFinishClassMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeacherRpcServerFutureStub extends io.grpc.stub.AbstractFutureStub<TeacherRpcServerFutureStub> {
    private TeacherRpcServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherRpcServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeacherRpcServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse> attendClass(
        lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAttendClassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse> finishClass(
        lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFinishClassMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LABORATORY_LIST = 0;
  private static final int METHODID_GET_EQUIPMENT_LIST = 1;
  private static final int METHODID_ATTEND_CLASS = 2;
  private static final int METHODID_FINISH_CLASS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TeacherRpcServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TeacherRpcServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LABORATORY_LIST:
          serviceImpl.getLaboratoryList((lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse>) responseObserver);
          break;
        case METHODID_GET_EQUIPMENT_LIST:
          serviceImpl.getEquipmentList((lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.getEquipmentResponse>) responseObserver);
          break;
        case METHODID_ATTEND_CLASS:
          serviceImpl.attendClass((lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.attendClassResponse>) responseObserver);
          break;
        case METHODID_FINISH_CLASS:
          serviceImpl.finishClass((lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.teacher.finishClassResponse>) responseObserver);
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

  private static abstract class TeacherRpcServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TeacherRpcServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lab.jlhgxy520.equipment.rpc.proto.teacher.TeacherProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TeacherRpcServer");
    }
  }

  private static final class TeacherRpcServerFileDescriptorSupplier
      extends TeacherRpcServerBaseDescriptorSupplier {
    TeacherRpcServerFileDescriptorSupplier() {}
  }

  private static final class TeacherRpcServerMethodDescriptorSupplier
      extends TeacherRpcServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TeacherRpcServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (TeacherRpcServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeacherRpcServerFileDescriptorSupplier())
              .addMethod(getGetLaboratoryListMethod())
              .addMethod(getGetEquipmentListMethod())
              .addMethod(getAttendClassMethod())
              .addMethod(getFinishClassMethod())
              .build();
        }
      }
    }
    return result;
  }
}
