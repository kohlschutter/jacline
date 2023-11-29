package elemental2.dom;
import jsinterop.annotations.JsProperty;
import elemental2.dom.RTCStats;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCCertificateStats extends RTCStats{
@JsProperty
String getBase64Certificate();
@JsProperty
String getFingerprint();
@JsProperty
String getFingerprintAlgorithm();
@JsProperty
String getIssuerCertificateId();
}
