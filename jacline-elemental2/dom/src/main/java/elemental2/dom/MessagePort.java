package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.core.Transferable;
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
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MessagePort implements Transferable, EventTarget{
@JsFunction
public interface OnmessageFn{
void onInvoke(MessageEvent<@Nullable Object> p0);
}
@JsFunction
public interface OnmessageerrorFn{
void onInvoke(MessageEvent<@Nullable Object> p0);
}
public MessagePort.@Nullable OnmessageFn onmessage;
public MessagePort.@Nullable OnmessageerrorFn onmessageerror;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void close();
public native boolean dispatchEvent(Event evt);
public native void postMessage(@Nullable Object message,@Nullable JsArray<Transferable> transfer);
@JsOverlay
public final void postMessage(@Nullable Object message,Transferable@Nullable [] transfer){
postMessage(message,Js.<@Nullable JsArray<Transferable>>uncheckedCast(transfer));
}
public native void postMessage(@Nullable Object message);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void start();
}
