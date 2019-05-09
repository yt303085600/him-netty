// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WSBaseReqProto.proto

package com.lmxdawn.him.common.protobuf;

public final class WSBaseReqProtoOuterClass {
  private WSBaseReqProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WSBaseReqProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.WSBaseReqProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 type = 1;</code>
     */
    int getType();

    /**
     * <pre>
     * 用户ID
     * </pre>
     *
     * <code>uint64 uid = 2;</code>
     */
    long getUid();

    /**
     * <pre>
     * 登录验证
     * </pre>
     *
     * <code>string sid = 3;</code>
     */
    java.lang.String getSid();
    /**
     * <pre>
     * 登录验证
     * </pre>
     *
     * <code>string sid = 3;</code>
     */
    com.google.protobuf.ByteString
        getSidBytes();
  }
  /**
   * <pre>
   * 请求实体
   * </pre>
   *
   * Protobuf type {@code protocol.WSBaseReqProto}
   */
  public  static final class WSBaseReqProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.WSBaseReqProto)
      WSBaseReqProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WSBaseReqProto.newBuilder() to construct.
    private WSBaseReqProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WSBaseReqProto() {
      sid_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WSBaseReqProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8: {

              type_ = input.readInt32();
              break;
            }
            case 16: {

              uid_ = input.readUInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              sid_ = s;
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
      return com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.internal_static_protocol_WSBaseReqProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.internal_static_protocol_WSBaseReqProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto.class, com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int UID_FIELD_NUMBER = 2;
    private long uid_;
    /**
     * <pre>
     * 用户ID
     * </pre>
     *
     * <code>uint64 uid = 2;</code>
     */
    public long getUid() {
      return uid_;
    }

    public static final int SID_FIELD_NUMBER = 3;
    private volatile java.lang.Object sid_;
    /**
     * <pre>
     * 登录验证
     * </pre>
     *
     * <code>string sid = 3;</code>
     */
    public java.lang.String getSid() {
      java.lang.Object ref = sid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sid_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 登录验证
     * </pre>
     *
     * <code>string sid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSidBytes() {
      java.lang.Object ref = sid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sid_ = b;
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
      if (type_ != 0) {
        output.writeInt32(1, type_);
      }
      if (uid_ != 0L) {
        output.writeUInt64(2, uid_);
      }
      if (!getSidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (uid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, uid_);
      }
      if (!getSidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sid_);
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
      if (!(obj instanceof com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto)) {
        return super.equals(obj);
      }
      com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto other = (com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto) obj;

      if (getType()
          != other.getType()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (!getSid()
          .equals(other.getSid())) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUid());
      hash = (37 * hash) + SID_FIELD_NUMBER;
      hash = (53 * hash) + getSid().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parseFrom(
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
    public static Builder newBuilder(com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto prototype) {
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
     * <pre>
     * 请求实体
     * </pre>
     *
     * Protobuf type {@code protocol.WSBaseReqProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.WSBaseReqProto)
        com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.internal_static_protocol_WSBaseReqProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.internal_static_protocol_WSBaseReqProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto.class, com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto.Builder.class);
      }

      // Construct using com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto.newBuilder()
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
        type_ = 0;

        uid_ = 0L;

        sid_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.internal_static_protocol_WSBaseReqProto_descriptor;
      }

      @java.lang.Override
      public com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto getDefaultInstanceForType() {
        return com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto.getDefaultInstance();
      }

      @java.lang.Override
      public com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto build() {
        com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto buildPartial() {
        com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto result = new com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto(this);
        result.type_ = type_;
        result.uid_ = uid_;
        result.sid_ = sid_;
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
        if (other instanceof com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto) {
          return mergeFrom((com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto other) {
        if (other == com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto.getDefaultInstance()) return this;
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.getUid() != 0L) {
          setUid(other.getUid());
        }
        if (!other.getSid().isEmpty()) {
          sid_ = other.sid_;
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
        com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ ;
      /**
       * <code>int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>int32 type = 1;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private long uid_ ;
      /**
       * <pre>
       * 用户ID
       * </pre>
       *
       * <code>uint64 uid = 2;</code>
       */
      public long getUid() {
        return uid_;
      }
      /**
       * <pre>
       * 用户ID
       * </pre>
       *
       * <code>uint64 uid = 2;</code>
       */
      public Builder setUid(long value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 用户ID
       * </pre>
       *
       * <code>uint64 uid = 2;</code>
       */
      public Builder clearUid() {
        
        uid_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object sid_ = "";
      /**
       * <pre>
       * 登录验证
       * </pre>
       *
       * <code>string sid = 3;</code>
       */
      public java.lang.String getSid() {
        java.lang.Object ref = sid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 登录验证
       * </pre>
       *
       * <code>string sid = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSidBytes() {
        java.lang.Object ref = sid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 登录验证
       * </pre>
       *
       * <code>string sid = 3;</code>
       */
      public Builder setSid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 登录验证
       * </pre>
       *
       * <code>string sid = 3;</code>
       */
      public Builder clearSid() {
        
        sid_ = getDefaultInstance().getSid();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 登录验证
       * </pre>
       *
       * <code>string sid = 3;</code>
       */
      public Builder setSidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sid_ = value;
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


      // @@protoc_insertion_point(builder_scope:protocol.WSBaseReqProto)
    }

    // @@protoc_insertion_point(class_scope:protocol.WSBaseReqProto)
    private static final com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto();
    }

    public static com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WSBaseReqProto>
        PARSER = new com.google.protobuf.AbstractParser<WSBaseReqProto>() {
      @java.lang.Override
      public WSBaseReqProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WSBaseReqProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WSBaseReqProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WSBaseReqProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.lmxdawn.him.common.protobuf.WSBaseReqProtoOuterClass.WSBaseReqProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_WSBaseReqProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_WSBaseReqProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024WSBaseReqProto.proto\022\010protocol\"8\n\016WSBa" +
      "seReqProto\022\014\n\004type\030\001 \001(\005\022\013\n\003uid\030\002 \001(\004\022\013\n" +
      "\003sid\030\003 \001(\tB#\n\037com.lmxdawn.him.common.pro" +
      "tobufH\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protocol_WSBaseReqProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_WSBaseReqProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_WSBaseReqProto_descriptor,
        new java.lang.String[] { "Type", "Uid", "Sid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
