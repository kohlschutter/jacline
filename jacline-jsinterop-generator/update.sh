#!/bin/sh
#
# Obtains the jsinterop-generator files that are necessary for j2cl/jacline
#
# Copyright 2023 by Christian Kohlschütter
# SPDX-License-Identifier: Apache-2.0
#

#git submodule update --init
alias bazel=bazelisk
cd jsinterop-generator
bazel build ... || true
cd ..

rm -rf src/main/resources

function copySrc {
  src=jsinterop-generator/"$1"
  out="$2"
  rm -rf "$out"
  mkdir -p "$out"
  javaFiles=$(cd "$src" ; find . -type f -name "*.java")
  for f in $javaFiles; do
    dir="$out/"$(dirname "$f")
    mkdir -p "$dir"
    case "$f" in 
      *AutoValue_*)
      continue
      ;;
    esac

    cp "$src/$f" "$dir"/
  done
}

copySrc java src/main/java
copySrc bazel-bin/java/jsinterop/generator/model/_javac/model/libmodel_sources src/model/java

find src -type d -exec chmod 755 "{}" \;
find src -type f -exec chmod 644 "{}" \;
