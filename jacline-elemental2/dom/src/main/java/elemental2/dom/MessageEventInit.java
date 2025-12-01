package elemental2.dom;
import org.jspecify.annotations.Nullable;
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
public interface MessageEventInit<T extends @Nullable Object> extends EventInit{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetSourceUnionType{
@JsOverlay
static MessageEventInit.@Nullable GetSourceUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable MessagePort asMessagePort(){
return Js.cast(this);
}
@JsOverlay
default @Nullable ServiceWorker asServiceWorker(){
return Js.cast(this);
}
@JsOverlay
default @Nullable Window asWindow(){
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
static <T extends @Nullable Object> MessageEventInit<T> create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
T getData();
@JsProperty
String getLastEventId();
@JsProperty
String getOrigin();
@JsProperty
JsArray<@Nullable MessagePort> getPorts();
@JsProperty
MessageEventInit.@Nullable GetSourceUnionType getSource();
@JsProperty
void setData(T data);
@JsProperty
void setLastEventId(String lastEventId);
@JsProperty
void setOrigin(String origin);
@JsProperty
void setPorts(JsArray<@Nullable MessagePort> ports);
@JsOverlay
default void setPorts(@Nullable MessagePort[] ports){
setPorts(Js.<JsArray<@Nullable MessagePort>>uncheckedCast(ports));
}
@JsProperty
void setSource(MessageEventInit.@Nullable GetSourceUnionType source);
@JsOverlay
default void setSource(MessagePort source){
setSource(Js.<MessageEventInit.@Nullable GetSourceUnionType>uncheckedCast(source));
}
@JsOverlay
default void setSource(ServiceWorker source){
setSource(Js.<MessageEventInit.@Nullable GetSourceUnionType>uncheckedCast(source));
}
@JsOverlay
default void setSource(Window source){
setSource(Js.<MessageEventInit.@Nullable GetSourceUnionType>uncheckedCast(source));
}
}
