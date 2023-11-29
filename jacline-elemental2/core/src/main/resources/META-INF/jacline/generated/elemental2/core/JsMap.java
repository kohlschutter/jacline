package elemental2.core;
import jsinterop.annotations.JsProperty;
import elemental2.core.ReadonlyMap;
import jsinterop.base.Js;
import elemental2.core.JsIterable;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
import elemental2.core.JsArray;
@JsType(isNative = true,name = "Map",namespace = JsPackage.GLOBAL)
public class JsMap<KEY, VALUE> implements ReadonlyMap<KEY, VALUE>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>{
@JsOverlay
static JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default KEY asKEY(){
return Js.cast(this);
}
@JsOverlay
default VALUE asVALUE(){
return Js.cast(this);
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorIterableUnionType<KEY, VALUE>{
@JsOverlay
static JsMap.ConstructorIterableUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<JsArray<JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>>> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsIterable<JsArray<JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>>> asJsIterable(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
public int size;
public JsMap(){}
public JsMap(JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>[][] iterable){}
public JsMap(JsMap.ConstructorIterableUnionType<KEY, VALUE> iterable){}
public JsMap(JsArray<JsArray<JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>>> iterable){}
public JsMap(JsIterable<JsArray<JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>>> iterable){}
public native void clear();
public native boolean delete(KEY key);
public native JsIteratorIterable<JsArray<ReadonlyMap.EntriesJsIteratorIterableTypeParameterArrayUnionType<KEY, VALUE>>> entries();
public native <THIS>void forEach(ReadonlyMap.ForEachCallbackFn<? super KEY, ? super VALUE> callback,THIS thisArg);
public native void forEach(ReadonlyMap.ForEachCallbackFn<? super KEY, ? super VALUE> callback);
public native VALUE get(KEY key);
@JsProperty
public native double getSize();
public native boolean has(KEY key);
public native JsIteratorIterable<KEY> keys();
public native JsMap<KEY, VALUE> set(KEY key,VALUE value);
public native JsIteratorIterable<VALUE> values();
}
