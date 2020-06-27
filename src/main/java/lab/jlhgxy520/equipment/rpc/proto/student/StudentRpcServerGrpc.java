package lab.jlhgxy520.equipment.rpc.proto.student;

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
    comments = "Source: student.proto")
public final class StudentRpcServerGrpc {

  private StudentRpcServerGrpc() {}

  public static final String SERVICE_NAME = "lab.jlhgxy520.equipment.rpc.proto.student.StudentRpcServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse> getAddClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addClass",
      requestType = lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse> getAddClassMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest, lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse> getAddClassMethod;
    if ((getAddClassMethod = StudentRpcServerGrpc.getAddClassMethod) == null) {
      synchronized (StudentRpcServerGrpc.class) {
        if ((getAddClassMethod = StudentRpcServerGrpc.getAddClassMethod) == null) {
          StudentRpcServerGrpc.getAddClassMethod = getAddClassMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest, lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentRpcServerMethodDescriptorSupplier("addClass"))
              .build();
        }
      }
    }
    return getAddClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse> getStudentClassStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "studentClassState",
      requestType = lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse> getStudentClassStateMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest, lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse> getStudentClassStateMethod;
    if ((getStudentClassStateMethod = StudentRpcServerGrpc.getStudentClassStateMethod) == null) {
      synchronized (StudentRpcServerGrpc.class) {
        if ((getStudentClassStateMethod = StudentRpcServerGrpc.getStudentClassStateMethod) == null) {
          StudentRpcServerGrpc.getStudentClassStateMethod = getStudentClassStateMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest, lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "studentClassState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentRpcServerMethodDescriptorSupplier("studentClassState"))
              .build();
        }
      }
    }
    return getStudentClassStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse> getInstructExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "instructExperiment",
      requestType = lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse> getInstructExperimentMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest, lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse> getInstructExperimentMethod;
    if ((getInstructExperimentMethod = StudentRpcServerGrpc.getInstructExperimentMethod) == null) {
      synchronized (StudentRpcServerGrpc.class) {
        if ((getInstructExperimentMethod = StudentRpcServerGrpc.getInstructExperimentMethod) == null) {
          StudentRpcServerGrpc.getInstructExperimentMethod = getInstructExperimentMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest, lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "instructExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentRpcServerMethodDescriptorSupplier("instructExperiment"))
              .build();
        }
      }
    }
    return getInstructExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse> getRealTimeDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "realTimeData",
      requestType = lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse> getRealTimeDataMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest, lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse> getRealTimeDataMethod;
    if ((getRealTimeDataMethod = StudentRpcServerGrpc.getRealTimeDataMethod) == null) {
      synchronized (StudentRpcServerGrpc.class) {
        if ((getRealTimeDataMethod = StudentRpcServerGrpc.getRealTimeDataMethod) == null) {
          StudentRpcServerGrpc.getRealTimeDataMethod = getRealTimeDataMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest, lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "realTimeData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentRpcServerMethodDescriptorSupplier("realTimeData"))
              .build();
        }
      }
    }
    return getRealTimeDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse> getGetEquipmentStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEquipmentState",
      requestType = lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest.class,
      responseType = lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest,
      lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse> getGetEquipmentStateMethod() {
    io.grpc.MethodDescriptor<lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest, lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse> getGetEquipmentStateMethod;
    if ((getGetEquipmentStateMethod = StudentRpcServerGrpc.getGetEquipmentStateMethod) == null) {
      synchronized (StudentRpcServerGrpc.class) {
        if ((getGetEquipmentStateMethod = StudentRpcServerGrpc.getGetEquipmentStateMethod) == null) {
          StudentRpcServerGrpc.getGetEquipmentStateMethod = getGetEquipmentStateMethod =
              io.grpc.MethodDescriptor.<lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest, lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEquipmentState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentRpcServerMethodDescriptorSupplier("getEquipmentState"))
              .build();
        }
      }
    }
    return getGetEquipmentStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentRpcServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentRpcServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentRpcServerStub>() {
        @java.lang.Override
        public StudentRpcServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentRpcServerStub(channel, callOptions);
        }
      };
    return StudentRpcServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentRpcServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentRpcServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentRpcServerBlockingStub>() {
        @java.lang.Override
        public StudentRpcServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentRpcServerBlockingStub(channel, callOptions);
        }
      };
    return StudentRpcServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentRpcServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentRpcServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentRpcServerFutureStub>() {
        @java.lang.Override
        public StudentRpcServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentRpcServerFutureStub(channel, callOptions);
        }
      };
    return StudentRpcServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StudentRpcServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void addClass(lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddClassMethod(), responseObserver);
    }

    /**
     */
    public void studentClassState(lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStudentClassStateMethod(), responseObserver);
    }

    /**
     */
    public void instructExperiment(lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInstructExperimentMethod(), responseObserver);
    }

    /**
     */
    public void realTimeData(lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRealTimeDataMethod(), responseObserver);
    }

    /**
     */
    public void getEquipmentState(lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEquipmentStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest,
                lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse>(
                  this, METHODID_ADD_CLASS)))
          .addMethod(
            getStudentClassStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest,
                lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse>(
                  this, METHODID_STUDENT_CLASS_STATE)))
          .addMethod(
            getInstructExperimentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest,
                lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse>(
                  this, METHODID_INSTRUCT_EXPERIMENT)))
          .addMethod(
            getRealTimeDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest,
                lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse>(
                  this, METHODID_REAL_TIME_DATA)))
          .addMethod(
            getGetEquipmentStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest,
                lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse>(
                  this, METHODID_GET_EQUIPMENT_STATE)))
          .build();
    }
  }

  /**
   */
  public static final class StudentRpcServerStub extends io.grpc.stub.AbstractAsyncStub<StudentRpcServerStub> {
    private StudentRpcServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentRpcServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentRpcServerStub(channel, callOptions);
    }

    /**
     */
    public void addClass(lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void studentClassState(lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStudentClassStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void instructExperiment(lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInstructExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void realTimeData(lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRealTimeDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEquipmentState(lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest request,
        io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEquipmentStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StudentRpcServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<StudentRpcServerBlockingStub> {
    private StudentRpcServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentRpcServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentRpcServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse addClass(lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse studentClassState(lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getStudentClassStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse instructExperiment(lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest request) {
      return blockingUnaryCall(
          getChannel(), getInstructExperimentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse> realTimeData(
        lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getRealTimeDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse getEquipmentState(lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEquipmentStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentRpcServerFutureStub extends io.grpc.stub.AbstractFutureStub<StudentRpcServerFutureStub> {
    private StudentRpcServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentRpcServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentRpcServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse> addClass(
        lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddClassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse> studentClassState(
        lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStudentClassStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse> instructExperiment(
        lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInstructExperimentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse> getEquipmentState(
        lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEquipmentStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CLASS = 0;
  private static final int METHODID_STUDENT_CLASS_STATE = 1;
  private static final int METHODID_INSTRUCT_EXPERIMENT = 2;
  private static final int METHODID_REAL_TIME_DATA = 3;
  private static final int METHODID_GET_EQUIPMENT_STATE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentRpcServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentRpcServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CLASS:
          serviceImpl.addClass((lab.jlhgxy520.equipment.rpc.proto.student.addClassRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.addClassResponse>) responseObserver);
          break;
        case METHODID_STUDENT_CLASS_STATE:
          serviceImpl.studentClassState((lab.jlhgxy520.equipment.rpc.proto.student.studentStateRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.studentStateResponse>) responseObserver);
          break;
        case METHODID_INSTRUCT_EXPERIMENT:
          serviceImpl.instructExperiment((lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse>) responseObserver);
          break;
        case METHODID_REAL_TIME_DATA:
          serviceImpl.realTimeData((lab.jlhgxy520.equipment.rpc.proto.student.realTimeRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.realTimeResponse>) responseObserver);
          break;
        case METHODID_GET_EQUIPMENT_STATE:
          serviceImpl.getEquipmentState((lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateRequest) request,
              (io.grpc.stub.StreamObserver<lab.jlhgxy520.equipment.rpc.proto.student.EquipmentStateResponse>) responseObserver);
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

  private static abstract class StudentRpcServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentRpcServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lab.jlhgxy520.equipment.rpc.proto.student.StudentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentRpcServer");
    }
  }

  private static final class StudentRpcServerFileDescriptorSupplier
      extends StudentRpcServerBaseDescriptorSupplier {
    StudentRpcServerFileDescriptorSupplier() {}
  }

  private static final class StudentRpcServerMethodDescriptorSupplier
      extends StudentRpcServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentRpcServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentRpcServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentRpcServerFileDescriptorSupplier())
              .addMethod(getAddClassMethod())
              .addMethod(getStudentClassStateMethod())
              .addMethod(getInstructExperimentMethod())
              .addMethod(getRealTimeDataMethod())
              .addMethod(getGetEquipmentStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
