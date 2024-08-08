package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ResizeObserverOptions{
@JsOverlay
static ResizeObserverOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getBox();
@JsProperty
void setBox(String box);
}
