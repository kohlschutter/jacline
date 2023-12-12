package elemental2.webstorage;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.webstorage.Storage;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface StorageEventInit extends EventInit{
@JsOverlay
static StorageEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getKey();
@JsProperty
String getNewValue();
@JsProperty
String getOldValue();
@JsProperty
Storage getStorageArea();
@JsProperty
String getUrl();
@JsProperty
void setKey(String key);
@JsProperty
void setNewValue(String newValue);
@JsProperty
void setOldValue(String oldValue);
@JsProperty
void setStorageArea(Storage storageArea);
@JsProperty
void setUrl(String url);
}
