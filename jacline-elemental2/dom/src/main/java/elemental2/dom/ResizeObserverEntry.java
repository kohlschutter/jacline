package elemental2.dom;
import elemental2.dom.Element;
import jsinterop.annotations.JsProperty;
import elemental2.dom.ResizeObserverSize;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
import elemental2.dom.DOMRectReadOnly;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ResizeObserverEntry{
@JsProperty
JsArray<ResizeObserverSize> getBorderBoxSize();
@JsProperty
JsArray<ResizeObserverSize> getContentBoxSize();
@JsProperty
DOMRectReadOnly getContentRect();
@JsProperty
Element getTarget();
}
