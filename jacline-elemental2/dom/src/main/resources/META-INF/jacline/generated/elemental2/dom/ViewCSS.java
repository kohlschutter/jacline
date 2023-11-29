package elemental2.dom;
import elemental2.dom.Element;
import elemental2.dom.CSSStyleDeclaration;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ViewCSS{
CSSStyleDeclaration getComputedStyle(Element elt,String pseudoElt);
CSSStyleDeclaration getComputedStyle(Element elt);
}
