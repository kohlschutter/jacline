package elemental2.dom;
import elemental2.dom.Event;
import elemental2.dom.DeviceOrientationEventInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class DeviceOrientationEvent extends Event{
public boolean absolute;
public double alpha;
public double beta;
public double gamma;
public double webkitCompassAccuracy;
public double webkitCompassHeading;
public DeviceOrientationEvent(String type,DeviceOrientationEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public DeviceOrientationEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
