package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.EventListener;
import jsinterop.annotations.JsFunction;
import java.lang.Deprecated;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class PermissionStatus implements EventTarget{
@JsFunction
public interface OnchangeFn{
@Nullable Object onInvoke(Event p0);
}
public PermissionStatus.@Nullable OnchangeFn onchange;
public String state;
@Deprecated
public String status;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
}
