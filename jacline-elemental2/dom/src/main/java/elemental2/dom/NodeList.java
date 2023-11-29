package elemental2.dom;
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
public class NodeList<T> implements JsIterable<T>, JsArrayLike<T>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EntriesJsIteratorIterableTypeParameterArrayUnionType<T>{
@JsOverlay
static NodeList.EntriesJsIteratorIterableTypeParameterArrayUnionType of(Object o){
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
public interface ForEachCallbackFn<T>{
Object onInvoke(T currentValue,int currentIndex,NodeList<T> listObj);
}
public int length;
public native JsIteratorIterable<JsArray<NodeList.EntriesJsIteratorIterableTypeParameterArrayUnionType<T>>> entries();
public native <S>void forEach(NodeList.ForEachCallbackFn<T> callback,S thisobj);
public native void forEach(NodeList.ForEachCallbackFn<T> callback);
public native T item(int index);
public native JsIteratorIterable<Double> keys();
public native JsIteratorIterable<T> values();
}
