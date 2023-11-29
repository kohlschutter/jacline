package elemental2.dom;
import elemental2.dom.RTCDataChannel;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class RTCDataChannelEvent extends Event{
public RTCDataChannel channel;
private RTCDataChannelEvent(){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
