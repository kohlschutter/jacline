package elemental2.dom;
import jsinterop.base.Js;
import elemental2.dom.URL;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class History{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PushStateUrlUnionType{
@JsOverlay
static History.PushStateUrlUnionType of(Object o){
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
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ReplaceStateUrlUnionType{
@JsOverlay
static History.ReplaceStateUrlUnionType of(Object o){
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
public int length;
public String scrollRestoration;
public Object state;
public native void back();
public native void forward();
public native void go(int delta);
public native void pushState(Object data,String title,History.PushStateUrlUnionType url);
@JsOverlay
public final void pushState(Object data,String title,String url){
pushState(data,title,Js.<History.PushStateUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final void pushState(Object data,String title,URL url){
pushState(data,title,Js.<History.PushStateUrlUnionType>uncheckedCast(url));
}
public native void pushState(Object data,String title);
public native void replaceState(Object data,String title,History.ReplaceStateUrlUnionType url);
@JsOverlay
public final void replaceState(Object data,String title,String url){
replaceState(data,title,Js.<History.ReplaceStateUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final void replaceState(Object data,String title,URL url){
replaceState(data,title,Js.<History.ReplaceStateUrlUnionType>uncheckedCast(url));
}
public native void replaceState(Object data,String title);
}
