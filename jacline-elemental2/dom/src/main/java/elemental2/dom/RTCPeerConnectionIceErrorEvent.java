package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Double;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCPeerConnectionIceErrorEvent extends Event{
public @Nullable String address;
public double errorCode;
public String errorText;
public @Nullable Double port;
public String url;
public RTCPeerConnectionIceErrorEvent(String type,JsObject eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public RTCPeerConnectionIceErrorEvent(String type,Object eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
}
