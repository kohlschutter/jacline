package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCStats;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCCodecStats extends RTCStats{
@JsProperty
double getChannels();
@JsProperty
double getClockRate();
@JsProperty
String getMimeType();
@JsProperty
double getPayloadType();
@JsProperty
String getSdpFmtpLine();
@JsProperty
String getTransportId();
}
