package elemental2.webassembly;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MemoryDescriptor{
@JsOverlay
static MemoryDescriptor create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getInitial();
@JsProperty
int getMaximum();
@JsProperty
void setInitial(int initial);
@JsProperty
void setMaximum(int maximum);
}
