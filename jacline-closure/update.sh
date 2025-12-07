#!/usr/bin/env zsh
#
# Obtains the closure-compiler files that are necessary for jacline
#
# Copyright 2025 by Christian Kohlschütter
# SPDX-License-Identifier: Apache-2.0
#

cd "$(dirname $0)"

cd ../closure-compiler
alias bazel=bazelisk

bazel build :all
bazel test :compiler_unshaded_content_test --test_output=errors

cd - >/dev/null

bazelBin=../closure-compiler/bazel-bin

javaOut=src/main/java
resourceOut=src/main/resources

rm -rf "$javaOut" "$resourceOut"
mkdir -p "$javaOut" "$resourceOut"

srcIn=../closure-compiler/src
generatedSrcIn=../closure-compiler/bazel-bin/src/java

for f in $( cd "$srcIn" ; find . -name "*.java" -or -name "*.proto"); do
  dir=${f%/*}
  mkdir -p "$javaOut/$dir"
  echo $f
  cp "$srcIn/$f" "$javaOut/$dir/"
done

for f in $( cd "$srcIn" ; find . -type f -not -name "*.java" -and -not -name "*.proto" -and -not -name "*.bazel" -and -not -name "*.html"); do
  dir=${f%/*}
  mkdir -p "$resourceOut/$dir"
  echo $f
  cp "$srcIn/$f" "$resourceOut/$dir/"
done

for f in $( cd "$generatedSrcIn" ; find . -type f -not -name "*.java"); do
  dir=${f%/*}
  mkdir -p "$resourceOut/$dir"
  echo $f
  cp "$generatedSrcIn/$f" "$resourceOut/$dir/"
done

