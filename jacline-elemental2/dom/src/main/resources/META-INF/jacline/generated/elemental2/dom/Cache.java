package elemental2.dom;
import java.lang.Void;
import elemental2.dom.URL;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
import elemental2.dom.Response;
import jsinterop.base.Js;
import elemental2.dom.CacheQueryOptions;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.Request;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public interface Cache{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AddAllRequestsArrayUnionType{
@JsOverlay
static Cache.AddAllRequestsArrayUnionType of(Object o){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AddRequestUnionType{
@JsOverlay
static Cache.AddRequestUnionType of(Object o){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface DeleteRequestUnionType{
@JsOverlay
static Cache.DeleteRequestUnionType of(Object o){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface KeysRequestUnionType{
@JsOverlay
static Cache.KeysRequestUnionType of(Object o){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface MatchAllRequestUnionType{
@JsOverlay
static Cache.MatchAllRequestUnionType of(Object o){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface MatchRequestUnionType{
@JsOverlay
static Cache.MatchRequestUnionType of(Object o){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PutRequestUnionType{
@JsOverlay
static Cache.PutRequestUnionType of(Object o){
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
Promise<Void> add(Cache.AddRequestUnionType request);
@JsOverlay
default Promise<Void> add(Request request){
return add(Js.<Cache.AddRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<Void> add(String request){
return add(Js.<Cache.AddRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<Void> add(URL request){
return add(Js.<Cache.AddRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<Void> addAll(Cache.AddAllRequestsArrayUnionType[] requests){
return addAll(Js.<JsArray<Cache.AddAllRequestsArrayUnionType>>uncheckedCast(requests));
}
Promise<Void> addAll(JsArray<Cache.AddAllRequestsArrayUnionType> requests);
Promise<Boolean> delete(Cache.DeleteRequestUnionType request,CacheQueryOptions options);
Promise<Boolean> delete(Cache.DeleteRequestUnionType request);
@JsOverlay
default Promise<Boolean> delete(Request request,CacheQueryOptions options){
return delete(Js.<Cache.DeleteRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<Boolean> delete(Request request){
return delete(Js.<Cache.DeleteRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<Boolean> delete(String request,CacheQueryOptions options){
return delete(Js.<Cache.DeleteRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<Boolean> delete(String request){
return delete(Js.<Cache.DeleteRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<Boolean> delete(URL request,CacheQueryOptions options){
return delete(Js.<Cache.DeleteRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<Boolean> delete(URL request){
return delete(Js.<Cache.DeleteRequestUnionType>uncheckedCast(request));
}
Promise<JsArray<Request>> keys();
Promise<JsArray<Request>> keys(Cache.KeysRequestUnionType request,CacheQueryOptions options);
Promise<JsArray<Request>> keys(Cache.KeysRequestUnionType request);
@JsOverlay
default Promise<JsArray<Request>> keys(Request request,CacheQueryOptions options){
return keys(Js.<Cache.KeysRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<JsArray<Request>> keys(Request request){
return keys(Js.<Cache.KeysRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<JsArray<Request>> keys(String request,CacheQueryOptions options){
return keys(Js.<Cache.KeysRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<JsArray<Request>> keys(String request){
return keys(Js.<Cache.KeysRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<JsArray<Request>> keys(URL request,CacheQueryOptions options){
return keys(Js.<Cache.KeysRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<JsArray<Request>> keys(URL request){
return keys(Js.<Cache.KeysRequestUnionType>uncheckedCast(request));
}
Promise<Response> match(Cache.MatchRequestUnionType request,CacheQueryOptions options);
Promise<Response> match(Cache.MatchRequestUnionType request);
@JsOverlay
default Promise<Response> match(Request request,CacheQueryOptions options){
return match(Js.<Cache.MatchRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<Response> match(Request request){
return match(Js.<Cache.MatchRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<Response> match(String request,CacheQueryOptions options){
return match(Js.<Cache.MatchRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<Response> match(String request){
return match(Js.<Cache.MatchRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<Response> match(URL request,CacheQueryOptions options){
return match(Js.<Cache.MatchRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<Response> match(URL request){
return match(Js.<Cache.MatchRequestUnionType>uncheckedCast(request));
}
Promise<JsArray<Response>> matchAll();
Promise<JsArray<Response>> matchAll(Cache.MatchAllRequestUnionType request,CacheQueryOptions options);
Promise<JsArray<Response>> matchAll(Cache.MatchAllRequestUnionType request);
@JsOverlay
default Promise<JsArray<Response>> matchAll(Request request,CacheQueryOptions options){
return matchAll(Js.<Cache.MatchAllRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<JsArray<Response>> matchAll(Request request){
return matchAll(Js.<Cache.MatchAllRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<JsArray<Response>> matchAll(String request,CacheQueryOptions options){
return matchAll(Js.<Cache.MatchAllRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<JsArray<Response>> matchAll(String request){
return matchAll(Js.<Cache.MatchAllRequestUnionType>uncheckedCast(request));
}
@JsOverlay
default Promise<JsArray<Response>> matchAll(URL request,CacheQueryOptions options){
return matchAll(Js.<Cache.MatchAllRequestUnionType>uncheckedCast(request),options);
}
@JsOverlay
default Promise<JsArray<Response>> matchAll(URL request){
return matchAll(Js.<Cache.MatchAllRequestUnionType>uncheckedCast(request));
}
Promise<Void> put(Cache.PutRequestUnionType request,Response response);
@JsOverlay
default Promise<Void> put(Request request,Response response){
return put(Js.<Cache.PutRequestUnionType>uncheckedCast(request),response);
}
@JsOverlay
default Promise<Void> put(String request,Response response){
return put(Js.<Cache.PutRequestUnionType>uncheckedCast(request),response);
}
@JsOverlay
default Promise<Void> put(URL request,Response response){
return put(Js.<Cache.PutRequestUnionType>uncheckedCast(request),response);
}
}
