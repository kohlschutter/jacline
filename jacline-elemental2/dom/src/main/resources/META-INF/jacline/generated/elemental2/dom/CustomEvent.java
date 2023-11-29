package elemental2.dom;
import elemental2.dom.Event;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.dom.CustomEventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CustomEvent<T> extends Event{
public T detail;
public CustomEvent(String type,CustomEventInit<T> eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public CustomEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public native void initCustomEvent(String eventType,boolean bubbles,boolean cancelable,T detail);
}
