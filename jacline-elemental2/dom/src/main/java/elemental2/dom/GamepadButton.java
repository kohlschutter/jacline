package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface GamepadButton{
@JsProperty
double getValue();
@JsProperty
boolean isPressed();
@JsProperty
void setPressed(boolean pressed);
@JsProperty
void setValue(double value);
}
