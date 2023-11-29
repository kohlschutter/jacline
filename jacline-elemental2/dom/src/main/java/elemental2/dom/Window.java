package elemental2.dom;
import elemental2.dom.CSSInterface;
import elemental2.dom.URL;
import elemental2.dom.Navigator;
import java.lang.Double;
import elemental2.dom.MutationObserver;
import elemental2.dom.TrustedScriptURL;
import elemental2.dom.Event;
import elemental2.dom.Console;
import elemental2.dom.ApplicationCache;
import elemental2.dom.Performance;
import elemental2.promise.Promise;
import elemental2.dom.History;
import elemental2.dom.EventTarget;
import elemental2.dom.HTMLIFrameElement;
import elemental2.core.JsError;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import elemental2.dom.HTMLObjectElement;
import elemental2.dom.Selection;
import elemental2.dom.Database;
import elemental2.dom.BarProp;
import java.lang.Boolean;
import elemental2.dom.Request;
import java.lang.String;
import elemental2.dom.NotificationCenter;
import jsinterop.annotations.JsType;
import elemental2.dom.MediaQueryList;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ScrollToOptions;
import elemental2.dom.DatabaseCallback;
import elemental2.dom.RequestInit;
import elemental2.core.Transferable;
import elemental2.dom.CacheStorage;
import jsinterop.base.JsConstructorFn;
import elemental2.core.JsArray;
import elemental2.dom.Response;
import elemental2.dom.EventListener;
import elemental2.dom.WindowPostMessageOptions;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.dom.Location;
import elemental2.dom.AttributionSourceParams;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Window implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface FetchInputUnionType{
@JsOverlay
static Window.FetchInputUnionType of(Object o){
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
public interface FrameElementUnionType{
@JsOverlay
static Window.FrameElementUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default HTMLIFrameElement asHTMLIFrameElement(){
return Js.cast(this);
}
@JsOverlay
default HTMLObjectElement asHTMLObjectElement(){
return Js.cast(this);
}
@JsOverlay
default boolean isHTMLIFrameElement(){
return (Object)this instanceof HTMLIFrameElement;
}
@JsOverlay
default boolean isHTMLObjectElement(){
return (Object)this instanceof HTMLObjectElement;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ImportScriptsUrlsUnionType{
@JsOverlay
static Window.ImportScriptsUrlsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default TrustedScriptURL asTrustedScriptURL(){
return Js.cast(this);
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
default boolean isTrustedScriptURL(){
return (Object)this instanceof TrustedScriptURL;
}
@JsOverlay
default boolean isURL(){
return (Object)this instanceof URL;
}
}
@JsFunction
public interface OnabortFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnbeforeunloadFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnblurFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnchangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnclickFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OncloseFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OncontextmenuFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OndblclickFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OndragdropFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnerrorFn{
Object onInvoke(String p0,String p1,double p2,double p3,JsError p4);
}
@JsFunction
public interface OnfocusFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnhashchangeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnkeydownFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnkeypressFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnkeyupFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnloadFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnmousedownFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnmousemoveFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnmouseoutFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnmouseoverFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnmouseupFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnmousewheelFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnpaintFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnpopstateFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnresetFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnresizeFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnscrollFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnselectFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnstorageFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnsubmitFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnunhandledrejectionFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnunloadFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OnwheelFn{
Object onInvoke(Event p0);
}
@JsFunction
public interface OpenDatabaseCallbackFn{
Object onInvoke(Database p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OpenDatabaseCallbackUnionType{
@JsOverlay
static Window.OpenDatabaseCallbackUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default DatabaseCallback asDatabaseCallback(){
return Js.cast(this);
}
@JsOverlay
default Window.OpenDatabaseCallbackFn asOpenDatabaseCallbackFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOpenDatabaseCallbackFn(){
return (Object)this instanceof Window.OpenDatabaseCallbackFn;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OpenReplaceOrAttributionParamsUnionType{
@JsOverlay
static Window.OpenReplaceOrAttributionParamsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default AttributionSourceParams asAttributionSourceParams(){
return Js.cast(this);
}
@JsOverlay
default boolean asBoolean(){
return Js.asBoolean(this);
}
@JsOverlay
default boolean isBoolean(){
return (Object)this instanceof Boolean;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OpenUrlUnionType{
@JsOverlay
static Window.OpenUrlUnionType of(Object o){
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
public interface PostMessageTargetOriginOrOptionsUnionType{
@JsOverlay
static Window.PostMessageTargetOriginOrOptionsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default WindowPostMessageOptions asWindowPostMessageOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ScrollByScrollToOptionsOrXUnionType{
@JsOverlay
static Window.ScrollByScrollToOptionsOrXUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default ScrollToOptions asScrollToOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ScrollScrollToOptionsOrXUnionType{
@JsOverlay
static Window.ScrollScrollToOptionsOrXUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default ScrollToOptions asScrollToOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ScrollToScrollToOptionsOrXUnionType{
@JsOverlay
static Window.ScrollToScrollToOptionsOrXUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default ScrollToOptions asScrollToOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
public CSSInterface CSS;
public JsConstructorFn<? extends MutationObserver> MozMutationObserver;
public JsConstructorFn<? extends MutationObserver> WebKitMutationObserver;
public Object Window;
public ApplicationCache applicationCache;
public CacheStorage caches;
public boolean closed;
public Console console;
public boolean crossOriginIsolated;
public double devicePixelRatio;
public Window.FrameElementUnionType frameElement;
public Window frames;
public History history;
public int innerHeight;
public int innerWidth;
public int length;
public Location location;
public BarProp locationbar;
public BarProp menubar;
public String name;
public Navigator navigator;
public Window.OnabortFn onabort;
public Window.OnbeforeunloadFn onbeforeunload;
public Window.OnblurFn onblur;
public Window.OnchangeFn onchange;
public Window.OnclickFn onclick;
public Window.OncloseFn onclose;
public Window.OncontextmenuFn oncontextmenu;
public Window.OndblclickFn ondblclick;
public Window.OndragdropFn ondragdrop;
public Window.OnerrorFn onerror;
public Window.OnfocusFn onfocus;
public Window.OnhashchangeFn onhashchange;
public Window.OnkeydownFn onkeydown;
public Window.OnkeypressFn onkeypress;
public Window.OnkeyupFn onkeyup;
public Window.OnloadFn onload;
public Window.OnmousedownFn onmousedown;
public Window.OnmousemoveFn onmousemove;
public Window.OnmouseoutFn onmouseout;
public Window.OnmouseoverFn onmouseover;
public Window.OnmouseupFn onmouseup;
public Window.OnmousewheelFn onmousewheel;
public Window.OnpaintFn onpaint;
public Window.OnpopstateFn onpopstate;
public Window.OnresetFn onreset;
public Window.OnresizeFn onresize;
public Window.OnscrollFn onscroll;
public Window.OnselectFn onselect;
public Window.OnstorageFn onstorage;
public Window.OnsubmitFn onsubmit;
public Window.OnunhandledrejectionFn onunhandledrejection;
public Window.OnunloadFn onunload;
public Window.OnwheelFn onwheel;
public Window opener;
public String origin;
public int outerHeight;
public int outerWidth;
public double pageXOffset;
public double pageYOffset;
public Window parent;
public Performance performance;
public BarProp personalbar;
public int screenX;
public int screenY;
public double scrollX;
public double scrollY;
public BarProp scrollbars;
public Window self;
public String status;
public BarProp statusbar;
public BarProp toolbar;
public Window top;
public NotificationCenter webkitNotifications;
public Window window;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void alert(Object message);
public native void blur();
public native void close();
public native boolean confirm(Object message);
public native boolean dispatchEvent(Event evt);
public native Promise<Response> fetch(Window.FetchInputUnionType input,RequestInit init);
public native Promise<Response> fetch(Window.FetchInputUnionType input);
@JsOverlay
public final Promise<Response> fetch(Request input,RequestInit init){
return fetch(Js.<Window.FetchInputUnionType>uncheckedCast(input),init);
}
@JsOverlay
public final Promise<Response> fetch(Request input){
return fetch(Js.<Window.FetchInputUnionType>uncheckedCast(input));
}
@JsOverlay
public final Promise<Response> fetch(String input,RequestInit init){
return fetch(Js.<Window.FetchInputUnionType>uncheckedCast(input),init);
}
@JsOverlay
public final Promise<Response> fetch(String input){
return fetch(Js.<Window.FetchInputUnionType>uncheckedCast(input));
}
@JsOverlay
public final Promise<Response> fetch(URL input,RequestInit init){
return fetch(Js.<Window.FetchInputUnionType>uncheckedCast(input),init);
}
@JsOverlay
public final Promise<Response> fetch(URL input){
return fetch(Js.<Window.FetchInputUnionType>uncheckedCast(input));
}
public native void focus();
public native Selection getSelection();
public native void importScripts(Window.ImportScriptsUrlsUnionType... urls);
@JsOverlay
public final void importScripts(String... urls){
importScripts(Js.<Window.ImportScriptsUrlsUnionType[]>uncheckedCast(urls));
}
@JsOverlay
public final void importScripts(TrustedScriptURL... urls){
importScripts(Js.<Window.ImportScriptsUrlsUnionType[]>uncheckedCast(urls));
}
@JsOverlay
public final void importScripts(URL... urls){
importScripts(Js.<Window.ImportScriptsUrlsUnionType[]>uncheckedCast(urls));
}
public native MediaQueryList matchMedia(String media_query_list);
public native void moveBy(int x,int y);
public native void moveTo(int x,int y);
public native Window open();
@JsOverlay
public final Window open(Window.OpenUrlUnionType url,String windowName,String windowFeatures,AttributionSourceParams replaceOrAttributionParams){
return open(url,windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
public native Window open(Window.OpenUrlUnionType url,String windowName,String windowFeatures,Window.OpenReplaceOrAttributionParamsUnionType replaceOrAttributionParams);
@JsOverlay
public final Window open(Window.OpenUrlUnionType url,String windowName,String windowFeatures,boolean replaceOrAttributionParams){
return open(url,windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
public native Window open(Window.OpenUrlUnionType url,String windowName,String windowFeatures);
public native Window open(Window.OpenUrlUnionType url,String windowName);
public native Window open(Window.OpenUrlUnionType url);
@JsOverlay
public final Window open(String url,String windowName,String windowFeatures,AttributionSourceParams replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
@JsOverlay
public final Window open(String url,String windowName,String windowFeatures,Window.OpenReplaceOrAttributionParamsUnionType replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,replaceOrAttributionParams);
}
@JsOverlay
public final Window open(String url,String windowName,String windowFeatures,boolean replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
@JsOverlay
public final Window open(String url,String windowName,String windowFeatures){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures);
}
@JsOverlay
public final Window open(String url,String windowName){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName);
}
@JsOverlay
public final Window open(String url){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final Window open(URL url,String windowName,String windowFeatures,AttributionSourceParams replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
@JsOverlay
public final Window open(URL url,String windowName,String windowFeatures,Window.OpenReplaceOrAttributionParamsUnionType replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,replaceOrAttributionParams);
}
@JsOverlay
public final Window open(URL url,String windowName,String windowFeatures,boolean replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
@JsOverlay
public final Window open(URL url,String windowName,String windowFeatures){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures);
}
@JsOverlay
public final Window open(URL url,String windowName){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName);
}
@JsOverlay
public final Window open(URL url){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final Database openDatabase(String name,String version,String description,int size,DatabaseCallback callback){
return openDatabase(name,version,description,size,Js.<Window.OpenDatabaseCallbackUnionType>uncheckedCast(callback));
}
@JsOverlay
public final Database openDatabase(String name,String version,String description,int size,Window.OpenDatabaseCallbackFn callback){
return openDatabase(name,version,description,size,Js.<Window.OpenDatabaseCallbackUnionType>uncheckedCast(callback));
}
public native Database openDatabase(String name,String version,String description,int size,Window.OpenDatabaseCallbackUnionType callback);
public native Database openDatabase(String name,String version,String description,int size);
public native void postMessage(Object message,Window.PostMessageTargetOriginOrOptionsUnionType targetOriginOrOptions,JsArray<Transferable> transfer);
@JsOverlay
public final void postMessage(Object message,Window.PostMessageTargetOriginOrOptionsUnionType targetOriginOrOptions,Transferable[] transfer){
postMessage(message,targetOriginOrOptions,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
public native void postMessage(Object message,Window.PostMessageTargetOriginOrOptionsUnionType targetOriginOrOptions);
@JsOverlay
public final void postMessage(Object message,String targetOriginOrOptions,JsArray<Transferable> transfer){
postMessage(message,Js.<Window.PostMessageTargetOriginOrOptionsUnionType>uncheckedCast(targetOriginOrOptions),transfer);
}
@JsOverlay
public final void postMessage(Object message,String targetOriginOrOptions,Transferable[] transfer){
postMessage(message,targetOriginOrOptions,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
@JsOverlay
public final void postMessage(Object message,String targetOriginOrOptions){
postMessage(message,Js.<Window.PostMessageTargetOriginOrOptionsUnionType>uncheckedCast(targetOriginOrOptions));
}
@JsOverlay
public final void postMessage(Object message,WindowPostMessageOptions targetOriginOrOptions,JsArray<Transferable> transfer){
postMessage(message,Js.<Window.PostMessageTargetOriginOrOptionsUnionType>uncheckedCast(targetOriginOrOptions),transfer);
}
@JsOverlay
public final void postMessage(Object message,WindowPostMessageOptions targetOriginOrOptions,Transferable[] transfer){
postMessage(message,targetOriginOrOptions,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
@JsOverlay
public final void postMessage(Object message,WindowPostMessageOptions targetOriginOrOptions){
postMessage(message,Js.<Window.PostMessageTargetOriginOrOptionsUnionType>uncheckedCast(targetOriginOrOptions));
}
public native void postMessage(Object message);
public native void print();
public native String prompt(String message,String value);
public native String prompt(String message);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native void resizeBy(int x,int y);
public native void resizeTo(int x,int y);
public native void scroll(Window.ScrollScrollToOptionsOrXUnionType scrollToOptionsOrX,double y);
public native void scroll(Window.ScrollScrollToOptionsOrXUnionType scrollToOptionsOrX);
@JsOverlay
public final void scroll(ScrollToOptions scrollToOptionsOrX,double y){
scroll(Js.<Window.ScrollScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX),y);
}
@JsOverlay
public final void scroll(ScrollToOptions scrollToOptionsOrX){
scroll(Js.<Window.ScrollScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX));
}
@JsOverlay
public final void scroll(double scrollToOptionsOrX,double y){
scroll(Js.<Window.ScrollScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX),y);
}
@JsOverlay
public final void scroll(double scrollToOptionsOrX){
scroll(Js.<Window.ScrollScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX));
}
public native void scrollBy(Window.ScrollByScrollToOptionsOrXUnionType scrollToOptionsOrX,double y);
public native void scrollBy(Window.ScrollByScrollToOptionsOrXUnionType scrollToOptionsOrX);
@JsOverlay
public final void scrollBy(ScrollToOptions scrollToOptionsOrX,double y){
scrollBy(Js.<Window.ScrollByScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX),y);
}
@JsOverlay
public final void scrollBy(ScrollToOptions scrollToOptionsOrX){
scrollBy(Js.<Window.ScrollByScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX));
}
@JsOverlay
public final void scrollBy(double scrollToOptionsOrX,double y){
scrollBy(Js.<Window.ScrollByScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX),y);
}
@JsOverlay
public final void scrollBy(double scrollToOptionsOrX){
scrollBy(Js.<Window.ScrollByScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX));
}
@JsOverlay
public final void scrollTo(ScrollToOptions scrollToOptionsOrX,double y){
scrollTo(Js.<Window.ScrollToScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX),y);
}
@JsOverlay
public final void scrollTo(ScrollToOptions scrollToOptionsOrX){
scrollTo(Js.<Window.ScrollToScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX));
}
public native void scrollTo(Window.ScrollToScrollToOptionsOrXUnionType scrollToOptionsOrX,double y);
public native void scrollTo(Window.ScrollToScrollToOptionsOrXUnionType scrollToOptionsOrX);
@JsOverlay
public final void scrollTo(double scrollToOptionsOrX,double y){
scrollTo(Js.<Window.ScrollToScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX),y);
}
@JsOverlay
public final void scrollTo(double scrollToOptionsOrX){
scrollTo(Js.<Window.ScrollToScrollToOptionsOrXUnionType>uncheckedCast(scrollToOptionsOrX));
}
public native void stop();
}
