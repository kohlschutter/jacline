package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.promise.IThenable;
import java.lang.Deprecated;
import jsinterop.annotations.JsMethod;
import elemental2.promise.Promise;
import elemental2.dom.Response;
import elemental2.dom.FetchEventInit;
import jsinterop.base.Js;
import elemental2.dom.ServiceWorkerClient;
import elemental2.dom.ExtendableEventInit;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.Request;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ExtendableEvent;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FetchEvent extends ExtendableEvent{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RespondWithRUnionType{
@JsOverlay
static FetchEvent.@Nullable RespondWithRUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable IThenable<@Nullable Response> asIThenable(){
return Js.cast(this);
}
@JsOverlay
default @Nullable Response asResponse(){
return Js.cast(this);
}
@JsOverlay
default boolean isResponse(){
return (Object)this instanceof Response;
}
}
@Deprecated
public ServiceWorkerClient client;
public @Nullable String clientId;
public boolean isReload;
public Promise<@Nullable Response> preloadResponse;
public Request request;
public @Nullable String resultingClientId;
public FetchEvent(String type,FetchEventInit eventInitDict){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(ExtendableEventInit)null);
}
public FetchEvent(String type){
// This super call is here only for the code to compile; it is never executed.
super((String)null,(ExtendableEventInit)null);
}
@JsMethod(name = "default")
public native Promise<Response> default_();
public native Promise<Response> forwardTo(String url);
@JsOverlay
public final void respondWith(IThenable<@Nullable Response> r){
respondWith(Js.<FetchEvent.@Nullable RespondWithRUnionType>uncheckedCast(r));
}
public native void respondWith(FetchEvent.@Nullable RespondWithRUnionType r);
@JsOverlay
public final void respondWith(Response r){
respondWith(Js.<FetchEvent.@Nullable RespondWithRUnionType>uncheckedCast(r));
}
}
