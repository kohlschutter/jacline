package elemental2.dom;
import elemental2.dom.StorageEstimate;
import java.lang.Boolean;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class StorageManager{
public native Promise<StorageEstimate> estimate();
public native Promise<Boolean> persist();
public native Promise<Boolean> persisted();
}
