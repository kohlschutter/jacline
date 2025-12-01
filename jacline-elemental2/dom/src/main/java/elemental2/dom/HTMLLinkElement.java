package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMTokenList;
import elemental2.dom.HTMLElement;
import elemental2.dom.StyleSheet;
import java.lang.String;
import elemental2.dom.LinkStyle;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Document;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLLinkElement extends HTMLElement implements LinkStyle{
public String as;
public String charset;
public String crossOrigin;
public boolean disabled;
public String fetchPriority;
public String href;
public String hreflang;
@JsProperty(name = "import")
public @Nullable Document import_;
public String media;
public String rel;
public DOMTokenList resources;
public String rev;
public @Nullable StyleSheet sheet;
public String target;
public String type;
@JsProperty
public native @Nullable StyleSheet getSheet();
@JsProperty
public native void setSheet(@Nullable StyleSheet sheet);
}
