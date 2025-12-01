#!/bin/sh
#
# Updates the jacline-j2cl project with the content from the ../j2cl submodule
#
# Copyright 2023 by Christian Kohlschütter
# SPDX-License-Identifier: Apache-2.0
#

set -e
cd "$(dirname $0)"
cd ../j2cl
bazelBinDir=$(pwd)/bazel-bin
alias bazel=bazelisk
#./build_test.sh || true
bazel build  {jre,transpiler,tools}/java/...
cd - >/dev/null
srcDir=$(pwd)/src

echo

function syncDirs() {
  id="$1"
  src="$2"
  dst="$srcDir/$id/java"
  if [[ -z "$1" || -z "$2" ]]; then
    echo "syncDirs: Invalid arguments" >&2
    exit 1
  fi
  echo "Syncing $1"
  echo "from $src"
  echo "to:  $dst"

  if [[ ! -d "$src" ]]; then
    echo "Missing directory: $src" >&2
    exit 1
  fi

  rm -rf "$dst"
  cp -a "$src" "$dst"

  rm -f $(find "$dst" -name "AutoValue_*.java" -or -name '$AutoValue_*.java')
}

echo BAZELBIN: $bazelBinDir

syncDirs libast \
	"$bazelBinDir/transpiler/java/com/google/j2cl/transpiler/ast/_javac/ast/libast_sources"

syncDirs liblibrary_info_proto \
	"$bazelBinDir/transpiler/java/com/google/j2cl/transpiler/backend/libraryinfo/_javac/library_info_proto/liblibrary_info_proto-speed_tmp"

syncDirs libsummary_proto \
	"$bazelBinDir/transpiler/java/com/google/j2cl/transpiler/backend/wasm/_javac/summary_proto/libsummary_proto-speed_tmp"

syncDirs libworker_protocol_proto \
	"$bazelBinDir/transpiler/java/com/google/j2cl/common/bazel/_javac/worker_protocol_proto/libworker_protocol_proto-speed_tmp"

echo "Done."
