package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ConstrainBooleanParameters{
@JsOverlay
static ConstrainBooleanParameters create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isExact();
@JsProperty
boolean isIdeal();
@JsProperty
void setExact(boolean exact);
@JsProperty
void setIdeal(boolean ideal);
}
