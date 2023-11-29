package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.GeolocationCoordinates;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface GeolocationPosition{
@JsOverlay
static GeolocationPosition create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
GeolocationCoordinates getCoords();
@JsProperty
double getTimestamp();
@JsProperty
void setCoords(GeolocationCoordinates coords);
@JsProperty
void setTimestamp(double timestamp);
}
