package elemental2.media;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.media.Gamepad;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface GamepadEventInit extends EventInit{
@JsOverlay
static GamepadEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
Gamepad getGamepad();
}
