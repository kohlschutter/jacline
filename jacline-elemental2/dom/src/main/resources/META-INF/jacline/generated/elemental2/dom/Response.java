package elemental2.dom;
import elemental2.dom.FormData;
import elemental2.dom.URL;
import elemental2.dom.ReadableStream;
import elemental2.dom.Headers;
import jsinterop.annotations.JsMethod;
import elemental2.dom.Blob;
import elemental2.promise.Promise;
import elemental2.core.ArrayBuffer;
import elemental2.dom.URLSearchParams;
import jsinterop.annotations.JsProperty;
import elemental2.dom.Body;
import jsinterop.base.Js;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.ResponseInit;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Response implements Body{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorBodyUnionType{
@JsOverlay
static Response.ConstructorBodyUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default ArrayBuffer asArrayBuffer(){
return Js.cast(this);
}
@JsOverlay
default ArrayBufferView asArrayBufferView(){
return Js.cast(this);
}
@JsOverlay
default Blob asBlob(){
return Js.cast(this);
}
@JsOverlay
default FormData asFormData(){
return Js.cast(this);
}
@JsOverlay
default ReadableStream asReadableStream(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default URLSearchParams asURLSearchParams(){
return Js.cast(this);
}
@JsOverlay
default boolean isArrayBuffer(){
return (Object)this instanceof ArrayBuffer;
}
@JsOverlay
default boolean isArrayBufferView(){
return (Object)this instanceof ArrayBufferView;
}
@JsOverlay
default boolean isBlob(){
return (Object)this instanceof Blob;
}
@JsOverlay
default boolean isFormData(){
return (Object)this instanceof FormData;
}
@JsOverlay
default boolean isReadableStream(){
return (Object)this instanceof ReadableStream;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isURLSearchParams(){
return (Object)this instanceof URLSearchParams;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RedirectUrlUnionType{
@JsOverlay
static Response.RedirectUrlUnionType of(Object o){
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
public static native Response error();
public static native Response redirect(Response.RedirectUrlUnionType url,int status);
public static native Response redirect(Response.RedirectUrlUnionType url);
@JsOverlay
public static final Response redirect(String url,int status){
return redirect(Js.<Response.RedirectUrlUnionType>uncheckedCast(url),status);
}
@JsOverlay
public static final Response redirect(String url){
return redirect(Js.<Response.RedirectUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public static final Response redirect(URL url,int status){
return redirect(Js.<Response.RedirectUrlUnionType>uncheckedCast(url),status);
}
@JsOverlay
public static final Response redirect(URL url){
return redirect(Js.<Response.RedirectUrlUnionType>uncheckedCast(url));
}
public ReadableStream body;
public boolean bodyUsed;
public Headers headers;
public boolean ok;
public boolean redirected;
public int status;
public String statusText;
public Promise<Headers> trailer;
public String type;
public String url;
public Response(){}
public Response(ArrayBuffer body,ResponseInit init){}
public Response(ArrayBuffer body){}
public Response(ArrayBufferView body,ResponseInit init){}
public Response(ArrayBufferView body){}
public Response(Blob body,ResponseInit init){}
public Response(Blob body){}
public Response(Response.ConstructorBodyUnionType body,ResponseInit init){}
public Response(Response.ConstructorBodyUnionType body){}
public Response(FormData body,ResponseInit init){}
public Response(FormData body){}
public Response(ReadableStream body,ResponseInit init){}
public Response(ReadableStream body){}
public Response(String body,ResponseInit init){}
public Response(String body){}
public Response(URLSearchParams body,ResponseInit init){}
public Response(URLSearchParams body){}
public native Promise<ArrayBuffer> arrayBuffer();
public native Promise<Blob> blob();
@JsMethod(name = "clone")
public native Response clone_();
public native Promise<FormData> formData();
@JsProperty
public native boolean isBodyUsed();
public native Promise<Object> json();
@JsProperty
public native void setBodyUsed(boolean bodyUsed);
public native Promise<String> text();
}
