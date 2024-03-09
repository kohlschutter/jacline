/*
 * Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package jsinterop.generator.closure;

import static com.google.common.collect.ImmutableList.toImmutableList;

import com.google.javascript.jscomp.SourceFile;
import java.util.ArrayList;
import java.util.List;
import jsinterop.generator.helper.AbortError;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

/** Entry point for generating JsType from closure extern files. */
public class Runner {
  @Option(name = "--output", usage = "Output jar file path", required = true)
  String output = null;

  @Option(name = "--output_dependency_file", usage = "Output dependency file path", required = true)
  String outputDependencyPath = null;

  @Option(name = "--package_prefix", usage = "Package prefix")
  String packagePrefix = null;

  @Option(
    name = "--extension_type_prefix",
    usage = "Value used for prefixing extension types",
    required = true
  )
  String extensionTypePrefix = null;

  @Option(
      name = "--global_scope_class_name",
      usage = "Value used for java class representing the global scope.",
      required = true)
  String globalScopeClassName = null;

  @Option(name = "--debug_mode", usage = "Enable debug mode")
  boolean debugEnabled = false;

  @Option(name = "--strict", usage = "Enabling strict mode: treats warning message as errors")
  boolean strict = false;

  @Option(
    name = "--dependency_mapping_file",
    usage =
        "File generated by the generator that contains the mapping between native fqn and java "
            + "fqn of types provided by a dependency"
  )
  List<String> dependencyMappingFilePaths = new ArrayList<>();

  @Option(
    name = "--name_mapping_file",
    usage =
        "File containing the mapping between a fqn of parameter and its final name. This file "
            + "allows the generator to rename some parameters with a well-defined name."
  )
  List<String> nameMappingFilePaths = new ArrayList<>();

  @Option(
    name = "--wildcard_types_file",
    usage =
        "File containing a list of key/value where the key is the"
            + " fully qualify name of the type parameter and the value is the kind of wildcard type"
            + "to use. Possible value: SUPER and EXTENDS"
  )
  List<String> wildcardTypesFiles = new ArrayList<>();

  @Option(
    name = "--integer_entities_file",
    usage =
        "File containing the list of entities typed as number and need to be converted to integer"
            + " instead of double. The entity is represented by its fqn."
  )
  List<String> integerEntitiesFiles = new ArrayList<>();

  @Option(name = "--dependency", usage = "Source file of a dependency")
  List<String> dependencyFilePaths = new ArrayList<>();

  @Option(name = "--custom_preprocessing_pass", hidden = true)
  List<String> customPreprocessingPasses = new ArrayList<>();

  @Argument(required = true, multiValued = true, usage = "list of source files")
  List<String> sourceFilePaths = new ArrayList<>();

  private void run() {
    Options options =
        Options.builder()
            .outputJarFile(output)
            .outputDependencyFile(outputDependencyPath)
            .packagePrefix(packagePrefix)
            .extensionTypePrefix(extensionTypePrefix)
            .globalScopeClassName(globalScopeClassName)
            .debugEnabled(debugEnabled)
            .strict(strict)
            .dependencyMappingFiles(dependencyMappingFilePaths)
            .nameMappingFiles(nameMappingFilePaths)
            .integerEntitiesFiles(integerEntitiesFiles)
            .wildcardTypesFiles(wildcardTypesFiles)
            .dependencies(
                dependencyFilePaths.stream().map(SourceFile::fromFile).collect(toImmutableList()))
            .sources(sourceFilePaths.stream().map(SourceFile::fromFile).collect(toImmutableList()))
            .customPreprocessingPasses(customPreprocessingPasses)
            .build();
    try {
      new ClosureJsInteropGenerator(options).convert();
    } catch (AbortError error) {
      System.exit(1);
    }
  }

  public static void main(String[] args) throws CmdLineException {
    Runner runner = new Runner();
    CmdLineParser parser = new CmdLineParser(runner);
    parser.parseArgument(args);
    runner.run();
  }
}