package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Deprecated;
import elemental2.dom.Event;
import elemental2.dom.NotificationOptions;
import elemental2.promise.Promise;
import elemental2.dom.NotificationPermissionCallback;
import elemental2.dom.EventTarget;
import elemental2.dom.EventListener;
import jsinterop.annotations.JsFunction;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Notification implements EventTarget{
@JsFunction
public interface OnclickFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncloseFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OndisplayFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnerrorFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnshowFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
public static String permission;
public static native Promise<String> requestPermission();
public static native Promise<String> requestPermission(NotificationPermissionCallback callback);
public String body;
public @Nullable Object data;
@Deprecated
public String dir;
public String icon;
public Notification.@Nullable OnclickFn onclick;
public Notification.@Nullable OncloseFn onclose;
@Deprecated
public Notification.@Nullable OndisplayFn ondisplay;
public Notification.@Nullable OnerrorFn onerror;
public Notification.@Nullable OnshowFn onshow;
@Deprecated
public String replaceId;
public String tag;
public String title;
public Notification(String title,NotificationOptions options){}
public Notification(String title){}
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void cancel();
public native void close();
public native boolean dispatchEvent(Event evt);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void show();
}
