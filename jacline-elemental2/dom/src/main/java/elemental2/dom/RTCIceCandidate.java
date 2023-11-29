package elemental2.dom;
import elemental2.dom.RTCIceCandidateInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCIceCandidate{
public String address;
public String candidate;
public String component;
public String foundation;
public double port;
public double priority;
public String protocol;
public String relatedAddress;
public double relatedPort;
public int sdpMLineIndex;
public String sdpMid;
public String tcpType;
public String type;
public String usernameFragment;
public RTCIceCandidate(){}
public RTCIceCandidate(RTCIceCandidateInit candidateInitDict){}
}
