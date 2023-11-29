package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.RTCRtpEncodingParameters;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MediaStream;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpTransceiverInit{
@JsOverlay
static RTCRtpTransceiverInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
String getDirection();
@JsProperty
JsArray<RTCRtpEncodingParameters> getSendEncodings();
@JsProperty
JsArray<MediaStream> getStreams();
@JsProperty
void setDirection(String direction);
@JsProperty
void setSendEncodings(JsArray<RTCRtpEncodingParameters> sendEncodings);
@JsOverlay
default void setSendEncodings(RTCRtpEncodingParameters[] sendEncodings){
setSendEncodings(Js.<JsArray<RTCRtpEncodingParameters>>uncheckedCast(sendEncodings));
}
@JsProperty
void setStreams(JsArray<MediaStream> streams);
@JsOverlay
default void setStreams(MediaStream[] streams){
setStreams(Js.<JsArray<MediaStream>>uncheckedCast(streams));
}
}
