#!/bin/sh
#
# Obtains the elemental2 files that are necessary for jacline-elemental2
#
# Copyright 2023 by Christian Kohlschütter
# SPDX-License-Identifier: Apache-2.0
#

git submodule update --init

alias bazel=bazelisk
cd elemental2
bazel build java/...
cd ..

fromBase=elemental2/bazel-bin/java/elemental2

for module in promise core dom encoding indexeddb media svg webassembly webcrypto webgl webstorage; do
  src="${module}/src"
  javaOut=${src}/main/java
  restOut=${src}/main/resources/META-INF/jacline/generated/
  rm -rf "$javaOut" "$restOut"
  mkdir -p "$javaOut" "$restOut"

  cp -r "$fromBase/$module/${module}-j2cl.js/"* "$javaOut"/
  #cp -r "$fromBase/$module/${module}-j2cl.js/"* "$restOut"/

  chmod 755 $(find ${src} -type d)
  chmod 644 $(find ${src} -type f)

  rm -f $(find "$javaOut" -type f -not -name "*.java")
done
