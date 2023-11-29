package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCStats;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCIceCandidateStats extends RTCStats{
@JsProperty
String getAddress();
@JsProperty
String getCandidateType();
@JsProperty
String getNetworkType();
@JsProperty
double getPort();
@JsProperty
double getPriority();
@JsProperty
String getProtocol();
@JsProperty
String getRelayProtocol();
@JsProperty
String getTransportId();
@JsProperty
String getUrl();
}
