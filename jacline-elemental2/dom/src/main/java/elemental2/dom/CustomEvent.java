package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventInit;
import elemental2.dom.CustomEventInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class CustomEvent<T extends @Nullable Object> extends Event{
public T detail;
public CustomEvent(String type,@Nullable CustomEventInit<T> eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public CustomEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(@Nullable EventInit)null);
}
public native void initCustomEvent(String eventType,boolean bubbles,boolean cancelable,T detail);
}
