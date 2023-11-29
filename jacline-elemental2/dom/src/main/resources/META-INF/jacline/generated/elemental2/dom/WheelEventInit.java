package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MouseEventInit;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WheelEventInit extends MouseEventInit{
@JsOverlay
static WheelEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getDeltaMode();
@JsProperty
double getDeltaX();
@JsProperty
double getDeltaY();
@JsProperty
double getDeltaZ();
@JsProperty
void setDeltaMode(int deltaMode);
@JsProperty
void setDeltaX(double deltaX);
@JsProperty
void setDeltaY(double deltaY);
@JsProperty
void setDeltaZ(double deltaZ);
}
