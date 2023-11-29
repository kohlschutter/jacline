package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpCodecParameters{
@JsOverlay
static RTCRtpCodecParameters create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getChannels();
@JsProperty
double getClockRate();
@JsProperty
double getCname();
@JsProperty
String getMimeType();
@JsProperty
String getSdpFmtpLine();
@JsProperty
void setChannels(double channels);
@JsProperty
void setClockRate(double clockRate);
@JsProperty
void setCname(double cname);
@JsProperty
void setMimeType(String mimeType);
@JsProperty
void setSdpFmtpLine(String sdpFmtpLine);
}
