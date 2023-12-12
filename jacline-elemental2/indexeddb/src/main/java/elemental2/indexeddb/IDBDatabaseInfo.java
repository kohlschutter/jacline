package elemental2.indexeddb;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface IDBDatabaseInfo{
@JsOverlay
static IDBDatabaseInfo create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getName();
@JsProperty
double getVersion();
@JsProperty
void setName(String name);
@JsProperty
void setVersion(double version);
}
