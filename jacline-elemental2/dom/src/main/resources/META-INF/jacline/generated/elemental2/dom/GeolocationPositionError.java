package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface GeolocationPositionError{
@JsOverlay
static GeolocationPositionError create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getCode();
@JsProperty
String getMessage();
@JsProperty(name = "PERMISSION_DENIED")
double getPERMISSION_DENIED();
@JsProperty(name = "POSITION_UNAVAILABLE")
double getPOSITION_UNAVAILABLE();
@JsProperty(name = "TIMEOUT")
double getTIMEOUT();
@JsProperty(name = "UNKNOWN_ERROR")
double getUNKNOWN_ERROR();
@JsProperty
void setCode(double code);
@JsProperty
void setMessage(String message);
}
