#!/bin/sh
#
# Transpiles any Java classes defined in src/fixes/java using an existing
# version of the jacline compiler.
#
# This is only necessary until we have a version in Maven central, at which
# point we can simply use the latest available release.
#
# Copyright 2023 by Christian Kohlschütter
# SPDX-License-Identifier: Apache-2.0
#
version="1.0.0-SNAPSHOT"
#
cd "$(dirname $0)"/..
mvn -Pbootstrap-fixes -Djacline.j2cl.bootstrap.jar=$HOME/.m2/repository/com/kohlschutter/jacline/jacline-jrejs/"$version"/jacline-jrejs-"$version"-bootstrap.jar clean compile
cp -av target/classes/META-INF/jacline/* src/fixes/resources/META-INF/jacline/
git status .
