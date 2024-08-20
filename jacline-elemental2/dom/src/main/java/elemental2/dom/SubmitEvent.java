package elemental2.dom;
import elemental2.dom.HTMLElement;
import elemental2.dom.Event;
import elemental2.dom.SubmitEventInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class SubmitEvent extends Event{
public HTMLElement submitter;
public SubmitEvent(String type,SubmitEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public SubmitEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
