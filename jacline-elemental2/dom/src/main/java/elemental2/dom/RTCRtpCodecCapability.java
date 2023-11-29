package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpCodecCapability{
@JsOverlay
static RTCRtpCodecCapability create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
int getChannels();
@JsProperty
int getClockRate();
@JsProperty
String getMimeType();
@JsProperty
String getSdpFmtpLine();
@JsProperty
void setChannels(int channels);
@JsProperty
void setClockRate(int clockRate);
@JsProperty
void setMimeType(String mimeType);
@JsProperty
void setSdpFmtpLine(String sdpFmtpLine);
}
