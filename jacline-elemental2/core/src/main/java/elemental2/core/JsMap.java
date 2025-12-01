package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.ReadonlyMap;
import elemental2.core.JsIterable;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,name = "Map",namespace = JsPackage.GLOBAL)
public class JsMap<K extends @Nullable Object, V extends @Nullable Object> implements ReadonlyMap<K, V>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorIterableJsIterableTypeParameterArrayUnionType<K extends @Nullable Object, V extends @Nullable Object>{
@JsOverlay
static <K extends @Nullable Object, V extends @Nullable Object> JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<K, V> of(Object o){
return Js.cast(o);
}
@JsOverlay
default K asK(){
return Js.cast(this);
}
@JsOverlay
default V asV(){
return Js.cast(this);
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorIterableUnionType<K extends @Nullable Object, V extends @Nullable Object>{
@JsOverlay
static <K extends @Nullable Object, V extends @Nullable Object> JsMap.@Nullable ConstructorIterableUnionType<K, V> of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<JsArray<JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<K, V>>> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable JsIterable<JsArray<JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<K, V>>, @Nullable Object, @Nullable Object> asJsIterable(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
public int size;
public JsMap(){}
public JsMap(JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<K, V>[][] iterable){}
public JsMap(JsMap.@Nullable ConstructorIterableUnionType<K, V> iterable){}
public JsMap(JsArray<JsArray<JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<K, V>>> iterable){}
public JsMap(JsIterable<JsArray<JsMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<K, V>>, @Nullable Object, @Nullable Object> iterable){}
public native void clear();
public native boolean delete(K key);
public native JsIteratorIterable<JsArray<ReadonlyMap.EntriesJsIteratorIterableTypeParameterArrayUnionType<K, V>>, @Nullable Object, @Nullable Object> entries();
public native <THIS extends @Nullable Object> void forEach(ReadonlyMap.ForEachCallbackFn<? super K, ? super V> callback,THIS thisArg);
public native void forEach(ReadonlyMap.ForEachCallbackFn<? super K, ? super V> callback);
public native V get(K key);
@JsProperty
public native double getSize();
public native boolean has(K key);
public native JsIteratorIterable<K, @Nullable Object, @Nullable Object> keys();
public native JsMap<K, V> set(K key,V value);
public native JsIteratorIterable<V, @Nullable Object, @Nullable Object> values();
}
