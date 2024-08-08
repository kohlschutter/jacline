package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ResizeObserverSize{
@JsOverlay
static ResizeObserverSize create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getBlockSize();
@JsProperty
double getInlineSize();
@JsProperty
void setBlockSize(double blockSize);
@JsProperty
void setInlineSize(double inlineSize);
}
