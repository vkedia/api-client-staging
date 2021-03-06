// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/storage.proto

package com.google.privacy.dlp.v2beta2;

public interface BigQueryKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta2.BigQueryKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
   */
  boolean hasTableReference();
  /**
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
   */
  com.google.privacy.dlp.v2beta2.BigQueryTable getTableReference();
  /**
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
   */
  com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder getTableReferenceOrBuilder();

  /**
   * <pre>
   * Absolute number of the row from the beginning of the table at the time
   * of scanning.
   * </pre>
   *
   * <code>int64 row_number = 2;</code>
   */
  long getRowNumber();
}
