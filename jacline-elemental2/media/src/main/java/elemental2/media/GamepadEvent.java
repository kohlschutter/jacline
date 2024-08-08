package elemental2.media;
import elemental2.dom.Event;
import elemental2.media.Gamepad;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.media.GamepadEventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class GamepadEvent extends Event{
public Gamepad gamepad;
public GamepadEvent(String type,GamepadEventInit gamepadEventInit){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public GamepadEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
