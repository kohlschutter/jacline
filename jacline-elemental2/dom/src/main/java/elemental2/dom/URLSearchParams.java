package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class URLSearchParams implements JsIterable<JsArray<String>, @Nullable Object, @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorInitUnionType{
@JsOverlay
static URLSearchParams.ConstructorInitUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<JsArray<String>> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsPropertyMap<String> asJsPropertyMap(){
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
@JsFunction
public interface ForEachCallbackFn{
@Nullable Object onInvoke(String value,String key);
}
public URLSearchParams(){}
public URLSearchParams(URLSearchParams.ConstructorInitUnionType init){}
public URLSearchParams(JsArray<JsArray<String>> init){}
public URLSearchParams(JsPropertyMap<String> init){}
public URLSearchParams(String init){}
public URLSearchParams(String[][] init){}
public native void append(String name,String value);
public native void delete(String name);
public native JsIteratorIterable<JsArray<String>, @Nullable Object, @Nullable Object> entries();
public native void forEach(URLSearchParams.ForEachCallbackFn callback);
public native @Nullable String get(String name);
public native JsArray<String> getAll(String name);
public native boolean has(String name);
public native JsIteratorIterable<String, @Nullable Object, @Nullable Object> keys();
public native void set(String name,String value);
public native void sort();
public native JsIteratorIterable<String, @Nullable Object, @Nullable Object> values();
}
