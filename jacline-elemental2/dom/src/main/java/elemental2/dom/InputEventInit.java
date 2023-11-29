package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import elemental2.dom.DataTransfer;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface InputEventInit extends UIEventInit{
@JsOverlay
static InputEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getData();
@JsProperty
DataTransfer getDataTransfer();
@JsProperty
String getInputType();
@JsProperty
boolean isIsComposing();
@JsProperty
void setData(String data);
@JsProperty
void setDataTransfer(DataTransfer dataTransfer);
@JsProperty
void setInputType(String inputType);
@JsProperty
void setIsComposing(boolean isComposing);
}
