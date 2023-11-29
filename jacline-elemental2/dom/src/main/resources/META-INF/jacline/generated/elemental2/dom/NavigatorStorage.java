package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.StorageManager;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface NavigatorStorage{
@JsProperty
StorageManager getStorage();
@JsProperty
void setStorage(StorageManager storage);
}
