package elemental2.dom;
import elemental2.dom.ClipboardEventInit;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.dom.DataTransfer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ClipboardEvent extends Event{
public DataTransfer clipboardData;
public ClipboardEvent(String type,ClipboardEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public ClipboardEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
