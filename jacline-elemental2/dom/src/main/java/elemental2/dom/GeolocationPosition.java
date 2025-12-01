package elemental2.dom;
import jsinterop.annotations.JsProperty;
import org.jspecify.annotations.Nullable;
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
@Nullable GeolocationCoordinates getCoords();
@JsProperty
double getTimestamp();
@JsProperty
void setCoords(@Nullable GeolocationCoordinates coords);
@JsProperty
void setTimestamp(double timestamp);
}
