package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.RTCRtpEncodingParameters;
import jsinterop.base.JsPropertyMap;
import elemental2.core.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MediaStream;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCRtpTransceiverInit{
@JsOverlay
static RTCRtpTransceiverInit create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
@Nullable String getDirection();
@JsProperty
@Nullable JsArray<RTCRtpEncodingParameters> getSendEncodings();
@JsProperty
@Nullable JsArray<MediaStream> getStreams();
@JsProperty
void setDirection(@Nullable String direction);
@JsProperty
void setSendEncodings(@Nullable JsArray<RTCRtpEncodingParameters> sendEncodings);
@JsOverlay
default void setSendEncodings(RTCRtpEncodingParameters@Nullable [] sendEncodings){
setSendEncodings(Js.<@Nullable JsArray<RTCRtpEncodingParameters>>uncheckedCast(sendEncodings));
}
@JsProperty
void setStreams(@Nullable JsArray<MediaStream> streams);
@JsOverlay
default void setStreams(MediaStream@Nullable [] streams){
setStreams(Js.<@Nullable JsArray<MediaStream>>uncheckedCast(streams));
}
}
