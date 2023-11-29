package elemental2.dom;
import java.lang.Void;
import elemental2.dom.MediaStreamTrack;
import elemental2.promise.Promise;
import elemental2.dom.RTCDtlsTransport;
import elemental2.dom.RTCStatsReport;
import elemental2.dom.RTCDTMFSender;
import elemental2.dom.RTCRtpSendParameters;
import elemental2.dom.RTCRtpCapabilities;
import elemental2.dom.MediaStream;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCRtpSender{
public static native RTCRtpCapabilities getCapabilities(String kind);
public RTCDTMFSender dtmf;
public MediaStreamTrack track;
public RTCDtlsTransport transport;
public native RTCRtpSendParameters getParameters();
public native Promise<RTCStatsReport> getStats();
public native Promise<Void> replaceTrack(MediaStreamTrack track);
public native Promise<Void> setParameters(RTCRtpSendParameters params);
public native void setStreams(MediaStream... streams);
}
