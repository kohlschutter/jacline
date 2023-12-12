package elemental2.indexeddb;
import jsinterop.annotations.JsProperty;
import elemental2.indexeddb.IDBFactory;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ServiceWorkerGlobalScope;
@JsType(isNative = true,name = "ServiceWorkerGlobalScope",namespace = JsPackage.GLOBAL)
public interface IndexedDbServiceWorkerGlobalScope extends ServiceWorkerGlobalScope{
@JsOverlay
static IndexedDbServiceWorkerGlobalScope of(ServiceWorkerGlobalScope o){
return Js.cast(o);
}
@JsProperty
IDBFactory getIndexedDB();
@JsProperty
void setIndexedDB(IDBFactory indexedDB);
}
