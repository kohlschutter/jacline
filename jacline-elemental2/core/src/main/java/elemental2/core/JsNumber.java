package elemental2.core;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import jsinterop.annotations.JsMethod;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,name = "Number",namespace = JsPackage.GLOBAL)
public class JsNumber{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ToLocaleStringLocalesUnionType{
@JsOverlay
static JsNumber.ToLocaleStringLocalesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ToStringRadixUnionType{
@JsOverlay
static JsNumber.@Nullable ToStringRadixUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default @Nullable JsNumber asJsNumber(){
return Js.cast(this);
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isJsNumber(){
return (Object)this instanceof JsNumber;
}
}
@JsOverlay
public static final double EPSILON=JsNumber__Constants.EPSILON;
@JsOverlay
public static final double MAX_SAFE_INTEGER=JsNumber__Constants.MAX_SAFE_INTEGER;
@JsOverlay
public static final double MAX_VALUE=JsNumber__Constants.MAX_VALUE;
@JsOverlay
public static final double MIN_SAFE_INTEGER=JsNumber__Constants.MIN_SAFE_INTEGER;
@JsOverlay
public static final double MIN_VALUE=JsNumber__Constants.MIN_VALUE;
@JsOverlay
public static final double NEGATIVE_INFINITY=JsNumber__Constants.NEGATIVE_INFINITY;
@JsOverlay
public static final double NaN=JsNumber__Constants.NaN;
@JsOverlay
public static final double POSITIVE_INFINITY=JsNumber__Constants.POSITIVE_INFINITY;
public static native boolean isFinite(@Nullable Object value);
public static native boolean isInteger(@Nullable Object value);
public static native boolean isNaN(@Nullable Object value);
public static native boolean isSafeInteger(@Nullable Object value);
public static native double parseFloat(String string);
public static native int parseInt(String string,int radix);
public JsNumber(){}
public JsNumber(@Nullable Object value){}
public native String toExponential();
public native String toExponential(double fractionDigits);
public native String toFixed();
public native String toFixed(int digits);
public native String toLocaleString();
@JsOverlay
public final String toLocaleString(JsArray<String> locales,@Nullable JsObject options){
return toLocaleString(Js.<JsNumber.ToLocaleStringLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleString(JsArray<String> locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleString(JsArray<String> locales){
return toLocaleString(Js.<JsNumber.ToLocaleStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleString(String locales,@Nullable JsObject options){
return toLocaleString(Js.<JsNumber.ToLocaleStringLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleString(String[] locales,@Nullable JsObject options){
return toLocaleString(Js.<JsArray<String>>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleString(String locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleString(String[] locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleString(String locales){
return toLocaleString(Js.<JsNumber.ToLocaleStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleString(String[] locales){
return toLocaleString(Js.<JsArray<String>>uncheckedCast(locales));
}
public native String toLocaleString(JsNumber.ToLocaleStringLocalesUnionType locales,@Nullable JsObject options);
@JsOverlay
public final String toLocaleString(JsNumber.ToLocaleStringLocalesUnionType locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
public native String toLocaleString(JsNumber.ToLocaleStringLocalesUnionType locales);
public native String toPrecision();
public native String toPrecision(double precision);
@JsOverlay
public final String toString(JsNumber radix){
return toString(Js.<JsNumber.@Nullable ToStringRadixUnionType>uncheckedCast(radix));
}
public native String toString(JsNumber.@Nullable ToStringRadixUnionType radix);
@JsOverlay
public final String toString(int radix){
return toString(Js.<JsNumber.@Nullable ToStringRadixUnionType>uncheckedCast(radix));
}
@JsMethod(name = "toString")
public native String toString_();
public native double valueOf();
}
