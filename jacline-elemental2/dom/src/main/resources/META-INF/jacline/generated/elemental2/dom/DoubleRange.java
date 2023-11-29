package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface DoubleRange{
@JsOverlay
static DoubleRange create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getMax();
@JsProperty
double getMin();
@JsProperty
void setMax(double max);
@JsProperty
void setMin(double min);
}
