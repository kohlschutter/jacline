package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface CompositionEventInit extends UIEventInit{
@JsOverlay
static CompositionEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getData();
@JsProperty
void setData(String data);
}
