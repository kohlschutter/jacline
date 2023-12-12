package elemental2.media;
import elemental2.core.JsIterator;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaKeyStatusMap{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EntriesJsIteratorTypeParameterArrayUnionType{
@JsOverlay
static MediaKeyStatusMap.EntriesJsIteratorTypeParameterArrayUnionType of(Object o){
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
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsFunction
public interface ForEachCallbackFn{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface P1UnionType{
@JsOverlay
static MediaKeyStatusMap.ForEachCallbackFn.P1UnionType of(Object o){
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
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
@JsOverlay
default Object onInvoke(String p0,ArrayBuffer p1){
return onInvoke(p0,Js.<MediaKeyStatusMap.ForEachCallbackFn.P1UnionType>uncheckedCast(p1));
}
@JsOverlay
default Object onInvoke(String p0,ArrayBufferView p1){
return onInvoke(p0,Js.<MediaKeyStatusMap.ForEachCallbackFn.P1UnionType>uncheckedCast(p1));
}
Object onInvoke(String p0,MediaKeyStatusMap.ForEachCallbackFn.P1UnionType p1);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetKeyIdUnionType{
@JsOverlay
static MediaKeyStatusMap.GetKeyIdUnionType of(Object o){
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
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface HasKeyIdUnionType{
@JsOverlay
static MediaKeyStatusMap.HasKeyIdUnionType of(Object o){
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
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface KeysJsIteratorTypeParameterUnionType{
@JsOverlay
static MediaKeyStatusMap.KeysJsIteratorTypeParameterUnionType of(Object o){
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
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
JsIterator<JsArray<MediaKeyStatusMap.EntriesJsIteratorTypeParameterArrayUnionType>, Object, Object> entries();
void forEach(MediaKeyStatusMap.ForEachCallbackFn callback);
@JsOverlay
default String get(ArrayBuffer keyId){
return get(Js.<MediaKeyStatusMap.GetKeyIdUnionType>uncheckedCast(keyId));
}
@JsOverlay
default String get(ArrayBufferView keyId){
return get(Js.<MediaKeyStatusMap.GetKeyIdUnionType>uncheckedCast(keyId));
}
String get(MediaKeyStatusMap.GetKeyIdUnionType keyId);
@JsProperty
int getSize();
@JsOverlay
default boolean has(ArrayBuffer keyId){
return has(Js.<MediaKeyStatusMap.HasKeyIdUnionType>uncheckedCast(keyId));
}
@JsOverlay
default boolean has(ArrayBufferView keyId){
return has(Js.<MediaKeyStatusMap.HasKeyIdUnionType>uncheckedCast(keyId));
}
boolean has(MediaKeyStatusMap.HasKeyIdUnionType keyId);
JsIterator<MediaKeyStatusMap.KeysJsIteratorTypeParameterUnionType, Object, Object> keys();
JsIterator<String, Object, Object> values();
}
