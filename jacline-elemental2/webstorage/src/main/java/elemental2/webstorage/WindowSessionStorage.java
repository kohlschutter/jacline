package elemental2.webstorage;
import jsinterop.annotations.JsProperty;
import elemental2.webstorage.Storage;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WindowSessionStorage{
@JsProperty
Storage getSessionStorage();
@JsProperty
void setSessionStorage(Storage sessionStorage);
}
