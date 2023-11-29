#!/bin/sh
#
# Obtains the Google Closure Library files that are necessary for j2cl/jacline
#
# Copyright 2023 by Christian Kohlschütter
# SPDX-License-Identifier: Apache-2.0
#

cd "$(dirname $0)"
url="https://registry.npmjs.org/google-closure-library/-/google-closure-library-20230802.0.0.tgz"
tgz=$(basename "$url")
if [[ ! -f "$tgz" ]]; then
  wget "$url"
fi
rm -rf package src
tar xvzf "$tgz"

jaclOut=src/main/resources/META-INF/jacline/sources/
mkdir -p "$jaclOut"

mkdir -p $jaclOut/goog/{reflect,math,asserts,debug,dom}

for f in base.js reflect/reflect.js math/long.js asserts/asserts.js debug/error.js dom/nodetype.js; do
  cp package/closure/goog/$f ${jaclOut}/goog/$f
done
