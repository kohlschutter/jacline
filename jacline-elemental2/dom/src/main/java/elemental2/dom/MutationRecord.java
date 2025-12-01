package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import elemental2.dom.NodeList;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MutationRecord{
public NodeList<Node> addedNodes;
public @Nullable String attributeName;
public @Nullable String attributeNamespace;
public @Nullable Node nextSibling;
public @Nullable String oldValue;
public @Nullable Node previousSibling;
public NodeList<Node> removedNodes;
public @Nullable Node target;
public String type;
}
