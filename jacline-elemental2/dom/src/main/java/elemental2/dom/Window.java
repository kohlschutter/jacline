package elemental2.dom;
import org.jspecify.annotations.Nullable;
import elemental2.dom.CSSInterface;
import elemental2.dom.Navigator;
import elemental2.dom.TrustedScriptURL;
import elemental2.dom.ApplicationCache;
import elemental2.dom.GamepadEvent;
import elemental2.dom.Performance;
import elemental2.dom.History;
import elemental2.dom.Database;
import elemental2.dom.Request;
import elemental2.dom.MediaQueryList;
import jsinterop.annotations.JsPackage;
import elemental2.dom.ScrollToOptions;
import elemental2.dom.PageTransitionEvent;
import elemental2.dom.CacheStorage;
import jsinterop.base.JsConstructorFn;
import elemental2.core.JsArray;
import elemental2.dom.Response;
import elemental2.dom.WindowPostMessageOptions;
import elemental2.dom.AnimationEvent;
import elemental2.dom.Location;
import elemental2.dom.AttributionSourceParams;
import elemental2.dom.URL;
import java.lang.Double;
import elemental2.dom.MutationObserver;
import elemental2.dom.Event;
import elemental2.dom.Console;
import elemental2.promise.Promise;
import elemental2.dom.EventTarget;
import elemental2.dom.HTMLIFrameElement;
import elemental2.core.JsError;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import elemental2.dom.HTMLObjectElement;
import elemental2.dom.BarProp;
import elemental2.dom.Selection;
import java.lang.Boolean;
import java.lang.String;
import elemental2.dom.NotificationCenter;
import jsinterop.annotations.JsType;
import elemental2.dom.DatabaseCallback;
import elemental2.dom.RequestInit;
import elemental2.core.Transferable;
import elemental2.dom.PointerEvent;
import elemental2.dom.SecurityPolicyViolationEvent;
import elemental2.dom.EventListener;
import elemental2.dom.PromiseRejectionEvent;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.dom.MessageEvent;
import elemental2.dom.TransitionEvent;
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
static Window.@Nullable FrameElementUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable HTMLIFrameElement asHTMLIFrameElement(){
return Js.cast(this);
}
@JsOverlay
default @Nullable HTMLObjectElement asHTMLObjectElement(){
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
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnafterprintFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnanimationcancelFn{
@Nullable Object onInvoke(AnimationEvent p0);
}
@JsFunction
public interface OnanimationendFn{
@Nullable Object onInvoke(AnimationEvent p0);
}
@JsFunction
public interface OnanimationiterationFn{
@Nullable Object onInvoke(AnimationEvent p0);
}
@JsFunction
public interface OnanimationstartFn{
@Nullable Object onInvoke(AnimationEvent p0);
}
@JsFunction
public interface OnauxclickFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnbeforeprintFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnbeforetoggleFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnbeforeunloadFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnblurFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnchangeFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnclickFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncloseFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OncontextmenuFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OndblclickFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OndragdropFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnerrorFn{
@Nullable Object onInvoke(String p0,String p1,double p2,double p3,JsError p4);
}
@JsFunction
public interface OnfocusFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OngamepadconnectedFn{
@Nullable Object onInvoke(GamepadEvent p0);
}
@JsFunction
public interface OngamepaddisconnectedFn{
@Nullable Object onInvoke(GamepadEvent p0);
}
@JsFunction
public interface OngotpointercaptureFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnhashchangeFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OninvalidFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnkeydownFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnkeypressFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnkeyupFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnlanguagechangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnloadFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnlostpointercaptureFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnmessageerrorFn{
@Nullable Object onInvoke(@Nullable MessageEvent<@Nullable Object> p0);
}
@JsFunction
public interface OnmousedownFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmousemoveFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmouseoutFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmouseoverFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmouseupFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnmousewheelFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnpagehideFn{
@Nullable Object onInvoke(@Nullable PageTransitionEvent p0);
}
@JsFunction
public interface OnpageshowFn{
@Nullable Object onInvoke(@Nullable PageTransitionEvent p0);
}
@JsFunction
public interface OnpaintFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnpointercancelFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnpointerdownFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnpointerenterFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnpointerleaveFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnpointermoveFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnpointeroutFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnpointeroverFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnpointerupFn{
@Nullable Object onInvoke(PointerEvent p0);
}
@JsFunction
public interface OnpopstateFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnrejectionhandledFn{
@Nullable Object onInvoke(PromiseRejectionEvent p0);
}
@JsFunction
public interface OnresetFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnresizeFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnscrollFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnscrollendFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnsecuritypolicyviolationFn{
@Nullable Object onInvoke(SecurityPolicyViolationEvent p0);
}
@JsFunction
public interface OnselectFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnslotchangeFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OnstorageFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnsubmitFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OntoggleFn{
@Nullable Object onInvoke(Event p0);
}
@JsFunction
public interface OntransitioncancelFn{
@Nullable Object onInvoke(@Nullable TransitionEvent p0);
}
@JsFunction
public interface OntransitionendFn{
@Nullable Object onInvoke(@Nullable TransitionEvent p0);
}
@JsFunction
public interface OntransitionrunFn{
@Nullable Object onInvoke(@Nullable TransitionEvent p0);
}
@JsFunction
public interface OntransitionstartFn{
@Nullable Object onInvoke(@Nullable TransitionEvent p0);
}
@JsFunction
public interface OnunhandledrejectionFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnunloadFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OnwheelFn{
@Nullable Object onInvoke(@Nullable Event p0);
}
@JsFunction
public interface OpenDatabaseCallbackFn{
@Nullable Object onInvoke(@Nullable Database p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OpenDatabaseCallbackUnionType{
@JsOverlay
static Window.@Nullable OpenDatabaseCallbackUnionType of(@Nullable Object o){
return Js.cast(o);
}
@JsOverlay
default @Nullable DatabaseCallback asDatabaseCallback(){
return Js.cast(this);
}
@JsOverlay
default Window.@Nullable OpenDatabaseCallbackFn asOpenDatabaseCallbackFn(){
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
public @Nullable CSSInterface CSS;
public JsConstructorFn<? extends MutationObserver> MozMutationObserver;
public JsConstructorFn<? extends MutationObserver> WebKitMutationObserver;
public @Nullable Object Window;
public @Nullable ApplicationCache applicationCache;
public CacheStorage caches;
public boolean closed;
public Console console;
public boolean crossOriginIsolated;
public double devicePixelRatio;
public Window.@Nullable FrameElementUnionType frameElement;
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
public Window.@Nullable OnabortFn onabort;
public Window.@Nullable OnafterprintFn onafterprint;
public Window.@Nullable OnanimationcancelFn onanimationcancel;
public Window.@Nullable OnanimationendFn onanimationend;
public Window.@Nullable OnanimationiterationFn onanimationiteration;
public Window.@Nullable OnanimationstartFn onanimationstart;
public Window.@Nullable OnauxclickFn onauxclick;
public Window.@Nullable OnbeforeprintFn onbeforeprint;
public Window.@Nullable OnbeforetoggleFn onbeforetoggle;
public Window.@Nullable OnbeforeunloadFn onbeforeunload;
public Window.@Nullable OnblurFn onblur;
public Window.@Nullable OnchangeFn onchange;
public Window.@Nullable OnclickFn onclick;
public Window.@Nullable OncloseFn onclose;
public Window.@Nullable OncontextmenuFn oncontextmenu;
public Window.@Nullable OndblclickFn ondblclick;
public Window.@Nullable OndragdropFn ondragdrop;
public Window.@Nullable OnerrorFn onerror;
public Window.@Nullable OnfocusFn onfocus;
public Window.@Nullable OngamepadconnectedFn ongamepadconnected;
public Window.@Nullable OngamepaddisconnectedFn ongamepaddisconnected;
public Window.@Nullable OngotpointercaptureFn ongotpointercapture;
public Window.@Nullable OnhashchangeFn onhashchange;
public Window.@Nullable OninvalidFn oninvalid;
public Window.@Nullable OnkeydownFn onkeydown;
public Window.@Nullable OnkeypressFn onkeypress;
public Window.@Nullable OnkeyupFn onkeyup;
public Window.@Nullable OnlanguagechangeFn onlanguagechange;
public Window.@Nullable OnloadFn onload;
public Window.@Nullable OnlostpointercaptureFn onlostpointercapture;
public Window.@Nullable OnmessageerrorFn onmessageerror;
public Window.@Nullable OnmousedownFn onmousedown;
public Window.@Nullable OnmousemoveFn onmousemove;
public Window.@Nullable OnmouseoutFn onmouseout;
public Window.@Nullable OnmouseoverFn onmouseover;
public Window.@Nullable OnmouseupFn onmouseup;
public Window.@Nullable OnmousewheelFn onmousewheel;
public Window.@Nullable OnpagehideFn onpagehide;
public Window.@Nullable OnpageshowFn onpageshow;
public Window.@Nullable OnpaintFn onpaint;
public Window.@Nullable OnpointercancelFn onpointercancel;
public Window.@Nullable OnpointerdownFn onpointerdown;
public Window.@Nullable OnpointerenterFn onpointerenter;
public Window.@Nullable OnpointerleaveFn onpointerleave;
public Window.@Nullable OnpointermoveFn onpointermove;
public Window.@Nullable OnpointeroutFn onpointerout;
public Window.@Nullable OnpointeroverFn onpointerover;
public Window.@Nullable OnpointerupFn onpointerup;
public Window.@Nullable OnpopstateFn onpopstate;
public Window.@Nullable OnrejectionhandledFn onrejectionhandled;
public Window.@Nullable OnresetFn onreset;
public Window.@Nullable OnresizeFn onresize;
public Window.@Nullable OnscrollFn onscroll;
public Window.@Nullable OnscrollendFn onscrollend;
public Window.@Nullable OnsecuritypolicyviolationFn onsecuritypolicyviolation;
public Window.@Nullable OnselectFn onselect;
public Window.@Nullable OnslotchangeFn onslotchange;
public Window.@Nullable OnstorageFn onstorage;
public Window.@Nullable OnsubmitFn onsubmit;
public Window.@Nullable OntoggleFn ontoggle;
public Window.@Nullable OntransitioncancelFn ontransitioncancel;
public Window.@Nullable OntransitionendFn ontransitionend;
public Window.@Nullable OntransitionrunFn ontransitionrun;
public Window.@Nullable OntransitionstartFn ontransitionstart;
public Window.@Nullable OnunhandledrejectionFn onunhandledrejection;
public Window.@Nullable OnunloadFn onunload;
public Window.@Nullable OnwheelFn onwheel;
public @Nullable Window opener;
public String origin;
public int outerHeight;
public int outerWidth;
public double pageXOffset;
public double pageYOffset;
public Window parent;
public @Nullable Performance performance;
public BarProp personalbar;
public int screenX;
public int screenY;
public double scrollX;
public double scrollY;
public BarProp scrollbars;
public Window self;
public @Nullable String status;
public BarProp statusbar;
public BarProp toolbar;
public Window top;
public @Nullable NotificationCenter webkitNotifications;
public Window window;
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native void alert(@Nullable Object message);
public native void blur();
public native void close();
public native boolean confirm(@Nullable Object message);
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
public native @Nullable Selection getSelection();
public native void importScripts();
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
public native @Nullable Window open();
@JsOverlay
public final @Nullable Window open(Window.OpenUrlUnionType url,String windowName,String windowFeatures,AttributionSourceParams replaceOrAttributionParams){
return open(url,windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
public native @Nullable Window open(Window.OpenUrlUnionType url,String windowName,String windowFeatures,Window.OpenReplaceOrAttributionParamsUnionType replaceOrAttributionParams);
@JsOverlay
public final @Nullable Window open(Window.OpenUrlUnionType url,String windowName,String windowFeatures,boolean replaceOrAttributionParams){
return open(url,windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
public native @Nullable Window open(Window.OpenUrlUnionType url,String windowName,String windowFeatures);
public native @Nullable Window open(Window.OpenUrlUnionType url,String windowName);
public native @Nullable Window open(Window.OpenUrlUnionType url);
@JsOverlay
public final @Nullable Window open(String url,String windowName,String windowFeatures,AttributionSourceParams replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
@JsOverlay
public final @Nullable Window open(String url,String windowName,String windowFeatures,Window.OpenReplaceOrAttributionParamsUnionType replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,replaceOrAttributionParams);
}
@JsOverlay
public final @Nullable Window open(String url,String windowName,String windowFeatures,boolean replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
@JsOverlay
public final @Nullable Window open(String url,String windowName,String windowFeatures){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures);
}
@JsOverlay
public final @Nullable Window open(String url,String windowName){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName);
}
@JsOverlay
public final @Nullable Window open(String url){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final @Nullable Window open(URL url,String windowName,String windowFeatures,AttributionSourceParams replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
@JsOverlay
public final @Nullable Window open(URL url,String windowName,String windowFeatures,Window.OpenReplaceOrAttributionParamsUnionType replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,replaceOrAttributionParams);
}
@JsOverlay
public final @Nullable Window open(URL url,String windowName,String windowFeatures,boolean replaceOrAttributionParams){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures,Js.<Window.OpenReplaceOrAttributionParamsUnionType>uncheckedCast(replaceOrAttributionParams));
}
@JsOverlay
public final @Nullable Window open(URL url,String windowName,String windowFeatures){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName,windowFeatures);
}
@JsOverlay
public final @Nullable Window open(URL url,String windowName){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url),windowName);
}
@JsOverlay
public final @Nullable Window open(URL url){
return open(Js.<Window.OpenUrlUnionType>uncheckedCast(url));
}
@JsOverlay
public final Database openDatabase(String name,String version,String description,int size,DatabaseCallback callback){
return openDatabase(name,version,description,size,Js.<Window.@Nullable OpenDatabaseCallbackUnionType>uncheckedCast(callback));
}
@JsOverlay
public final Database openDatabase(String name,String version,String description,int size,Window.OpenDatabaseCallbackFn callback){
return openDatabase(name,version,description,size,Js.<Window.@Nullable OpenDatabaseCallbackUnionType>uncheckedCast(callback));
}
public native Database openDatabase(String name,String version,String description,int size,Window.@Nullable OpenDatabaseCallbackUnionType callback);
public native Database openDatabase(String name,String version,String description,int size);
public native void postMessage(@Nullable Object message,Window.PostMessageTargetOriginOrOptionsUnionType targetOriginOrOptions,JsArray<Transferable> transfer);
@JsOverlay
public final void postMessage(@Nullable Object message,Window.PostMessageTargetOriginOrOptionsUnionType targetOriginOrOptions,Transferable[] transfer){
postMessage(message,targetOriginOrOptions,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
public native void postMessage(@Nullable Object message,Window.PostMessageTargetOriginOrOptionsUnionType targetOriginOrOptions);
@JsOverlay
public final void postMessage(@Nullable Object message,String targetOriginOrOptions,JsArray<Transferable> transfer){
postMessage(message,Js.<Window.PostMessageTargetOriginOrOptionsUnionType>uncheckedCast(targetOriginOrOptions),transfer);
}
@JsOverlay
public final void postMessage(@Nullable Object message,String targetOriginOrOptions,Transferable[] transfer){
postMessage(message,targetOriginOrOptions,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
@JsOverlay
public final void postMessage(@Nullable Object message,String targetOriginOrOptions){
postMessage(message,Js.<Window.PostMessageTargetOriginOrOptionsUnionType>uncheckedCast(targetOriginOrOptions));
}
@JsOverlay
public final void postMessage(@Nullable Object message,WindowPostMessageOptions targetOriginOrOptions,JsArray<Transferable> transfer){
postMessage(message,Js.<Window.PostMessageTargetOriginOrOptionsUnionType>uncheckedCast(targetOriginOrOptions),transfer);
}
@JsOverlay
public final void postMessage(@Nullable Object message,WindowPostMessageOptions targetOriginOrOptions,Transferable[] transfer){
postMessage(message,targetOriginOrOptions,Js.<JsArray<Transferable>>uncheckedCast(transfer));
}
@JsOverlay
public final void postMessage(@Nullable Object message,WindowPostMessageOptions targetOriginOrOptions){
postMessage(message,Js.<Window.PostMessageTargetOriginOrOptionsUnionType>uncheckedCast(targetOriginOrOptions));
}
public native void postMessage(@Nullable Object message);
public native void print();
public native @Nullable String prompt(String message,String value);
public native @Nullable String prompt(String message);
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
