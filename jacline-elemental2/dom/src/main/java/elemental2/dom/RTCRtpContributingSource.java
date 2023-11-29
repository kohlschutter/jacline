package elemental2.dom;
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
static RTCRtpContributingSource.GetTimestampUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default JsDate asJsDate(){
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
double getRtpTimestamp();
@JsProperty
double getSenderCaptureTimeOffset();
@JsProperty
double getSource();
@JsProperty
RTCRtpContributingSource.GetTimestampUnionType getTimestamp();
@JsProperty
void setAudioLevel(double audioLevel);
@JsProperty
void setCaptureTimestamp(double captureTimestamp);
@JsProperty
void setRtpTimestamp(double rtpTimestamp);
@JsProperty
void setSenderCaptureTimeOffset(double senderCaptureTimeOffset);
@JsProperty
void setSource(double source);
@JsProperty
void setTimestamp(RTCRtpContributingSource.GetTimestampUnionType timestamp);
@JsOverlay
default void setTimestamp(JsDate timestamp){
setTimestamp(Js.<RTCRtpContributingSource.GetTimestampUnionType>uncheckedCast(timestamp));
}
@JsOverlay
default void setTimestamp(double timestamp){
setTimestamp(Js.<RTCRtpContributingSource.GetTimestampUnionType>uncheckedCast(timestamp));
}
}
