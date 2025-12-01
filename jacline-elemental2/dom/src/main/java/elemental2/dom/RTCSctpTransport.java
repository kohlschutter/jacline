package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import elemental2.dom.Event;
import elemental2.dom.RTCDtlsTransport;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCSctpTransport extends EventTarget{
@JsFunction
public interface OnstatechangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsProperty
@Nullable Double getMaxChannels();
@JsProperty
double getMaxMessageSize();
@JsProperty
RTCSctpTransport.@Nullable OnstatechangeFn getOnstatechange();
@JsProperty
String getState();
@JsProperty
RTCDtlsTransport getTransport();
@JsProperty
void setOnstatechange(RTCSctpTransport.@Nullable OnstatechangeFn onstatechange);
}
