package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.JsArrayLike;
import elemental2.dom.HTMLCollection;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLFormControlsCollection<T extends @Nullable Object> extends HTMLCollection<T> implements JsArrayLike<T>{
public native @Nullable T namedItem(String name);
}
