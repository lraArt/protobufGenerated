// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/HeartbeatMessage.proto

package com.perfectdiary.common.http.protocol.request;

/**
 * <pre>
 *心跳 proto
 * </pre>
 *
 * Protobuf type {@code com.perfectdiary.messager.HeartBeat}
 */
public  final class HeartBeat extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.perfectdiary.messager.HeartBeat)
    HeartBeatOrBuilder {
  // Use HeartBeat.newBuilder() to construct.
  private HeartBeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeartBeat() {
    ping_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private HeartBeat(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            ping_ = input.readBool();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.perfectdiary.common.http.protocol.request.HeartBeatMessage.internal_static_com_perfectdiary_messager_HeartBeat_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.perfectdiary.common.http.protocol.request.HeartBeatMessage.internal_static_com_perfectdiary_messager_HeartBeat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.perfectdiary.common.http.protocol.request.HeartBeat.class, com.perfectdiary.common.http.protocol.request.HeartBeat.Builder.class);
  }

  public static final int PING_FIELD_NUMBER = 1;
  private boolean ping_;
  /**
   * <code>optional bool ping = 1;</code>
   */
  public boolean getPing() {
    return ping_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (ping_ != false) {
      output.writeBool(1, ping_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ping_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, ping_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.perfectdiary.common.http.protocol.request.HeartBeat)) {
      return super.equals(obj);
    }
    com.perfectdiary.common.http.protocol.request.HeartBeat other = (com.perfectdiary.common.http.protocol.request.HeartBeat) obj;

    boolean result = true;
    result = result && (getPing()
        == other.getPing());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + PING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPing());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.perfectdiary.common.http.protocol.request.HeartBeat parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.perfectdiary.common.http.protocol.request.HeartBeat prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   *心跳 proto
   * </pre>
   *
   * Protobuf type {@code com.perfectdiary.messager.HeartBeat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.perfectdiary.messager.HeartBeat)
      com.perfectdiary.common.http.protocol.request.HeartBeatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.perfectdiary.common.http.protocol.request.HeartBeatMessage.internal_static_com_perfectdiary_messager_HeartBeat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.perfectdiary.common.http.protocol.request.HeartBeatMessage.internal_static_com_perfectdiary_messager_HeartBeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.perfectdiary.common.http.protocol.request.HeartBeat.class, com.perfectdiary.common.http.protocol.request.HeartBeat.Builder.class);
    }

    // Construct using com.perfectdiary.common.http.protocol.request.HeartBeat.newBuilder()
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
    public Builder clear() {
      super.clear();
      ping_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.perfectdiary.common.http.protocol.request.HeartBeatMessage.internal_static_com_perfectdiary_messager_HeartBeat_descriptor;
    }

    public com.perfectdiary.common.http.protocol.request.HeartBeat getDefaultInstanceForType() {
      return com.perfectdiary.common.http.protocol.request.HeartBeat.getDefaultInstance();
    }

    public com.perfectdiary.common.http.protocol.request.HeartBeat build() {
      com.perfectdiary.common.http.protocol.request.HeartBeat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.perfectdiary.common.http.protocol.request.HeartBeat buildPartial() {
      com.perfectdiary.common.http.protocol.request.HeartBeat result = new com.perfectdiary.common.http.protocol.request.HeartBeat(this);
      result.ping_ = ping_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.perfectdiary.common.http.protocol.request.HeartBeat) {
        return mergeFrom((com.perfectdiary.common.http.protocol.request.HeartBeat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.perfectdiary.common.http.protocol.request.HeartBeat other) {
      if (other == com.perfectdiary.common.http.protocol.request.HeartBeat.getDefaultInstance()) return this;
      if (other.getPing() != false) {
        setPing(other.getPing());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.perfectdiary.common.http.protocol.request.HeartBeat parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.perfectdiary.common.http.protocol.request.HeartBeat) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean ping_ ;
    /**
     * <code>optional bool ping = 1;</code>
     */
    public boolean getPing() {
      return ping_;
    }
    /**
     * <code>optional bool ping = 1;</code>
     */
    public Builder setPing(boolean value) {
      
      ping_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool ping = 1;</code>
     */
    public Builder clearPing() {
      
      ping_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.perfectdiary.messager.HeartBeat)
  }

  // @@protoc_insertion_point(class_scope:com.perfectdiary.messager.HeartBeat)
  private static final com.perfectdiary.common.http.protocol.request.HeartBeat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.perfectdiary.common.http.protocol.request.HeartBeat();
  }

  public static com.perfectdiary.common.http.protocol.request.HeartBeat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeartBeat>
      PARSER = new com.google.protobuf.AbstractParser<HeartBeat>() {
    public HeartBeat parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HeartBeat(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HeartBeat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeartBeat> getParserForType() {
    return PARSER;
  }

  public com.perfectdiary.common.http.protocol.request.HeartBeat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

