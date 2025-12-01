package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import elemental2.dom.RTCIceCandidateInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCIceCandidate{
public @Nullable String address;
public String candidate;
public @Nullable String component;
public @Nullable String foundation;
public @Nullable Double port;
public @Nullable Double priority;
public @Nullable String protocol;
public @Nullable String relatedAddress;
public @Nullable Double relatedPort;
public int sdpMLineIndex;
public @Nullable String sdpMid;
public @Nullable String tcpType;
public @Nullable String type;
public @Nullable String usernameFragment;
public RTCIceCandidate(){}
public RTCIceCandidate(RTCIceCandidateInit candidateInitDict){}
}
