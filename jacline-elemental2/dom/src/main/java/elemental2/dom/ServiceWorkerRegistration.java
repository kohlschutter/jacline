package elemental2.dom;
import org.jspecify.annotations.Nullable;
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
@Nullable Object onInvoke(Event p0);
}
@JsProperty
@Nullable ServiceWorker getActive();
@JsProperty
@Nullable ServiceWorker getInstalling();
@JsProperty
@Nullable NavigationPreloadManager getNavigationPreload();
Promise<@Nullable JsArray<@Nullable Notification>> getNotifications();
Promise<@Nullable JsArray<@Nullable Notification>> getNotifications(GetNotificationOptions filter);
@JsProperty
ServiceWorkerRegistration.@Nullable OnupdatefoundFn getOnupdatefound();
@JsProperty
PushManager getPushManager();
@JsProperty
String getScope();
@JsProperty
SyncManager getSync();
@JsProperty
@Nullable ServiceWorker getWaiting();
@JsProperty
void setActive(@Nullable ServiceWorker active);
@JsProperty
void setInstalling(@Nullable ServiceWorker installing);
@JsProperty
void setNavigationPreload(@Nullable NavigationPreloadManager navigationPreload);
@JsProperty
void setOnupdatefound(ServiceWorkerRegistration.@Nullable OnupdatefoundFn onupdatefound);
@JsProperty
void setPushManager(PushManager pushManager);
@JsProperty
void setScope(String scope);
@JsProperty
void setSync(SyncManager sync);
@JsProperty
void setWaiting(@Nullable ServiceWorker waiting);
Promise<Void> showNotification(String title,NotificationOptions options);
Promise<Void> showNotification(String title);
Promise<Boolean> unregister();
Promise<Void> update();
}
