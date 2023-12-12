package elemental2.indexeddb;
import elemental2.indexeddb.IDBRequest;
import jsinterop.annotations.JsFunction;
import elemental2.indexeddb.IDBVersionChangeEvent;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IDBOpenDBRequest extends IDBRequest{
@JsFunction
public interface OnblockedFn{
Object onInvoke(IDBVersionChangeEvent p0);
}
@JsFunction
public interface OnupgradeneededFn{
Object onInvoke(IDBVersionChangeEvent p0);
}
public IDBOpenDBRequest.OnblockedFn onblocked;
public IDBOpenDBRequest.OnupgradeneededFn onupgradeneeded;
}
