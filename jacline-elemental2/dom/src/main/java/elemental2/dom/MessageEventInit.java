package elemental2.dom;
import elemental2.dom.MessagePort;
import elemental2.dom.Window;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.ServiceWorker;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.EventInit;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MessageEventInit<T> extends EventInit{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetSourceUnionType{
@JsOverlay
static MessageEventInit.GetSourceUnionType of(Object o){
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
@JsOverlay
static MessageEventInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
T getData();
@JsProperty
String getLastEventId();
@JsProperty
String getOrigin();
@JsProperty
JsArray<MessagePort> getPorts();
@JsProperty
MessageEventInit.GetSourceUnionType getSource();
@JsProperty
void setData(T data);
@JsProperty
void setLastEventId(String lastEventId);
@JsProperty
void setOrigin(String origin);
@JsProperty
void setPorts(JsArray<MessagePort> ports);
@JsOverlay
default void setPorts(MessagePort[] ports){
setPorts(Js.<JsArray<MessagePort>>uncheckedCast(ports));
}
@JsProperty
void setSource(MessageEventInit.GetSourceUnionType source);
@JsOverlay
default void setSource(MessagePort source){
setSource(Js.<MessageEventInit.GetSourceUnionType>uncheckedCast(source));
}
@JsOverlay
default void setSource(ServiceWorker source){
setSource(Js.<MessageEventInit.GetSourceUnionType>uncheckedCast(source));
}
@JsOverlay
default void setSource(Window source){
setSource(Js.<MessageEventInit.GetSourceUnionType>uncheckedCast(source));
}
}
