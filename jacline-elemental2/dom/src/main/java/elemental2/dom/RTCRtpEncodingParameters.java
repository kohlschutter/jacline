package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpEncodingParameters{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetRidUnionType{
@JsOverlay
static RTCRtpEncodingParameters.@Nullable GetRidUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default @Nullable String asString(){
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
@Nullable Boolean getActive();
@JsProperty
@Nullable Boolean getAdaptivePtime();
@JsProperty
@Nullable Double getCodecPayloadType();
@JsProperty
@Nullable String getDtx();
@JsProperty
@Nullable Double getMaxBitrate();
@JsProperty
@Nullable Double getMaxFramerate();
@JsProperty
@Nullable String getNetworkPriority();
@JsProperty
@Nullable String getPriority();
@JsProperty
@Nullable Double getPtime();
@JsProperty
RTCRtpEncodingParameters.@Nullable GetRidUnionType getRid();
@JsProperty
@Nullable Double getScaleResolutionDownBy();
@JsProperty
void setActive(@Nullable Boolean active);
@JsProperty
void setAdaptivePtime(@Nullable Boolean adaptivePtime);
@JsProperty
void setCodecPayloadType(@Nullable Double codecPayloadType);
@JsProperty
void setDtx(@Nullable String dtx);
@JsProperty
void setMaxBitrate(@Nullable Double maxBitrate);
@JsProperty
void setMaxFramerate(@Nullable Double maxFramerate);
@JsProperty
void setNetworkPriority(@Nullable String networkPriority);
@JsProperty
void setPriority(@Nullable String priority);
@JsProperty
void setPtime(@Nullable Double ptime);
@JsProperty
void setRid(RTCRtpEncodingParameters.@Nullable GetRidUnionType rid);
@JsOverlay
default void setRid(String rid){
setRid(Js.<RTCRtpEncodingParameters.@Nullable GetRidUnionType>uncheckedCast(rid));
}
@JsOverlay
default void setRid(double rid){
setRid(Js.<RTCRtpEncodingParameters.@Nullable GetRidUnionType>uncheckedCast(rid));
}
@JsProperty
void setScaleResolutionDownBy(@Nullable Double scaleResolutionDownBy);
}
