package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMImplementation;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMImplementationList implements JsArrayLike<DOMImplementation>{
public int length;
public native @Nullable DOMImplementation item(int index);
}
