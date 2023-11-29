package elemental2.dom;
import elemental2.dom.HTMLElement;
import elemental2.dom.AssignedNodesOptions;
import elemental2.dom.Node;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLSlotElement extends HTMLElement{
public native JsArray<HTMLElement> assignedElements();
public native JsArray<HTMLElement> assignedElements(AssignedNodesOptions options);
public native JsArray<Node> assignedNodes();
public native JsArray<Node> assignedNodes(AssignedNodesOptions options);
}
