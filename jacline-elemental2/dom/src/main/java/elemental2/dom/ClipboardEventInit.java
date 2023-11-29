package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.dom.DataTransfer;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ClipboardEventInit extends EventInit{
@JsOverlay
static ClipboardEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
DataTransfer getClipboardData();
@JsProperty
void setClipboardData(DataTransfer clipboardData);
}
