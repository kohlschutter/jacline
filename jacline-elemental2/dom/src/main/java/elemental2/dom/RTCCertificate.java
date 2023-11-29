package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCDtlsFingerprint;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCCertificate{
@JsProperty
double getExpires();
JsArray<RTCDtlsFingerprint> getFingerprints();
}
