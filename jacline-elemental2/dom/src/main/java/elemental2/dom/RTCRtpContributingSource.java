package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import java.lang.Double;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsDate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpContributingSource{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetTimestampUnionType{
@JsOverlay
static RTCRtpContributingSource.@Nullable GetTimestampUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default @Nullable JsDate asJsDate(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
@JsOverlay
default boolean isJsDate(){
return (Object)this instanceof JsDate;
}
}
@JsProperty
double getAudioLevel();
@JsProperty
double getCaptureTimestamp();
@JsProperty
@Nullable Double getRtpTimestamp();
@JsProperty
double getSenderCaptureTimeOffset();
@JsProperty
@Nullable Double getSource();
@JsProperty
RTCRtpContributingSource.@Nullable GetTimestampUnionType getTimestamp();
@JsProperty
void setAudioLevel(double audioLevel);
@JsProperty
void setCaptureTimestamp(double captureTimestamp);
@JsProperty
void setRtpTimestamp(@Nullable Double rtpTimestamp);
@JsProperty
void setSenderCaptureTimeOffset(double senderCaptureTimeOffset);
@JsProperty
void setSource(@Nullable Double source);
@JsProperty
void setTimestamp(RTCRtpContributingSource.@Nullable GetTimestampUnionType timestamp);
@JsOverlay
default void setTimestamp(JsDate timestamp){
setTimestamp(Js.<RTCRtpContributingSource.@Nullable GetTimestampUnionType>uncheckedCast(timestamp));
}
@JsOverlay
default void setTimestamp(double timestamp){
setTimestamp(Js.<RTCRtpContributingSource.@Nullable GetTimestampUnionType>uncheckedCast(timestamp));
}
}
