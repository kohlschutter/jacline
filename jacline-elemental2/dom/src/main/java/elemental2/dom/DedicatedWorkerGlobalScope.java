package elemental2.dom;
import org.jspecify.annotations.Nullable;
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
void onInvoke(MessageEvent<@Nullable Object> p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface WebkitPostMessageTransferOrOptionsUnionType{
@JsOverlay
static DedicatedWorkerGlobalScope.@Nullable WebkitPostMessageTransferOrOptionsUnionType of(@Nullable Object o){
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
@JsProperty
DedicatedWorkerGlobalScope.@Nullable OnmessageFn getOnmessage();
void postMessage(@Nullable Object message,WorkerGlobalScope.@Nullable PostMessageTransferOrOptionsUnionType transferOrOptions);
void postMessage(@Nullable Object message);
@JsProperty
void setOnmessage(DedicatedWorkerGlobalScope.@Nullable OnmessageFn onmessage);
@JsOverlay
default void webkitPostMessage(@Nullable Object message,JsArray<Transferable> transferOrOptions){
webkitPostMessage(message,Js.<DedicatedWorkerGlobalScope.@Nullable WebkitPostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
@JsOverlay
default void webkitPostMessage(@Nullable Object message,StructuredSerializeOptions transferOrOptions){
webkitPostMessage(message,Js.<DedicatedWorkerGlobalScope.@Nullable WebkitPostMessageTransferOrOptionsUnionType>uncheckedCast(transferOrOptions));
}
@JsOverlay
default void webkitPostMessage(@Nullable Object message,Transferable[] transferOrOptions){
webkitPostMessage(message,Js.<JsArray<Transferable>>uncheckedCast(transferOrOptions));
}
void webkitPostMessage(@Nullable Object message,DedicatedWorkerGlobalScope.@Nullable WebkitPostMessageTransferOrOptionsUnionType transferOrOptions);
void webkitPostMessage(@Nullable Object message);
}
