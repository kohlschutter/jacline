package elemental2.dom;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import elemental2.dom.CSSStyleDeclaration;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ViewCSS{
@Nullable CSSStyleDeclaration getComputedStyle(@Nullable Element elt,@Nullable String pseudoElt);
@Nullable CSSStyleDeclaration getComputedStyle(@Nullable Element elt);
}
