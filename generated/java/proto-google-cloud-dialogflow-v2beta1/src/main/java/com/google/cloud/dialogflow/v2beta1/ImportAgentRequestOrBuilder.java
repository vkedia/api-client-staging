// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ImportAgentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ImportAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project that the agent to import is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project that the agent to import is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Warning: Importing agents from a URI is not implemented yet.
   * This feature is coming soon.
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   */
  java.lang.String getAgentUri();
  /**
   * <pre>
   * Warning: Importing agents from a URI is not implemented yet.
   * This feature is coming soon.
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   */
  com.google.protobuf.ByteString
      getAgentUriBytes();

  /**
   * <pre>
   * The agent to import.
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   */
  com.google.protobuf.ByteString getAgentContent();

  public com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.AgentCase getAgentCase();
}
