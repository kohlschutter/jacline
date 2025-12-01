package elemental2.core;
import org.jspecify.annotations.Nullable;
import java.lang.Deprecated;
import jsinterop.base.JsConstructorFn;
import elemental2.core.Arguments;
import elemental2.core.TrustedScript;
import elemental2.core.JSONType;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "goog.global",namespace = JsPackage.GLOBAL)
public class Global{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EvalCodeUnionType{
@JsOverlay
static Global.EvalCodeUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default TrustedScript asTrustedScript(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isTrustedScript(){
return (Object)this instanceof TrustedScript;
}
}
@Deprecated
public static JsConstructorFn<?> ActiveXObject;
@JsOverlay
public static final double Infinity=Global__Constants.Infinity;
public static JSONType JSON;
@JsOverlay
public static final double NaN=Global__Constants.NaN;
public static Arguments arguments;
@JsOverlay
public static final Object undefined=Global__Constants.undefined;
public static native String decodeURI(String uri);
public static native String decodeURIComponent(String uri);
public static native String encodeURI(String uri);
public static native String encodeURIComponent(String uri);
public static native String escape(String str);
public static native @Nullable Object eval(Global.EvalCodeUnionType code);
@JsOverlay
public static final @Nullable Object eval(String code){
return eval(Js.<Global.EvalCodeUnionType>uncheckedCast(code));
}
@JsOverlay
public static final @Nullable Object eval(TrustedScript code){
return eval(Js.<Global.EvalCodeUnionType>uncheckedCast(code));
}
public static native boolean isFinite(@Nullable Object num);
public static native boolean isNaN(@Nullable Object num);
public static native double parseFloat(@Nullable Object num);
public static native int parseInt(@Nullable Object num,int base);
public static native String unescape(String str);
}
