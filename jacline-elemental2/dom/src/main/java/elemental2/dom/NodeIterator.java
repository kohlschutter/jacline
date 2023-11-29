package elemental2.dom;
import elemental2.dom.Node;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface NodeIterator{
void detach();
Node nextNode();
Node previousNode();
}
