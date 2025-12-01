package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.CSSStyleDeclaration;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSRule;
import elemental2.dom.StylePropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSStyleRule extends CSSRule{
public String selectorText;
public @Nullable CSSStyleDeclaration style;
public StylePropertyMap styleMap;
}
