#!/usr/bin/env zsh
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
bazel build "jre/java/..."
cd - >/dev/null

bazelBin=../j2cl/bazel-bin

javaOut=src/main/java
sharedOut=src/shared/java
restOut=src/main/resources/META-INF/jacline/generated/
jaclineOut=src/main/jacline
rm -rf "$jaclineOut"
rm -rf "$javaOut" "$sharedOut"
rm -rf src/main/resources
mkdir -p "$javaOut" "$restOut" "$sharedOut"

cp -r ${bazelBin}/jre/java/jre.js/* "$javaOut"/
#cp -r ${bazelBin}/jre/java/jre.js/* "$restOut"/

( cd src/main/java ; jar xf ../../../"$jsia" jsinterop )

chmod 755 $(find src -type d)
chmod 644 $(find src -type f)

anno=javaemul/internal/annotations
mkdir -p ${javaOut}/${anno}
cp ../j2cl/jre/java/${anno}/*.java ${javaOut}/${anno}/

mkdir -p "$sharedOut"/javaemul/internal/annotations
mv "$javaOut"/javaemul/internal/{ArrayStamper,JsUtils}.java "$sharedOut"/javaemul/internal/
mv "$javaOut"/javaemul/internal/annotations/Wasm.java "$sharedOut"/javaemul/internal/annotations/

rm -f $(find "$javaOut" -type f -not -name "*.java" -and -not -name "*.native_js")

cp ../j2cl/jre/java/module-info.java "$javaOut"/

for f in $(find "$javaOut" -name "*.native_js"); do
  new=$(echo "$f" | sed -E 's|native_js|native.js|g')
  mv -vf "$f" "$new"
done

for f in $(cd src/fixes/java ; find . -type f ); do
  origFile="src/main/java/$f"
  if [[ -f "$origFile" ]]; then
    echo Overriding "$f" with fixed version in src/fixes/java
    rm -f "$origFile"
  else
    echo Adding new file "$f"
  fi
done

jaclineIn=../j2cl/jre/java
for f in $( cd "$jaclineIn" ; find . -name "*.js" | grep -v super-wasm | grep -v ".native.js"); do
  dir=${f%/*}
  mkdir -p "$jaclineOut/$dir"
  echo $f
  cp -a "$jaclineIn/$f" "$jaclineOut/$dir/"
done

vmbootstrapIn="$bazelBin/jre/java/jre.js"
for f in $( cd "$vmbootstrapIn" ; find . -name "*.js" | grep '/vmbootstrap/'); do
  dir=${f%/*}
  mkdir -p "$jaclineOut/$dir"
  echo $f
  cp -a "$vmbootstrapIn/$f" "$jaclineOut/$dir/"
done

for f in $(find patches -name "*.diff"); do
  echo $f
  cat "$f" | patch -p2 --backup-if-mismatch --version-control none
done
