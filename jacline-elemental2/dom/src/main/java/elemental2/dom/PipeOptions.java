package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PipeOptions{
@JsOverlay
static PipeOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isPreventAbort();
@JsProperty
boolean isPreventCancel();
@JsProperty
boolean isPreventClose();
@JsProperty
void setPreventAbort(boolean preventAbort);
@JsProperty
void setPreventCancel(boolean preventCancel);
@JsProperty
void setPreventClose(boolean preventClose);
}
