package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface SubmitEventInit extends EventInit{
@JsOverlay
static SubmitEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
HTMLElement getSubmitter();
@JsProperty
void setSubmitter(HTMLElement submitter);
}
