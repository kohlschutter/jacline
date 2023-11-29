package elemental2.dom;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.RTCDtlsTransport;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCSctpTransport extends EventTarget{
@JsFunction
public interface OnstatechangeFn{
Object onInvoke(Event p0);
}
@JsProperty
double getMaxChannels();
@JsProperty
double getMaxMessageSize();
@JsProperty
RTCSctpTransport.OnstatechangeFn getOnstatechange();
@JsProperty
String getState();
@JsProperty
RTCDtlsTransport getTransport();
@JsProperty
void setOnstatechange(RTCSctpTransport.OnstatechangeFn onstatechange);
}
