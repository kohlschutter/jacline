package elemental2.dom;
import elemental2.dom.HTMLOptionElement;
import elemental2.dom.HTMLCollection;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLDataListElement extends HTMLElement{
public HTMLCollection<HTMLOptionElement> options;
}
