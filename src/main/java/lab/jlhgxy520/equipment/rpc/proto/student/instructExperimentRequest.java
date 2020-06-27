// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package lab.jlhgxy520.equipment.rpc.proto.student;

/**
 * Protobuf type {@code lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest}
 */
public  final class instructExperimentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest)
    instructExperimentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use instructExperimentRequest.newBuilder() to construct.
  private instructExperimentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private instructExperimentRequest() {
    studentId_ = "";
    equipmentKey_ = "";
    instruct_ = 0;
    strInstruct_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new instructExperimentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private instructExperimentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            studentId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            equipmentKey_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            instruct_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            strInstruct_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lab.jlhgxy520.equipment.rpc.proto.student.StudentProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_student_instructExperimentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lab.jlhgxy520.equipment.rpc.proto.student.StudentProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_student_instructExperimentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.class, lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct}
   */
  public enum Instruct
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *开始实验 接收数据
     * </pre>
     *
     * <code>START = 0;</code>
     */
    START(0),
    /**
     * <pre>
     *修改转速
     * </pre>
     *
     * <code>INSTRUCT = 2;</code>
     */
    INSTRUCT(2),
    /**
     * <pre>
     *结束实验 停止接收数据
     * </pre>
     *
     * <code>OVER = 1;</code>
     */
    OVER(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *开始实验 接收数据
     * </pre>
     *
     * <code>START = 0;</code>
     */
    public static final int START_VALUE = 0;
    /**
     * <pre>
     *修改转速
     * </pre>
     *
     * <code>INSTRUCT = 2;</code>
     */
    public static final int INSTRUCT_VALUE = 2;
    /**
     * <pre>
     *结束实验 停止接收数据
     * </pre>
     *
     * <code>OVER = 1;</code>
     */
    public static final int OVER_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Instruct valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Instruct forNumber(int value) {
      switch (value) {
        case 0: return START;
        case 2: return INSTRUCT;
        case 1: return OVER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Instruct>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Instruct> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Instruct>() {
            public Instruct findValueByNumber(int number) {
              return Instruct.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Instruct[] VALUES = values();

    public static Instruct valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Instruct(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct)
  }

  public static final int STUDENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object studentId_;
  /**
   * <code>string student_id = 1;</code>
   * @return The studentId.
   */
  public java.lang.String getStudentId() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      studentId_ = s;
      return s;
    }
  }
  /**
   * <code>string student_id = 1;</code>
   * @return The bytes for studentId.
   */
  public com.google.protobuf.ByteString
      getStudentIdBytes() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      studentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EQUIPMENT_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object equipmentKey_;
  /**
   * <code>string equipment_key = 2;</code>
   * @return The equipmentKey.
   */
  public java.lang.String getEquipmentKey() {
    java.lang.Object ref = equipmentKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      equipmentKey_ = s;
      return s;
    }
  }
  /**
   * <code>string equipment_key = 2;</code>
   * @return The bytes for equipmentKey.
   */
  public com.google.protobuf.ByteString
      getEquipmentKeyBytes() {
    java.lang.Object ref = equipmentKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      equipmentKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTRUCT_FIELD_NUMBER = 3;
  private int instruct_;
  /**
   * <pre>
   *指令
   * </pre>
   *
   * <code>.lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct instruct = 3;</code>
   * @return The enum numeric value on the wire for instruct.
   */
  public int getInstructValue() {
    return instruct_;
  }
  /**
   * <pre>
   *指令
   * </pre>
   *
   * <code>.lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct instruct = 3;</code>
   * @return The instruct.
   */
  public lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct getInstruct() {
    @SuppressWarnings("deprecation")
    lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct result = lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct.valueOf(instruct_);
    return result == null ? lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct.UNRECOGNIZED : result;
  }

  public static final int STR_INSTRUCT_FIELD_NUMBER = 4;
  private volatile java.lang.Object strInstruct_;
  /**
   * <code>string str_instruct = 4;</code>
   * @return The strInstruct.
   */
  public java.lang.String getStrInstruct() {
    java.lang.Object ref = strInstruct_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      strInstruct_ = s;
      return s;
    }
  }
  /**
   * <code>string str_instruct = 4;</code>
   * @return The bytes for strInstruct.
   */
  public com.google.protobuf.ByteString
      getStrInstructBytes() {
    java.lang.Object ref = strInstruct_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      strInstruct_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getStudentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, studentId_);
    }
    if (!getEquipmentKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, equipmentKey_);
    }
    if (instruct_ != lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct.START.getNumber()) {
      output.writeEnum(3, instruct_);
    }
    if (!getStrInstructBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, strInstruct_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStudentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, studentId_);
    }
    if (!getEquipmentKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, equipmentKey_);
    }
    if (instruct_ != lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct.START.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, instruct_);
    }
    if (!getStrInstructBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, strInstruct_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest)) {
      return super.equals(obj);
    }
    lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest other = (lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest) obj;

    if (!getStudentId()
        .equals(other.getStudentId())) return false;
    if (!getEquipmentKey()
        .equals(other.getEquipmentKey())) return false;
    if (instruct_ != other.instruct_) return false;
    if (!getStrInstruct()
        .equals(other.getStrInstruct())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STUDENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStudentId().hashCode();
    hash = (37 * hash) + EQUIPMENT_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getEquipmentKey().hashCode();
    hash = (37 * hash) + INSTRUCT_FIELD_NUMBER;
    hash = (53 * hash) + instruct_;
    hash = (37 * hash) + STR_INSTRUCT_FIELD_NUMBER;
    hash = (53 * hash) + getStrInstruct().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest)
      lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lab.jlhgxy520.equipment.rpc.proto.student.StudentProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_student_instructExperimentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lab.jlhgxy520.equipment.rpc.proto.student.StudentProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_student_instructExperimentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.class, lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Builder.class);
    }

    // Construct using lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      studentId_ = "";

      equipmentKey_ = "";

      instruct_ = 0;

      strInstruct_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lab.jlhgxy520.equipment.rpc.proto.student.StudentProto.internal_static_lab_jlhgxy520_equipment_rpc_proto_student_instructExperimentRequest_descriptor;
    }

    @java.lang.Override
    public lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest getDefaultInstanceForType() {
      return lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest build() {
      lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest buildPartial() {
      lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest result = new lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest(this);
      result.studentId_ = studentId_;
      result.equipmentKey_ = equipmentKey_;
      result.instruct_ = instruct_;
      result.strInstruct_ = strInstruct_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest) {
        return mergeFrom((lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest other) {
      if (other == lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.getDefaultInstance()) return this;
      if (!other.getStudentId().isEmpty()) {
        studentId_ = other.studentId_;
        onChanged();
      }
      if (!other.getEquipmentKey().isEmpty()) {
        equipmentKey_ = other.equipmentKey_;
        onChanged();
      }
      if (other.instruct_ != 0) {
        setInstructValue(other.getInstructValue());
      }
      if (!other.getStrInstruct().isEmpty()) {
        strInstruct_ = other.strInstruct_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object studentId_ = "";
    /**
     * <code>string student_id = 1;</code>
     * @return The studentId.
     */
    public java.lang.String getStudentId() {
      java.lang.Object ref = studentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        studentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string student_id = 1;</code>
     * @return The bytes for studentId.
     */
    public com.google.protobuf.ByteString
        getStudentIdBytes() {
      java.lang.Object ref = studentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        studentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string student_id = 1;</code>
     * @param value The studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      studentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string student_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStudentId() {
      
      studentId_ = getDefaultInstance().getStudentId();
      onChanged();
      return this;
    }
    /**
     * <code>string student_id = 1;</code>
     * @param value The bytes for studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      studentId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object equipmentKey_ = "";
    /**
     * <code>string equipment_key = 2;</code>
     * @return The equipmentKey.
     */
    public java.lang.String getEquipmentKey() {
      java.lang.Object ref = equipmentKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        equipmentKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string equipment_key = 2;</code>
     * @return The bytes for equipmentKey.
     */
    public com.google.protobuf.ByteString
        getEquipmentKeyBytes() {
      java.lang.Object ref = equipmentKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        equipmentKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string equipment_key = 2;</code>
     * @param value The equipmentKey to set.
     * @return This builder for chaining.
     */
    public Builder setEquipmentKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      equipmentKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string equipment_key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEquipmentKey() {
      
      equipmentKey_ = getDefaultInstance().getEquipmentKey();
      onChanged();
      return this;
    }
    /**
     * <code>string equipment_key = 2;</code>
     * @param value The bytes for equipmentKey to set.
     * @return This builder for chaining.
     */
    public Builder setEquipmentKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      equipmentKey_ = value;
      onChanged();
      return this;
    }

    private int instruct_ = 0;
    /**
     * <pre>
     *指令
     * </pre>
     *
     * <code>.lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct instruct = 3;</code>
     * @return The enum numeric value on the wire for instruct.
     */
    public int getInstructValue() {
      return instruct_;
    }
    /**
     * <pre>
     *指令
     * </pre>
     *
     * <code>.lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct instruct = 3;</code>
     * @param value The enum numeric value on the wire for instruct to set.
     * @return This builder for chaining.
     */
    public Builder setInstructValue(int value) {
      instruct_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *指令
     * </pre>
     *
     * <code>.lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct instruct = 3;</code>
     * @return The instruct.
     */
    public lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct getInstruct() {
      @SuppressWarnings("deprecation")
      lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct result = lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct.valueOf(instruct_);
      return result == null ? lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *指令
     * </pre>
     *
     * <code>.lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct instruct = 3;</code>
     * @param value The instruct to set.
     * @return This builder for chaining.
     */
    public Builder setInstruct(lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      instruct_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *指令
     * </pre>
     *
     * <code>.lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest.Instruct instruct = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstruct() {
      
      instruct_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object strInstruct_ = "";
    /**
     * <code>string str_instruct = 4;</code>
     * @return The strInstruct.
     */
    public java.lang.String getStrInstruct() {
      java.lang.Object ref = strInstruct_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        strInstruct_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string str_instruct = 4;</code>
     * @return The bytes for strInstruct.
     */
    public com.google.protobuf.ByteString
        getStrInstructBytes() {
      java.lang.Object ref = strInstruct_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        strInstruct_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string str_instruct = 4;</code>
     * @param value The strInstruct to set.
     * @return This builder for chaining.
     */
    public Builder setStrInstruct(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      strInstruct_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string str_instruct = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStrInstruct() {
      
      strInstruct_ = getDefaultInstance().getStrInstruct();
      onChanged();
      return this;
    }
    /**
     * <code>string str_instruct = 4;</code>
     * @param value The bytes for strInstruct to set.
     * @return This builder for chaining.
     */
    public Builder setStrInstructBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      strInstruct_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest)
  }

  // @@protoc_insertion_point(class_scope:lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest)
  private static final lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest();
  }

  public static lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<instructExperimentRequest>
      PARSER = new com.google.protobuf.AbstractParser<instructExperimentRequest>() {
    @java.lang.Override
    public instructExperimentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new instructExperimentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<instructExperimentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<instructExperimentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

