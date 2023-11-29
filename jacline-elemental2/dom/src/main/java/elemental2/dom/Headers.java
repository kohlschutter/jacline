package elemental2.dom;
import elemental2.core.JsIterator;
import elemental2.core.JsIterable;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Headers implements JsIterable<JsArray<String>>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorHeadersInitUnionType{
@JsOverlay
static Headers.ConstructorHeadersInitUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Headers asHeaders(){
return Js.cast(this);
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
default boolean isHeaders(){
return (Object)this instanceof Headers;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
public Headers(){}
public Headers(Headers.ConstructorHeadersInitUnionType headersInit){}
public Headers(Headers headersInit){}
public Headers(JsArray<JsArray<String>> headersInit){}
public Headers(JsPropertyMap<String> headersInit){}
public Headers(String[][] headersInit){}
public native void append(String name,String value);
public native void delete(String name);
public native JsIteratorIterable<JsArray<String>> entries();
public native String get(String name);
public native JsArray<String> getAll(String name);
public native boolean has(String name);
public native JsIteratorIterable<String> keys();
public native void set(String name,String value);
public native JsIterator<String, Object, Object> values();
}
