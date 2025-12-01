package elemental2.dom;
import elemental2.dom.ServiceWorkerClients;
import org.jspecify.annotations.Nullable;
import elemental2.dom.WorkerGlobalScope;
import elemental2.dom.Event;
import elemental2.dom.Console;
import elemental2.dom.ServiceWorkerRegistration;
import elemental2.promise.Promise;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.FetchEvent;
import elemental2.dom.Cache;
import jsinterop.annotations.JsFunction;
import elemental2.dom.InstallEvent;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ExtendableEvent;
import java.lang.Void;
import elemental2.dom.CacheStorage;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.dom.MessageEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ServiceWorkerGlobalScope extends WorkerGlobalScope{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface NotificationFieldType{
@JsOverlay
static ServiceWorkerGlobalScope.NotificationFieldType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getMaxActions();
@JsProperty
String getPermission();
@JsProperty
void setMaxActions(double maxActions);
@JsProperty
void setPermission(String permission);
}
@JsFunction
public interface OnactivateFn{
@Nullable Object onInvoke(ExtendableEvent p0);
}
@JsFunction
public interface OnbeforeevictedFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnevictedFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnfetchFn{
@Nullable Object onInvoke(FetchEvent p0);
}
@JsFunction
public interface OninstallFn{
@Nullable Object onInvoke(InstallEvent p0);
}
@JsFunction
public interface OnmessageFn{
@Nullable Object onInvoke(MessageEvent p0);
}
@JsProperty
CacheStorage getCaches();
@JsProperty
ServiceWorkerClients getClients();
@JsProperty
Console getConsole();
@JsProperty(name = "Notification")
ServiceWorkerGlobalScope.NotificationFieldType getNotification();
@JsProperty
ServiceWorkerGlobalScope.@Nullable OnactivateFn getOnactivate();
@JsProperty
ServiceWorkerGlobalScope.@Nullable OnbeforeevictedFn getOnbeforeevicted();
@JsProperty
ServiceWorkerGlobalScope.@Nullable OnevictedFn getOnevicted();
@JsProperty
ServiceWorkerGlobalScope.@Nullable OnfetchFn getOnfetch();
@JsProperty
ServiceWorkerGlobalScope.@Nullable OninstallFn getOninstall();
@JsProperty
ServiceWorkerGlobalScope.@Nullable OnmessageFn getOnmessage();
@JsProperty
ServiceWorkerRegistration getRegistration();
@JsProperty
String getScope();
@JsProperty
Cache getScriptCache();
@JsProperty
void setCaches(CacheStorage caches);
@JsProperty
void setClients(ServiceWorkerClients clients);
@JsProperty
void setConsole(Console console);
@JsProperty(name = "Notification")
void setNotification(ServiceWorkerGlobalScope.NotificationFieldType Notification);
@JsProperty
void setOnactivate(ServiceWorkerGlobalScope.@Nullable OnactivateFn onactivate);
@JsProperty
void setOnbeforeevicted(ServiceWorkerGlobalScope.@Nullable OnbeforeevictedFn onbeforeevicted);
@JsProperty
void setOnevicted(ServiceWorkerGlobalScope.@Nullable OnevictedFn onevicted);
@JsProperty
void setOnfetch(ServiceWorkerGlobalScope.@Nullable OnfetchFn onfetch);
@JsProperty
void setOninstall(ServiceWorkerGlobalScope.@Nullable OninstallFn oninstall);
@JsProperty
void setOnmessage(ServiceWorkerGlobalScope.@Nullable OnmessageFn onmessage);
@JsProperty
void setRegistration(ServiceWorkerRegistration registration);
@JsProperty
void setScope(String scope);
@JsProperty
void setScriptCache(Cache scriptCache);
Promise<Void> skipWaiting();
}
