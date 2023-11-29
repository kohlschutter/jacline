package elemental2.dom;
import elemental2.dom.ExtendableEventInit;
import elemental2.dom.PushMessageData;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ExtendableEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PushEvent extends ExtendableEvent{
public PushMessageData data;
public PushEvent(String type,ExtendableEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(ExtendableEventInit)null);
}
public PushEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(ExtendableEventInit)null);
}
}
