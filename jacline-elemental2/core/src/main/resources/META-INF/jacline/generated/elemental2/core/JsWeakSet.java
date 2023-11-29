package elemental2.core;
import jsinterop.base.Js;
import elemental2.core.JsIterable;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,name = "WeakSet",namespace = JsPackage.GLOBAL)
public class JsWeakSet<VALUE>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorIterableUnionType<VALUE>{
@JsOverlay
static JsWeakSet.ConstructorIterableUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<VALUE> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsIterable<VALUE> asJsIterable(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
public JsWeakSet(){}
public JsWeakSet(JsWeakSet.ConstructorIterableUnionType<VALUE> iterable){}
public JsWeakSet(JsArray<VALUE> iterable){}
public JsWeakSet(JsIterable<VALUE> iterable){}
public JsWeakSet(VALUE[] iterable){}
public native JsWeakSet<VALUE> add(VALUE value);
public native void clear();
public native boolean delete(VALUE value);
public native boolean has(VALUE value);
}
