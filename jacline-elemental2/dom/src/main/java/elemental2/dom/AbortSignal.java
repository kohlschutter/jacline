package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.EventListener;
import elemental2.core.JsIterable;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Event;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class AbortSignal implements EventTarget{
@JsFunction
public interface OnabortFn{
@Nullable Object onInvoke(Event p0);
}
public static native AbortSignal abort();
public static native AbortSignal abort(@Nullable Object reason);
public static native AbortSignal any(JsIterable signals);
public static native AbortSignal timeout(double milliseconds);
public boolean aborted;
public AbortSignal.@Nullable OnabortFn onabort;
public @Nullable Object reason;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void throwIfAborted();
}
