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
public interface ToggleEventInit extends EventInit{
@JsOverlay
static ToggleEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getNewState();
@JsProperty
String getOldState();
@JsProperty
void setNewState(String newState);
@JsProperty
void setOldState(String oldState);
}
