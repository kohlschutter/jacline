package elemental2.dom;
import elemental2.dom.Gamepad;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
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
@Nullable Gamepad getGamepad();
}
