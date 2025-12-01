package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.EventListener;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Event;
import jsinterop.annotations.JsOverlay;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.EventTarget;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ApplicationCache implements EventTarget{
@JsFunction
public interface OncachedFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OncheckingFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OndownloadingFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnnoupdateFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnprogressFn{
void onInvoke(Event p0);
}
@JsFunction
public interface OnupdatereadyFn{
void onInvoke(Event p0);
}
@JsOverlay
public static final int CHECKING=ApplicationCache__Constants.CHECKING;
@JsOverlay
public static final int DOWNLOADING=ApplicationCache__Constants.DOWNLOADING;
@JsOverlay
public static final int IDLE=ApplicationCache__Constants.IDLE;
@JsOverlay
public static final int OBSOLETE=ApplicationCache__Constants.OBSOLETE;
@JsOverlay
public static final int UNCACHED=ApplicationCache__Constants.UNCACHED;
@JsOverlay
public static final int UPDATEREADY=ApplicationCache__Constants.UPDATEREADY;
public ApplicationCache.@Nullable OncachedFn oncached;
public ApplicationCache.@Nullable OncheckingFn onchecking;
public ApplicationCache.@Nullable OndownloadingFn ondownloading;
public ApplicationCache.@Nullable OnerrorFn onerror;
public ApplicationCache.@Nullable OnnoupdateFn onnoupdate;
public ApplicationCache.@Nullable OnprogressFn onprogress;
public ApplicationCache.@Nullable OnupdatereadyFn onupdateready;
public int status;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void swapCache();
public native void update();
}
