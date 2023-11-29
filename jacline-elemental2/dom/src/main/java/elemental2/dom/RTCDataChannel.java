package elemental2.dom;
import elemental2.dom.RTCErrorEvent;
import elemental2.dom.Event;
import elemental2.dom.Blob;
import elemental2.core.ArrayBuffer;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
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
public interface RTCDataChannel extends EventTarget{
@JsFunction
public interface OnbufferedamountlowFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OncloseFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnclosingFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
Object onInvoke(RTCErrorEvent p0);
}
@JsFunction
public interface OnmessageFn{
Object onInvoke(MessageEvent<Object> p0);
}
@JsFunction
public interface OnopenFn{
Object onInvoke(Event p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SendDataUnionType{
@JsOverlay
static RTCDataChannel.SendDataUnionType of(Object o){
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
Object close();
@JsProperty
String getBinaryType();
@JsProperty
int getBufferedAmount();
@JsProperty
double getBufferedAmountLowThreshold();
@JsProperty
double getId();
@JsProperty
String getLabel();
@JsProperty
double getMaxPacketLifeTime();
@JsProperty
double getMaxRetransmits();
@JsProperty
RTCDataChannel.OnbufferedamountlowFn getOnbufferedamountlow();
@JsProperty
RTCDataChannel.OncloseFn getOnclose();
@JsProperty
RTCDataChannel.OnclosingFn getOnclosing();
@JsProperty
RTCDataChannel.OnerrorFn getOnerror();
@JsProperty
RTCDataChannel.OnmessageFn getOnmessage();
@JsProperty
RTCDataChannel.OnopenFn getOnopen();
@JsProperty
String getProtocol();
@JsProperty
String getReadyState();
@JsProperty
boolean isNegotiated();
@JsProperty
boolean isOrdered();
@JsProperty
boolean isReliable();
@JsOverlay
default void send(ArrayBuffer data){
send(Js.<RTCDataChannel.SendDataUnionType>uncheckedCast(data));
}
@JsOverlay
default void send(ArrayBufferView data){
send(Js.<RTCDataChannel.SendDataUnionType>uncheckedCast(data));
}
@JsOverlay
default void send(Blob data){
send(Js.<RTCDataChannel.SendDataUnionType>uncheckedCast(data));
}
void send(RTCDataChannel.SendDataUnionType data);
@JsOverlay
default void send(String data){
send(Js.<RTCDataChannel.SendDataUnionType>uncheckedCast(data));
}
@JsProperty
void setBinaryType(String binaryType);
@JsProperty
void setBufferedAmountLowThreshold(double bufferedAmountLowThreshold);
@JsProperty
void setOnbufferedamountlow(RTCDataChannel.OnbufferedamountlowFn onbufferedamountlow);
@JsProperty
void setOnclose(RTCDataChannel.OncloseFn onclose);
@JsProperty
void setOnclosing(RTCDataChannel.OnclosingFn onclosing);
@JsProperty
void setOnerror(RTCDataChannel.OnerrorFn onerror);
@JsProperty
void setOnmessage(RTCDataChannel.OnmessageFn onmessage);
@JsProperty
void setOnopen(RTCDataChannel.OnopenFn onopen);
@JsProperty
void setReadyState(String readyState);
}
