package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCRtpStreamStats;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCSentRtpStreamStats extends RTCRtpStreamStats{
@JsProperty
int getBytesSent();
@JsProperty
double getPacketsDiscardedOnSend();
@JsProperty
int getPacketsSent();
}
