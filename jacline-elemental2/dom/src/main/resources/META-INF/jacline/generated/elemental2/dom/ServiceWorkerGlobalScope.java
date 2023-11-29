package elemental2.dom;
import elemental2.dom.ServiceWorkerClients;
import java.lang.Void;
import elemental2.dom.WorkerGlobalScope;
import elemental2.dom.Event;
import elemental2.dom.Console;
import elemental2.dom.CacheStorage;
import elemental2.dom.ServiceWorkerRegistration;
import elemental2.promise.Promise;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.FetchEvent;
import elemental2.dom.Cache;
import jsinterop.annotations.JsFunction;
import elemental2.dom.InstallEvent;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import elemental2.dom.MessageEvent;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ExtendableEvent;
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
Object onInvoke(ExtendableEvent p0);
}
@JsFunction
public interface OnbeforeevictedFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnevictedFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnfetchFn{
Object onInvoke(FetchEvent p0);
}
@JsFunction
public interface OninstallFn{
Object onInvoke(InstallEvent p0);
}
@JsFunction
public interface OnmessageFn{
Object onInvoke(MessageEvent p0);
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
ServiceWorkerGlobalScope.OnactivateFn getOnactivate();
@JsProperty
ServiceWorkerGlobalScope.OnbeforeevictedFn getOnbeforeevicted();
@JsProperty
ServiceWorkerGlobalScope.OnevictedFn getOnevicted();
@JsProperty
ServiceWorkerGlobalScope.OnfetchFn getOnfetch();
@JsProperty
ServiceWorkerGlobalScope.OninstallFn getOninstall();
@JsProperty
ServiceWorkerGlobalScope.OnmessageFn getOnmessage();
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
void setOnactivate(ServiceWorkerGlobalScope.OnactivateFn onactivate);
@JsProperty
void setOnbeforeevicted(ServiceWorkerGlobalScope.OnbeforeevictedFn onbeforeevicted);
@JsProperty
void setOnevicted(ServiceWorkerGlobalScope.OnevictedFn onevicted);
@JsProperty
void setOnfetch(ServiceWorkerGlobalScope.OnfetchFn onfetch);
@JsProperty
void setOninstall(ServiceWorkerGlobalScope.OninstallFn oninstall);
@JsProperty
void setOnmessage(ServiceWorkerGlobalScope.OnmessageFn onmessage);
@JsProperty
void setRegistration(ServiceWorkerRegistration registration);
@JsProperty
void setScope(String scope);
@JsProperty
void setScriptCache(Cache scriptCache);
Promise<Void> skipWaiting();
}
