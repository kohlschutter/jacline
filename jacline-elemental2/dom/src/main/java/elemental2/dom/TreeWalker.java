package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.NodeFilter;
import elemental2.dom.Node;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TreeWalker{
Node firstChild();
@JsProperty
Node getCurrentNode();
@JsProperty
NodeFilter getFilter();
@JsProperty
Node getRoot();
@JsProperty
double getWhatToShow();
@JsProperty
boolean isExpandEntityReference();
Node lastChild();
Node nextNode();
Node nextSibling();
Node parentNode();
Node previousNode();
Node previousSibling();
@JsProperty
void setCurrentNode(Node currentNode);
@JsProperty
void setExpandEntityReference(boolean expandEntityReference);
@JsProperty
void setFilter(NodeFilter filter);
@JsProperty
void setRoot(Node root);
@JsProperty
void setWhatToShow(double whatToShow);
}
