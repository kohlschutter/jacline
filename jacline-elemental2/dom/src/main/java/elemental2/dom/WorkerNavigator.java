package elemental2.dom;
import elemental2.dom.NavigatorBadge;
import jsinterop.annotations.JsProperty;
import java.lang.Void;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.dom.NavigatorStorage;
import elemental2.dom.StorageManager;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WorkerNavigator implements NavigatorBadge, NavigatorStorage{
public double deviceMemory;
public int hardwareConcurrency;
public StorageManager storage;
public native Promise<Void> clearAppBadge();
@JsProperty
public native StorageManager getStorage();
public native Promise<Void> setAppBadge();
public native Promise<Void> setAppBadge(double contents);
@JsProperty
public native void setStorage(StorageManager storage);
}
