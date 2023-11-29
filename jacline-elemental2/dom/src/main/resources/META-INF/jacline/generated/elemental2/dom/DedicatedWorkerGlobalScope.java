package elemental2.dom;
import elemental2.core.Transferable;
import elemental2.dom.WorkerGlobalScope;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import elemental2.dom.MessageEvent;
import jsinterop.annotations.JsPackage;
import elemental2.dom.StructuredSerializeOptions;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface DedicatedWorkerGlobalScope extends WorkerGlobalScope{
@JsFunction
public interface OnmessageFn{
void onInvoke(MessageEvent<Object> p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface WebkitPostMessageTransferOrOptionsUnionType{
@JsOverlay
static DedicatedWorkerGlobalScope.WebkitPostMessageTransferOrOptionsUnionType of(Object o){
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
@JsProperty
DedicatedWorkerGlobalScope.OnmessageFn getOnmessage();
void postMessage(Object message,WorkerGlobalScope.PostMessageTransferOrOptionsUnionType transferOrOptions);
void postMessage(Object message);
@JsProperty
void setOnmessage(DedicatedWorkerGlobalScope.OnmessageFn onmessage);
@JsOverlay
default void webkitPostMessage(Object message,JsArray<Transferable> transferOrOptions){
webkitPostMessage(message,Js.<DedicatedWorkerGlobalScope.WebkitPostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
@JsOverlay
default void webkitPostMessage(Object message,StructuredSerializeOptions transferOrOptions){
webkitPostMessage(message,Js.<DedicatedWorkerGlobalScope.WebkitPostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
@JsOverlay
default void webkitPostMessage(Object message,Transferable[] transferOrOptions){
webkitPostMessage(message,Js.<JsArray<Transferable>>uncheckedCast(transferOrOptions));
}
void webkitPostMessage(Object message,DedicatedWorkerGlobalScope.WebkitPostMessageTransferOrOptionsUnionType transferOrOptions);
void webkitPostMessage(Object message);
}
