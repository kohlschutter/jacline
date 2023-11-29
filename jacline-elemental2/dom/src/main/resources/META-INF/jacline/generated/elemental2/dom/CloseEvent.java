package elemental2.dom;
import elemental2.dom.CloseEventInit;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CloseEvent extends Event{
public int code;
public String reason;
public boolean wasClean;
public CloseEvent(String type,CloseEventInit init){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public CloseEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
