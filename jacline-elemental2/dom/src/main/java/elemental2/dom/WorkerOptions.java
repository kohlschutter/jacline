package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WorkerOptions{
@JsOverlay
static WorkerOptions create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getCredentials();
@JsProperty
String getName();
@JsProperty
String getType();
@JsProperty
void setCredentials(String credentials);
@JsProperty
void setName(String name);
@JsProperty
void setType(String type);
}
