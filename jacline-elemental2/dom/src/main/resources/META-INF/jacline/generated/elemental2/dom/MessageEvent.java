package elemental2.dom;
import elemental2.dom.MessagePort;
import elemental2.dom.MessageEventInit;
import elemental2.dom.Window;
import elemental2.dom.Event;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.ServiceWorker;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.EventInit;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class MessageEvent<T> extends Event{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface InitMessageEventNSSourceArgUnionType{
@JsOverlay
static MessageEvent.InitMessageEventNSSourceArgUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default MessagePort asMessagePort(){
return Js.cast(this);
}
@JsOverlay
default ServiceWorker asServiceWorker(){
return Js.cast(this);
}
@JsOverlay
default Window asWindow(){
return Js.cast(this);
}
@JsOverlay
default boolean isMessagePort(){
return (Object)this instanceof MessagePort;
}
@JsOverlay
default boolean isServiceWorker(){
return (Object)this instanceof ServiceWorker;
}
@JsOverlay
default boolean isWindow(){
return (Object)this instanceof Window;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface InitMessageEventSourceArgUnionType{
@JsOverlay
static MessageEvent.InitMessageEventSourceArgUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default MessagePort asMessagePort(){
return Js.cast(this);
}
@JsOverlay
default ServiceWorker asServiceWorker(){
return Js.cast(this);
}
@JsOverlay
default Window asWindow(){
return Js.cast(this);
}
@JsOverlay
default boolean isMessagePort(){
return (Object)this instanceof MessagePort;
}
@JsOverlay
default boolean isServiceWorker(){
return (Object)this instanceof ServiceWorker;
}
@JsOverlay
default boolean isWindow(){
return (Object)this instanceof Window;
}
}
public T data;
public String lastEventId;
public String origin;
public JsArray<MessagePort> ports;
public Window source;
public MessageEvent(String type,MessageEventInit<T> eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public MessageEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public native void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessageEvent.InitMessageEventSourceArgUnionType sourceArg,JsArray<MessagePort> portsArg);
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessageEvent.InitMessageEventSourceArgUnionType sourceArg,MessagePort[] portsArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,sourceArg,Js.<JsArray<MessagePort>>uncheckedCast(portsArg));
}
public native void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessageEvent.InitMessageEventSourceArgUnionType sourceArg);
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessagePort sourceArg,JsArray<MessagePort> portsArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventSourceArgUnionType>uncheckedCast(sourceArg),portsArg);
}
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessagePort sourceArg,MessagePort[] portsArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,sourceArg,Js.<JsArray<MessagePort>>uncheckedCast(portsArg));
}
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessagePort sourceArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventSourceArgUnionType>uncheckedCast(sourceArg));
}
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,ServiceWorker sourceArg,JsArray<MessagePort> portsArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventSourceArgUnionType>uncheckedCast(sourceArg),portsArg);
}
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,ServiceWorker sourceArg,MessagePort[] portsArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,sourceArg,Js.<JsArray<MessagePort>>uncheckedCast(portsArg));
}
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,ServiceWorker sourceArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventSourceArgUnionType>uncheckedCast(sourceArg));
}
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,Window sourceArg,JsArray<MessagePort> portsArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventSourceArgUnionType>uncheckedCast(sourceArg),portsArg);
}
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,Window sourceArg,MessagePort[] portsArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,sourceArg,Js.<JsArray<MessagePort>>uncheckedCast(portsArg));
}
@JsOverlay
public final void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,Window sourceArg){
initMessageEvent(typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventSourceArgUnionType>uncheckedCast(sourceArg));
}
public native void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg);
public native void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg);
public native void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg);
public native void initMessageEvent(String typeArg,boolean canBubbleArg,boolean cancelableArg);
public native void initMessageEvent(String typeArg,boolean canBubbleArg);
public native void initMessageEvent(String typeArg);
public native void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessageEvent.InitMessageEventNSSourceArgUnionType sourceArg,JsArray<MessagePort> portsArg);
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessageEvent.InitMessageEventNSSourceArgUnionType sourceArg,MessagePort[] portsArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,sourceArg,Js.<JsArray<MessagePort>>uncheckedCast(portsArg));
}
public native void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessageEvent.InitMessageEventNSSourceArgUnionType sourceArg);
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessagePort sourceArg,JsArray<MessagePort> portsArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventNSSourceArgUnionType>uncheckedCast(sourceArg),portsArg);
}
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessagePort sourceArg,MessagePort[] portsArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,sourceArg,Js.<JsArray<MessagePort>>uncheckedCast(portsArg));
}
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,MessagePort sourceArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventNSSourceArgUnionType>uncheckedCast(sourceArg));
}
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,ServiceWorker sourceArg,JsArray<MessagePort> portsArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventNSSourceArgUnionType>uncheckedCast(sourceArg),portsArg);
}
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,ServiceWorker sourceArg,MessagePort[] portsArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,sourceArg,Js.<JsArray<MessagePort>>uncheckedCast(portsArg));
}
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,ServiceWorker sourceArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventNSSourceArgUnionType>uncheckedCast(sourceArg));
}
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,Window sourceArg,JsArray<MessagePort> portsArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventNSSourceArgUnionType>uncheckedCast(sourceArg),portsArg);
}
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,Window sourceArg,MessagePort[] portsArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,sourceArg,Js.<JsArray<MessagePort>>uncheckedCast(portsArg));
}
@JsOverlay
public final void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg,Window sourceArg){
initMessageEventNS(namespaceURI,typeArg,canBubbleArg,cancelableArg,dataArg,originArg,lastEventIdArg,Js.<MessageEvent.InitMessageEventNSSourceArgUnionType>uncheckedCast(sourceArg));
}
public native void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg,String lastEventIdArg);
public native void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg,String originArg);
public native void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg,T dataArg);
public native void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg,boolean cancelableArg);
public native void initMessageEventNS(String namespaceURI,String typeArg,boolean canBubbleArg);
public native void initMessageEventNS(String namespaceURI,String typeArg);
public native void initMessageEventNS(String namespaceURI);
}
