package elemental2.dom;
import java.lang.Void;
import elemental2.dom.PushManager;
import elemental2.dom.Event;
import elemental2.dom.NotificationOptions;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import elemental2.dom.Notification;
import elemental2.dom.NavigationPreloadManager;
import jsinterop.annotations.JsFunction;
import java.lang.Boolean;
import elemental2.dom.ServiceWorker;
import java.lang.Object;
import elemental2.dom.SyncManager;
import java.lang.String;
import elemental2.dom.GetNotificationOptions;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ServiceWorkerRegistration extends EventTarget{
@JsFunction
public interface OnupdatefoundFn{
Object onInvoke(Event p0);
}
@JsProperty
ServiceWorker getActive();
@JsProperty
ServiceWorker getInstalling();
@JsProperty
NavigationPreloadManager getNavigationPreload();
Promise<JsArray<Notification>> getNotifications();
Promise<JsArray<Notification>> getNotifications(GetNotificationOptions filter);
@JsProperty
ServiceWorkerRegistration.OnupdatefoundFn getOnupdatefound();
@JsProperty
PushManager getPushManager();
@JsProperty
String getScope();
@JsProperty
SyncManager getSync();
@JsProperty
ServiceWorker getWaiting();
@JsProperty
void setActive(ServiceWorker active);
@JsProperty
void setInstalling(ServiceWorker installing);
@JsProperty
void setNavigationPreload(NavigationPreloadManager navigationPreload);
@JsProperty
void setOnupdatefound(ServiceWorkerRegistration.OnupdatefoundFn onupdatefound);
@JsProperty
void setPushManager(PushManager pushManager);
@JsProperty
void setScope(String scope);
@JsProperty
void setSync(SyncManager sync);
@JsProperty
void setWaiting(ServiceWorker waiting);
Promise<Void> showNotification(String title,NotificationOptions options);
Promise<Void> showNotification(String title);
Promise<Boolean> unregister();
Promise<Void> update();
}
