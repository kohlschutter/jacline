package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface CloseEventInit extends EventInit{
@JsOverlay
static CloseEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getCode();
@JsProperty
String getReason();
@JsProperty
boolean isWasClean();
@JsProperty
void setCode(int code);
@JsProperty
void setReason(String reason);
@JsProperty
void setWasClean(boolean wasClean);
}
