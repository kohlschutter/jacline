package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import elemental2.core.JsIterable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
import elemental2.core.JsArray;
@JsType(isNative = true,name = "Set",namespace = JsPackage.GLOBAL)
public class JsSet<VALUE extends @Nullable Object> implements JsIterable<VALUE, @Nullable Object, @Nullable Object>{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorIterableUnionType<VALUE extends @Nullable Object>{
@JsOverlay
static <VALUE extends @Nullable Object> JsSet.@Nullable ConstructorIterableUnionType<VALUE> of(@Nullable Object o){
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
@JsFunction
public interface ForEachCallbackFn<VALUE extends @Nullable Object>{
@Nullable Object onInvoke(VALUE p0,VALUE p1,JsSet<? extends VALUE> p2);
}
public int size;
public JsSet(){}
public JsSet(JsSet.@Nullable ConstructorIterableUnionType<VALUE> iterable){}
public JsSet(JsArray<VALUE> iterable){}
public JsSet(JsIterable<VALUE, @Nullable Object, @Nullable Object> iterable){}
public JsSet(VALUE[] iterable){}
public native JsSet<VALUE> add(VALUE value);
public native void clear();
public native boolean delete(VALUE value);
public native JsIteratorIterable<JsArray<VALUE>, @Nullable Object, @Nullable Object> entries();
public native <THIS extends @Nullable Object> @Nullable Object forEach(JsSet.ForEachCallbackFn<? super VALUE> callback,THIS thisArg);
public native @Nullable Object forEach(JsSet.ForEachCallbackFn<? super VALUE> callback);
public native boolean has(VALUE value);
public native JsIteratorIterable<VALUE, @Nullable Object, @Nullable Object> keys();
public native JsIteratorIterable<VALUE, @Nullable Object, @Nullable Object> values();
}
