package elemental2.dom;
import elemental2.dom.FormData;
import elemental2.dom.URL;
import elemental2.dom.Headers;
import jsinterop.annotations.JsMethod;
import elemental2.dom.Blob;
import elemental2.promise.Promise;
import elemental2.core.ArrayBuffer;
import jsinterop.annotations.JsProperty;
import elemental2.dom.Body;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.RequestInit;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Request implements Body{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConstructorInputUnionType{
@JsOverlay
static Request.ConstructorInputUnionType of(Object o){
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
public boolean bodyUsed;
public String cache;
public String credentials;
public String destination;
public Headers headers;
public String integrity;
public boolean isHistoryNavigation;
public boolean keepalive;
public String method;
public String mode;
public String redirect;
public String referrer;
public String type;
public String url;
public Request(Request.ConstructorInputUnionType input,RequestInit init){}
public Request(Request.ConstructorInputUnionType input){}
public Request(Request input,RequestInit init){}
public Request(Request input){}
public Request(String input,RequestInit init){}
public Request(String input){}
public Request(URL input,RequestInit init){}
public Request(URL input){}
public native Promise<ArrayBuffer> arrayBuffer();
public native Promise<Blob> blob();
@JsMethod(name = "clone")
public native Request clone_();
public native Promise<FormData> formData();
@JsProperty
public native boolean isBodyUsed();
public native Promise<Object> json();
@JsProperty
public native void setBodyUsed(boolean bodyUsed);
public native Promise<String> text();
}
