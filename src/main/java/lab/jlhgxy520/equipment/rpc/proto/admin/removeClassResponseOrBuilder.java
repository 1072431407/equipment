// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: admin.proto

package lab.jlhgxy520.equipment.rpc.proto.admin;

public interface removeClassResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>.lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>.lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse.State state = 1;</code>
   * @return The state.
   */
  lab.jlhgxy520.equipment.rpc.proto.admin.removeClassResponse.State getState();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
