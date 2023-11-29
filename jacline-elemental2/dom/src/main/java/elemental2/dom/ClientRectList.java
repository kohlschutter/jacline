package elemental2.dom;
import jsinterop.base.JsArrayLike;
import elemental2.dom.DOMRect;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ClientRectList implements JsArrayLike<DOMRect>{
public int length;
public native DOMRect item(int index);
}
