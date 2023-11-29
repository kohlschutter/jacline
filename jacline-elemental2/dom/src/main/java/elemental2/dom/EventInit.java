package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface EventInit{
@JsOverlay
static EventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isBubbles();
@JsProperty
boolean isCancelable();
@JsProperty
boolean isComposed();
@JsProperty
void setBubbles(boolean bubbles);
@JsProperty
void setCancelable(boolean cancelable);
@JsProperty
void setComposed(boolean composed);
}
