// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/deploy.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Single source file that is part of the version to be deployed. Each source
 * file that is deployed must be specified separately.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.FileInfo}
 */
public  final class FileInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.FileInfo)
    FileInfoOrBuilder {
  // Use FileInfo.newBuilder() to construct.
  private FileInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileInfo() {
    sourceUrl_ = "";
    sha1Sum_ = "";
    mimeType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FileInfo(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sourceUrl_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sha1Sum_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            mimeType_ = s;
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
    return com.google.appengine.v1.DeployProto.internal_static_google_appengine_v1_FileInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.DeployProto.internal_static_google_appengine_v1_FileInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.FileInfo.class, com.google.appengine.v1.FileInfo.Builder.class);
  }

  public static final int SOURCE_URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object sourceUrl_;
  /**
   * <pre>
   * URL source to use to fetch this file. Must be a URL to a resource in
   * Google Cloud Storage in the form
   * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
   * </pre>
   *
   * <code>string source_url = 1;</code>
   */
  public java.lang.String getSourceUrl() {
    java.lang.Object ref = sourceUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL source to use to fetch this file. Must be a URL to a resource in
   * Google Cloud Storage in the form
   * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
   * </pre>
   *
   * <code>string source_url = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSourceUrlBytes() {
    java.lang.Object ref = sourceUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHA1_SUM_FIELD_NUMBER = 2;
  private volatile java.lang.Object sha1Sum_;
  /**
   * <pre>
   * The SHA1 hash of the file, in hex.
   * </pre>
   *
   * <code>string sha1_sum = 2;</code>
   */
  public java.lang.String getSha1Sum() {
    java.lang.Object ref = sha1Sum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sha1Sum_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The SHA1 hash of the file, in hex.
   * </pre>
   *
   * <code>string sha1_sum = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSha1SumBytes() {
    java.lang.Object ref = sha1Sum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sha1Sum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object mimeType_;
  /**
   * <pre>
   * The MIME type of the file.
   * Defaults to the value from Google Cloud Storage.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   */
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The MIME type of the file.
   * Defaults to the value from Google Cloud Storage.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mimeType_ = b;
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
    if (!getSourceUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceUrl_);
    }
    if (!getSha1SumBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sha1Sum_);
    }
    if (!getMimeTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mimeType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSourceUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceUrl_);
    }
    if (!getSha1SumBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sha1Sum_);
    }
    if (!getMimeTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mimeType_);
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
    if (!(obj instanceof com.google.appengine.v1.FileInfo)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.FileInfo other = (com.google.appengine.v1.FileInfo) obj;

    boolean result = true;
    result = result && getSourceUrl()
        .equals(other.getSourceUrl());
    result = result && getSha1Sum()
        .equals(other.getSha1Sum());
    result = result && getMimeType()
        .equals(other.getMimeType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SOURCE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSourceUrl().hashCode();
    hash = (37 * hash) + SHA1_SUM_FIELD_NUMBER;
    hash = (53 * hash) + getSha1Sum().hashCode();
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.FileInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.FileInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.FileInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.FileInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.FileInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.FileInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.FileInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.FileInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.FileInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.FileInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.FileInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.FileInfo parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.FileInfo prototype) {
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
   * Single source file that is part of the version to be deployed. Each source
   * file that is deployed must be specified separately.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.FileInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.FileInfo)
      com.google.appengine.v1.FileInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.DeployProto.internal_static_google_appengine_v1_FileInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.DeployProto.internal_static_google_appengine_v1_FileInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.FileInfo.class, com.google.appengine.v1.FileInfo.Builder.class);
    }

    // Construct using com.google.appengine.v1.FileInfo.newBuilder()
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
      sourceUrl_ = "";

      sha1Sum_ = "";

      mimeType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.DeployProto.internal_static_google_appengine_v1_FileInfo_descriptor;
    }

    public com.google.appengine.v1.FileInfo getDefaultInstanceForType() {
      return com.google.appengine.v1.FileInfo.getDefaultInstance();
    }

    public com.google.appengine.v1.FileInfo build() {
      com.google.appengine.v1.FileInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.v1.FileInfo buildPartial() {
      com.google.appengine.v1.FileInfo result = new com.google.appengine.v1.FileInfo(this);
      result.sourceUrl_ = sourceUrl_;
      result.sha1Sum_ = sha1Sum_;
      result.mimeType_ = mimeType_;
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
      if (other instanceof com.google.appengine.v1.FileInfo) {
        return mergeFrom((com.google.appengine.v1.FileInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.FileInfo other) {
      if (other == com.google.appengine.v1.FileInfo.getDefaultInstance()) return this;
      if (!other.getSourceUrl().isEmpty()) {
        sourceUrl_ = other.sourceUrl_;
        onChanged();
      }
      if (!other.getSha1Sum().isEmpty()) {
        sha1Sum_ = other.sha1Sum_;
        onChanged();
      }
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
        onChanged();
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
      com.google.appengine.v1.FileInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.FileInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sourceUrl_ = "";
    /**
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     */
    public java.lang.String getSourceUrl() {
      java.lang.Object ref = sourceUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSourceUrlBytes() {
      java.lang.Object ref = sourceUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     */
    public Builder setSourceUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     */
    public Builder clearSourceUrl() {
      
      sourceUrl_ = getDefaultInstance().getSourceUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL source to use to fetch this file. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 1;</code>
     */
    public Builder setSourceUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sha1Sum_ = "";
    /**
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     */
    public java.lang.String getSha1Sum() {
      java.lang.Object ref = sha1Sum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sha1Sum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSha1SumBytes() {
      java.lang.Object ref = sha1Sum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sha1Sum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     */
    public Builder setSha1Sum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sha1Sum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     */
    public Builder clearSha1Sum() {
      
      sha1Sum_ = getDefaultInstance().getSha1Sum();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The SHA1 hash of the file, in hex.
     * </pre>
     *
     * <code>string sha1_sum = 2;</code>
     */
    public Builder setSha1SumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sha1Sum_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     * <pre>
     * The MIME type of the file.
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The MIME type of the file.
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The MIME type of the file.
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public Builder setMimeType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mimeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The MIME type of the file.
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public Builder clearMimeType() {
      
      mimeType_ = getDefaultInstance().getMimeType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The MIME type of the file.
     * Defaults to the value from Google Cloud Storage.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public Builder setMimeTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mimeType_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.FileInfo)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.FileInfo)
  private static final com.google.appengine.v1.FileInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.FileInfo();
  }

  public static com.google.appengine.v1.FileInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileInfo>
      PARSER = new com.google.protobuf.AbstractParser<FileInfo>() {
    public FileInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileInfo> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.v1.FileInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
