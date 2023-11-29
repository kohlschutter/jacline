package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.RTCRtpEncodingParameters;
import elemental2.dom.RTCRtpParameters;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpSendParameters extends RTCRtpParameters{
@JsOverlay
static RTCRtpSendParameters create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getDegradationPreference();
@JsProperty
JsArray<RTCRtpEncodingParameters> getEncodings();
@JsProperty
String getTransactionId();
@JsProperty
void setDegradationPreference(String degradationPreference);
@JsProperty
void setEncodings(JsArray<RTCRtpEncodingParameters> encodings);
@JsOverlay
default void setEncodings(RTCRtpEncodingParameters[] encodings){
setEncodings(Js.<JsArray<RTCRtpEncodingParameters>>uncheckedCast(encodings));
}
@JsProperty
void setTransactionId(String transactionId);
}
