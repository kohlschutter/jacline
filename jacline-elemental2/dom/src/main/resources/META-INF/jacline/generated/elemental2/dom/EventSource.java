package elemental2.dom;
import elemental2.dom.URL;
import elemental2.dom.Event;
import elemental2.dom.EventSourceInit;
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
public class EventSource implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorUrlUnionType{
@JsOverlay
static EventSource.ConstructorUrlUnionType of(Object o){
return Js.cast(o);
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
void onInvoke(Event p0);
}
@JsFunction
public interface OnmessageFn{
void onInvoke(MessageEvent<String> p0);
}
@JsFunction
public interface OnopenFn{
void onInvoke(Event p0);
}
@JsOverlay
public static final int CLOSED=EventSource__Constants.CLOSED;
@JsOverlay
public static final int CONNECTING=EventSource__Constants.CONNECTING;
@JsOverlay
public static final int OPEN=EventSource__Constants.OPEN;
public EventSource.OnerrorFn onerror;
public EventSource.OnmessageFn onmessage;
public EventSource.OnopenFn onopen;
public int readyState;
public String url;
public boolean withCredentials;
public EventSource(EventSource.ConstructorUrlUnionType url,EventSourceInit eventSourceInitDict){}
public EventSource(EventSource.ConstructorUrlUnionType url){}
public EventSource(String url,EventSourceInit eventSourceInitDict){}
public EventSource(String url){}
public EventSource(URL url,EventSourceInit eventSourceInitDict){}
public EventSource(URL url){}
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void close();
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
