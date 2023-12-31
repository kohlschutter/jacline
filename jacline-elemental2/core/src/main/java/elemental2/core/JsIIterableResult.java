package elemental2.core;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "IIterableResult",namespace = JsPackage.GLOBAL)
public interface JsIIterableResult<VALUE>{
@JsOverlay
static JsIIterableResult create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
VALUE getValue();
@JsProperty
boolean isDone();
@JsProperty
void setDone(boolean done);
@JsProperty
void setValue(VALUE value);
}
