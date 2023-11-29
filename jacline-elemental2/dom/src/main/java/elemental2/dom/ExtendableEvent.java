package elemental2.dom;
import elemental2.promise.IThenable;
import elemental2.dom.ExtendableEventInit;
import elemental2.dom.Event;
import elemental2.dom.ServiceWorker;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ExtendableEvent extends Event{
public ServiceWorker activeWorker;
public ExtendableEvent(String type,ExtendableEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public ExtendableEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public native void waitUntil(IThenable f);
}
