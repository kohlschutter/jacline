package elemental2.dom;
import elemental2.dom.RTCRtpReceiver;
import elemental2.dom.MediaStreamTrack;
import elemental2.dom.MediaStream;
import java.lang.Object;
import elemental2.dom.RTCRtpTransceiver;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCTrackEvent{
public RTCRtpReceiver receiver;
public JsArray<MediaStream> streams;
public MediaStreamTrack track;
public RTCRtpTransceiver transceiver;
public RTCTrackEvent(String type,JsObject eventInitDict){}
public RTCTrackEvent(String type,Object eventInitDict){}
}
