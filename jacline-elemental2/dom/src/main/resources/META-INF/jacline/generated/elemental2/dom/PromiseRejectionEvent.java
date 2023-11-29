package elemental2.dom;
import elemental2.dom.PromiseRejectionEventInit;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.dom.EventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PromiseRejectionEvent extends Event{
public Promise<Object> promise;
public Object reason;
public PromiseRejectionEvent(String type,PromiseRejectionEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
public PromiseRejectionEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(EventInit)null);
}
}
