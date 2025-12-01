package elemental2.indexeddb;
import org.jspecify.annotations.Nullable;
import elemental2.dom.DOMError;
import elemental2.dom.Event;
import elemental2.dom.DOMStringList;
import elemental2.indexeddb.IDBDatabase;
import jsinterop.base.Js;
import elemental2.indexeddb.IDBObjectStore;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.DOMException;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IDBTransaction{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ErrorUnionType{
@JsOverlay
static IDBTransaction.ErrorUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default DOMError asDOMError(){
return Js.cast(this);
}
@JsOverlay
default DOMException asDOMException(){
return Js.cast(this);
}
@JsOverlay
default boolean isDOMError(){
return (Object)this instanceof DOMError;
}
@JsOverlay
default boolean isDOMException(){
return (Object)this instanceof DOMException;
}
}
@JsFunction
public interface OnabortFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OncompleteFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
@Nullable Object onInvoke(Event p0);
}
public IDBDatabase db;
public IDBTransaction.ErrorUnionType error;
public String mode;
public DOMStringList objectStoreNames;
public IDBTransaction.@Nullable OnabortFn onabort;
public IDBTransaction.@Nullable OncompleteFn oncomplete;
public IDBTransaction.@Nullable OnerrorFn onerror;
public native void abort();
public native void commit();
public native IDBObjectStore objectStore(String name);
}
