/*
 * Copyright 2008 Google Inc.
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
package java.lang;

import static javaemul.internal.InternalPreconditions.checkArrayType;
import static javaemul.internal.InternalPreconditions.checkNotNull;
import static javaemul.internal.InternalPreconditions.isTypeChecked;

import java.io.PrintStream;
import javaemul.internal.ArrayHelper;
import javaemul.internal.HashCodes;
import javaemul.internal.annotations.Wasm;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;

/**
 * General-purpose low-level utility methods. GWT only supports a limited subset
 * of these methods due to browser limitations. Only the documented methods are
 * available.
 */
public final class System {

  private static final int MILLIS_TO_NANOS = 1_000_000;

  /**
   * Does nothing in web mode. To get output in web mode, subclass PrintStream
   * and call {@link #setErr(PrintStream)}.
   */
  public static PrintStream err = new PrintStream(null);

  /**
   * Does nothing in web mode. To get output in web mode, subclass
   * {@link PrintStream} and call {@link #setOut(PrintStream)}.
   */
  public static PrintStream out = new PrintStream(null);

  public static void arraycopy(Object src, int srcOfs, Object dest, int destOfs, int len) {
    checkNotNull(src, "src");
    checkNotNull(dest, "dest");

    // Fast path for no type checking. Also hides rest of the checking specific code from compilers.
    if (!isTypeChecked()) {
      checkArrayCopyIndicies(src, srcOfs, dest, destOfs, len);
      ArrayHelper.copy(src, srcOfs, dest, destOfs, len);
      return;
    }

    Class<?> srcType = src.getClass();
    Class<?> destType = dest.getClass();
    checkArrayType(srcType.isArray(), "srcType is not an array");
    checkArrayType(destType.isArray(), "destType is not an array");

    boolean isObjectArray = src instanceof Object[];
    boolean arrayTypeMatch;
    if (isObjectArray) {
      // Destination also should be Object[]
      arrayTypeMatch = dest instanceof Object[];
    } else {
      // Source is primitive; ensure that components are exactly match;
      arrayTypeMatch = srcType.getComponentType() == destType.getComponentType();
    }
    checkArrayType(arrayTypeMatch, "Array types don't match");

    checkArrayCopyIndicies(src, srcOfs, dest, destOfs, len);

    /*
     * If the arrays are not references or if they are exactly the same type, we
     * can copy them in native code for speed. Otherwise, we have to copy them
     * in Java so we get appropriate errors.
     */
    if (isObjectArray && !srcType.equals(destType)) {
      // copy in Java to make sure we get ArrayStoreExceptions if the values
      // aren't compatible
      Object[] srcArray = (Object[]) src;
      Object[] destArray = (Object[]) dest;
      if (src == dest && srcOfs < destOfs) {
        // TODO(jat): how does backward copies handle failures in the middle?
        // copy backwards to avoid destructive copies
        srcOfs += len;
        for (int destEnd = destOfs + len; destEnd-- > destOfs; ) {
          destArray[destEnd] = srcArray[--srcOfs];
        }
      } else {
        for (int destEnd = destOfs + len; destOfs < destEnd; ) {
          destArray[destOfs++] = srcArray[srcOfs++];
        }
      }
    } else {
      ArrayHelper.copy(src, srcOfs, dest, destOfs, len);
    }
  }

  private static void checkArrayCopyIndicies(
      Object src, int srcOfs, Object dest, int destOfs, int len) {
    int srclen = ArrayHelper.getLength(src);
    int destlen = ArrayHelper.getLength(dest);
    if (srcOfs < 0 || destOfs < 0 || len < 0 || srcOfs + len > srclen || destOfs + len > destlen) {
      throw new IndexOutOfBoundsException();
    }
  }

  public static long currentTimeMillis() {
    return (long) currentTimeMillisAsDouble();
  }

  /** System.currentTimeMillis in double that avoids long conversion. */
  @JsMethod(namespace = JsPackage.GLOBAL, name = "Date.now")
  public static native double currentTimeMillisAsDouble();

  public static long nanoTime() {
    return (long) nanoTimeAsDouble();
  }

  /** System.nanoTime in double that avoids long conversion. */
  public static double nanoTimeAsDouble() {
    return performanceNow() * MILLIS_TO_NANOS;
  }

  @JsMethod(namespace = JsPackage.GLOBAL, name = "performance.now")
  private static native double performanceNow();

  /**
   * Has no effect; just here for source compatibility.
   *
   * @skip
   */
  public static void gc() {
  }

  @Wasm("nop") // Calls are replaced by a pass for Wasm.
  @JsMethod(name = "$getDefine", namespace = "nativebootstrap.Util")
  public static native String getProperty(String key);

  @Wasm("nop") // Calls are replaced by a pass for Wasm.
  @JsMethod(name = "$getDefine", namespace = "nativebootstrap.Util")
  public static native String getProperty(String key, String def);

  public static int identityHashCode(Object o) {
    return HashCodes.getIdentityHashCode(o);
  }

  public static void setErr(PrintStream err) {
    System.err = err;
  }

  public static void setOut(PrintStream out) {
    System.out = out;
  }
}
