package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface NavigationPreloadState{
@JsOverlay
static NavigationPreloadState create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getHeaderValue();
@JsProperty
boolean isEnabled();
@JsProperty
void setEnabled(boolean enabled);
@JsProperty
void setHeaderValue(String headerValue);
}
