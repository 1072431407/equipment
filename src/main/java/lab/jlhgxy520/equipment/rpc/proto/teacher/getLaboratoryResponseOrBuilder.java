// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: teacher.proto

package lab.jlhgxy520.equipment.rpc.proto.teacher;

public interface getLaboratoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>.lab.jlhgxy520.equipment.rpc.proto.teacher.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>.lab.jlhgxy520.equipment.rpc.proto.teacher.State state = 1;</code>
   * @return The state.
   */
  lab.jlhgxy520.equipment.rpc.proto.teacher.State getState();

  /**
   * <pre>
   *教室ID
   * </pre>
   *
   * <code>string class_id = 2;</code>
   * @return The classId.
   */
  java.lang.String getClassId();
  /**
   * <pre>
   *教室ID
   * </pre>
   *
   * <code>string class_id = 2;</code>
   * @return The bytes for classId.
   */
  com.google.protobuf.ByteString
      getClassIdBytes();

  /**
   * <pre>
   *教室号 520
   * </pre>
   *
   * <code>string class_number = 3;</code>
   * @return The classNumber.
   */
  java.lang.String getClassNumber();
  /**
   * <pre>
   *教室号 520
   * </pre>
   *
   * <code>string class_number = 3;</code>
   * @return The bytes for classNumber.
   */
  com.google.protobuf.ByteString
      getClassNumberBytes();

  /**
   * <pre>
   *设备数量
   * </pre>
   *
   * <code>string equipment_number = 4;</code>
   * @return The equipmentNumber.
   */
  java.lang.String getEquipmentNumber();
  /**
   * <pre>
   *设备数量
   * </pre>
   *
   * <code>string equipment_number = 4;</code>
   * @return The bytes for equipmentNumber.
   */
  com.google.protobuf.ByteString
      getEquipmentNumberBytes();

  /**
   * <code>.lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse.ClassState class_state = 5;</code>
   * @return The enum numeric value on the wire for classState.
   */
  int getClassStateValue();
  /**
   * <code>.lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse.ClassState class_state = 5;</code>
   * @return The classState.
   */
  lab.jlhgxy520.equipment.rpc.proto.teacher.getLaboratoryResponse.ClassState getClassState();

  /**
   * <code>string class_code = 6;</code>
   * @return The classCode.
   */
  java.lang.String getClassCode();
  /**
   * <code>string class_code = 6;</code>
   * @return The bytes for classCode.
   */
  com.google.protobuf.ByteString
      getClassCodeBytes();
}
