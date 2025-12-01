package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import elemental2.dom.NodeFilter;
import elemental2.dom.Node;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TreeWalker{
@Nullable Node firstChild();
@JsProperty
@Nullable Node getCurrentNode();
@JsProperty
@Nullable NodeFilter getFilter();
@JsProperty
@Nullable Node getRoot();
@JsProperty
double getWhatToShow();
@JsProperty
boolean isExpandEntityReference();
@Nullable Node lastChild();
@Nullable Node nextNode();
@Nullable Node nextSibling();
@Nullable Node parentNode();
@Nullable Node previousNode();
@Nullable Node previousSibling();
@JsProperty
void setCurrentNode(@Nullable Node currentNode);
@JsProperty
void setExpandEntityReference(boolean expandEntityReference);
@JsProperty
void setFilter(@Nullable NodeFilter filter);
@JsProperty
void setRoot(@Nullable Node root);
@JsProperty
void setWhatToShow(double whatToShow);
}
