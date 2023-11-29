package elemental2.dom;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLSourceElement extends HTMLElement{
public String media;
public String sizes;
public String src;
public String srcset;
public String type;
}
