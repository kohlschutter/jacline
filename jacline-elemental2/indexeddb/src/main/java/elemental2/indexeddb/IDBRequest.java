package elemental2.indexeddb;
import java.lang.Deprecated;
import elemental2.dom.DOMError;
import elemental2.indexeddb.IDBCursor;
import elemental2.dom.Event;
import elemental2.indexeddb.IDBTransaction;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import elemental2.indexeddb.IDBObjectStore;
import elemental2.indexeddb.IDBIndex;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.DOMException;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IDBRequest<T> implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ErrorUnionType{
@JsOverlay
static IDBRequest.ErrorUnionType of(Object o){
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
public interface OnerrorFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnsuccessFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SourceUnionType{
@JsOverlay
static IDBRequest.SourceUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default IDBCursor asIDBCursor(){
return Js.cast(this);
}
@JsOverlay
default IDBIndex asIDBIndex(){
return Js.cast(this);
}
@JsOverlay
default IDBObjectStore asIDBObjectStore(){
return Js.cast(this);
}
@JsOverlay
default boolean isIDBCursor(){
return (Object)this instanceof IDBCursor;
}
@JsOverlay
default boolean isIDBIndex(){
return (Object)this instanceof IDBIndex;
}
@JsOverlay
default boolean isIDBObjectStore(){
return (Object)this instanceof IDBObjectStore;
}
}
public IDBRequest.ErrorUnionType error;
@Deprecated
public double errorCode;
public IDBRequest.OnerrorFn onerror;
public IDBRequest.OnsuccessFn onsuccess;
public String readyState;
public T result;
public IDBRequest.SourceUnionType source;
public IDBTransaction transaction;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
