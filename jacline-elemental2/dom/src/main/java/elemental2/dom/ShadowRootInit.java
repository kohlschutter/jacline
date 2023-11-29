package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ShadowRootInit{
@JsOverlay
static ShadowRootInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getMode();
@JsProperty
String getSlotAssignment();
@JsProperty
boolean isDelegatesFocus();
@JsProperty
void setDelegatesFocus(boolean delegatesFocus);
@JsProperty
void setMode(String mode);
@JsProperty
void setSlotAssignment(String slotAssignment);
}
