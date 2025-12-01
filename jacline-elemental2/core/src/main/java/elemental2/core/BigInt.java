package elemental2.core;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import jsinterop.annotations.JsMethod;
import jsinterop.base.JsBigint;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class BigInt{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorArgUnionType{
@JsOverlay
static BigInt.ConstructorArgUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default JsBigint asJsBigint(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ToLocaleStringLocalesUnionType{
@JsOverlay
static BigInt.ToLocaleStringLocalesUnionType of(Object o){
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
public static native JsBigint asIntN(double width,JsBigint bigint);
public static native JsBigint asUintN(double width,JsBigint bigint);
public BigInt(BigInt.ConstructorArgUnionType arg){}
public BigInt(JsBigint arg){}
public BigInt(String arg){}
public BigInt(double arg){}
public native String toLocaleString();
@JsOverlay
public final String toLocaleString(JsArray<String> locales,@Nullable JsObject options){
return toLocaleString(Js.<BigInt.ToLocaleStringLocalesUnionType>uncheckedCast(locales),options);
}
@JsOverlay
public final String toLocaleString(JsArray<String> locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
@JsOverlay
public final String toLocaleString(JsArray<String> locales){
return toLocaleString(Js.<BigInt.ToLocaleStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleString(String locales,@Nullable JsObject options){
return toLocaleString(Js.<BigInt.ToLocaleStringLocalesUnionType>uncheckedCast(locales),options);
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
return toLocaleString(Js.<BigInt.ToLocaleStringLocalesUnionType>uncheckedCast(locales));
}
@JsOverlay
public final String toLocaleString(String[] locales){
return toLocaleString(Js.<JsArray<String>>uncheckedCast(locales));
}
public native String toLocaleString(BigInt.ToLocaleStringLocalesUnionType locales,@Nullable JsObject options);
@JsOverlay
public final String toLocaleString(BigInt.ToLocaleStringLocalesUnionType locales,@Nullable Object options){
return toLocaleString(locales,Js.<@Nullable JsObject>uncheckedCast(options));
}
public native String toLocaleString(BigInt.ToLocaleStringLocalesUnionType locales);
public native String toString(double radix);
@JsMethod(name = "toString")
public native String toString_();
public native JsBigint valueOf();
}
