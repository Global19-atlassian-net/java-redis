// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1beta1/cloud_redis.proto

package com.google.cloud.redis.v1beta1;

/**
 * <pre>
 * Request for [UpdateInstance][google.cloud.redis.v1beta1.CloudRedis.UpdateInstance].
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1beta1.UpdateInstanceRequest}
 */
public  final class UpdateInstanceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1beta1.UpdateInstanceRequest)
    UpdateInstanceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateInstanceRequest.newBuilder() to construct.
  private UpdateInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateInstanceRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateInstanceRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.redis.v1beta1.Instance.Builder subBuilder = null;
            if (instance_ != null) {
              subBuilder = instance_.toBuilder();
            }
            instance_ = input.readMessage(com.google.cloud.redis.v1beta1.Instance.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(instance_);
              instance_ = subBuilder.buildPartial();
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
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1beta1.UpdateInstanceRequest.class, com.google.cloud.redis.v1beta1.UpdateInstanceRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field may only include these
   * fields from [Instance][CloudRedis.Instance]:
   * * `display_name`
   * * `labels`
   * * `memory_size_gb`
   * * `redis_config`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field may only include these
   * fields from [Instance][CloudRedis.Instance]:
   * * `display_name`
   * * `labels`
   * * `memory_size_gb`
   * * `redis_config`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field may only include these
   * fields from [Instance][CloudRedis.Instance]:
   * * `display_name`
   * * `labels`
   * * `memory_size_gb`
   * * `redis_config`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int INSTANCE_FIELD_NUMBER = 2;
  private com.google.cloud.redis.v1beta1.Instance instance_;
  /**
   * <pre>
   * Required. Update description.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
   */
  public boolean hasInstance() {
    return instance_ != null;
  }
  /**
   * <pre>
   * Required. Update description.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
   */
  public com.google.cloud.redis.v1beta1.Instance getInstance() {
    return instance_ == null ? com.google.cloud.redis.v1beta1.Instance.getDefaultInstance() : instance_;
  }
  /**
   * <pre>
   * Required. Update description.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
   */
  public com.google.cloud.redis.v1beta1.InstanceOrBuilder getInstanceOrBuilder() {
    return getInstance();
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (instance_ != null) {
      output.writeMessage(2, getInstance());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdateMask());
    }
    if (instance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInstance());
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
    if (!(obj instanceof com.google.cloud.redis.v1beta1.UpdateInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1beta1.UpdateInstanceRequest other = (com.google.cloud.redis.v1beta1.UpdateInstanceRequest) obj;

    boolean result = true;
    result = result && (hasUpdateMask() == other.hasUpdateMask());
    if (hasUpdateMask()) {
      result = result && getUpdateMask()
          .equals(other.getUpdateMask());
    }
    result = result && (hasInstance() == other.hasInstance());
    if (hasInstance()) {
      result = result && getInstance()
          .equals(other.getInstance());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasInstance()) {
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.redis.v1beta1.UpdateInstanceRequest prototype) {
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
   * Request for [UpdateInstance][google.cloud.redis.v1beta1.CloudRedis.UpdateInstance].
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1beta1.UpdateInstanceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1beta1.UpdateInstanceRequest)
      com.google.cloud.redis.v1beta1.UpdateInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1beta1.UpdateInstanceRequest.class, com.google.cloud.redis.v1beta1.UpdateInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1beta1.UpdateInstanceRequest.newBuilder()
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
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      if (instanceBuilder_ == null) {
        instance_ = null;
      } else {
        instance_ = null;
        instanceBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_descriptor;
    }

    public com.google.cloud.redis.v1beta1.UpdateInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.redis.v1beta1.UpdateInstanceRequest.getDefaultInstance();
    }

    public com.google.cloud.redis.v1beta1.UpdateInstanceRequest build() {
      com.google.cloud.redis.v1beta1.UpdateInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.redis.v1beta1.UpdateInstanceRequest buildPartial() {
      com.google.cloud.redis.v1beta1.UpdateInstanceRequest result = new com.google.cloud.redis.v1beta1.UpdateInstanceRequest(this);
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      if (instanceBuilder_ == null) {
        result.instance_ = instance_;
      } else {
        result.instance_ = instanceBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.redis.v1beta1.UpdateInstanceRequest) {
        return mergeFrom((com.google.cloud.redis.v1beta1.UpdateInstanceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1beta1.UpdateInstanceRequest other) {
      if (other == com.google.cloud.redis.v1beta1.UpdateInstanceRequest.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasInstance()) {
        mergeInstance(other.getInstance());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.redis.v1beta1.UpdateInstanceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.redis.v1beta1.UpdateInstanceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.FieldMask updateMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. The elements of the repeated paths field may only include these
     * fields from [Instance][CloudRedis.Instance]:
     * * `display_name`
     * * `labels`
     * * `memory_size_gb`
     * * `redis_config`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. The elements of the repeated paths field may only include these
     * fields from [Instance][CloudRedis.Instance]:
     * * `display_name`
     * * `labels`
     * * `memory_size_gb`
     * * `redis_config`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. The elements of the repeated paths field may only include these
     * fields from [Instance][CloudRedis.Instance]:
     * * `display_name`
     * * `labels`
     * * `memory_size_gb`
     * * `redis_config`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. The elements of the repeated paths field may only include these
     * fields from [Instance][CloudRedis.Instance]:
     * * `display_name`
     * * `labels`
     * * `memory_size_gb`
     * * `redis_config`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. The elements of the repeated paths field may only include these
     * fields from [Instance][CloudRedis.Instance]:
     * * `display_name`
     * * `labels`
     * * `memory_size_gb`
     * * `redis_config`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. The elements of the repeated paths field may only include these
     * fields from [Instance][CloudRedis.Instance]:
     * * `display_name`
     * * `labels`
     * * `memory_size_gb`
     * * `redis_config`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. The elements of the repeated paths field may only include these
     * fields from [Instance][CloudRedis.Instance]:
     * * `display_name`
     * * `labels`
     * * `memory_size_gb`
     * * `redis_config`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. The elements of the repeated paths field may only include these
     * fields from [Instance][CloudRedis.Instance]:
     * * `display_name`
     * * `labels`
     * * `memory_size_gb`
     * * `redis_config`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. The elements of the repeated paths field may only include these
     * fields from [Instance][CloudRedis.Instance]:
     * * `display_name`
     * * `labels`
     * * `memory_size_gb`
     * * `redis_config`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.redis.v1beta1.Instance instance_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.redis.v1beta1.Instance, com.google.cloud.redis.v1beta1.Instance.Builder, com.google.cloud.redis.v1beta1.InstanceOrBuilder> instanceBuilder_;
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
     */
    public boolean hasInstance() {
      return instanceBuilder_ != null || instance_ != null;
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
     */
    public com.google.cloud.redis.v1beta1.Instance getInstance() {
      if (instanceBuilder_ == null) {
        return instance_ == null ? com.google.cloud.redis.v1beta1.Instance.getDefaultInstance() : instance_;
      } else {
        return instanceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
     */
    public Builder setInstance(com.google.cloud.redis.v1beta1.Instance value) {
      if (instanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        instance_ = value;
        onChanged();
      } else {
        instanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
     */
    public Builder setInstance(
        com.google.cloud.redis.v1beta1.Instance.Builder builderForValue) {
      if (instanceBuilder_ == null) {
        instance_ = builderForValue.build();
        onChanged();
      } else {
        instanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
     */
    public Builder mergeInstance(com.google.cloud.redis.v1beta1.Instance value) {
      if (instanceBuilder_ == null) {
        if (instance_ != null) {
          instance_ =
            com.google.cloud.redis.v1beta1.Instance.newBuilder(instance_).mergeFrom(value).buildPartial();
        } else {
          instance_ = value;
        }
        onChanged();
      } else {
        instanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
     */
    public Builder clearInstance() {
      if (instanceBuilder_ == null) {
        instance_ = null;
        onChanged();
      } else {
        instance_ = null;
        instanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
     */
    public com.google.cloud.redis.v1beta1.Instance.Builder getInstanceBuilder() {
      
      onChanged();
      return getInstanceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
     */
    public com.google.cloud.redis.v1beta1.InstanceOrBuilder getInstanceOrBuilder() {
      if (instanceBuilder_ != null) {
        return instanceBuilder_.getMessageOrBuilder();
      } else {
        return instance_ == null ?
            com.google.cloud.redis.v1beta1.Instance.getDefaultInstance() : instance_;
      }
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.Instance instance = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.redis.v1beta1.Instance, com.google.cloud.redis.v1beta1.Instance.Builder, com.google.cloud.redis.v1beta1.InstanceOrBuilder> 
        getInstanceFieldBuilder() {
      if (instanceBuilder_ == null) {
        instanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.v1beta1.Instance, com.google.cloud.redis.v1beta1.Instance.Builder, com.google.cloud.redis.v1beta1.InstanceOrBuilder>(
                getInstance(),
                getParentForChildren(),
                isClean());
        instance_ = null;
      }
      return instanceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1beta1.UpdateInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1beta1.UpdateInstanceRequest)
  private static final com.google.cloud.redis.v1beta1.UpdateInstanceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1beta1.UpdateInstanceRequest();
  }

  public static com.google.cloud.redis.v1beta1.UpdateInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateInstanceRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateInstanceRequest>() {
    public UpdateInstanceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateInstanceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateInstanceRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.redis.v1beta1.UpdateInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

