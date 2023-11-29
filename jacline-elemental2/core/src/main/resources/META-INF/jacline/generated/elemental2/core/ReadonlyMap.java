package elemental2.core;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.core.JsIterable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadonlyMap<KEY, VALUE> extends JsIterable<JsArray<ReadonlyMap.JsIterableTypeParameterArrayUnionType<KEY, VALUE>>>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EntriesJsIteratorIterableTypeParameterArrayUnionType<KEY, VALUE>{
@JsOverlay
static ReadonlyMap.EntriesJsIteratorIterableTypeParameterArrayUnionType of(Object o){
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
@JsFunction
public interface ForEachCallbackFn<KEY, VALUE>{
Object onInvoke(VALUE p0,KEY p1);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface JsIterableTypeParameterArrayUnionType<KEY, VALUE>{
@JsOverlay
static ReadonlyMap.JsIterableTypeParameterArrayUnionType of(Object o){
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
JsIteratorIterable<JsArray<ReadonlyMap.EntriesJsIteratorIterableTypeParameterArrayUnionType<KEY, VALUE>>> entries();
<THIS>void forEach(ReadonlyMap.ForEachCallbackFn<? super KEY, ? super VALUE> callback,THIS thisArg);
void forEach(ReadonlyMap.ForEachCallbackFn<? super KEY, ? super VALUE> callback);
VALUE get(KEY key);
@JsProperty
double getSize();
boolean has(KEY key);
JsIteratorIterable<KEY> keys();
JsIteratorIterable<VALUE> values();
}
