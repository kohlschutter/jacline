package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import elemental2.dom.Event;
import elemental2.dom.DeviceOrientationEventInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DeviceOrientationEvent extends Event{
public boolean absolute;
public @Nullable Double alpha;
public @Nullable Double beta;
public @Nullable Double gamma;
public @Nullable Double webkitCompassAccuracy;
public @Nullable Double webkitCompassHeading;
public DeviceOrientationEvent(String type,DeviceOrientationEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public DeviceOrientationEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
