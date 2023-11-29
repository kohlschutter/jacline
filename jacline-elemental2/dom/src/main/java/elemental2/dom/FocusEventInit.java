package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import jsinterop.base.JsPropertyMap;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface FocusEventInit extends UIEventInit{
@JsOverlay
static FocusEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
EventTarget getRelatedTarget();
@JsProperty
void setRelatedTarget(EventTarget relatedTarget);
}
