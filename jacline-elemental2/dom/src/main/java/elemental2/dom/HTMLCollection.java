package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.core.JsIterable;
import jsinterop.base.JsArrayLike;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLCollection<T extends @Nullable Object> implements JsIterable<T, @Nullable Object, @Nullable Object>, JsArrayLike<T>, JsPropertyMap<T>{
public int length;
public native @Nullable T item(int index);
public native @Nullable T namedItem(String name);
}
