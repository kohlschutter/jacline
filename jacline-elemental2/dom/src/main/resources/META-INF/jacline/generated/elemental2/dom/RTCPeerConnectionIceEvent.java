package elemental2.dom;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.RTCIceCandidate;
import elemental2.dom.EventInit;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCPeerConnectionIceEvent extends Event{
public RTCIceCandidate candidate;
public String url;
public RTCPeerConnectionIceEvent(String type,JsObject eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public RTCPeerConnectionIceEvent(String type,Object eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
