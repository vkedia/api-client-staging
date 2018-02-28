// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/keys.proto

package com.google.spanner.v1;

public interface KeyRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.KeyRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If the start is closed, then the range includes all rows whose
   * first `len(start_closed)` key columns exactly match `start_closed`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue start_closed = 1;</code>
   */
  com.google.protobuf.ListValue getStartClosed();
  /**
   * <pre>
   * If the start is closed, then the range includes all rows whose
   * first `len(start_closed)` key columns exactly match `start_closed`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue start_closed = 1;</code>
   */
  com.google.protobuf.ListValueOrBuilder getStartClosedOrBuilder();

  /**
   * <pre>
   * If the start is open, then the range excludes rows whose first
   * `len(start_open)` key columns exactly match `start_open`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue start_open = 2;</code>
   */
  com.google.protobuf.ListValue getStartOpen();
  /**
   * <pre>
   * If the start is open, then the range excludes rows whose first
   * `len(start_open)` key columns exactly match `start_open`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue start_open = 2;</code>
   */
  com.google.protobuf.ListValueOrBuilder getStartOpenOrBuilder();

  /**
   * <pre>
   * If the end is closed, then the range includes all rows whose
   * first `len(end_closed)` key columns exactly match `end_closed`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue end_closed = 3;</code>
   */
  com.google.protobuf.ListValue getEndClosed();
  /**
   * <pre>
   * If the end is closed, then the range includes all rows whose
   * first `len(end_closed)` key columns exactly match `end_closed`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue end_closed = 3;</code>
   */
  com.google.protobuf.ListValueOrBuilder getEndClosedOrBuilder();

  /**
   * <pre>
   * If the end is open, then the range excludes rows whose first
   * `len(end_open)` key columns exactly match `end_open`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue end_open = 4;</code>
   */
  com.google.protobuf.ListValue getEndOpen();
  /**
   * <pre>
   * If the end is open, then the range excludes rows whose first
   * `len(end_open)` key columns exactly match `end_open`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue end_open = 4;</code>
   */
  com.google.protobuf.ListValueOrBuilder getEndOpenOrBuilder();

  public com.google.spanner.v1.KeyRange.StartKeyTypeCase getStartKeyTypeCase();

  public com.google.spanner.v1.KeyRange.EndKeyTypeCase getEndKeyTypeCase();
}
