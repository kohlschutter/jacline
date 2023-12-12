package elemental2.media;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WorkletOptions{
@JsOverlay
static WorkletOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getCredentials();
@JsProperty
void setCredentials(String credentials);
}
