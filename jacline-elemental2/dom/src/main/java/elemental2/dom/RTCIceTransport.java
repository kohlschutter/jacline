package elemental2.dom;
import elemental2.dom.RTCIceParameters;
import elemental2.dom.Event;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsFunction;
import elemental2.dom.RTCIceCandidatePair;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.RTCIceCandidate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface RTCIceTransport extends EventTarget{
@JsFunction
public interface OngatheringstatechangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnselectedcandidatepairchangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnstatechangeFn{
Object onInvoke(Event p0);
}
@JsProperty
String getComponent();
@JsProperty
String getGatheringState();
JsArray<RTCIceCandidate> getLocalCandidates();
RTCIceParameters getLocalParameters();
@JsProperty
RTCIceTransport.OngatheringstatechangeFn getOngatheringstatechange();
@JsProperty
RTCIceTransport.OnselectedcandidatepairchangeFn getOnselectedcandidatepairchange();
@JsProperty
RTCIceTransport.OnstatechangeFn getOnstatechange();
JsArray<RTCIceCandidate> getRemoteCandidates();
RTCIceParameters getRemoteParameters();
@JsProperty
String getRole();
RTCIceCandidatePair getSelectedCandidatePair();
@JsProperty
String getState();
@JsProperty
void setOngatheringstatechange(RTCIceTransport.OngatheringstatechangeFn ongatheringstatechange);
@JsProperty
void setOnselectedcandidatepairchange(RTCIceTransport.OnselectedcandidatepairchangeFn onselectedcandidatepairchange);
@JsProperty
void setOnstatechange(RTCIceTransport.OnstatechangeFn onstatechange);
}
