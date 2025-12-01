package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.PositionCallback;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.GeolocationPositionOptions;
import elemental2.dom.PositionErrorCallback;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Geolocation{
public native void clearWatch(int watchId);
public native void getCurrentPosition(PositionCallback successCallback,PositionErrorCallback errorCallback,@Nullable GeolocationPositionOptions options);
public native void getCurrentPosition(PositionCallback successCallback,PositionErrorCallback errorCallback);
public native void getCurrentPosition(PositionCallback successCallback);
public native int watchPosition(PositionCallback successCallback,PositionErrorCallback errorCallback,@Nullable GeolocationPositionOptions options);
public native int watchPosition(PositionCallback successCallback,PositionErrorCallback errorCallback);
public native int watchPosition(PositionCallback successCallback);
}
