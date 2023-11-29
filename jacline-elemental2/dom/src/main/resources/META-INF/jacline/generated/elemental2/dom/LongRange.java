package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface LongRange{
@JsOverlay
static LongRange create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getMax();
@JsProperty
int getMin();
@JsProperty
void setMax(int max);
@JsProperty
void setMin(int min);
}
