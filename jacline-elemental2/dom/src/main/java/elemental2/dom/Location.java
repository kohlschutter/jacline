package elemental2.dom;
import org.jspecify.annotations.Nullable;
import jsinterop.base.Js;
import elemental2.dom.URL;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DOMStringList;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Location{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface AssignUrlUnionType{
@JsOverlay
static Location.AssignUrlUnionType of(Object o){
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
public interface ReplaceUrlUnionType{
@JsOverlay
static Location.ReplaceUrlUnionType of(Object o){
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
public @Nullable DOMStringList ancestorOrigins;
public String hash;
public String host;
public String hostname;
public String href;
public String origin;
public String pathname;
public String port;
public String protocol;
public String search;
public native void assign(Location.AssignUrlUnionType url);
@JsOverlay
public final void assign(String url){
assign(Js.<Location.AssignUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final void assign(URL url){
assign(Js.<Location.AssignUrlUnionType>uncheckedCast(url));
}
public native void reload();
public native void reload(boolean forceReload);
public native void replace(Location.ReplaceUrlUnionType url);
@JsOverlay
public final void replace(String url){
replace(Js.<Location.ReplaceUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final void replace(URL url){
replace(Js.<Location.ReplaceUrlUnionType>uncheckedCast(url));
}
}
