package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.NavigatorStorage;
import elemental2.dom.StorageManager;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WorkerNavigator implements NavigatorStorage{
public double deviceMemory;
public int hardwareConcurrency;
public StorageManager storage;
@JsProperty
public native StorageManager getStorage();
@JsProperty
public native void setStorage(StorageManager storage);
}
