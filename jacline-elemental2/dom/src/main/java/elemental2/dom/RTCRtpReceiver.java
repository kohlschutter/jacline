package elemental2.dom;
import elemental2.dom.MediaStreamTrack;
import elemental2.dom.RTCRtpContributingSource;
import elemental2.promise.Promise;
import elemental2.dom.RTCDtlsTransport;
import elemental2.dom.RTCStatsReport;
import elemental2.core.JsArray;
import elemental2.dom.RTCRtpCapabilities;
import elemental2.dom.RTCRtpReceiveParameters;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCRtpReceiver{
public static native RTCRtpCapabilities getCapabilities(String kind);
public double playoutDelayHint;
public MediaStreamTrack track;
public RTCDtlsTransport transport;
public native JsArray<RTCRtpContributingSource> getContributingSources();
public native RTCRtpReceiveParameters getParameters();
public native Promise<RTCStatsReport> getStats();
public native JsArray<RTCRtpContributingSource> getSynchronizationSources();
}
