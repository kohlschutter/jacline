package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ExtendableEventInit{
@JsOverlay
static ExtendableEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isBubbles();
@JsProperty
boolean isCancelable();
@JsProperty
void setBubbles(boolean bubbles);
@JsProperty
void setCancelable(boolean cancelable);
}
