package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface CustomEventInit<T> extends EventInit{
@JsOverlay
static CustomEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
T getDetail();
@JsProperty
void setDetail(T detail);
}
