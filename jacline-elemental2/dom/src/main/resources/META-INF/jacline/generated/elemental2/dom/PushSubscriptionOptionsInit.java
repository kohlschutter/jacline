package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.ArrayBuffer;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface PushSubscriptionOptionsInit{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetApplicationServerKeyUnionType{
@JsOverlay
static PushSubscriptionOptionsInit.GetApplicationServerKeyUnionType of(Object o){
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
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsOverlay
static PushSubscriptionOptionsInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
PushSubscriptionOptionsInit.GetApplicationServerKeyUnionType getApplicationServerKey();
@JsProperty
boolean isUserVisibleOnly();
@JsOverlay
default void setApplicationServerKey(ArrayBuffer applicationServerKey){
setApplicationServerKey(Js.<PushSubscriptionOptionsInit.GetApplicationServerKeyUnionType>uncheckedCast(applicationServerKey));
}
@JsOverlay
default void setApplicationServerKey(ArrayBufferView applicationServerKey){
setApplicationServerKey(Js.<PushSubscriptionOptionsInit.GetApplicationServerKeyUnionType>uncheckedCast(applicationServerKey));
}
@JsProperty
void setApplicationServerKey(PushSubscriptionOptionsInit.GetApplicationServerKeyUnionType applicationServerKey);
@JsOverlay
default void setApplicationServerKey(String applicationServerKey){
setApplicationServerKey(Js.<PushSubscriptionOptionsInit.GetApplicationServerKeyUnionType>uncheckedCast(applicationServerKey));
}
@JsProperty
void setUserVisibleOnly(boolean userVisibleOnly);
}
