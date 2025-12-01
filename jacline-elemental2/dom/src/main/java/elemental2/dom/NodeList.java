package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import java.lang.Double;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class NodeList<T extends @Nullable Object> implements JsIterable<T, @Nullable Object, @Nullable Object>, JsArrayLike<T>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EntriesJsIteratorIterableTypeParameterArrayUnionType<T extends @Nullable Object>{
@JsOverlay
static <T extends @Nullable Object> NodeList.EntriesJsIteratorIterableTypeParameterArrayUnionType<T> of(Object o){
return Js.cast(o);
}
@JsOverlay
default Double asDouble(){
return Js.cast(this);
}
@JsOverlay
default T asT(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
@JsFunction
public interface ForEachCallbackFn<T extends @Nullable Object>{
@Nullable Object onInvoke(T currentValue,int currentIndex,NodeList<T> listObj);
}
public int length;
public native JsIteratorIterable<JsArray<NodeList.EntriesJsIteratorIterableTypeParameterArrayUnionType<T>>, @Nullable Object, @Nullable Object> entries();
public native <S extends @Nullable Object> void forEach(NodeList.@Nullable ForEachCallbackFn<T> callback,S thisobj);
public native void forEach(NodeList.@Nullable ForEachCallbackFn<T> callback);
public native @Nullable T item(int index);
public native JsIteratorIterable<Double, @Nullable Object, @Nullable Object> keys();
public native JsIteratorIterable<T, @Nullable Object, @Nullable Object> values();
}
