package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface TouchInitDict{
@JsOverlay
static TouchInitDict create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getAltitudeAngle();
@JsProperty
double getAzimuthAngle();
@JsProperty
double getClientX();
@JsProperty
double getClientY();
@JsProperty
double getForce();
@JsProperty
int getIdentifier();
@JsProperty
double getPageX();
@JsProperty
double getPageY();
@JsProperty
double getRadiusX();
@JsProperty
double getRadiusY();
@JsProperty
double getRotationAngle();
@JsProperty
double getScreenX();
@JsProperty
double getScreenY();
@JsProperty
EventTarget getTarget();
@JsProperty
String getTouchType();
@JsProperty
void setAltitudeAngle(double altitudeAngle);
@JsProperty
void setAzimuthAngle(double azimuthAngle);
@JsProperty
void setClientX(double clientX);
@JsProperty
void setClientY(double clientY);
@JsProperty
void setForce(double force);
@JsProperty
void setIdentifier(int identifier);
@JsProperty
void setPageX(double pageX);
@JsProperty
void setPageY(double pageY);
@JsProperty
void setRadiusX(double radiusX);
@JsProperty
void setRadiusY(double radiusY);
@JsProperty
void setRotationAngle(double rotationAngle);
@JsProperty
void setScreenX(double screenX);
@JsProperty
void setScreenY(double screenY);
@JsProperty
void setTarget(EventTarget target);
@JsProperty
void setTouchType(String touchType);
}
