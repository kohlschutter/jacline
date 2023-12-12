package elemental2.indexeddb;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface IDBVersionChangeEventInit extends EventInit{
@JsOverlay
static IDBVersionChangeEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getNewVersion();
@JsProperty
double getOldVersion();
@JsProperty
void setNewVersion(double newVersion);
@JsProperty
void setOldVersion(double oldVersion);
}
