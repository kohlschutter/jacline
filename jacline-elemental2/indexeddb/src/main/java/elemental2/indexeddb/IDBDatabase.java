package elemental2.indexeddb;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import elemental2.indexeddb.IDBTransaction;
import elemental2.core.JsArray;
import elemental2.dom.DOMStringList;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import elemental2.indexeddb.IDBObjectStore;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import elemental2.indexeddb.IDBTransactionOptions;
import elemental2.indexeddb.IDBObjectStoreParameters;
import elemental2.indexeddb.IDBVersionChangeEvent;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IDBDatabase implements EventTarget{
@JsFunction
public interface OnabortFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OncloseFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnversionchangeFn{
@Nullable Object onInvoke(IDBVersionChangeEvent p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface TransactionStoreNamesUnionType{
@JsOverlay
static IDBDatabase.TransactionStoreNamesUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default DOMStringList asDOMStringList(){
return Js.cast(this);
}
@JsOverlay
default JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isDOMStringList(){
return (Object)this instanceof DOMStringList;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public String name;
public DOMStringList objectStoreNames;
public IDBDatabase.@Nullable OnabortFn onabort;
public IDBDatabase.@Nullable OncloseFn onclose;
public IDBDatabase.@Nullable OnerrorFn onerror;
public IDBDatabase.@Nullable OnversionchangeFn onversionchange;
public double version;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void close();
public native IDBObjectStore createObjectStore(String name,IDBObjectStoreParameters parameters);
public native IDBObjectStore createObjectStore(String name);
public native void deleteObjectStore(String name);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
@JsOverlay
public final IDBTransaction transaction(DOMStringList storeNames,String mode,IDBTransactionOptions options){
return transaction(Js.<IDBDatabase.TransactionStoreNamesUnionType>uncheckedCast(storeNames),mode,options);
}
@JsOverlay
public final IDBTransaction transaction(DOMStringList storeNames,String mode){
return transaction(Js.<IDBDatabase.TransactionStoreNamesUnionType>uncheckedCast(storeNames),mode);
}
@JsOverlay
public final IDBTransaction transaction(DOMStringList storeNames){
return transaction(Js.<IDBDatabase.TransactionStoreNamesUnionType>uncheckedCast(storeNames));
}
@JsOverlay
public final IDBTransaction transaction(JsArray<String> storeNames,String mode,IDBTransactionOptions options){
return transaction(Js.<IDBDatabase.TransactionStoreNamesUnionType>uncheckedCast(storeNames),mode,options);
}
@JsOverlay
public final IDBTransaction transaction(JsArray<String> storeNames,String mode){
return transaction(Js.<IDBDatabase.TransactionStoreNamesUnionType>uncheckedCast(storeNames),mode);
}
@JsOverlay
public final IDBTransaction transaction(JsArray<String> storeNames){
return transaction(Js.<IDBDatabase.TransactionStoreNamesUnionType>uncheckedCast(storeNames));
}
@JsOverlay
public final IDBTransaction transaction(String storeNames,String mode,IDBTransactionOptions options){
return transaction(Js.<IDBDatabase.TransactionStoreNamesUnionType>uncheckedCast(storeNames),mode,options);
}
@JsOverlay
public final IDBTransaction transaction(String[] storeNames,String mode,IDBTransactionOptions options){
return transaction(Js.<JsArray<String>>uncheckedCast(storeNames),mode,options);
}
@JsOverlay
public final IDBTransaction transaction(String storeNames,String mode){
return transaction(Js.<IDBDatabase.TransactionStoreNamesUnionType>uncheckedCast(storeNames),mode);
}
@JsOverlay
public final IDBTransaction transaction(String[] storeNames,String mode){
return transaction(Js.<JsArray<String>>uncheckedCast(storeNames),mode);
}
@JsOverlay
public final IDBTransaction transaction(String storeNames){
return transaction(Js.<IDBDatabase.TransactionStoreNamesUnionType>uncheckedCast(storeNames));
}
@JsOverlay
public final IDBTransaction transaction(String[] storeNames){
return transaction(Js.<JsArray<String>>uncheckedCast(storeNames));
}
public native IDBTransaction transaction(IDBDatabase.TransactionStoreNamesUnionType storeNames,String mode,IDBTransactionOptions options);
public native IDBTransaction transaction(IDBDatabase.TransactionStoreNamesUnionType storeNames,String mode);
public native IDBTransaction transaction(IDBDatabase.TransactionStoreNamesUnionType storeNames);
}
