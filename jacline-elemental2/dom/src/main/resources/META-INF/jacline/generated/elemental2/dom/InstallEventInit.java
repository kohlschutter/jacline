package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.ServiceWorker;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface InstallEventInit{
@JsOverlay
static InstallEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
ServiceWorker getActiveWorker();
@JsProperty
boolean isBubbles();
@JsProperty
boolean isCancelable();
@JsProperty
void setActiveWorker(ServiceWorker activeWorker);
@JsProperty
void setBubbles(boolean bubbles);
@JsProperty
void setCancelable(boolean cancelable);
}
