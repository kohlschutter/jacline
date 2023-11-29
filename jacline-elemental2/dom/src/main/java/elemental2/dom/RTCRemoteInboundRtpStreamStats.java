package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.RTCReceivedRtpStreamStats;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRemoteInboundRtpStreamStats extends RTCReceivedRtpStreamStats{
@JsProperty
double getFractionLost();
@JsProperty
String getLocalId();
@JsProperty
double getRoundTripMeasurements();
@JsProperty
double getRoundTripTime();
@JsProperty
double getTotalRoundTripTime();
}
