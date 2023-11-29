package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCStats;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpStreamStats extends RTCStats{
@JsProperty
String getCodecId();
@JsProperty
String getKind();
@JsProperty
String getMediaType();
@JsProperty
int getSsrc();
@JsProperty
String getTransportId();
}
