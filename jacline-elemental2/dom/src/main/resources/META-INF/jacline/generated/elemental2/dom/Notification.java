package elemental2.dom;
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
Object onInvoke(Event p0);
}
@JsFunction
public interface OncloseFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OndisplayFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnshowFn{
Object onInvoke(Event p0);
}
public static String permission;
public static native Promise<String> requestPermission();
public static native Promise<String> requestPermission(NotificationPermissionCallback callback);
public String body;
public Object data;
@Deprecated
public String dir;
public String icon;
public Notification.OnclickFn onclick;
public Notification.OncloseFn onclose;
@Deprecated
public Notification.OndisplayFn ondisplay;
public Notification.OnerrorFn onerror;
public Notification.OnshowFn onshow;
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
