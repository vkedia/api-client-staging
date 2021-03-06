// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/context.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The request message for [Contexts.CreateContext][google.cloud.dialogflow.v2beta1.Contexts.CreateContext].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateContextRequest}
 */
public  final class CreateContextRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.CreateContextRequest)
    CreateContextRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateContextRequest.newBuilder() to construct.
  private CreateContextRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateContextRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateContextRequest(
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

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.dialogflow.v2beta1.Context.Builder subBuilder = null;
            if (context_ != null) {
              subBuilder = context_.toBuilder();
            }
            context_ = input.readMessage(com.google.cloud.dialogflow.v2beta1.Context.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(context_);
              context_ = subBuilder.buildPartial();
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
    return com.google.cloud.dialogflow.v2beta1.ContextProto.internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ContextProto.internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.CreateContextRequest.class, com.google.cloud.dialogflow.v2beta1.CreateContextRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The session to create a context for.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
   * `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime ID&gt;/sessions/&lt;Session ID&gt;`.
   * Note: Runtimes are under construction and will be available soon.
   * If &lt;Runtime ID&gt; is not specified, we assume default 'sandbox' runtime.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The session to create a context for.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
   * `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime ID&gt;/sessions/&lt;Session ID&gt;`.
   * Note: Runtimes are under construction and will be available soon.
   * If &lt;Runtime ID&gt; is not specified, we assume default 'sandbox' runtime.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTEXT_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2beta1.Context context_;
  /**
   * <pre>
   * Required. The context to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
   */
  public boolean hasContext() {
    return context_ != null;
  }
  /**
   * <pre>
   * Required. The context to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.Context getContext() {
    return context_ == null ? com.google.cloud.dialogflow.v2beta1.Context.getDefaultInstance() : context_;
  }
  /**
   * <pre>
   * Required. The context to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getContextOrBuilder() {
    return getContext();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (context_ != null) {
      output.writeMessage(2, getContext());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (context_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getContext());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.CreateContextRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.CreateContextRequest other = (com.google.cloud.dialogflow.v2beta1.CreateContextRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasContext() == other.hasContext());
    if (hasContext()) {
      result = result && getContext()
          .equals(other.getContext());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasContext()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getContext().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.CreateContextRequest prototype) {
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
   * The request message for [Contexts.CreateContext][google.cloud.dialogflow.v2beta1.Contexts.CreateContext].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateContextRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.CreateContextRequest)
      com.google.cloud.dialogflow.v2beta1.CreateContextRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ContextProto.internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ContextProto.internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.CreateContextRequest.class, com.google.cloud.dialogflow.v2beta1.CreateContextRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.CreateContextRequest.newBuilder()
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
      parent_ = "";

      if (contextBuilder_ == null) {
        context_ = null;
      } else {
        context_ = null;
        contextBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ContextProto.internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.CreateContextRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.CreateContextRequest.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.CreateContextRequest build() {
      com.google.cloud.dialogflow.v2beta1.CreateContextRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.CreateContextRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.CreateContextRequest result = new com.google.cloud.dialogflow.v2beta1.CreateContextRequest(this);
      result.parent_ = parent_;
      if (contextBuilder_ == null) {
        result.context_ = context_;
      } else {
        result.context_ = contextBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.CreateContextRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.CreateContextRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.CreateContextRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.CreateContextRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasContext()) {
        mergeContext(other.getContext());
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
      com.google.cloud.dialogflow.v2beta1.CreateContextRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.CreateContextRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime ID&gt;/sessions/&lt;Session ID&gt;`.
     * Note: Runtimes are under construction and will be available soon.
     * If &lt;Runtime ID&gt; is not specified, we assume default 'sandbox' runtime.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime ID&gt;/sessions/&lt;Session ID&gt;`.
     * Note: Runtimes are under construction and will be available soon.
     * If &lt;Runtime ID&gt; is not specified, we assume default 'sandbox' runtime.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime ID&gt;/sessions/&lt;Session ID&gt;`.
     * Note: Runtimes are under construction and will be available soon.
     * If &lt;Runtime ID&gt; is not specified, we assume default 'sandbox' runtime.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime ID&gt;/sessions/&lt;Session ID&gt;`.
     * Note: Runtimes are under construction and will be available soon.
     * If &lt;Runtime ID&gt; is not specified, we assume default 'sandbox' runtime.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime ID&gt;/sessions/&lt;Session ID&gt;`.
     * Note: Runtimes are under construction and will be available soon.
     * If &lt;Runtime ID&gt; is not specified, we assume default 'sandbox' runtime.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2beta1.Context context_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Context, com.google.cloud.dialogflow.v2beta1.Context.Builder, com.google.cloud.dialogflow.v2beta1.ContextOrBuilder> contextBuilder_;
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
     */
    public boolean hasContext() {
      return contextBuilder_ != null || context_ != null;
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Context getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? com.google.cloud.dialogflow.v2beta1.Context.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
     */
    public Builder setContext(com.google.cloud.dialogflow.v2beta1.Context value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
        onChanged();
      } else {
        contextBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
     */
    public Builder setContext(
        com.google.cloud.dialogflow.v2beta1.Context.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
        onChanged();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
     */
    public Builder mergeContext(com.google.cloud.dialogflow.v2beta1.Context value) {
      if (contextBuilder_ == null) {
        if (context_ != null) {
          context_ =
            com.google.cloud.dialogflow.v2beta1.Context.newBuilder(context_).mergeFrom(value).buildPartial();
        } else {
          context_ = value;
        }
        onChanged();
      } else {
        contextBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
     */
    public Builder clearContext() {
      if (contextBuilder_ == null) {
        context_ = null;
        onChanged();
      } else {
        context_ = null;
        contextBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Context.Builder getContextBuilder() {
      
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ?
            com.google.cloud.dialogflow.v2beta1.Context.getDefaultInstance() : context_;
      }
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Context context = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Context, com.google.cloud.dialogflow.v2beta1.Context.Builder, com.google.cloud.dialogflow.v2beta1.ContextOrBuilder> 
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Context, com.google.cloud.dialogflow.v2beta1.Context.Builder, com.google.cloud.dialogflow.v2beta1.ContextOrBuilder>(
                getContext(),
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      return contextBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.CreateContextRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.CreateContextRequest)
  private static final com.google.cloud.dialogflow.v2beta1.CreateContextRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.CreateContextRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateContextRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateContextRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateContextRequest>() {
    public CreateContextRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateContextRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateContextRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateContextRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.CreateContextRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

