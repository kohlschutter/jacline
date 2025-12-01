package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSStyleSheet;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DOMImplementationCSS{
public native @Nullable CSSStyleSheet createCSSStyleSheet(String title,String media);
}
