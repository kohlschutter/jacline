package elemental2.core;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,name = "IIterableResult",namespace = JsPackage.GLOBAL)
public interface JsIIterableResult<TYield extends @Nullable Object>{
@JsOverlay
static <TYield extends @Nullable Object> JsIIterableResult<TYield> create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
TYield getValue();
@JsProperty
boolean isDone();
@JsProperty
void setDone(boolean done);
@JsProperty
void setValue(TYield value);
}
