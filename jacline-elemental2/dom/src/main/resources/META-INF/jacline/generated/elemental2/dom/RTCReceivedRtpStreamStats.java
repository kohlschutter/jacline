package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCRtpStreamStats;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCReceivedRtpStreamStats extends RTCRtpStreamStats{
@JsProperty
int getFramesDropped();
@JsProperty
double getJitter();
@JsProperty
double getPacketsLost();
@JsProperty
double getPacketsReceived();
}
