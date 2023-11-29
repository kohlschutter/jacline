package elemental2.dom;
import jsinterop.base.JsArrayLike;
import elemental2.dom.HTMLCollection;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLFormControlsCollection<T> extends HTMLCollection<T> implements JsArrayLike<T>{
public native T namedItem(String name);
}
