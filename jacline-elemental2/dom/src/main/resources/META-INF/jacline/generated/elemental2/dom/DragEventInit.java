package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MouseEventInit;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DataTransfer;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface DragEventInit extends MouseEventInit{
@JsOverlay
static DragEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
DataTransfer getDataTransfer();
@JsProperty
void setDataTransfer(DataTransfer dataTransfer);
}
