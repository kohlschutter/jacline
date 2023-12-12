package elemental2.indexeddb;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface IDBIndexParameters{
@JsOverlay
static IDBIndexParameters create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
boolean isMultiEntry();
@JsProperty
boolean isUnique();
@JsProperty
void setMultiEntry(boolean multiEntry);
@JsProperty
void setUnique(boolean unique);
}
