package elemental2.dom;
import elemental2.dom.HTMLElement;
import elemental2.dom.Node;
import elemental2.dom.NodeList;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLShadowElement extends HTMLElement{
public native NodeList<Node> getDistributedNodes();
}
