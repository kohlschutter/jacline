package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class IceCandidate{
public String label;
public IceCandidate(String label,String sdp){}
public native String toSdp();
}
