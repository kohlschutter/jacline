package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface DeviceOrientationEventInit extends EventInit{
@JsOverlay
static DeviceOrientationEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getAlpha();
@JsProperty
double getBeta();
@JsProperty
double getGamma();
@JsProperty
boolean isAbsolute();
@JsProperty
void setAbsolute(boolean absolute);
@JsProperty
void setAlpha(double alpha);
@JsProperty
void setBeta(double beta);
@JsProperty
void setGamma(double gamma);
}
