package elemental2.webassembly;
import org.jspecify.annotations.Nullable;
import elemental2.webassembly.webassembly.Tag;
import elemental2.promise.Promise;
import elemental2.core.ArrayBuffer;
import jsinterop.base.JsPropertyMap;
import elemental2.dom.Response;
import jsinterop.annotations.JsProperty;
import elemental2.webassembly.webassembly.Instance;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.webassembly.webassembly.Module;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WebAssembly{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CompileBytesUnionType{
@JsOverlay
static WebAssembly.CompileBytesUnionType of(Object o){
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
public interface InstantiateModuleObjectUnionType{
@JsOverlay
static WebAssembly.InstantiateModuleObjectUnionType of(Object o){
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
public interface InstantiateReturnType{
@JsOverlay
static WebAssembly.InstantiateReturnType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
Instance getInstance();
@JsProperty
Module getModule();
@JsProperty
void setInstance(Instance instance);
@JsProperty
void setModule(Module module);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface InstantiateStreamingReturnType{
@JsOverlay
static WebAssembly.InstantiateStreamingReturnType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
Instance getInstance();
@JsProperty
Module getModule();
@JsProperty
void setInstance(Instance instance);
@JsProperty
void setModule(Module module);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface InstantiateStreamingSourceUnionType{
@JsOverlay
static WebAssembly.InstantiateStreamingSourceUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Promise<Response> asPromise(){
return Js.cast(this);
}
@JsOverlay
default Response asResponse(){
return Js.cast(this);
}
@JsOverlay
default boolean isPromise(){
return (Object)this instanceof Promise;
}
@JsOverlay
default boolean isResponse(){
return (Object)this instanceof Response;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ValidateBytesUnionType{
@JsOverlay
static WebAssembly.ValidateBytesUnionType of(Object o){
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
public static Tag JSTag;
@JsOverlay
public static final Promise<Module> compile(ArrayBuffer bytes){
return compile(Js.<WebAssembly.CompileBytesUnionType>uncheckedCast(bytes));
}
@JsOverlay
public static final Promise<Module> compile(ArrayBufferView bytes){
return compile(Js.<WebAssembly.CompileBytesUnionType>uncheckedCast(bytes));
}
public static native Promise<Module> compile(WebAssembly.CompileBytesUnionType bytes);
public static native Promise<Module> compileStreaming(Promise<Response> moduleStream);
@JsOverlay
public static final Promise<WebAssembly.InstantiateReturnType> instantiate(ArrayBuffer moduleObject,@Nullable JsObject importObject){
return instantiate(Js.<WebAssembly.InstantiateModuleObjectUnionType>uncheckedCast(moduleObject),importObject);
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateReturnType> instantiate(ArrayBuffer moduleObject,@Nullable Object importObject){
return instantiate(moduleObject,Js.<@Nullable JsObject>uncheckedCast(importObject));
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateReturnType> instantiate(ArrayBuffer moduleObject){
return instantiate(Js.<WebAssembly.InstantiateModuleObjectUnionType>uncheckedCast(moduleObject));
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateReturnType> instantiate(ArrayBufferView moduleObject,@Nullable JsObject importObject){
return instantiate(Js.<WebAssembly.InstantiateModuleObjectUnionType>uncheckedCast(moduleObject),importObject);
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateReturnType> instantiate(ArrayBufferView moduleObject,@Nullable Object importObject){
return instantiate(moduleObject,Js.<@Nullable JsObject>uncheckedCast(importObject));
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateReturnType> instantiate(ArrayBufferView moduleObject){
return instantiate(Js.<WebAssembly.InstantiateModuleObjectUnionType>uncheckedCast(moduleObject));
}
public static native Promise<WebAssembly.InstantiateReturnType> instantiate(WebAssembly.InstantiateModuleObjectUnionType moduleObject,@Nullable JsObject importObject);
@JsOverlay
public static final Promise<WebAssembly.InstantiateReturnType> instantiate(WebAssembly.InstantiateModuleObjectUnionType moduleObject,@Nullable Object importObject){
return instantiate(moduleObject,Js.<@Nullable JsObject>uncheckedCast(importObject));
}
public static native Promise<WebAssembly.InstantiateReturnType> instantiate(WebAssembly.InstantiateModuleObjectUnionType moduleObject);
public static native Promise<WebAssembly.InstantiateStreamingReturnType> instantiateStreaming(WebAssembly.InstantiateStreamingSourceUnionType source,@Nullable JsObject importObject);
@JsOverlay
public static final Promise<WebAssembly.InstantiateStreamingReturnType> instantiateStreaming(WebAssembly.InstantiateStreamingSourceUnionType source,@Nullable Object importObject){
return instantiateStreaming(source,Js.<@Nullable JsObject>uncheckedCast(importObject));
}
public static native Promise<WebAssembly.InstantiateStreamingReturnType> instantiateStreaming(WebAssembly.InstantiateStreamingSourceUnionType source);
@JsOverlay
public static final Promise<WebAssembly.InstantiateStreamingReturnType> instantiateStreaming(Promise<Response> source,@Nullable JsObject importObject){
return instantiateStreaming(Js.<WebAssembly.InstantiateStreamingSourceUnionType>uncheckedCast(source),importObject);
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateStreamingReturnType> instantiateStreaming(Promise<Response> source,@Nullable Object importObject){
return instantiateStreaming(source,Js.<@Nullable JsObject>uncheckedCast(importObject));
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateStreamingReturnType> instantiateStreaming(Promise<Response> source){
return instantiateStreaming(Js.<WebAssembly.InstantiateStreamingSourceUnionType>uncheckedCast(source));
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateStreamingReturnType> instantiateStreaming(Response source,@Nullable JsObject importObject){
return instantiateStreaming(Js.<WebAssembly.InstantiateStreamingSourceUnionType>uncheckedCast(source),importObject);
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateStreamingReturnType> instantiateStreaming(Response source,@Nullable Object importObject){
return instantiateStreaming(source,Js.<@Nullable JsObject>uncheckedCast(importObject));
}
@JsOverlay
public static final Promise<WebAssembly.InstantiateStreamingReturnType> instantiateStreaming(Response source){
return instantiateStreaming(Js.<WebAssembly.InstantiateStreamingSourceUnionType>uncheckedCast(source));
}
@JsOverlay
public static final boolean validate(ArrayBuffer bytes){
return validate(Js.<WebAssembly.ValidateBytesUnionType>uncheckedCast(bytes));
}
@JsOverlay
public static final boolean validate(ArrayBufferView bytes){
return validate(Js.<WebAssembly.ValidateBytesUnionType>uncheckedCast(bytes));
}
public static native boolean validate(WebAssembly.ValidateBytesUnionType bytes);
}
