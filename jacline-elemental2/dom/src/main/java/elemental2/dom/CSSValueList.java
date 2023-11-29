package elemental2.dom;
import elemental2.dom.CSSValue;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSValueList extends CSSValue implements JsArrayLike<CSSValue>{
public int length;
public native CSSValue item(int index);
}
