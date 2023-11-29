package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.CSSStyleSheet;
import elemental2.dom.MediaList;
import elemental2.dom.CSSRule;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CSSImportRule extends CSSRule{
public String href;
public MediaList media;
public CSSStyleSheet styleSheet;
}
