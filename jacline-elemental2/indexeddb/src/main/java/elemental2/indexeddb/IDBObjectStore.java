package elemental2.indexeddb;
import java.lang.Double;
import elemental2.indexeddb.IDBKeyRange;
import elemental2.indexeddb.IDBTransaction;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import elemental2.dom.DOMStringList;
import elemental2.indexeddb.IDBRequest;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import elemental2.indexeddb.IDBIndex;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.indexeddb.IDBIndexParameters;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsDate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IDBObjectStore{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AddKeyUnionType{
@JsOverlay
static IDBObjectStore.AddKeyUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CountKeyUnionType{
@JsOverlay
static IDBObjectStore.CountKeyUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default IDBKeyRange asIDBKeyRange(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isIDBKeyRange(){
return (Object)this instanceof IDBKeyRange;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CreateIndexKeyPathUnionType{
@JsOverlay
static IDBObjectStore.CreateIndexKeyPathUnionType of(Object o){
return Js.cast(o);
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
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DeleteKeyUnionType{
@JsOverlay
static IDBObjectStore.DeleteKeyUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default IDBKeyRange asIDBKeyRange(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isIDBKeyRange(){
return (Object)this instanceof IDBKeyRange;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetAllKeysQueryUnionType{
@JsOverlay
static IDBObjectStore.GetAllKeysQueryUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default IDBKeyRange asIDBKeyRange(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isIDBKeyRange(){
return (Object)this instanceof IDBKeyRange;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetAllQueryUnionType{
@JsOverlay
static IDBObjectStore.GetAllQueryUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default IDBKeyRange asIDBKeyRange(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isIDBKeyRange(){
return (Object)this instanceof IDBKeyRange;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetKeyQueryUnionType{
@JsOverlay
static IDBObjectStore.GetKeyQueryUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default IDBKeyRange asIDBKeyRange(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isIDBKeyRange(){
return (Object)this instanceof IDBKeyRange;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetKeyUnionType{
@JsOverlay
static IDBObjectStore.GetKeyUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default IDBKeyRange asIDBKeyRange(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isIDBKeyRange(){
return (Object)this instanceof IDBKeyRange;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OpenKeyCursorQueryUnionType{
@JsOverlay
static IDBObjectStore.OpenKeyCursorQueryUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default IDBKeyRange asIDBKeyRange(){
return Js.cast(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isIDBKeyRange(){
return (Object)this instanceof IDBKeyRange;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PutKeyUnionType{
@JsOverlay
static IDBObjectStore.PutKeyUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
public boolean autoIncrement;
public DOMStringList indexNames;
public Object keyPath;
public String name;
public IDBTransaction transaction;
public native IDBRequest add(Object value,IDBObjectStore.AddKeyUnionType key);
@JsOverlay
public final IDBRequest add(Object value,ArrayBuffer key){
return add(value,Js.<IDBObjectStore.AddKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest add(Object value,ArrayBufferView key){
return add(value,Js.<IDBObjectStore.AddKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest add(Object value,JsArray<Object> key){
return add(value,Js.<IDBObjectStore.AddKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest add(Object value,JsDate key){
return add(value,Js.<IDBObjectStore.AddKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest add(Object value,Object[] key){
return add(value,Js.<JsArray<Object>>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest add(Object value,String key){
return add(value,Js.<IDBObjectStore.AddKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest add(Object value,double key){
return add(value,Js.<IDBObjectStore.AddKeyUnionType>uncheckedCast(key));
}
public native IDBRequest add(Object value);
public native IDBRequest clear();
public native IDBRequest count();
@JsOverlay
public final IDBRequest count(ArrayBuffer key){
return count(Js.<IDBObjectStore.CountKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest count(ArrayBufferView key){
return count(Js.<IDBObjectStore.CountKeyUnionType>uncheckedCast(key));
}
public native IDBRequest count(IDBObjectStore.CountKeyUnionType key);
@JsOverlay
public final IDBRequest count(IDBKeyRange key){
return count(Js.<IDBObjectStore.CountKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest count(JsArray<Object> key){
return count(Js.<IDBObjectStore.CountKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest count(JsDate key){
return count(Js.<IDBObjectStore.CountKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest count(Object[] key){
return count(Js.<JsArray<Object>>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest count(String key){
return count(Js.<IDBObjectStore.CountKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest count(double key){
return count(Js.<IDBObjectStore.CountKeyUnionType>uncheckedCast(key));
}
public native IDBIndex createIndex(String name,IDBObjectStore.CreateIndexKeyPathUnionType keyPath,IDBIndexParameters paramters);
public native IDBIndex createIndex(String name,IDBObjectStore.CreateIndexKeyPathUnionType keyPath);
@JsOverlay
public final IDBIndex createIndex(String name,JsArray<String> keyPath,IDBIndexParameters paramters){
return createIndex(name,Js.<IDBObjectStore.CreateIndexKeyPathUnionType>uncheckedCast(keyPath),paramters);
}
@JsOverlay
public final IDBIndex createIndex(String name,JsArray<String> keyPath){
return createIndex(name,Js.<IDBObjectStore.CreateIndexKeyPathUnionType>uncheckedCast(keyPath));
}
@JsOverlay
public final IDBIndex createIndex(String name,String keyPath,IDBIndexParameters paramters){
return createIndex(name,Js.<IDBObjectStore.CreateIndexKeyPathUnionType>uncheckedCast(keyPath),paramters);
}
@JsOverlay
public final IDBIndex createIndex(String name,String[] keyPath,IDBIndexParameters paramters){
return createIndex(name,Js.<JsArray<String>>uncheckedCast(keyPath),paramters);
}
@JsOverlay
public final IDBIndex createIndex(String name,String keyPath){
return createIndex(name,Js.<IDBObjectStore.CreateIndexKeyPathUnionType>uncheckedCast(keyPath));
}
@JsOverlay
public final IDBIndex createIndex(String name,String[] keyPath){
return createIndex(name,Js.<JsArray<String>>uncheckedCast(keyPath));
}
@JsOverlay
public final IDBRequest delete(ArrayBuffer key){
return delete(Js.<IDBObjectStore.DeleteKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest delete(ArrayBufferView key){
return delete(Js.<IDBObjectStore.DeleteKeyUnionType>uncheckedCast(key));
}
public native IDBRequest delete(IDBObjectStore.DeleteKeyUnionType key);
@JsOverlay
public final IDBRequest delete(IDBKeyRange key){
return delete(Js.<IDBObjectStore.DeleteKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest delete(JsArray<Object> key){
return delete(Js.<IDBObjectStore.DeleteKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest delete(JsDate key){
return delete(Js.<IDBObjectStore.DeleteKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest delete(Object[] key){
return delete(Js.<JsArray<Object>>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest delete(String key){
return delete(Js.<IDBObjectStore.DeleteKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest delete(double key){
return delete(Js.<IDBObjectStore.DeleteKeyUnionType>uncheckedCast(key));
}
public native void deleteIndex(String indexName);
@JsOverlay
public final IDBRequest get(ArrayBuffer key){
return get(Js.<IDBObjectStore.GetKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest get(ArrayBufferView key){
return get(Js.<IDBObjectStore.GetKeyUnionType>uncheckedCast(key));
}
public native IDBRequest get(IDBObjectStore.GetKeyUnionType key);
@JsOverlay
public final IDBRequest get(IDBKeyRange key){
return get(Js.<IDBObjectStore.GetKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest get(JsArray<Object> key){
return get(Js.<IDBObjectStore.GetKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest get(JsDate key){
return get(Js.<IDBObjectStore.GetKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest get(Object[] key){
return get(Js.<JsArray<Object>>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest get(String key){
return get(Js.<IDBObjectStore.GetKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest get(double key){
return get(Js.<IDBObjectStore.GetKeyUnionType>uncheckedCast(key));
}
public native IDBRequest getAll();
@JsOverlay
public final IDBRequest getAll(ArrayBuffer query,int count){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAll(ArrayBuffer query){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAll(ArrayBufferView query,int count){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAll(ArrayBufferView query){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query));
}
public native IDBRequest getAll(IDBObjectStore.GetAllQueryUnionType query,int count);
public native IDBRequest getAll(IDBObjectStore.GetAllQueryUnionType query);
@JsOverlay
public final IDBRequest getAll(IDBKeyRange query,int count){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAll(IDBKeyRange query){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAll(JsArray<Object> query,int count){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAll(JsArray<Object> query){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAll(JsDate query,int count){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAll(JsDate query){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAll(Object[] query,int count){
return getAll(Js.<JsArray<Object>>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAll(Object[] query){
return getAll(Js.<JsArray<Object>>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAll(String query,int count){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAll(String query){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAll(double query,int count){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAll(double query){
return getAll(Js.<IDBObjectStore.GetAllQueryUnionType>uncheckedCast(query));
}
public native IDBRequest getAllKeys();
@JsOverlay
public final IDBRequest getAllKeys(ArrayBuffer query,int count){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAllKeys(ArrayBuffer query){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAllKeys(ArrayBufferView query,int count){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAllKeys(ArrayBufferView query){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query));
}
public native IDBRequest getAllKeys(IDBObjectStore.GetAllKeysQueryUnionType query,int count);
public native IDBRequest getAllKeys(IDBObjectStore.GetAllKeysQueryUnionType query);
@JsOverlay
public final IDBRequest getAllKeys(IDBKeyRange query,int count){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAllKeys(IDBKeyRange query){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAllKeys(JsArray<Object> query,int count){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAllKeys(JsArray<Object> query){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAllKeys(JsDate query,int count){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAllKeys(JsDate query){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAllKeys(Object[] query,int count){
return getAllKeys(Js.<JsArray<Object>>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAllKeys(Object[] query){
return getAllKeys(Js.<JsArray<Object>>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAllKeys(String query,int count){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAllKeys(String query){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getAllKeys(double query,int count){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query),count);
}
@JsOverlay
public final IDBRequest getAllKeys(double query){
return getAllKeys(Js.<IDBObjectStore.GetAllKeysQueryUnionType>uncheckedCast(query));
}
public native IDBRequest getKey();
@JsOverlay
public final IDBRequest getKey(ArrayBuffer query){
return getKey(Js.<IDBObjectStore.GetKeyQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getKey(ArrayBufferView query){
return getKey(Js.<IDBObjectStore.GetKeyQueryUnionType>uncheckedCast(query));
}
public native IDBRequest getKey(IDBObjectStore.GetKeyQueryUnionType query);
@JsOverlay
public final IDBRequest getKey(IDBKeyRange query){
return getKey(Js.<IDBObjectStore.GetKeyQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getKey(JsArray<Object> query){
return getKey(Js.<IDBObjectStore.GetKeyQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getKey(JsDate query){
return getKey(Js.<IDBObjectStore.GetKeyQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getKey(Object[] query){
return getKey(Js.<JsArray<Object>>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getKey(String query){
return getKey(Js.<IDBObjectStore.GetKeyQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest getKey(double query){
return getKey(Js.<IDBObjectStore.GetKeyQueryUnionType>uncheckedCast(query));
}
public native IDBIndex index(String name);
public native IDBRequest openCursor();
public native IDBRequest openCursor(IDBKeyRange range,String direction);
public native IDBRequest openCursor(IDBKeyRange range);
public native IDBRequest openKeyCursor();
@JsOverlay
public final IDBRequest openKeyCursor(ArrayBuffer query,String direction){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query),direction);
}
@JsOverlay
public final IDBRequest openKeyCursor(ArrayBuffer query){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest openKeyCursor(ArrayBufferView query,String direction){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query),direction);
}
@JsOverlay
public final IDBRequest openKeyCursor(ArrayBufferView query){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest openKeyCursor(IDBKeyRange query,String direction){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query),direction);
}
@JsOverlay
public final IDBRequest openKeyCursor(IDBKeyRange query){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest openKeyCursor(JsArray<Object> query,String direction){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query),direction);
}
@JsOverlay
public final IDBRequest openKeyCursor(JsArray<Object> query){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest openKeyCursor(JsDate query,String direction){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query),direction);
}
@JsOverlay
public final IDBRequest openKeyCursor(JsDate query){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest openKeyCursor(Object[] query,String direction){
return openKeyCursor(Js.<JsArray<Object>>uncheckedCast(query),direction);
}
@JsOverlay
public final IDBRequest openKeyCursor(Object[] query){
return openKeyCursor(Js.<JsArray<Object>>uncheckedCast(query));
}
public native IDBRequest openKeyCursor(IDBObjectStore.OpenKeyCursorQueryUnionType query,String direction);
public native IDBRequest openKeyCursor(IDBObjectStore.OpenKeyCursorQueryUnionType query);
@JsOverlay
public final IDBRequest openKeyCursor(String query,String direction){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query),direction);
}
@JsOverlay
public final IDBRequest openKeyCursor(String query){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest openKeyCursor(double query,String direction){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query),direction);
}
@JsOverlay
public final IDBRequest openKeyCursor(double query){
return openKeyCursor(Js.<IDBObjectStore.OpenKeyCursorQueryUnionType>uncheckedCast(query));
}
@JsOverlay
public final IDBRequest put(Object value,ArrayBuffer key){
return put(value,Js.<IDBObjectStore.PutKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest put(Object value,ArrayBufferView key){
return put(value,Js.<IDBObjectStore.PutKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest put(Object value,JsArray<Object> key){
return put(value,Js.<IDBObjectStore.PutKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest put(Object value,JsDate key){
return put(value,Js.<IDBObjectStore.PutKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest put(Object value,Object[] key){
return put(value,Js.<JsArray<Object>>uncheckedCast(key));
}
public native IDBRequest put(Object value,IDBObjectStore.PutKeyUnionType key);
@JsOverlay
public final IDBRequest put(Object value,String key){
return put(value,Js.<IDBObjectStore.PutKeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final IDBRequest put(Object value,double key){
return put(value,Js.<IDBObjectStore.PutKeyUnionType>uncheckedCast(key));
}
public native IDBRequest put(Object value);
}
