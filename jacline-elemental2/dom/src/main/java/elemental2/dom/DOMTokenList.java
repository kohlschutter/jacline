package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsMethod;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsIteratorIterable;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMTokenList implements JsArrayLike<String>{
public int length;
public String value;
public native void add(String... var_args);
public native boolean contains(String token);
public native String item(int index);
public native void remove(String... var_args);
public native void replace(String token,String newToken);
public native boolean supports(String token);
@JsMethod(name = "toString")
public native String toString_();
public native boolean toggle(String token,boolean force);
public native boolean toggle(String token);
public native JsIteratorIterable<String, @Nullable Object, @Nullable Object> values();
}
