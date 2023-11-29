package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.DoubleRange;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ConstrainDoubleRange extends DoubleRange{
@JsOverlay
static ConstrainDoubleRange create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getExact();
@JsProperty
double getIdeal();
@JsProperty
void setExact(double exact);
@JsProperty
void setIdeal(double ideal);
}
