#!/bin/sh
#
# Obtains the jsinterop-base files that are necessary for j2cl/jacline
#
# Copyright 2023 by Christian Kohlschütter
# SPDX-License-Identifier: Apache-2.0
#

#if [[ ! -d jsinterop-base ]]; then
#  git clone https://github.com/google/jsinterop-base.git
#fi
alias bazel=bazelisk
cd jsinterop-base
bazel build java/...
cd ..

javaOut=src/main/java
restOut=src/main/resources/META-INF/jacline/generated/
rm -rf src/main/java
rm -rf src/main/resources
mkdir -p "$javaOut" "$restOut"

cp -r jsinterop-base/bazel-bin/java/jsinterop/base/base-j2cl.js/* "$javaOut"/
#cp -r jsinterop-base/bazel-bin/java/jsinterop/base/base-j2cl.js/* "$restOut"/

find src -type d -exec chmod 755 "{}" \;
find src -type f -exec chmod 644 "{}" \;

rm -f $(find "$javaOut" -type f -not -name "*.java" -and -not -name "*.native_js")

for f in $(find "$javaOut" -name "*.native_js"); do
  new=$(echo "$f" | sed -E 's|native_js|native.js|g')
  mv -vf "$f" "$new"
done
