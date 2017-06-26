// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface SpeechRecognitionAlternativeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.SpeechRecognitionAlternative)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * *Output-only* Transcript text representing the words that the user spoke.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   */
  java.lang.String getTranscript();
  /**
   * <pre>
   * *Output-only* Transcript text representing the words that the user spoke.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   */
  com.google.protobuf.ByteString
      getTranscriptBytes();

  /**
   * <pre>
   * *Output-only* The confidence estimate between 0.0 and 1.0. A higher number
   * indicates an estimated greater likelihood that the recognized words are
   * correct. This field is typically provided only for the top hypothesis, and
   * only for `is_final=true` results. Clients should not rely on the
   * `confidence` field as it is not guaranteed to be accurate, or even set, in
   * any of the results.
   * The default of 0.0 is a sentinel value indicating `confidence` was not set.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  float getConfidence();
}