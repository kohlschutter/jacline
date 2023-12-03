/*
 * jacline-lib-common
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
package com.kohlschutter.jacline.lib.pledge;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Test;

public class PledgeTest {

  @Test
  public void test() throws InterruptedException, ExecutionException {
    CompletableFuture<Integer> result = new CompletableFuture<>();

    Pledge.resolveObject(123).then((i) -> {
      return i + 4;
    }).thenAccept(result::complete).exceptionallyAccept((o) -> {
      result.completeExceptionally(Pledge.asThrowable(o));
    });

    assertEquals(127, result.get());
  }

  @Test
  public void testThenable() throws Exception {
    CompletableFuture<Integer> result = new CompletableFuture<>();

    Pledge.resolveThenable(int.class, (success, fail) -> {
      success.consume(1);
    }).then((i) -> {
      return i + 22;
    }).thenAccept((i) -> {
      result.complete(i);
    }).exceptionallyAccept((o) -> {
      result.completeExceptionally((Throwable) o);
    });

    assertEquals(23, result.get());
  }

  @Test
  public void testThenableFail() throws Exception {
    CompletableFuture<Integer> result = new CompletableFuture<>();

    Pledge.resolveThenable(int.class, (success, fail) -> {
      fail.consume("not an exception");
    }).then((i) -> {
      return i + 22;
    }).thenAccept((i) -> {
      result.complete(i);
    }).exceptionallyAccept((o) -> {
      result.completeExceptionally(Pledge.asThrowable(o));
    });

    try {
      result.get();
      fail("Expected a ExecutionException");
    } catch (ExecutionException e) {
      assertEquals("not an exception", Pledge.asObject(e.getCause()));
    }
    assertTrue(result.isCompletedExceptionally());
  }
}
