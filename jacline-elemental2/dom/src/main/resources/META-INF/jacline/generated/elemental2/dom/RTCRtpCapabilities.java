package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCRtpHeaderExtensionCapability;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.RTCRtpCodecCapability;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpCapabilities{
@JsOverlay
static RTCRtpCapabilities create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
JsArray<RTCRtpCodecCapability> getCodecs();
@JsProperty
JsArray<RTCRtpHeaderExtensionCapability> getHeaderExtensions();
@JsProperty
void setCodecs(JsArray<RTCRtpCodecCapability> codecs);
@JsOverlay
default void setCodecs(RTCRtpCodecCapability[] codecs){
setCodecs(Js.<JsArray<RTCRtpCodecCapability>>uncheckedCast(codecs));
}
@JsProperty
void setHeaderExtensions(JsArray<RTCRtpHeaderExtensionCapability> headerExtensions);
@JsOverlay
default void setHeaderExtensions(RTCRtpHeaderExtensionCapability[] headerExtensions){
setHeaderExtensions(Js.<JsArray<RTCRtpHeaderExtensionCapability>>uncheckedCast(headerExtensions));
}
}
