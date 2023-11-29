package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCDataChannelInitDictionary_{
@JsOverlay
static RTCDataChannelInitDictionary_ create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getId();
@JsProperty
double getMaxPacketLifeTime();
@JsProperty
double getMaxRetransmits();
@JsProperty
String getPriority();
@JsProperty
String getProtocol();
@JsProperty
boolean isNegotiated();
@JsProperty
boolean isOrdered();
@JsProperty
void setId(double id);
@JsProperty
void setMaxPacketLifeTime(double maxPacketLifeTime);
@JsProperty
void setMaxRetransmits(double maxRetransmits);
@JsProperty
void setNegotiated(boolean negotiated);
@JsProperty
void setOrdered(boolean ordered);
@JsProperty
void setPriority(String priority);
@JsProperty
void setProtocol(String protocol);
}
