package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpEncodingParameters{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetRidUnionType{
@JsOverlay
static RTCRtpEncodingParameters.GetRidUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsOverlay
static RTCRtpEncodingParameters create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getCodecPayloadType();
@JsProperty
String getDtx();
@JsProperty
double getMaxBitrate();
@JsProperty
double getMaxFramerate();
@JsProperty
String getNetworkPriority();
@JsProperty
String getPriority();
@JsProperty
double getPtime();
@JsProperty
RTCRtpEncodingParameters.GetRidUnionType getRid();
@JsProperty
double getScaleResolutionDownBy();
@JsProperty
boolean isActive();
@JsProperty
boolean isAdaptivePtime();
@JsProperty
void setActive(boolean active);
@JsProperty
void setAdaptivePtime(boolean adaptivePtime);
@JsProperty
void setCodecPayloadType(double codecPayloadType);
@JsProperty
void setDtx(String dtx);
@JsProperty
void setMaxBitrate(double maxBitrate);
@JsProperty
void setMaxFramerate(double maxFramerate);
@JsProperty
void setNetworkPriority(String networkPriority);
@JsProperty
void setPriority(String priority);
@JsProperty
void setPtime(double ptime);
@JsProperty
void setRid(RTCRtpEncodingParameters.GetRidUnionType rid);
@JsOverlay
default void setRid(String rid){
setRid(Js.<RTCRtpEncodingParameters.GetRidUnionType>uncheckedCast(rid));
}
@JsOverlay
default void setRid(double rid){
setRid(Js.<RTCRtpEncodingParameters.GetRidUnionType>uncheckedCast(rid));
}
@JsProperty
void setScaleResolutionDownBy(double scaleResolutionDownBy);
}
