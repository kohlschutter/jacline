package elemental2.webstorage;
import jsinterop.annotations.JsProperty;
import elemental2.webstorage.Storage;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WindowLocalStorage{
@JsProperty
Storage getLocalStorage();
@JsProperty
void setLocalStorage(Storage localStorage);
}
