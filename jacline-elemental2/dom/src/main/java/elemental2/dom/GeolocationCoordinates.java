package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import java.lang.Double;
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
@Nullable Double getAltitude();
@JsProperty
@Nullable Double getAltitudeAccuracy();
@JsProperty
@Nullable Double getHeading();
@JsProperty
double getLatitude();
@JsProperty
double getLongitude();
@JsProperty
@Nullable Double getSpeed();
@JsProperty
void setAccuracy(double accuracy);
@JsProperty
void setAltitude(@Nullable Double altitude);
@JsProperty
void setAltitudeAccuracy(@Nullable Double altitudeAccuracy);
@JsProperty
void setHeading(@Nullable Double heading);
@JsProperty
void setLatitude(double latitude);
@JsProperty
void setLongitude(double longitude);
@JsProperty
void setSpeed(@Nullable Double speed);
}
