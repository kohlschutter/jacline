package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.ErrorEvent;
import elemental2.dom.URL;
import elemental2.dom.WorkerOptions;
import elemental2.core.Transferable;
import elemental2.dom.TrustedScriptURL;
import elemental2.dom.Event;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.MessageEvent;
import jsinterop.annotations.JsPackage;
import elemental2.dom.StructuredSerializeOptions;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Worker implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorScriptURLUnionType{
@JsOverlay
static Worker.ConstructorScriptURLUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default TrustedScriptURL asTrustedScriptURL(){
return Js.cast(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isTrustedScriptURL(){
return (Object)this instanceof TrustedScriptURL;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsFunction
public interface OnerrorFn{
void onInvoke(ErrorEvent p0);
}
@JsFunction
public interface OnmessageFn{
void onInvoke(MessageEvent<@Nullable Object> p0);
}
@JsFunction
public interface OnmessageerrorFn{
@Nullable Object onInvoke(MessageEvent p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PostMessageTransferOrOptionsUnionType{
@JsOverlay
static Worker.@Nullable PostMessageTransferOrOptionsUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<Transferable> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable StructuredSerializeOptions asStructuredSerializeOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface WebkitPostMessageTransferOrOptionsUnionType{
@JsOverlay
static Worker.@Nullable WebkitPostMessageTransferOrOptionsUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable JsArray<Transferable> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default @Nullable StructuredSerializeOptions asStructuredSerializeOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
}
public Worker.@Nullable OnerrorFn onerror;
public Worker.@Nullable OnmessageFn onmessage;
public Worker.@Nullable OnmessageerrorFn onmessageerror;
public Worker(Worker.ConstructorScriptURLUnionType scriptURL,WorkerOptions options){}
public Worker(Worker.ConstructorScriptURLUnionType scriptURL){}
public Worker(String scriptURL,WorkerOptions options){}
public Worker(String scriptURL){}
public Worker(TrustedScriptURL scriptURL,WorkerOptions options){}
public Worker(TrustedScriptURL scriptURL){}
public Worker(URL scriptURL,WorkerOptions options){}
public Worker(URL scriptURL){}
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
@JsOverlay
public final void postMessage(@Nullable Object message,JsArray<Transferable> transferOrOptions){
postMessage(message,Js.<Worker.@Nullable PostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
public native void postMessage(@Nullable Object message,Worker.@Nullable PostMessageTransferOrOptionsUnionType transferOrOptions);
@JsOverlay
public final void postMessage(@Nullable Object message,StructuredSerializeOptions transferOrOptions){
postMessage(message,Js.<Worker.@Nullable PostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
@JsOverlay
public final void postMessage(@Nullable Object message,Transferable[] transferOrOptions){
postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(transferOrOptions));
}
public native void postMessage(@Nullable Object message);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void terminate();
@JsOverlay
public final void webkitPostMessage(@Nullable Object message,JsArray<Transferable> transferOrOptions){
webkitPostMessage(message,Js.<Worker.@Nullable WebkitPostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
@JsOverlay
public final void webkitPostMessage(@Nullable Object message,StructuredSerializeOptions transferOrOptions){
webkitPostMessage(message,Js.<Worker.@Nullable WebkitPostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
@JsOverlay
public final void webkitPostMessage(@Nullable Object message,Transferable[] transferOrOptions){
webkitPostMessage(message,Js.<JsArray<Transferable>>uncheckedCast(transferOrOptions));
}
public native void webkitPostMessage(@Nullable Object message,Worker.@Nullable WebkitPostMessageTransferOrOptionsUnionType transferOrOptions);
public native void webkitPostMessage(@Nullable Object message);
}
