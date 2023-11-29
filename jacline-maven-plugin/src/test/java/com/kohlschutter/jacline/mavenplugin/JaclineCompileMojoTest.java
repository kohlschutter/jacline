/*
 * jacline-maven-plugin
 *
 * Copyright 2023 Christian Kohlschütter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kohlschutter.jacline.mavenplugin;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.maven.plugin.testing.MojoRule;
import org.junit.Rule;

public class JaclineCompileMojoTest {
  @Rule
  public MojoRule rule = new MojoRule() {
    @Override
    protected void before() throws Throwable {
    }

    @Override
    protected void after() {
    }
  };

  // @Test
  public void testSomething() throws Exception {
    File pom = new File("target/test-classes/project-to-test/");
    // if (!pom.isDirectory()) {
    pom = new File(JaclineCompileMojoTest.class.getResource("/project-to-test").toURI());
    // }
    assertNotNull(pom);
    assertTrue(pom.exists());

    JaclineCompileMojo myMojo = (JaclineCompileMojo) rule.lookupConfiguredMojo(pom, "compile");
    assertNotNull(myMojo);
    myMojo.execute();

    Path outputDirectory = Path.of(myMojo.jaclineMetaInfDirectory);
    assertNotNull(outputDirectory);
    assertTrue(Files.exists(outputDirectory));
  }
}
