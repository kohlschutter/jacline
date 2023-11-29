package elemental2.dom;
import elemental2.dom.URL;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
import elemental2.dom.Response;
import jsinterop.base.Js;
import elemental2.dom.Cache;
import elemental2.dom.CacheQueryOptions;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.Request;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface CacheStorage{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface MatchRequestUnionType{
@JsOverlay
static CacheStorage.MatchRequestUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Request asRequest(){
return Js.cast(this);
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
default boolean isRequest(){
return (Object)this instanceof Request;
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
Promise<Boolean> delete(String cacheName);
Promise<Boolean> has(String cacheName);
Promise<JsArray<String>> keys();
Promise<Response> match(CacheStorage.MatchRequestUnionType request,CacheQueryOptions options);
Promise<Response> match(CacheStorage.MatchRequestUnionType request);
@JsOverlay
default Promise<Response> match(Request request,CacheQueryOptions options){
return match(Js.<CacheStorage.MatchRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<Response> match(Request request){
return match(Js.<CacheStorage.MatchRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<Response> match(String request,CacheQueryOptions options){
return match(Js.<CacheStorage.MatchRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<Response> match(String request){
return match(Js.<CacheStorage.MatchRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<Response> match(URL request,CacheQueryOptions options){
return match(Js.<CacheStorage.MatchRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<Response> match(URL request){
return match(Js.<CacheStorage.MatchRequestUnionType>uncheckedCast(request));
}
Promise<Cache> open(String cacheName);
}
