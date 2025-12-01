package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import elemental2.core.JsIterable;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,name = "WeakSet",namespace = JsPackage.GLOBAL)
public class JsWeakSet<VALUE extends @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorIterableUnionType<VALUE extends @Nullable Object>{
@JsOverlay
static <VALUE extends @Nullable Object> JsWeakSet.@Nullable ConstructorIterableUnionType<VALUE> of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<VALUE> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable JsIterable<VALUE, @Nullable Object, @Nullable Object> asJsIterable(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
public JsWeakSet(){}
public JsWeakSet(JsWeakSet.@Nullable ConstructorIterableUnionType<VALUE> iterable){}
public JsWeakSet(JsArray<VALUE> iterable){}
public JsWeakSet(JsIterable<VALUE, @Nullable Object, @Nullable Object> iterable){}
public JsWeakSet(VALUE[] iterable){}
public native JsWeakSet<VALUE> add(VALUE value);
public native void clear();
public native boolean delete(VALUE value);
public native boolean has(VALUE value);
}
