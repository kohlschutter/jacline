package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.JsArrayLike;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSRule;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSRuleList implements JsArrayLike<CSSRule>{
public int length;
public native @Nullable CSSRule item(int index);
}
