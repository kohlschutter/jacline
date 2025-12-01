package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import elemental2.dom.Event;
import elemental2.dom.DeviceAcceleration;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.dom.DeviceRotationRate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DeviceMotionEvent extends Event{
public @Nullable DeviceAcceleration acceleration;
public @Nullable DeviceAcceleration accelerationIncludingGravity;
public @Nullable Double interval;
public @Nullable DeviceRotationRate rotationRate;
public DeviceMotionEvent(){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
