package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface FullscreenOptions{
@JsOverlay
static FullscreenOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getNavigationUI();
@JsProperty
void setNavigationUI(String navigationUI);
}
