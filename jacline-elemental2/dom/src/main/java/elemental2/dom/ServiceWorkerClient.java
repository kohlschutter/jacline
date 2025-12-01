package elemental2.dom;
import org.jspecify.annotations.Nullable;
import java.lang.Void;
import elemental2.dom.URL;
import elemental2.core.Transferable;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class ServiceWorkerClient{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface NavigateUrlUnionType{
@JsOverlay
static ServiceWorkerClient.NavigateUrlUnionType of(Object o){
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
public boolean focused;
public String frameType;
public boolean hidden;
public String id;
public Promise<Void> ready;
public String url;
public String visibilityState;
public native Promise focus();
public native Promise<ServiceWorkerClient> navigate(ServiceWorkerClient.NavigateUrlUnionType url);
@JsOverlay
public final Promise<ServiceWorkerClient> navigate(String url){
return navigate(Js.<ServiceWorkerClient.NavigateUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final Promise<ServiceWorkerClient> navigate(URL url){
return navigate(Js.<ServiceWorkerClient.NavigateUrlUnionType>uncheckedCast(url));
}
public native void postMessage(@Nullable Object message,JsArray<Transferable> transfer);
@JsOverlay
public final void postMessage(@Nullable Object message,Transferable[] transfer){
postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
public native void postMessage(@Nullable Object message);
}
