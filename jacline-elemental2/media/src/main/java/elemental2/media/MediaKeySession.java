package elemental2.media;
import elemental2.media.MediaKeyStatusMap;
import elemental2.dom.Event;
import elemental2.promise.Promise;
import elemental2.core.ArrayBuffer;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface MediaKeySession extends EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AddEventListenerListenerUnionType{
@JsOverlay
static MediaKeySession.AddEventListenerListenerUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventTarget.AddEventListenerListenerFn asAddEventListenerListenerFn(){
return Js.cast(this);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default boolean isAddEventListenerListenerFn(){
return (Object)this instanceof EventTarget.AddEventListenerListenerFn;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GenerateRequestInitDataUnionType{
@JsOverlay
static MediaKeySession.GenerateRequestInitDataUnionType of(Object o){
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
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RemoveEventListenerListenerUnionType{
@JsOverlay
static MediaKeySession.RemoveEventListenerListenerUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default EventListener asEventListener(){
return Js.cast(this);
}
@JsOverlay
default EventTarget.RemoveEventListenerListenerFn asRemoveEventListenerListenerFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isRemoveEventListenerListenerFn(){
return (Object)this instanceof EventTarget.RemoveEventListenerListenerFn;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface UpdateResponseUnionType{
@JsOverlay
static MediaKeySession.UpdateResponseUnionType of(Object o){
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
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
}
void addEventListener(String type,MediaKeySession.AddEventListenerListenerUnionType listener,EventTarget.AddEventListenerOptionsUnionType options);
void addEventListener(String type,MediaKeySession.AddEventListenerListenerUnionType listener);
Promise close();
boolean dispatchEvent(Event evt);
@JsOverlay
default Promise generateRequest(String initDataType,ArrayBuffer initData){
return generateRequest(initDataType,Js.<MediaKeySession.GenerateRequestInitDataUnionType>uncheckedCast(initData));
}
@JsOverlay
default Promise generateRequest(String initDataType,ArrayBufferView initData){
return generateRequest(initDataType,Js.<MediaKeySession.GenerateRequestInitDataUnionType>uncheckedCast(initData));
}
Promise generateRequest(String initDataType,MediaKeySession.GenerateRequestInitDataUnionType initData);
@JsProperty
Promise getClosed();
@JsProperty
double getExpiration();
@JsProperty
MediaKeyStatusMap getKeyStatuses();
@JsProperty
String getSessionId();
Promise<Boolean> load(String sessionId);
Promise remove();
void removeEventListener(String type,MediaKeySession.RemoveEventListenerListenerUnionType listener,EventTarget.RemoveEventListenerOptionsUnionType options);
void removeEventListener(String type,MediaKeySession.RemoveEventListenerListenerUnionType listener);
@JsOverlay
default Promise update(ArrayBuffer response){
return update(Js.<MediaKeySession.UpdateResponseUnionType>uncheckedCast(response));
}
@JsOverlay
default Promise update(ArrayBufferView response){
return update(Js.<MediaKeySession.UpdateResponseUnionType>uncheckedCast(response));
}
Promise update(MediaKeySession.UpdateResponseUnionType response);
}
