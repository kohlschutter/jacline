package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CustomStateSet{
@JsFunction
public interface ForEachCallbackFn{
@Nullable Object onInvoke(String p0,String p1,@Nullable CustomStateSet p2);
}
public double size;
public native void add(String value);
public native void clear();
public native boolean delete(String value);
public native JsIteratorIterable<JsArray<String>, @Nullable Object, @Nullable Object> entries();
public native @Nullable Object forEach(CustomStateSet.ForEachCallbackFn callback,CustomStateSet thisArg);
public native @Nullable Object forEach(CustomStateSet.ForEachCallbackFn callback);
public native boolean has(String value);
public native JsIteratorIterable<String, @Nullable Object, @Nullable Object> keys();
public native JsIteratorIterable<String, @Nullable Object, @Nullable Object> values();
}
