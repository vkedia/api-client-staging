// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Machine resources for a version.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.Resources}
 */
public  final class Resources extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.Resources)
    ResourcesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Resources.newBuilder() to construct.
  private Resources(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Resources() {
    cpu_ = 0D;
    diskGb_ = 0D;
    memoryGb_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Resources(
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
          case 9: {

            cpu_ = input.readDouble();
            break;
          }
          case 17: {

            diskGb_ = input.readDouble();
            break;
          }
          case 25: {

            memoryGb_ = input.readDouble();
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
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Resources_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Resources_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.Resources.class, com.google.appengine.v1.Resources.Builder.class);
  }

  public static final int CPU_FIELD_NUMBER = 1;
  private double cpu_;
  /**
   * <pre>
   * Number of CPU cores needed.
   * </pre>
   *
   * <code>double cpu = 1;</code>
   */
  public double getCpu() {
    return cpu_;
  }

  public static final int DISK_GB_FIELD_NUMBER = 2;
  private double diskGb_;
  /**
   * <pre>
   * Disk size (GB) needed.
   * </pre>
   *
   * <code>double disk_gb = 2;</code>
   */
  public double getDiskGb() {
    return diskGb_;
  }

  public static final int MEMORY_GB_FIELD_NUMBER = 3;
  private double memoryGb_;
  /**
   * <pre>
   * Memory (GB) needed.
   * </pre>
   *
   * <code>double memory_gb = 3;</code>
   */
  public double getMemoryGb() {
    return memoryGb_;
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
    if (cpu_ != 0D) {
      output.writeDouble(1, cpu_);
    }
    if (diskGb_ != 0D) {
      output.writeDouble(2, diskGb_);
    }
    if (memoryGb_ != 0D) {
      output.writeDouble(3, memoryGb_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cpu_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, cpu_);
    }
    if (diskGb_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, diskGb_);
    }
    if (memoryGb_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, memoryGb_);
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
    if (!(obj instanceof com.google.appengine.v1.Resources)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.Resources other = (com.google.appengine.v1.Resources) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getCpu())
        == java.lang.Double.doubleToLongBits(
            other.getCpu()));
    result = result && (
        java.lang.Double.doubleToLongBits(getDiskGb())
        == java.lang.Double.doubleToLongBits(
            other.getDiskGb()));
    result = result && (
        java.lang.Double.doubleToLongBits(getMemoryGb())
        == java.lang.Double.doubleToLongBits(
            other.getMemoryGb()));
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
    hash = (37 * hash) + CPU_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCpu()));
    hash = (37 * hash) + DISK_GB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDiskGb()));
    hash = (37 * hash) + MEMORY_GB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMemoryGb()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.Resources parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.Resources parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.Resources parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.Resources parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.Resources parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.Resources parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.Resources parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.Resources parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.Resources parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.Resources parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.Resources parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.Resources parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.Resources prototype) {
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
   * Machine resources for a version.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.Resources}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.Resources)
      com.google.appengine.v1.ResourcesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Resources_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Resources_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.Resources.class, com.google.appengine.v1.Resources.Builder.class);
    }

    // Construct using com.google.appengine.v1.Resources.newBuilder()
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
      cpu_ = 0D;

      diskGb_ = 0D;

      memoryGb_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Resources_descriptor;
    }

    public com.google.appengine.v1.Resources getDefaultInstanceForType() {
      return com.google.appengine.v1.Resources.getDefaultInstance();
    }

    public com.google.appengine.v1.Resources build() {
      com.google.appengine.v1.Resources result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.v1.Resources buildPartial() {
      com.google.appengine.v1.Resources result = new com.google.appengine.v1.Resources(this);
      result.cpu_ = cpu_;
      result.diskGb_ = diskGb_;
      result.memoryGb_ = memoryGb_;
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
      if (other instanceof com.google.appengine.v1.Resources) {
        return mergeFrom((com.google.appengine.v1.Resources)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.Resources other) {
      if (other == com.google.appengine.v1.Resources.getDefaultInstance()) return this;
      if (other.getCpu() != 0D) {
        setCpu(other.getCpu());
      }
      if (other.getDiskGb() != 0D) {
        setDiskGb(other.getDiskGb());
      }
      if (other.getMemoryGb() != 0D) {
        setMemoryGb(other.getMemoryGb());
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
      com.google.appengine.v1.Resources parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.Resources) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double cpu_ ;
    /**
     * <pre>
     * Number of CPU cores needed.
     * </pre>
     *
     * <code>double cpu = 1;</code>
     */
    public double getCpu() {
      return cpu_;
    }
    /**
     * <pre>
     * Number of CPU cores needed.
     * </pre>
     *
     * <code>double cpu = 1;</code>
     */
    public Builder setCpu(double value) {
      
      cpu_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of CPU cores needed.
     * </pre>
     *
     * <code>double cpu = 1;</code>
     */
    public Builder clearCpu() {
      
      cpu_ = 0D;
      onChanged();
      return this;
    }

    private double diskGb_ ;
    /**
     * <pre>
     * Disk size (GB) needed.
     * </pre>
     *
     * <code>double disk_gb = 2;</code>
     */
    public double getDiskGb() {
      return diskGb_;
    }
    /**
     * <pre>
     * Disk size (GB) needed.
     * </pre>
     *
     * <code>double disk_gb = 2;</code>
     */
    public Builder setDiskGb(double value) {
      
      diskGb_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Disk size (GB) needed.
     * </pre>
     *
     * <code>double disk_gb = 2;</code>
     */
    public Builder clearDiskGb() {
      
      diskGb_ = 0D;
      onChanged();
      return this;
    }

    private double memoryGb_ ;
    /**
     * <pre>
     * Memory (GB) needed.
     * </pre>
     *
     * <code>double memory_gb = 3;</code>
     */
    public double getMemoryGb() {
      return memoryGb_;
    }
    /**
     * <pre>
     * Memory (GB) needed.
     * </pre>
     *
     * <code>double memory_gb = 3;</code>
     */
    public Builder setMemoryGb(double value) {
      
      memoryGb_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Memory (GB) needed.
     * </pre>
     *
     * <code>double memory_gb = 3;</code>
     */
    public Builder clearMemoryGb() {
      
      memoryGb_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.Resources)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.Resources)
  private static final com.google.appengine.v1.Resources DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.Resources();
  }

  public static com.google.appengine.v1.Resources getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Resources>
      PARSER = new com.google.protobuf.AbstractParser<Resources>() {
    public Resources parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Resources(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Resources> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Resources> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.v1.Resources getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

