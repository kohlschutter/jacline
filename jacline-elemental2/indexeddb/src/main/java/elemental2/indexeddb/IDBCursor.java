package elemental2.indexeddb;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import jsinterop.annotations.JsMethod;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import elemental2.indexeddb.IDBRequest;
import jsinterop.base.Js;
import elemental2.indexeddb.IDBObjectStore;
import elemental2.core.ArrayBufferView;
import elemental2.indexeddb.IDBIndex;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsDate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IDBCursor{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ContinuePrimaryKeyKeyUnionType{
@JsOverlay
static IDBCursor.ContinuePrimaryKeyKeyUnionType of(Object o){
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
default JsArray<@Nullable Object> asJsArray(){
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
public interface ContinuePrimaryKeyPrimaryKeyUnionType{
@JsOverlay
static IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType of(Object o){
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
default JsArray<@Nullable Object> asJsArray(){
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
public interface Continue_KeyUnionType{
@JsOverlay
static IDBCursor.Continue_KeyUnionType of(Object o){
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
default JsArray<@Nullable Object> asJsArray(){
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
public interface KeyUnionType{
@JsOverlay
static IDBCursor.KeyUnionType of(Object o){
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
default JsArray<@Nullable Object> asJsArray(){
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
public interface PrimaryKeyUnionType{
@JsOverlay
static IDBCursor.PrimaryKeyUnionType of(Object o){
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
default JsArray<@Nullable Object> asJsArray(){
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
public interface SourceUnionType{
@JsOverlay
static IDBCursor.SourceUnionType of(Object o){
return Js.cast(o);
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
default boolean isIDBIndex(){
return (Object)this instanceof IDBIndex;
}
@JsOverlay
default boolean isIDBObjectStore(){
return (Object)this instanceof IDBObjectStore;
}
}
public String direction;
public IDBCursor.KeyUnionType key;
public IDBCursor.PrimaryKeyUnionType primaryKey;
public IDBCursor.SourceUnionType source;
public native void advance(int count);
@JsOverlay
public final void continuePrimaryKey(ArrayBuffer key,ArrayBuffer primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBuffer key,ArrayBufferView primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBuffer key,IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(ArrayBuffer key,JsArray<@Nullable Object> primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBuffer key,JsDate primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBuffer key,@Nullable Object[] primaryKey){
continuePrimaryKey(key,Js.<JsArray<@Nullable Object>>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBuffer key,String primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBuffer key,double primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBufferView key,ArrayBuffer primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBufferView key,ArrayBufferView primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBufferView key,IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(ArrayBufferView key,JsArray<@Nullable Object> primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBufferView key,JsDate primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBufferView key,@Nullable Object[] primaryKey){
continuePrimaryKey(key,Js.<JsArray<@Nullable Object>>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBufferView key,String primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(ArrayBufferView key,double primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(IDBCursor.ContinuePrimaryKeyKeyUnionType key,ArrayBuffer primaryKey){
continuePrimaryKey(key,Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(IDBCursor.ContinuePrimaryKeyKeyUnionType key,ArrayBufferView primaryKey){
continuePrimaryKey(key,Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
public native void continuePrimaryKey(IDBCursor.ContinuePrimaryKeyKeyUnionType key,IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType primaryKey);
@JsOverlay
public final void continuePrimaryKey(IDBCursor.ContinuePrimaryKeyKeyUnionType key,JsArray<@Nullable Object> primaryKey){
continuePrimaryKey(key,Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(IDBCursor.ContinuePrimaryKeyKeyUnionType key,JsDate primaryKey){
continuePrimaryKey(key,Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(IDBCursor.ContinuePrimaryKeyKeyUnionType key,@Nullable Object[] primaryKey){
continuePrimaryKey(key,Js.<JsArray<@Nullable Object>>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(IDBCursor.ContinuePrimaryKeyKeyUnionType key,String primaryKey){
continuePrimaryKey(key,Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(IDBCursor.ContinuePrimaryKeyKeyUnionType key,double primaryKey){
continuePrimaryKey(key,Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsArray<@Nullable Object> key,ArrayBuffer primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsArray<@Nullable Object> key,ArrayBufferView primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsArray<@Nullable Object> key,IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(JsArray<@Nullable Object> key,JsArray<@Nullable Object> primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsArray<@Nullable Object> key,JsDate primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsArray<@Nullable Object> key,String primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsArray<@Nullable Object> key,double primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsDate key,ArrayBuffer primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsDate key,ArrayBufferView primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsDate key,IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(JsDate key,JsArray<@Nullable Object> primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsDate key,JsDate primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsDate key,@Nullable Object[] primaryKey){
continuePrimaryKey(key,Js.<JsArray<@Nullable Object>>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsDate key,String primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(JsDate key,double primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(@Nullable Object[] key,ArrayBuffer primaryKey){
continuePrimaryKey(Js.<JsArray<@Nullable Object>>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(@Nullable Object[] key,ArrayBufferView primaryKey){
continuePrimaryKey(Js.<JsArray<@Nullable Object>>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(@Nullable Object[] key,IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType primaryKey){
continuePrimaryKey(Js.<JsArray<@Nullable Object>>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(@Nullable Object[] key,JsDate primaryKey){
continuePrimaryKey(Js.<JsArray<@Nullable Object>>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(@Nullable Object[] key,@Nullable Object[] primaryKey){
continuePrimaryKey(Js.<JsArray<@Nullable Object>>uncheckedCast(key),Js.<JsArray<@Nullable Object>>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(@Nullable Object[] key,String primaryKey){
continuePrimaryKey(Js.<JsArray<@Nullable Object>>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(@Nullable Object[] key,double primaryKey){
continuePrimaryKey(Js.<JsArray<@Nullable Object>>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(String key,ArrayBuffer primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(String key,ArrayBufferView primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(String key,IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(String key,JsArray<@Nullable Object> primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(String key,JsDate primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(String key,@Nullable Object[] primaryKey){
continuePrimaryKey(key,Js.<JsArray<@Nullable Object>>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(String key,String primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(String key,double primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(double key,ArrayBuffer primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(double key,ArrayBufferView primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(double key,IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),primaryKey);
}
@JsOverlay
public final void continuePrimaryKey(double key,JsArray<@Nullable Object> primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(double key,JsDate primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(double key,@Nullable Object[] primaryKey){
continuePrimaryKey(key,Js.<JsArray<@Nullable Object>>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(double key,String primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsOverlay
public final void continuePrimaryKey(double key,double primaryKey){
continuePrimaryKey(Js.<IDBCursor.ContinuePrimaryKeyKeyUnionType>uncheckedCast(key),Js.<IDBCursor.ContinuePrimaryKeyPrimaryKeyUnionType>uncheckedCast(primaryKey));
}
@JsMethod(name = "continue")
public native void continue_();
@JsOverlay
public final void continue_(ArrayBuffer key){
continue_(Js.<IDBCursor.Continue_KeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final void continue_(ArrayBufferView key){
continue_(Js.<IDBCursor.Continue_KeyUnionType>uncheckedCast(key));
}
@JsMethod(name = "continue")
public native void continue_(IDBCursor.Continue_KeyUnionType key);
@JsOverlay
public final void continue_(JsArray<@Nullable Object> key){
continue_(Js.<IDBCursor.Continue_KeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final void continue_(JsDate key){
continue_(Js.<IDBCursor.Continue_KeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final void continue_(@Nullable Object[] key){
continue_(Js.<JsArray<@Nullable Object>>uncheckedCast(key));
}
@JsOverlay
public final void continue_(String key){
continue_(Js.<IDBCursor.Continue_KeyUnionType>uncheckedCast(key));
}
@JsOverlay
public final void continue_(double key){
continue_(Js.<IDBCursor.Continue_KeyUnionType>uncheckedCast(key));
}
public native IDBRequest delete();
public native IDBRequest update(@Nullable Object value);
}
