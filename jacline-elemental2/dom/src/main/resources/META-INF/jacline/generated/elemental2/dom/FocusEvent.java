package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UIEventInit;
import elemental2.dom.FocusEventInit;
import elemental2.dom.UIEvent;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FocusEvent extends UIEvent{
public EventTarget relatedTarget;
public FocusEvent(String type,FocusEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(UIEventInit)null);
}
public FocusEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(UIEventInit)null);
}
}
