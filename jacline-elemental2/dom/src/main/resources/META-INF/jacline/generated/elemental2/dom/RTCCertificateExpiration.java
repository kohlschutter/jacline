package elemental2.dom;
import java.lang.FunctionalInterface;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@FunctionalInterface
public interface RTCCertificateExpiration{
@JsProperty
double getExpires();
}
