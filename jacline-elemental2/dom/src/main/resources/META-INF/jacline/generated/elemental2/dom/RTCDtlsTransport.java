package elemental2.dom;
import elemental2.dom.RTCErrorEvent;
import elemental2.dom.Event;
import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsFunction;
import elemental2.dom.RTCIceTransport;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCDtlsTransport extends EventTarget{
@JsFunction
public interface OnerrorFn{
Object onInvoke(RTCErrorEvent p0);
}
@JsFunction
public interface OnstatechangeFn{
Object onInvoke(Event p0);
}
@JsProperty
RTCIceTransport getIceTransport();
@JsProperty
RTCDtlsTransport.OnerrorFn getOnerror();
@JsProperty
RTCDtlsTransport.OnstatechangeFn getOnstatechange();
JsArray<ArrayBuffer> getRemoteCertificates();
@JsProperty
String getState();
@JsProperty
void setOnerror(RTCDtlsTransport.OnerrorFn onerror);
@JsProperty
void setOnstatechange(RTCDtlsTransport.OnstatechangeFn onstatechange);
}
