package elemental2.dom;
import elemental2.dom.Notification;
import elemental2.dom.ExtendableEventInit;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ExtendableEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class NotificationEvent extends ExtendableEvent{
public String action;
public Notification notification;
public NotificationEvent(String type,ExtendableEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(ExtendableEventInit)null);
}
public NotificationEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(ExtendableEventInit)null);
}
}
