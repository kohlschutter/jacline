package elemental2.dom;
import java.lang.Void;
import elemental2.dom.URL;
import elemental2.dom.ServiceWorkerClientQueryOptions;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import elemental2.dom.ServiceWorkerClient;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface ServiceWorkerClients{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OpenWindowUrlUnionType{
@JsOverlay
static ServiceWorkerClients.OpenWindowUrlUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URL asURL(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
Promise<Void> claim();
Promise<ServiceWorkerClient> get(String id);
Promise<JsArray<ServiceWorkerClient>> getAll();
Promise<JsArray<ServiceWorkerClient>> getAll(ServiceWorkerClientQueryOptions options);
Promise<JsArray<ServiceWorkerClient>> matchAll();
Promise<JsArray<ServiceWorkerClient>> matchAll(ServiceWorkerClientQueryOptions options);
Promise<ServiceWorkerClient> openWindow(ServiceWorkerClients.OpenWindowUrlUnionType url);
@JsOverlay
default Promise<ServiceWorkerClient> openWindow(String url){
return openWindow(Js.<ServiceWorkerClients.OpenWindowUrlUnionType>uncheckedCast(url));
}
@JsOverlay
default Promise<ServiceWorkerClient> openWindow(URL url){
return openWindow(Js.<ServiceWorkerClients.OpenWindowUrlUnionType>uncheckedCast(url));
}
}
