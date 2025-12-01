package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.RTCSentRtpStreamStats;
import java.lang.Double;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsDate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRemoteOutboundRtpStreamStats extends RTCSentRtpStreamStats{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface GetRemoteTimestampUnionType{
@JsOverlay
static RTCRemoteOutboundRtpStreamStats.@Nullable GetRemoteTimestampUnionType of(@Nullable Object o){
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
String getLocalId();
@JsProperty
RTCRemoteOutboundRtpStreamStats.@Nullable GetRemoteTimestampUnionType getRemoteTimestamp();
@JsProperty
double getReportsSent();
@JsProperty
double getRoundTripTime();
@JsProperty
double getRoundTripTimeMeasurements();
@JsProperty
double getTotalRoundTripTime();
}
