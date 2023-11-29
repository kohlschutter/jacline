#!/bin/sh
#
# Obtains the jrejs files that are necessary for jacline
#
# Copyright 2023 by Christian Kohlschütter
# SPDX-License-Identifier: Apache-2.0
#

cd "$(dirname $0)"

jsiaUrl=https://repo1.maven.org/maven2/com/google/jsinterop/jsinterop-annotations/2.1.0/jsinterop-annotations-2.1.0-sources.jar
jsia=$(basename "$jsiaUrl")
if [[ ! -f "$jsia" ]]; then
  wget "$jsiaUrl"
fi

cd ../j2cl
alias bazel=bazelisk
#bazel build "jre/java/..."
cd - >/dev/null

bazelBin=../j2cl/bazel-bin

javaOut=src/main/java
sharedOut=src/shared/java
restOut=src/main/resources/META-INF/jacline/generated/
rm -rf "$javaOut" "$sharedOut"
rm -rf src/main/resources
mkdir -p "$javaOut" "$restOut" "$sharedOut"

cp -r ${bazelBin}/jre/java/jre.js/* "$javaOut"/
cp -r ${bazelBin}/jre/java/jre.js/* "$restOut"/

cp ../j2cl/jre/java/module-info.java "$javaOut"/

( cd src/main/java ; jar xf ../../../"$jsia" jsinterop )

chmod 755 $(find src -type d)
chmod 644 $(find src -type f)

anno=javaemul/internal/annotations
mkdir -p ${javaOut}/${anno}
cp ../j2cl/jre/java/${anno}/*.java ${javaOut}/${anno}/

mkdir -p "$sharedOut"/javaemul/internal/annotations
mv "$javaOut"/javaemul/internal/{ArrayStamper,JsUtils}.java "$sharedOut"/javaemul/internal/
mv "$javaOut"/javaemul/internal/annotations/Wasm.java "$sharedOut"/javaemul/internal/annotations/

rm -f $(find "$javaOut" -type f -not -name "*.java")

for f in $(cd src/fixes/java ; find . -type f ); do
  origFile="src/main/java/$f"
  if [[ -f "$origFile" ]]; then
    echo Overriding "$f" with fixed version in src/fixes/java
    rm -f "$origFile"
  else
    echo Adding new file "$f"
  fi
done
