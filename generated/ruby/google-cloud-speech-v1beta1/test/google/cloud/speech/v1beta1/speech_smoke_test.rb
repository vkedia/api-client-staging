# Copyright 2017, Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# AUTO GENERATED BY GAPIC

require "minitest/autorun"
require "minitest/spec"

require "google/cloud/speech"

describe "SpeechSmokeTest" do
  it "runs one smoke test with sync_recognize" do

    speech_client = Google::Cloud::Speech.new
    language_code = "en-US"
    sample_rate = 44100
    encoding = :FLAC
    config = {
      language_code: language_code,
      sample_rate: sample_rate,
      encoding: encoding
    }
    uri = "gs://gapic-toolkit/hello.flac"
    audio = { uri: uri }
    response = speech_client.sync_recognize(config, audio)
  end
end