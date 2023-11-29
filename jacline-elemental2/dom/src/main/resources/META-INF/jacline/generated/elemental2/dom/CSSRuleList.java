package elemental2.dom;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSRule;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSRuleList implements JsArrayLike<CSSRule>{
public int length;
public native CSSRule item(int index);
}
