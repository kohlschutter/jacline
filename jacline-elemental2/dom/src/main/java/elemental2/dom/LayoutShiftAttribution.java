package elemental2.dom;
import elemental2.dom.Node;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DOMRectReadOnly;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class LayoutShiftAttribution{
public DOMRectReadOnly currentRect;
public Node node;
public DOMRectReadOnly previousRect;
}
