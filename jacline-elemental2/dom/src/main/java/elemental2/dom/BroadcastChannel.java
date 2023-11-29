package elemental2.dom;
import elemental2.dom.EventListener;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.MessageEvent;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class BroadcastChannel implements EventTarget{
@JsFunction
public interface OnmessageFn{
Object onInvoke(MessageEvent<Object> p0);
}
public String name;
public BroadcastChannel.OnmessageFn onmessage;
public BroadcastChannel(String channelName){}
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void close();
public native boolean dispatchEvent(Event evt);
public native Object postMessage(Object message);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
