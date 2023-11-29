package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface DOMPointInit{
@JsOverlay
static DOMPointInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getW();
@JsProperty
double getX();
@JsProperty
double getY();
@JsProperty
double getZ();
@JsProperty
void setW(double w);
@JsProperty
void setX(double x);
@JsProperty
void setY(double y);
@JsProperty
void setZ(double z);
}
