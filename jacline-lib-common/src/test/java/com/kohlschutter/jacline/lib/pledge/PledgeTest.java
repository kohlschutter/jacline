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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Test;

import com.kohlschutter.jacline.lib.util.ExecutorHelper;

public class PledgeTest {

  @Test
  public void test() throws InterruptedException, ExecutionException {
    CompletableFuture<Integer> result = new CompletableFuture<>();

    Pledge.ofResult(123).then((i) -> {
      return i + 4;
    }).thenAccept(result::complete).exceptionallyAccept((o) -> {
      result.completeExceptionally(Pledge.asThrowable(o));
    });

    assertEquals(127, result.get());
  }

  @Test
  public void testThenable() throws Exception {
    CompletableFuture<Integer> result = new CompletableFuture<>();

    Pledge.<Integer> ofThenable((success, fail) -> {
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

    Pledge.<Integer> ofThenable((success, fail) -> {
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

  @Test
  public void testRejected() throws Exception {
    CompletableFuture<Number> result = new CompletableFuture<>();

    Pledge.<Number> ofRejected("Rejected for some reason").thenAccept((i) -> {
      result.complete(i);
    }).exceptionallyAccept((e) -> {
      result.completeExceptionally(Pledge.asThrowable(e));
    });

    try {
      result.get();
      fail("Expected a ExecutionException");
    } catch (ExecutionException e) {
      assertEquals("Rejected for some reason", Pledge.asObject(e.getCause()));
    }
  }

  @Test
  public void testFirstToSettle() throws Exception {
    Pledge<String> pledge1 = Pledge.ofRejected("rejected");
    Pledge<String> pledge2 = Pledge.ofCallback((resolve) -> {
      ExecutorHelper.executeDelayed(resolve, 0, "quick");
    });
    Pledge<String> pledge3 = Pledge.ofThenable((resolve, err) -> {
      ExecutorHelper.executeDelayed(resolve, 100, "slow");
    });

    CompletableFuture<String> result = new CompletableFuture<>();

    Pledge.firstToSettle(Pledge.group(pledge1, pledge2, pledge3)).thenAccept((t) -> {
      result.complete(t);
    }).exceptionallyAccept((t) -> {
      result.complete((String) Pledge.asObject(t));
    });

    assertEquals("rejected", result.get());
  }

  @Test
  public void testFirstToSucceed() throws Exception {
    Pledge<String> pledge1 = Pledge.ofRejected("rejected");
    Pledge<String> pledge2 = Pledge.ofThenable((resolve, err) -> {
      ExecutorHelper.executeDelayed(resolve, 0, "quick");
    });
    Pledge<String> pledge3 = Pledge.ofThenable((resolve, err) -> {
      ExecutorHelper.executeDelayed(resolve, 100, "slow");
    });

    CompletableFuture<String> result = new CompletableFuture<>();

    Pledge.firstToSucceed(Pledge.group(pledge1, pledge2, pledge3)).thenAccept((t) -> {
      result.complete(t);
    }).exceptionallyAccept((t) -> {
      t = Pledge.asObject(t);
      if (t instanceof Throwable) {
        result.complete(((Throwable) t).getMessage());
      } else {
        result.complete((String) t);
      }
    });

    assertEquals("quick", result.get());
  }

  @Test
  public void testFirstToSucceedNeitherDoes() throws Exception {
    Pledge<String> pledge1 = Pledge.ofRejected("rejected1");
    Pledge<String> pledge2 = Pledge.ofRejected("rejected2");
    Pledge<String> pledge3 = Pledge.ofThenable((resolve, err) -> {
      ExecutorHelper.executeDelayed(err, 0, "rejected3");
    });

    CompletableFuture<String> result = new CompletableFuture<>();

    Pledge.firstToSucceed(Pledge.group(pledge1, pledge2, pledge3)).thenAccept((t) -> {
      result.complete(t);
    }).exceptionallyAccept((t) -> {
      t = Pledge.asObject(t);
      if (t instanceof Throwable) {
        result.complete(((Throwable) t).getMessage());
      } else {
        result.complete((String) t);
      }
    });

    assertEquals("All futures completed exceptionally", result.get());
  }

  @Test
  public void testFirstToSettleEmpty() throws Exception {
    CompletableFuture<String> result = new CompletableFuture<>();

    Pledge.firstToSettle(Pledge.<String> group()).thenAccept((t) -> {
      result.complete(t);
    }).exceptionallyAccept((t) -> {
      t = Pledge.asObject(t);
      if (t instanceof Throwable) {
        result.complete(((Throwable) t).getMessage());
      } else {
        result.complete((String) t);
      }
    });

    assertEquals("No futures specified", result.get());
  }

  @Test
  public void testFirstToSucceedEmpty() throws Exception {
    CompletableFuture<String> result = new CompletableFuture<>();

    Pledge.firstToSucceed(Pledge.<String> group()).thenAccept((t) -> {
      result.complete(t);
    }).exceptionallyAccept((t) -> {
      t = Pledge.asObject(t);
      if (t instanceof Throwable) {
        result.complete(((Throwable) t).getMessage());
      } else {
        result.complete((String) t);
      }
    });

    assertEquals("No futures specified", result.get());
  }

  @Test
  public void testAll() throws Exception {
    Pledge<Integer> pledge1 = Pledge.ofResult(1);
    Pledge<Integer> pledge2 = Pledge.ofResult(2);
    Pledge<Integer> pledge3 = Pledge.ofThenable((resolve, err) -> {
      ExecutorHelper.executeDelayed(resolve, 0, 3);
    });

    CompletableFuture<Integer[]> result = new CompletableFuture<>();

    Pledge.allOf(Integer.class, Pledge.group(pledge1, pledge2, pledge3)).thenAccept((t) -> {
      result.complete(t);
    }).exceptionallyAccept((t) -> {
      result.completeExceptionally(Pledge.asThrowable(t));
    });

    assertArrayEquals(new Integer[] {1, 2, 3}, result.get());
  }

  @Test
  public void testAllEmpty() throws Exception {
    CompletableFuture<Integer[]> result = new CompletableFuture<>();

    Pledge.allOf(Integer.class, Pledge.group()).thenAccept((t) -> {
      result.complete(t);
    }).exceptionallyAccept((t) -> {
      result.completeExceptionally(Pledge.asThrowable(t));
    });

    assertArrayEquals(new Integer[] {}, result.get());
  }
}
