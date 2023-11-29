package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ReadableStreamIteratorOptions{
@JsOverlay
static ReadableStreamIteratorOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isPreventCancel();
@JsProperty
void setPreventCancel(boolean preventCancel);
}
