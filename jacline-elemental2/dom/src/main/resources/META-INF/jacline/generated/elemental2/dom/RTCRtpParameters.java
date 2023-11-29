package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCRtpCodecParameters;
import elemental2.dom.RTCRtcpParameters;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.RTCRtpHeaderExtensionParameters;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpParameters{
@JsOverlay
static RTCRtpParameters create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<RTCRtpCodecParameters> getCodecs();
@JsProperty
JsArray<RTCRtpHeaderExtensionParameters> getHeaderExtensions();
@JsProperty
RTCRtcpParameters getRtcp();
@JsProperty
void setCodecs(JsArray<RTCRtpCodecParameters> codecs);
@JsOverlay
default void setCodecs(RTCRtpCodecParameters[] codecs){
setCodecs(Js.<JsArray<RTCRtpCodecParameters>>uncheckedCast(codecs));
}
@JsProperty
void setHeaderExtensions(JsArray<RTCRtpHeaderExtensionParameters> headerExtensions);
@JsOverlay
default void setHeaderExtensions(RTCRtpHeaderExtensionParameters[] headerExtensions){
setHeaderExtensions(Js.<JsArray<RTCRtpHeaderExtensionParameters>>uncheckedCast(headerExtensions));
}
@JsProperty
void setRtcp(RTCRtcpParameters rtcp);
}
