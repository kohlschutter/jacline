package elemental2.dom;
import elemental2.dom.HTMLElement;
import elemental2.dom.Node;
import elemental2.dom.NodeList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLContentElement extends HTMLElement{
public String select;
public native NodeList<Node> getDistributedNodes();
}
