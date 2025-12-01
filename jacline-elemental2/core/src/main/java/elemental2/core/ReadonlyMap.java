package elemental2.core;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadonlyMap<K extends @Nullable Object, V extends @Nullable Object> extends JsIterable<JsArray<ReadonlyMap.JsIterableTypeParameterArrayUnionType<K, V>>, @Nullable Object, @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EntriesJsIteratorIterableTypeParameterArrayUnionType<K extends @Nullable Object, V extends @Nullable Object>{
@JsOverlay
static <K extends @Nullable Object, V extends @Nullable Object> ReadonlyMap.EntriesJsIteratorIterableTypeParameterArrayUnionType<K, V> of(Object o){
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
@JsFunction
public interface ForEachCallbackFn<K extends @Nullable Object, V extends @Nullable Object>{
@Nullable Object onInvoke(V p0,K p1);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface JsIterableTypeParameterArrayUnionType<K extends @Nullable Object, V extends @Nullable Object>{
@JsOverlay
static <K extends @Nullable Object, V extends @Nullable Object> ReadonlyMap.JsIterableTypeParameterArrayUnionType<K, V> of(Object o){
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
JsIteratorIterable<JsArray<ReadonlyMap.EntriesJsIteratorIterableTypeParameterArrayUnionType<K, V>>, @Nullable Object, @Nullable Object> entries();
<THIS extends @Nullable Object> void forEach(ReadonlyMap.ForEachCallbackFn<? super K, ? super V> callback,THIS thisArg);
void forEach(ReadonlyMap.ForEachCallbackFn<? super K, ? super V> callback);
V get(K key);
@JsProperty
double getSize();
boolean has(K key);
JsIteratorIterable<K, @Nullable Object, @Nullable Object> keys();
JsIteratorIterable<V, @Nullable Object, @Nullable Object> values();
}
