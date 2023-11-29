package elemental2.dom;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.RTCIceCandidate;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCIceCandidatePair{
public RTCIceCandidate local;
public RTCIceCandidate remote;
}
