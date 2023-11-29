package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.FormData;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface FormDataEventInit extends EventInit{
@JsOverlay
static FormDataEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
FormData getFormData();
@JsProperty
void setFormData(FormData formData);
}
