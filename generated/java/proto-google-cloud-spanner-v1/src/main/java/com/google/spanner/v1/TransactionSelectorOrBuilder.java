// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/transaction.proto

package com.google.spanner.v1;

public interface TransactionSelectorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.TransactionSelector)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Execute the read or SQL query in a temporary transaction.
   * This is the most efficient way to execute a transaction that
   * consists of a single SQL query.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
   */
  com.google.spanner.v1.TransactionOptions getSingleUse();
  /**
   * <pre>
   * Execute the read or SQL query in a temporary transaction.
   * This is the most efficient way to execute a transaction that
   * consists of a single SQL query.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
   */
  com.google.spanner.v1.TransactionOptionsOrBuilder getSingleUseOrBuilder();

  /**
   * <pre>
   * Execute the read or SQL query in a previously-started transaction.
   * </pre>
   *
   * <code>bytes id = 2;</code>
   */
  com.google.protobuf.ByteString getId();

  /**
   * <pre>
   * Begin a new transaction and execute this read or SQL query in
   * it. The transaction ID of the new transaction is returned in
   * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
   */
  com.google.spanner.v1.TransactionOptions getBegin();
  /**
   * <pre>
   * Begin a new transaction and execute this read or SQL query in
   * it. The transaction ID of the new transaction is returned in
   * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
   */
  com.google.spanner.v1.TransactionOptionsOrBuilder getBeginOrBuilder();

  public com.google.spanner.v1.TransactionSelector.SelectorCase getSelectorCase();
}
