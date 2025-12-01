package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.MessagePort;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.ExtendableEventInit;
import elemental2.dom.ServiceWorkerClient;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.ServiceWorker;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ExtendableMessageEventInit<T extends @Nullable Object> extends ExtendableEventInit{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetSourceUnionType{
@JsOverlay
static ExtendableMessageEventInit.GetSourceUnionType of(Object o){
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
default ServiceWorkerClient asServiceWorkerClient(){
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
default boolean isServiceWorkerClient(){
return (Object)this instanceof ServiceWorkerClient;
}
}
@JsOverlay
static <T extends @Nullable Object> ExtendableMessageEventInit<T> create(){
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
ExtendableMessageEventInit.GetSourceUnionType getSource();
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
void setSource(ExtendableMessageEventInit.GetSourceUnionType source);
@JsOverlay
default void setSource(MessagePort source){
setSource(Js.<ExtendableMessageEventInit.GetSourceUnionType>uncheckedCast(source));
}
@JsOverlay
default void setSource(ServiceWorker source){
setSource(Js.<ExtendableMessageEventInit.GetSourceUnionType>uncheckedCast(source));
}
@JsOverlay
default void setSource(ServiceWorkerClient source){
setSource(Js.<ExtendableMessageEventInit.GetSourceUnionType>uncheckedCast(source));
}
}
