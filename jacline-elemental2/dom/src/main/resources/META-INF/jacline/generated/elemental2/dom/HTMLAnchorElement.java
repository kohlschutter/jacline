package elemental2.dom;
import elemental2.dom.DOMTokenList;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLAnchorElement extends HTMLElement{
public String accessKey;
public String attributionSrc;
public String charset;
public String coords;
public String download;
public String hash;
public String host;
public String hostname;
public String href;
public String hreflang;
public String name;
public String pathname;
public String ping;
public String port;
public String protocol;
public String rel;
public DOMTokenList relList;
public String rev;
public String search;
public String shape;
public int tabIndex;
public String target;
public String type;
public native void blur();
public native void focus();
}
