package elemental2.dom;
import java.lang.Void;
import elemental2.dom.URL;
import elemental2.dom.ShareData;
import elemental2.dom.PluginArray;
import elemental2.dom.MimeTypeArray;
import elemental2.promise.Promise;
import elemental2.dom.NavigatorStorage;
import elemental2.dom.Clipboard;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import elemental2.dom.BatteryManager;
import elemental2.dom.Geolocation;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.ServiceWorkerContainer;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.UserActivation;
import elemental2.dom.StorageManager;
import elemental2.dom.MediaDevices;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Navigator implements NavigatorStorage{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RegisterProtocolHandlerUrlUnionType{
@JsOverlay
static Navigator.RegisterProtocolHandlerUrlUnionType of(Object o){
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
public interface UnregisterProtocolHandlerUrlUnionType{
@JsOverlay
static Navigator.UnregisterProtocolHandlerUrlUnionType of(Object o){
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
public String appCodeName;
public String appName;
public String appVersion;
public Clipboard clipboard;
public boolean cookieEnabled;
public double deviceMemory;
public Geolocation geolocation;
public int hardwareConcurrency;
public String language;
public MediaDevices mediaDevices;
public MimeTypeArray mimeTypes;
public boolean onLine;
public String platform;
public PluginArray plugins;
public String product;
public ServiceWorkerContainer serviceWorker;
public StorageManager storage;
public UserActivation userActivation;
public String userAgent;
public native boolean canShare();
public native boolean canShare(ShareData data);
public native Promise<BatteryManager> getBattery();
@JsProperty
public native StorageManager getStorage();
public native boolean javaEnabled();
public native void registerContentHandler(String mimeType,String url,String title);
public native void registerProtocolHandler(String scheme,Navigator.RegisterProtocolHandlerUrlUnionType url,String title);
@JsOverlay
public final void registerProtocolHandler(String scheme,String url,String title){
registerProtocolHandler(scheme,Js.<Navigator.RegisterProtocolHandlerUrlUnionType>uncheckedCast(url),title);
}
@JsOverlay
public final void registerProtocolHandler(String scheme,URL url,String title){
registerProtocolHandler(scheme,Js.<Navigator.RegisterProtocolHandlerUrlUnionType>uncheckedCast(url),title);
}
@JsProperty
public native void setStorage(StorageManager storage);
public native Promise<Void> share();
public native Promise<Void> share(ShareData data);
public native boolean taintEnabled();
public native void unregisterContentHandler(String mimeType,String url);
@JsOverlay
public final void unregisterProtocolHandler(String scheme,String url){
unregisterProtocolHandler(scheme,Js.<Navigator.UnregisterProtocolHandlerUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final void unregisterProtocolHandler(String scheme,URL url){
unregisterProtocolHandler(scheme,Js.<Navigator.UnregisterProtocolHandlerUrlUnionType>uncheckedCast(url));
}
public native void unregisterProtocolHandler(String scheme,Navigator.UnregisterProtocolHandlerUrlUnionType url);
}
