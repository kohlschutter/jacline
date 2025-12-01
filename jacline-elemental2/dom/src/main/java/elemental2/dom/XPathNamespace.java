package elemental2.dom;
import elemental2.dom.Element;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class XPathNamespace extends Node{
@JsOverlay
public static final int XPATH_NAMESPACE_NODE=XPathNamespace__Constants.XPATH_NAMESPACE_NODE;
public @Nullable Element ownerElement;
}
