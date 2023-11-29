package elemental2.dom;
import elemental2.dom.EventListenerOptions;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.AbortSignal;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AddEventListenerOptions extends EventListenerOptions{
@JsOverlay
static AddEventListenerOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
AbortSignal getSignal();
@JsProperty
boolean isOnce();
@JsProperty
boolean isPassive();
@JsProperty
void setOnce(boolean once);
@JsProperty
void setPassive(boolean passive);
@JsProperty
void setSignal(AbortSignal signal);
}
