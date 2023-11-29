package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.core.Transferable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface StructuredSerializeOptions{
@JsOverlay
static StructuredSerializeOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<Transferable> getTransfer();
@JsProperty
void setTransfer(JsArray<Transferable> transfer);
@JsOverlay
default void setTransfer(Transferable[] transfer){
setTransfer(Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
}
