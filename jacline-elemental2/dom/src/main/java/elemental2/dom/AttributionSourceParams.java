package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface AttributionSourceParams{
@JsOverlay
static AttributionSourceParams create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getAttributionDestination();
@JsProperty
double getAttributionExpiry();
@JsProperty
String getAttributionReportTo();
@JsProperty
String getAttributionSourceEventId();
@JsProperty
void setAttributionDestination(String attributionDestination);
@JsProperty
void setAttributionExpiry(double attributionExpiry);
@JsProperty
void setAttributionReportTo(String attributionReportTo);
@JsProperty
void setAttributionSourceEventId(String attributionSourceEventId);
}
