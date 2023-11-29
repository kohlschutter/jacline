package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCStats;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCIceCandidatePairStats extends RTCStats{
@JsProperty
double getAvailableIncomingBitrate();
@JsProperty
double getAvailableOutgoingBitrate();
@JsProperty
double getBytesDiscardedOnSend();
@JsProperty
double getBytesReceived();
@JsProperty
double getBytesSent();
@JsProperty
double getConsentRequestsSent();
@JsProperty
double getCurrentRoundTripTime();
@JsProperty
double getLastPacketReceivedTimestamp();
@JsProperty
String getLocalCandidateId();
@JsProperty
double getPacketsDiscardedOnSend();
@JsProperty
double getPacketsReceived();
@JsProperty
double getPacketsSent();
@JsProperty
String getRemoteCandidateId();
@JsProperty
double getRequestsReceived();
@JsProperty
double getRequestsSent();
@JsProperty
double getResponsesReceived();
@JsProperty
double getResponsesSent();
@JsProperty
String getState();
@JsProperty
double getTotalRoundTripTime();
@JsProperty
String getTransportId();
@JsProperty
boolean isNominated();
}
