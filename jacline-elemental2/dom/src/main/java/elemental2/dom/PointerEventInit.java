package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MouseEventInit;
import elemental2.dom.PointerEvent;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PointerEventInit extends MouseEventInit{
@JsOverlay
static PointerEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getAltitudeAngle();
@JsProperty
double getAzimuthAngle();
@JsProperty
JsArray<PointerEvent> getCoalescedEvents();
@JsProperty
double getHeight();
@JsProperty
int getPointerId();
@JsProperty
String getPointerType();
@JsProperty
JsArray<PointerEvent> getPredictedEvents();
@JsProperty
double getPressure();
@JsProperty
double getTangentialPressure();
@JsProperty
int getTiltX();
@JsProperty
int getTiltY();
@JsProperty
double getTwist();
@JsProperty
double getWidth();
@JsProperty
boolean isIsPrimary();
@JsProperty
void setAltitudeAngle(double altitudeAngle);
@JsProperty
void setAzimuthAngle(double azimuthAngle);
@JsProperty
void setCoalescedEvents(JsArray<PointerEvent> coalescedEvents);
@JsOverlay
default void setCoalescedEvents(PointerEvent[] coalescedEvents){
setCoalescedEvents(Js.<JsArray<PointerEvent>>uncheckedCast(coalescedEvents));
}
@JsProperty
void setHeight(double height);
@JsProperty
void setIsPrimary(boolean isPrimary);
@JsProperty
void setPointerId(int pointerId);
@JsProperty
void setPointerType(String pointerType);
@JsProperty
void setPredictedEvents(JsArray<PointerEvent> predictedEvents);
@JsOverlay
default void setPredictedEvents(PointerEvent[] predictedEvents){
setPredictedEvents(Js.<JsArray<PointerEvent>>uncheckedCast(predictedEvents));
}
@JsProperty
void setPressure(double pressure);
@JsProperty
void setTangentialPressure(double tangentialPressure);
@JsProperty
void setTiltX(int tiltX);
@JsProperty
void setTiltY(int tiltY);
@JsProperty
void setTwist(double twist);
@JsProperty
void setWidth(double width);
}
