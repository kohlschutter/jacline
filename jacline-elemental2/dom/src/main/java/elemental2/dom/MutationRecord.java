package elemental2.dom;
import elemental2.dom.Node;
import elemental2.dom.NodeList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MutationRecord{
public NodeList<Node> addedNodes;
public String attributeName;
public String attributeNamespace;
public Node nextSibling;
public String oldValue;
public Node previousSibling;
public NodeList<Node> removedNodes;
public Node target;
public String type;
}
