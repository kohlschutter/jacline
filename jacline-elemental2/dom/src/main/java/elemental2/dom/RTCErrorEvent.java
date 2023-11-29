package elemental2.dom;
import elemental2.dom.RTCError;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCErrorEvent extends Event{
public RTCError error;
public String message;
public RTCErrorEvent(){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
