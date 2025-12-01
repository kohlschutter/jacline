package elemental2.dom;
import elemental2.dom.Gamepad;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import java.lang.String;
import elemental2.dom.GamepadEventInit;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class GamepadEvent extends Event{
public @Nullable Gamepad gamepad;
public GamepadEvent(String type,@Nullable GamepadEventInit gamepadEventInit){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public GamepadEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
