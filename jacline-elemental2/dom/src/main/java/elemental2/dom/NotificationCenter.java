package elemental2.dom;
import elemental2.dom.Notification;
import java.lang.Deprecated;
import elemental2.core.Function;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
@Deprecated
public class NotificationCenter{
public native double checkPermission();
public native Notification createHTMLNotification(String url);
public native Notification createNotification(String iconUrl,String title,String body);
public native void requestPermission();
public native void requestPermission(Function callback);
}
