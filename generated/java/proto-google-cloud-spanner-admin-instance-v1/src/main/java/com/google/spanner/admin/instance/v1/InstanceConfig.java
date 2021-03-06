// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

/**
 * <pre>
 * A possible configuration for a Cloud Spanner instance. Configurations
 * define the geographic placement of nodes and their replication.
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.instance.v1.InstanceConfig}
 */
public  final class InstanceConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.instance.v1.InstanceConfig)
    InstanceConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstanceConfig.newBuilder() to construct.
  private InstanceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstanceConfig() {
    name_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InstanceConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            displayName_ = s;
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
    return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto.internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto.internal_static_google_spanner_admin_instance_v1_InstanceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.instance.v1.InstanceConfig.class, com.google.spanner.admin.instance.v1.InstanceConfig.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * A unique identifier for the instance configuration.  Values
   * are of the form
   * `projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A unique identifier for the instance configuration.  Values
   * are of the form
   * `projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object displayName_;
  /**
   * <pre>
   * The name of this instance configuration as it appears in UIs.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of this instance configuration as it appears in UIs.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
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
    if (!(obj instanceof com.google.spanner.admin.instance.v1.InstanceConfig)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.instance.v1.InstanceConfig other = (com.google.spanner.admin.instance.v1.InstanceConfig) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getDisplayName()
        .equals(other.getDisplayName());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.admin.instance.v1.InstanceConfig parseFrom(
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
  public static Builder newBuilder(com.google.spanner.admin.instance.v1.InstanceConfig prototype) {
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
   * A possible configuration for a Cloud Spanner instance. Configurations
   * define the geographic placement of nodes and their replication.
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.instance.v1.InstanceConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.instance.v1.InstanceConfig)
      com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto.internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto.internal_static_google_spanner_admin_instance_v1_InstanceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.instance.v1.InstanceConfig.class, com.google.spanner.admin.instance.v1.InstanceConfig.Builder.class);
    }

    // Construct using com.google.spanner.admin.instance.v1.InstanceConfig.newBuilder()
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
      name_ = "";

      displayName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto.internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor;
    }

    public com.google.spanner.admin.instance.v1.InstanceConfig getDefaultInstanceForType() {
      return com.google.spanner.admin.instance.v1.InstanceConfig.getDefaultInstance();
    }

    public com.google.spanner.admin.instance.v1.InstanceConfig build() {
      com.google.spanner.admin.instance.v1.InstanceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.spanner.admin.instance.v1.InstanceConfig buildPartial() {
      com.google.spanner.admin.instance.v1.InstanceConfig result = new com.google.spanner.admin.instance.v1.InstanceConfig(this);
      result.name_ = name_;
      result.displayName_ = displayName_;
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
      if (other instanceof com.google.spanner.admin.instance.v1.InstanceConfig) {
        return mergeFrom((com.google.spanner.admin.instance.v1.InstanceConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.instance.v1.InstanceConfig other) {
      if (other == com.google.spanner.admin.instance.v1.InstanceConfig.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
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
      com.google.spanner.admin.instance.v1.InstanceConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.admin.instance.v1.InstanceConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * A unique identifier for the instance configuration.  Values
     * are of the form
     * `projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A unique identifier for the instance configuration.  Values
     * are of the form
     * `projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A unique identifier for the instance configuration.  Values
     * are of the form
     * `projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique identifier for the instance configuration.  Values
     * are of the form
     * `projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique identifier for the instance configuration.  Values
     * are of the form
     * `projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * The name of this instance configuration as it appears in UIs.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of this instance configuration as it appears in UIs.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of this instance configuration as it appears in UIs.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of this instance configuration as it appears in UIs.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public Builder clearDisplayName() {
      
      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of this instance configuration as it appears in UIs.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      displayName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.spanner.admin.instance.v1.InstanceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.instance.v1.InstanceConfig)
  private static final com.google.spanner.admin.instance.v1.InstanceConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.instance.v1.InstanceConfig();
  }

  public static com.google.spanner.admin.instance.v1.InstanceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceConfig>
      PARSER = new com.google.protobuf.AbstractParser<InstanceConfig>() {
    public InstanceConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InstanceConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InstanceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceConfig> getParserForType() {
    return PARSER;
  }

  public com.google.spanner.admin.instance.v1.InstanceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

