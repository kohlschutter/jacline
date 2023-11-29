package elemental2.dom;
import elemental2.dom.RTCSessionDescriptionInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCSessionDescription{
public String sdp;
public String type;
public RTCSessionDescription(){}
public RTCSessionDescription(RTCSessionDescriptionInit descriptionInitDict){}
}
