package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "Math",namespace = JsPackage.GLOBAL)
public class JsMath{
@JsOverlay
public static final double E=JsMath__Constants.E;
@JsOverlay
public static final double LN10=JsMath__Constants.LN10;
@JsOverlay
public static final double LN2=JsMath__Constants.LN2;
@JsOverlay
public static final double LOG10E=JsMath__Constants.LOG10E;
@JsOverlay
public static final double LOG2E=JsMath__Constants.LOG2E;
@JsOverlay
public static final double PI=JsMath__Constants.PI;
@JsOverlay
public static final double SQRT1_2=JsMath__Constants.SQRT1_2;
@JsOverlay
public static final double SQRT2=JsMath__Constants.SQRT2;
public static native double abs(@Nullable Object x);
public static native double acos(@Nullable Object x);
public static native double acosh(double value);
public static native double asin(@Nullable Object x);
public static native double asinh(double value);
public static native double atan(@Nullable Object x);
public static native double atan2(@Nullable Object y,@Nullable Object x);
public static native double atanh(double value);
public static native double cbrt(double value);
public static native int ceil(@Nullable Object x);
public static native int clz32(int value);
public static native double cos(@Nullable Object x);
public static native double cosh(double value);
public static native double exp(@Nullable Object x);
public static native double expm1(double value);
public static native int floor(@Nullable Object x);
public static native double fround(double value);
public static native double hypot(double... var_args);
public static native double imul(double value1,double value2);
public static native double log(@Nullable Object x);
public static native double log10(double value);
public static native double log1p(double value);
public static native double log2(double value);
public static native double max(@Nullable Object... var_args);
public static native double min(@Nullable Object... var_args);
public static native double pow(@Nullable Object x,@Nullable Object y);
public static native double random();
public static native int round(@Nullable Object x);
public static native double sign(double value);
public static native double sin(@Nullable Object x);
public static native double sinh(double value);
public static native double sqrt(@Nullable Object x);
public static native double tan(@Nullable Object x);
public static native double tanh(double value);
public static native String toSource();
public static native int trunc(double value);
}
