package elemental2.dom;
import org.jspecify.annotations.Nullable;
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
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnselectedcandidatepairchangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnstatechangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsProperty
String getComponent();
@JsProperty
String getGatheringState();
JsArray<RTCIceCandidate> getLocalCandidates();
@Nullable RTCIceParameters getLocalParameters();
@JsProperty
RTCIceTransport.@Nullable OngatheringstatechangeFn getOngatheringstatechange();
@JsProperty
RTCIceTransport.@Nullable OnselectedcandidatepairchangeFn getOnselectedcandidatepairchange();
@JsProperty
RTCIceTransport.@Nullable OnstatechangeFn getOnstatechange();
JsArray<RTCIceCandidate> getRemoteCandidates();
@Nullable RTCIceParameters getRemoteParameters();
@JsProperty
String getRole();
@Nullable RTCIceCandidatePair getSelectedCandidatePair();
@JsProperty
String getState();
@JsProperty
void setOngatheringstatechange(RTCIceTransport.@Nullable OngatheringstatechangeFn ongatheringstatechange);
@JsProperty
void setOnselectedcandidatepairchange(RTCIceTransport.@Nullable OnselectedcandidatepairchangeFn onselectedcandidatepairchange);
@JsProperty
void setOnstatechange(RTCIceTransport.@Nullable OnstatechangeFn onstatechange);
}
