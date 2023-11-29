package elemental2.dom;
import jsinterop.annotations.JsProperty;
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
public String href;
public String hreflang;
@JsProperty(name = "import")
public Document import_;
public String media;
public String rel;
public DOMTokenList resources;
public String rev;
public StyleSheet sheet;
public String target;
public String type;
@JsProperty
public native StyleSheet getSheet();
@JsProperty
public native void setSheet(StyleSheet sheet);
}
