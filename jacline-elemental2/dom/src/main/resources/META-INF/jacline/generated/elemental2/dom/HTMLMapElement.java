package elemental2.dom;
import elemental2.dom.HTMLCollection;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLAreaElement;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLMapElement extends HTMLElement{
public HTMLCollection<HTMLAreaElement> areas;
public String name;
}
