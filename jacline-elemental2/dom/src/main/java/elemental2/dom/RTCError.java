package elemental2.dom;
import jsinterop.annotations.JsProperty;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCError{
@JsProperty
String getErrorDetail();
@JsProperty
int getHttpRequestStatusCode();
@JsProperty
int getReceivedAlert();
@JsProperty
int getSctpCauseCode();
@JsProperty
int getSdpLineNumber();
@JsProperty
int getSentAlert();
}
