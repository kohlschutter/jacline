package elemental2.dom;
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
void onInvoke(MessageEvent<Object> p0);
}
public MessagePort.OnmessageFn onmessage;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void close();
public native boolean dispatchEvent(Event evt);
public native void postMessage(Object message,JsArray<Transferable> transfer);
@JsOverlay
public final void postMessage(Object message,Transferable[] transfer){
postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
public native void postMessage(Object message);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void start();
}
