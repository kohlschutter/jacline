package elemental2.core;
import jsinterop.base.Js;
import elemental2.core.JsIterable;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,name = "WeakMap",namespace = JsPackage.GLOBAL)
public class JsWeakMap<KEY, VALUE>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>{
@JsOverlay
static JsWeakMap.ConstructorIterableJsIterableTypeParameterArrayUnionType of(Object o){
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
static JsWeakMap.ConstructorIterableUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<JsArray<JsWeakMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>>> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsIterable<JsArray<JsWeakMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>>> asJsIterable(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
public JsWeakMap(){}
public JsWeakMap(JsWeakMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>[][] iterable){}
public JsWeakMap(JsWeakMap.ConstructorIterableUnionType<KEY, VALUE> iterable){}
public JsWeakMap(JsArray<JsArray<JsWeakMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>>> iterable){}
public JsWeakMap(JsIterable<JsArray<JsWeakMap.ConstructorIterableJsIterableTypeParameterArrayUnionType<KEY, VALUE>>> iterable){}
public native void clear();
public native boolean delete(KEY key);
public native VALUE get(KEY key);
public native boolean has(KEY key);
public native JsWeakMap<KEY, VALUE> set(KEY key,VALUE value);
}
