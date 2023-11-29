package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RegistrationOptions{
@JsOverlay
static RegistrationOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getScope();
@JsProperty
String getUpdateViaCache();
@JsProperty
boolean isUseCache();
@JsProperty
void setScope(String scope);
@JsProperty
void setUpdateViaCache(String updateViaCache);
@JsProperty
void setUseCache(boolean useCache);
}
