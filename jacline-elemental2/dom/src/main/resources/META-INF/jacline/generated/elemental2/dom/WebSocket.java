package elemental2.dom;
import elemental2.dom.URL;
import elemental2.dom.Event;
import elemental2.dom.Blob;
import elemental2.core.ArrayBuffer;
import elemental2.dom.CloseEvent;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.MessageEvent;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class WebSocket implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorProtocolUnionType{
@JsOverlay
static WebSocket.ConstructorProtocolUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<String> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorUrlUnionType{
@JsOverlay
static WebSocket.ConstructorUrlUnionType of(Object o){
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
public interface OncloseFn{
void onInvoke(CloseEvent event);
}
@JsFunction
public interface OnerrorFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnmessageFn{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface EventMessageEventTypeParameterUnionType{
@JsOverlay
static WebSocket.OnmessageFn.EventMessageEventTypeParameterUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default Blob asBlob(){
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
default boolean isBlob(){
return (Object)this instanceof Blob;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
void onInvoke(MessageEvent<WebSocket.OnmessageFn.EventMessageEventTypeParameterUnionType> event);
}
@JsFunction
public interface OnopenFn{
void onInvoke(Event event);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SendDataUnionType{
@JsOverlay
static WebSocket.SendDataUnionType of(Object o){
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
default Blob asBlob(){
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
default boolean isBlob(){
return (Object)this instanceof Blob;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsOverlay
public static final int CLOSED=WebSocket__Constants.CLOSED;
@JsOverlay
public static final int CLOSING=WebSocket__Constants.CLOSING;
@JsOverlay
public static final int CONNECTING=WebSocket__Constants.CONNECTING;
@JsOverlay
public static final int OPEN=WebSocket__Constants.OPEN;
public String binaryType;
public int bufferedAmount;
public WebSocket.OncloseFn onclose;
public WebSocket.OnerrorFn onerror;
public WebSocket.OnmessageFn onmessage;
public WebSocket.OnopenFn onopen;
public int readyState;
public String url;
public WebSocket(WebSocket.ConstructorUrlUnionType url,WebSocket.ConstructorProtocolUnionType protocol){}
public WebSocket(WebSocket.ConstructorUrlUnionType url,JsArray<String> protocol){}
public WebSocket(WebSocket.ConstructorUrlUnionType url,String protocol){}
public WebSocket(WebSocket.ConstructorUrlUnionType url,String[] protocol){}
public WebSocket(WebSocket.ConstructorUrlUnionType url){}
public WebSocket(String url,WebSocket.ConstructorProtocolUnionType protocol){}
public WebSocket(String url,JsArray<String> protocol){}
public WebSocket(String url,String protocol){}
public WebSocket(String url,String[] protocol){}
public WebSocket(String url){}
public WebSocket(URL url,WebSocket.ConstructorProtocolUnionType protocol){}
public WebSocket(URL url,JsArray<String> protocol){}
public WebSocket(URL url,String protocol){}
public WebSocket(URL url,String[] protocol){}
public WebSocket(URL url){}
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void close();
public native void close(int code,String reason);
public native void close(int code);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
@JsOverlay
public final void send(ArrayBuffer data){
send(Js.<WebSocket.SendDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void send(ArrayBufferView data){
send(Js.<WebSocket.SendDataUnionType>uncheckedCast(data));
}
@JsOverlay
public final void send(Blob data){
send(Js.<WebSocket.SendDataUnionType>uncheckedCast(data));
}
public native void send(WebSocket.SendDataUnionType data);
@JsOverlay
public final void send(String data){
send(Js.<WebSocket.SendDataUnionType>uncheckedCast(data));
}
}
