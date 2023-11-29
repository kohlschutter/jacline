package elemental2.dom;
import elemental2.dom.HTMLElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLMetaElement extends HTMLElement{
public String content;
public String httpEquiv;
public String name;
public String scheme;
}
