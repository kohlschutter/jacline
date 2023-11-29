package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface GeolocationCoordinates{
@JsOverlay
static GeolocationCoordinates create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getAccuracy();
@JsProperty
double getAltitude();
@JsProperty
double getAltitudeAccuracy();
@JsProperty
double getHeading();
@JsProperty
double getLatitude();
@JsProperty
double getLongitude();
@JsProperty
double getSpeed();
@JsProperty
void setAccuracy(double accuracy);
@JsProperty
void setAltitude(double altitude);
@JsProperty
void setAltitudeAccuracy(double altitudeAccuracy);
@JsProperty
void setHeading(double heading);
@JsProperty
void setLatitude(double latitude);
@JsProperty
void setLongitude(double longitude);
@JsProperty
void setSpeed(double speed);
}
