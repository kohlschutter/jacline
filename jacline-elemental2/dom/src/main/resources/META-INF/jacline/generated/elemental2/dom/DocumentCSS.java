package elemental2.dom;
import elemental2.dom.Element;
import elemental2.dom.CSSStyleDeclaration;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DocumentCSS{
public native CSSStyleDeclaration getOverrideStyle(Element elt,String pseudoElt);
}
