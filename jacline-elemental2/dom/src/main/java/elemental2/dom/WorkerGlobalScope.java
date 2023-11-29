package elemental2.dom;
import elemental2.dom.WorkerLocation;
import elemental2.dom.URL;
import elemental2.core.Transferable;
import elemental2.dom.Event;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import elemental2.dom.Response;
import elemental2.core.JsError;
import jsinterop.annotations.JsProperty;
import elemental2.dom.WorkerNavigator;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.Request;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.WorkerPerformance;
import jsinterop.annotations.JsPackage;
import elemental2.dom.StructuredSerializeOptions;
import elemental2.dom.RequestInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface WorkerGlobalScope extends EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface FetchInputUnionType{
@JsOverlay
static WorkerGlobalScope.FetchInputUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Request asRequest(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isRequest(){
return (Object)this instanceof Request;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsFunction
public interface OnerrorFn{
void onInvoke(String event,String source,int lineno,int colno,JsError error);
}
@JsFunction
public interface OnofflineFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnonlineFn{
void onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PostMessageTransferOrOptionsUnionType{
@JsOverlay
static WorkerGlobalScope.PostMessageTransferOrOptionsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<Transferable> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default StructuredSerializeOptions asStructuredSerializeOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
void close();
Promise<Response> fetch(WorkerGlobalScope.FetchInputUnionType input,RequestInit init);
Promise<Response> fetch(WorkerGlobalScope.FetchInputUnionType input);
@JsOverlay
default Promise<Response> fetch(Request input,RequestInit init){
return fetch(Js.<WorkerGlobalScope.FetchInputUnionType>uncheckedCast(input),init);
}
@JsOverlay
default Promise<Response> fetch(Request input){
return fetch(Js.<WorkerGlobalScope.FetchInputUnionType>uncheckedCast(input));
}
@JsOverlay
default Promise<Response> fetch(String input,RequestInit init){
return fetch(Js.<WorkerGlobalScope.FetchInputUnionType>uncheckedCast(input),init);
}
@JsOverlay
default Promise<Response> fetch(String input){
return fetch(Js.<WorkerGlobalScope.FetchInputUnionType>uncheckedCast(input));
}
@JsOverlay
default Promise<Response> fetch(URL input,RequestInit init){
return fetch(Js.<WorkerGlobalScope.FetchInputUnionType>uncheckedCast(input),init);
}
@JsOverlay
default Promise<Response> fetch(URL input){
return fetch(Js.<WorkerGlobalScope.FetchInputUnionType>uncheckedCast(input));
}
@JsProperty
WorkerLocation getLocation();
@JsProperty
WorkerNavigator getNavigator();
@JsProperty
WorkerGlobalScope.OnerrorFn getOnerror();
@JsProperty
WorkerGlobalScope.OnofflineFn getOnoffline();
@JsProperty
WorkerGlobalScope.OnonlineFn getOnonline();
@JsProperty
String getOrigin();
@JsProperty
WorkerPerformance getPerformance();
@JsProperty
WorkerGlobalScope getSelf();
@JsOverlay
default void postMessage(Object message,JsArray<Transferable> transferOrOptions){
postMessage(message,Js.<WorkerGlobalScope.PostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
void postMessage(Object message,WorkerGlobalScope.PostMessageTransferOrOptionsUnionType transferOrOptions);
@JsOverlay
default void postMessage(Object message,StructuredSerializeOptions transferOrOptions){
postMessage(message,Js.<WorkerGlobalScope.PostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
@JsOverlay
default void postMessage(Object message,Transferable[] transferOrOptions){
postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(transferOrOptions));
}
void postMessage(Object message);
@JsProperty
void setLocation(WorkerLocation location);
@JsProperty
void setNavigator(WorkerNavigator navigator);
@JsProperty
void setOnerror(WorkerGlobalScope.OnerrorFn onerror);
@JsProperty
void setOnoffline(WorkerGlobalScope.OnofflineFn onoffline);
@JsProperty
void setOnonline(WorkerGlobalScope.OnonlineFn ononline);
@JsProperty
void setPerformance(WorkerPerformance performance);
@JsProperty
void setSelf(WorkerGlobalScope self);
}
