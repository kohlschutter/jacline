package elemental2.dom;
import elemental2.dom.Element;
import elemental2.dom.CSSInterface;
import elemental2.dom.VisualViewport;
import elemental2.dom.HTMLVideoElement;
import elemental2.dom.URL;
import elemental2.dom.Navigator;
import java.lang.Double;
import elemental2.dom.TrustedScriptURL;
import elemental2.dom.Screen;
import elemental2.dom.TrustedTypePolicyFactory;
import elemental2.dom.Console;
import elemental2.dom.ApplicationCache;
import elemental2.dom.Performance;
import elemental2.dom.Blob;
import elemental2.promise.Promise;
import elemental2.dom.HTMLCanvasElement;
import elemental2.dom.History;
import jsinterop.base.Js;
import elemental2.dom.CustomElementRegistry;
import jsinterop.annotations.JsFunction;
import elemental2.dom.Database;
import elemental2.dom.Request;
import elemental2.dom.IdleDeadline;
import java.lang.String;
import elemental2.dom.ImageData;
import jsinterop.annotations.JsType;
import elemental2.dom.HTMLDocument;
import jsinterop.annotations.JsPackage;
import elemental2.dom.DatabaseCallback;
import elemental2.dom.StructuredSerializeOptions;
import elemental2.dom.RequestInit;
import elemental2.dom.IdleCallbackOptions;
import elemental2.dom.OffscreenCanvas;
import elemental2.dom.ImageBitmapOptions;
import elemental2.dom.Window;
import elemental2.core.Transferable;
import elemental2.core.TrustedScript;
import elemental2.core.JsArray;
import elemental2.dom.ImageBitmap;
import elemental2.dom.FrameRequestCallback;
import elemental2.dom.Response;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import elemental2.dom.HTMLImageElement;
import elemental2.dom.Location;
@JsType(isNative = true,name = "goog.global",namespace = JsPackage.GLOBAL)
public class DomGlobal{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CreateImageBitmapImageUnionType{
@JsOverlay
static DomGlobal.CreateImageBitmapImageUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default Blob asBlob(){
return Js.cast(this);
}
@JsOverlay
default HTMLCanvasElement asHTMLCanvasElement(){
return Js.cast(this);
}
@JsOverlay
default HTMLImageElement asHTMLImageElement(){
return Js.cast(this);
}
@JsOverlay
default HTMLVideoElement asHTMLVideoElement(){
return Js.cast(this);
}
@JsOverlay
default ImageBitmap asImageBitmap(){
return Js.cast(this);
}
@JsOverlay
default ImageData asImageData(){
return Js.cast(this);
}
@JsOverlay
default OffscreenCanvas asOffscreenCanvas(){
return Js.cast(this);
}
@JsOverlay
default boolean isBlob(){
return (Object)this instanceof Blob;
}
@JsOverlay
default boolean isHTMLCanvasElement(){
return (Object)this instanceof HTMLCanvasElement;
}
@JsOverlay
default boolean isHTMLImageElement(){
return (Object)this instanceof HTMLImageElement;
}
@JsOverlay
default boolean isHTMLVideoElement(){
return (Object)this instanceof HTMLVideoElement;
}
@JsOverlay
default boolean isImageData(){
return (Object)this instanceof ImageData;
}
@JsOverlay
default boolean isOffscreenCanvas(){
return (Object)this instanceof OffscreenCanvas;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface CreateImageBitmapSxOrOptionsUnionType{
@JsOverlay
static DomGlobal.CreateImageBitmapSxOrOptionsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default double asDouble(){
return Js.asDouble(this);
}
@JsOverlay
default ImageBitmapOptions asImageBitmapOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isDouble(){
return (Object)this instanceof Double;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface FetchInputUnionType{
@JsOverlay
static DomGlobal.FetchInputUnionType of(Object o){
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
public interface ImportScriptsUrlsUnionType{
@JsOverlay
static DomGlobal.ImportScriptsUrlsUnionType of(Object o){
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
public interface OpenDatabaseCallbackFn{
Object onInvoke(Database p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface OpenDatabaseCallbackUnionType{
@JsOverlay
static DomGlobal.OpenDatabaseCallbackUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default DatabaseCallback asDatabaseCallback(){
return Js.cast(this);
}
@JsOverlay
default DomGlobal.OpenDatabaseCallbackFn asOpenDatabaseCallbackFn(){
return Js.cast(this);
}
@JsOverlay
default boolean isOpenDatabaseCallbackFn(){
return (Object)this instanceof DomGlobal.OpenDatabaseCallbackFn;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PostMessageTargetOriginOrOptionsOrTransferUnionType{
@JsOverlay
static DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<Transferable> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default StructuredSerializeOptions asStructuredSerializeOptions(){
return Js.cast(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface PostMessageTargetOriginOrPortsOrTransferUnionType{
@JsOverlay
static DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default JsArray<Object> asJsArray(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default boolean isJsArray(){
return (Object)this instanceof JsArray;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
}
@JsFunction
public interface QueueMicrotaskCallbackFn{
void onInvoke();
}
@JsFunction
public interface RequestIdleCallbackCallbackFn{
void onInvoke(IdleDeadline deadline);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface RequestIdleCallbackOptionsUnionType{
@JsOverlay
static DomGlobal.RequestIdleCallbackOptionsUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default IdleCallbackOptions asIdleCallbackOptions(){
return Js.cast(this);
}
@JsOverlay
default int asInt(){
return Js.asInt(this);
}
@JsOverlay
default boolean isInt(){
return (Object)this instanceof Double;
}
}
@JsFunction
public interface SetImmediateCallbackFn{
Object onInvoke();
}
@JsFunction
public interface SetIntervalCallbackFn{
void onInvoke(Object... p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SetIntervalCallbackUnionType{
@JsOverlay
static DomGlobal.SetIntervalCallbackUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default DomGlobal.SetIntervalCallbackFn asSetIntervalCallbackFn(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default TrustedScript asTrustedScript(){
return Js.cast(this);
}
@JsOverlay
default boolean isSetIntervalCallbackFn(){
return (Object)this instanceof DomGlobal.SetIntervalCallbackFn;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isTrustedScript(){
return (Object)this instanceof TrustedScript;
}
}
@JsFunction
public interface SetTimeoutCallbackFn{
void onInvoke(Object... p0);
}
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface SetTimeoutCallbackUnionType{
@JsOverlay
static DomGlobal.SetTimeoutCallbackUnionType of(Object o){
return Js.cast(o);
}
@JsOverlay
default DomGlobal.SetTimeoutCallbackFn asSetTimeoutCallbackFn(){
return Js.cast(this);
}
@JsOverlay
default String asString(){
return Js.asString(this);
}
@JsOverlay
default TrustedScript asTrustedScript(){
return Js.cast(this);
}
@JsOverlay
default boolean isSetTimeoutCallbackFn(){
return (Object)this instanceof DomGlobal.SetTimeoutCallbackFn;
}
@JsOverlay
default boolean isString(){
return (Object)this instanceof String;
}
@JsOverlay
default boolean isTrustedScript(){
return (Object)this instanceof TrustedScript;
}
}
public static CSSInterface CSS;
public static ApplicationCache applicationCache;
public static Console console;
public static CustomElementRegistry customElements;
@JsOverlay
public static final HTMLDocument document=DomGlobal__Constants.document;
public static History history;
@JsOverlay
public static final boolean isSecureContext=DomGlobal__Constants.isSecureContext;
@JsOverlay
public static final Location location=DomGlobal__Constants.location;
@JsOverlay
public static final Navigator navigator=DomGlobal__Constants.navigator;
public static Performance performance;
@JsOverlay
public static final Screen screen=DomGlobal__Constants.screen;
@JsOverlay
public static final Window self=DomGlobal__Constants.self;
@JsOverlay
public static final Window top=DomGlobal__Constants.top;
public static TrustedTypePolicyFactory trustedTypes;
@JsOverlay
public static final VisualViewport visualViewport=DomGlobal__Constants.visualViewport;
public static Window window;
public static native void alert(Object message);
public static native String atob(String encodedData);
public static native String btoa(String stringToEncode);
public static native void cancelAnimationFrame(int handle);
public static native void cancelIdleCallback(int handle);
public static native void cancelRequestAnimationFrame(double handle);
public static native void clearImmediate();
public static native void clearImmediate(double immediateID);
public static native void clearInterval(double intervalID);
public static native void clearTimeout(double timeoutID);
public static native boolean confirm(Object message);
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,ImageBitmapOptions sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,ImageBitmapOptions sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,ImageBitmapOptions sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,double sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,double sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,double sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,double sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image,double sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(Blob image){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image));
}
public static native Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options);
public static native Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh);
public static native Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw);
public static native Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy);
public static native Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions);
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,ImageBitmapOptions sxOrOptions,double sy,double sw){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,ImageBitmapOptions sxOrOptions,double sy){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,ImageBitmapOptions sxOrOptions){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,double sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,double sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,double sxOrOptions,double sy,double sw){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,double sxOrOptions,double sy){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image,double sxOrOptions){
return createImageBitmap(image,Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
public static native Promise<ImageBitmap> createImageBitmap(DomGlobal.CreateImageBitmapImageUnionType image);
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,ImageBitmapOptions sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,ImageBitmapOptions sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,ImageBitmapOptions sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,double sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,double sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,double sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,double sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image,double sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLCanvasElement image){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,ImageBitmapOptions sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,ImageBitmapOptions sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,ImageBitmapOptions sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,double sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,double sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,double sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,double sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image,double sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLImageElement image){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,ImageBitmapOptions sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,ImageBitmapOptions sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,ImageBitmapOptions sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,double sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,double sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,double sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,double sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image,double sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(HTMLVideoElement image){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,ImageBitmapOptions sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,ImageBitmapOptions sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,ImageBitmapOptions sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,double sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,double sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,double sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,double sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image,double sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageBitmap image){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,ImageBitmapOptions sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,ImageBitmapOptions sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,ImageBitmapOptions sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,double sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,double sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,double sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,double sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image,double sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(ImageData image){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions,sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,DomGlobal.CreateImageBitmapSxOrOptionsUnionType sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),sxOrOptions);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,ImageBitmapOptions sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,ImageBitmapOptions sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,ImageBitmapOptions sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,ImageBitmapOptions sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,double sxOrOptions,double sy,double sw,double sh,ImageBitmapOptions options){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh,options);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,double sxOrOptions,double sy,double sw,double sh){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw,sh);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,double sxOrOptions,double sy,double sw){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy,sw);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,double sxOrOptions,double sy){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions),sy);
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image,double sxOrOptions){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image),Js.<DomGlobal.CreateImageBitmapSxOrOptionsUnionType>uncheckedCast(sxOrOptions));
}
@JsOverlay
public static final Promise<ImageBitmap> createImageBitmap(OffscreenCanvas image){
return createImageBitmap(Js.<DomGlobal.CreateImageBitmapImageUnionType>uncheckedCast(image));
}
public static native void dump(Object x);
public static native Promise<Response> fetch(DomGlobal.FetchInputUnionType input,RequestInit init);
public static native Promise<Response> fetch(DomGlobal.FetchInputUnionType input);
@JsOverlay
public static final Promise<Response> fetch(Request input,RequestInit init){
return fetch(Js.<DomGlobal.FetchInputUnionType>uncheckedCast(input),init);
}
@JsOverlay
public static final Promise<Response> fetch(Request input){
return fetch(Js.<DomGlobal.FetchInputUnionType>uncheckedCast(input));
}
@JsOverlay
public static final Promise<Response> fetch(String input,RequestInit init){
return fetch(Js.<DomGlobal.FetchInputUnionType>uncheckedCast(input),init);
}
@JsOverlay
public static final Promise<Response> fetch(String input){
return fetch(Js.<DomGlobal.FetchInputUnionType>uncheckedCast(input));
}
@JsOverlay
public static final Promise<Response> fetch(URL input,RequestInit init){
return fetch(Js.<DomGlobal.FetchInputUnionType>uncheckedCast(input),init);
}
@JsOverlay
public static final Promise<Response> fetch(URL input){
return fetch(Js.<DomGlobal.FetchInputUnionType>uncheckedCast(input));
}
public static native boolean hasOwnProperty(Object propertyName);
public static native void importScripts(DomGlobal.ImportScriptsUrlsUnionType... urls);
@JsOverlay
public static final void importScripts(String... urls){
importScripts(Js.<DomGlobal.ImportScriptsUrlsUnionType[]>uncheckedCast(urls));
}
@JsOverlay
public static final void importScripts(TrustedScriptURL... urls){
importScripts(Js.<DomGlobal.ImportScriptsUrlsUnionType[]>uncheckedCast(urls));
}
@JsOverlay
public static final void importScripts(URL... urls){
importScripts(Js.<DomGlobal.ImportScriptsUrlsUnionType[]>uncheckedCast(urls));
}
@JsOverlay
public static final Database openDatabase(String name,String version,String description,int size,DatabaseCallback callback){
return openDatabase(name,version,description,size,Js.<DomGlobal.OpenDatabaseCallbackUnionType>uncheckedCast(callback));
}
@JsOverlay
public static final Database openDatabase(String name,String version,String description,int size,DomGlobal.OpenDatabaseCallbackFn callback){
return openDatabase(name,version,description,size,Js.<DomGlobal.OpenDatabaseCallbackUnionType>uncheckedCast(callback));
}
public static native Database openDatabase(String name,String version,String description,int size,DomGlobal.OpenDatabaseCallbackUnionType callback);
public static native Database openDatabase(String name,String version,String description,int size);
@JsOverlay
public static final void postMessage(Object message,JsArray<Transferable> targetOriginOrOptionsOrTransfer,JsArray<Object> targetOriginOrPortsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer),Js.<DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,JsArray<Transferable> targetOriginOrOptionsOrTransfer,DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType targetOriginOrPortsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer),targetOriginOrPortsOrTransfer);
}
@JsOverlay
public static final void postMessage(Object message,JsArray<Transferable> targetOriginOrOptionsOrTransfer,String targetOriginOrPortsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer),Js.<DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,JsArray<Transferable> targetOriginOrOptionsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType targetOriginOrOptionsOrTransfer,JsArray<Object> targetOriginOrPortsOrTransfer){
postMessage(message,targetOriginOrOptionsOrTransfer,Js.<DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType targetOriginOrOptionsOrTransfer,Object[] targetOriginOrPortsOrTransfer){
postMessage(message,targetOriginOrOptionsOrTransfer,Js.<JsArray<Object>>uncheckedCast(targetOriginOrPortsOrTransfer));
}
public static native void postMessage(Object message,DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType targetOriginOrOptionsOrTransfer,DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType targetOriginOrPortsOrTransfer);
@JsOverlay
public static final void postMessage(Object message,DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType targetOriginOrOptionsOrTransfer,String targetOriginOrPortsOrTransfer){
postMessage(message,targetOriginOrOptionsOrTransfer,Js.<DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(targetOriginOrPortsOrTransfer));
}
public static native void postMessage(Object message,DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType targetOriginOrOptionsOrTransfer);
@JsOverlay
public static final void postMessage(Object message,String targetOriginOrOptionsOrTransfer,JsArray<Object> targetOriginOrPortsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer),Js.<DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,String targetOriginOrOptionsOrTransfer,Object[] targetOriginOrPortsOrTransfer){
postMessage(message,targetOriginOrOptionsOrTransfer,Js.<JsArray<Object>>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,String targetOriginOrOptionsOrTransfer,DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType targetOriginOrPortsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer),targetOriginOrPortsOrTransfer);
}
@JsOverlay
public static final void postMessage(Object message,String targetOriginOrOptionsOrTransfer,String targetOriginOrPortsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer),Js.<DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,String targetOriginOrOptionsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,StructuredSerializeOptions targetOriginOrOptionsOrTransfer,JsArray<Object> targetOriginOrPortsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer),Js.<DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,StructuredSerializeOptions targetOriginOrOptionsOrTransfer,Object[] targetOriginOrPortsOrTransfer){
postMessage(message,targetOriginOrOptionsOrTransfer,Js.<JsArray<Object>>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,StructuredSerializeOptions targetOriginOrOptionsOrTransfer,DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType targetOriginOrPortsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer),targetOriginOrPortsOrTransfer);
}
@JsOverlay
public static final void postMessage(Object message,StructuredSerializeOptions targetOriginOrOptionsOrTransfer,String targetOriginOrPortsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer),Js.<DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,StructuredSerializeOptions targetOriginOrOptionsOrTransfer){
postMessage(message,Js.<DomGlobal.PostMessageTargetOriginOrOptionsOrTransferUnionType>uncheckedCast(targetOriginOrOptionsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,Transferable[] targetOriginOrOptionsOrTransfer,Object[] targetOriginOrPortsOrTransfer){
postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(targetOriginOrOptionsOrTransfer),Js.<JsArray<Object>>uncheckedCast(targetOriginOrPortsOrTransfer));
}
@JsOverlay
public static final void postMessage(Object message,Transferable[] targetOriginOrOptionsOrTransfer,DomGlobal.PostMessageTargetOriginOrPortsOrTransferUnionType targetOriginOrPortsOrTransfer){
postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(targetOriginOrOptionsOrTransfer),targetOriginOrPortsOrTransfer);
}
@JsOverlay
public static final void postMessage(Object message,Transferable[] targetOriginOrOptionsOrTransfer,String targetOriginOrPortsOrTransfer){
postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(targetOriginOrOptionsOrTransfer),targetOriginOrPortsOrTransfer);
}
@JsOverlay
public static final void postMessage(Object message,Transferable[] targetOriginOrOptionsOrTransfer){
postMessage(message,Js.<JsArray<Transferable>>uncheckedCast(targetOriginOrOptionsOrTransfer));
}
public static native void postMessage(Object message);
public static native String prompt(String message,String value);
public static native String prompt(String message);
public static native void queueMicrotask(DomGlobal.QueueMicrotaskCallbackFn callback);
public static native void reportError(Object error);
public static native int requestAnimationFrame(FrameRequestCallback callback,Element element);
public static native int requestAnimationFrame(FrameRequestCallback callback);
@JsOverlay
public static final int requestIdleCallback(DomGlobal.RequestIdleCallbackCallbackFn callback,IdleCallbackOptions options){
return requestIdleCallback(callback,Js.<DomGlobal.RequestIdleCallbackOptionsUnionType>uncheckedCast(options));
}
public static native int requestIdleCallback(DomGlobal.RequestIdleCallbackCallbackFn callback,DomGlobal.RequestIdleCallbackOptionsUnionType options);
@JsOverlay
public static final int requestIdleCallback(DomGlobal.RequestIdleCallbackCallbackFn callback,int options){
return requestIdleCallback(callback,Js.<DomGlobal.RequestIdleCallbackOptionsUnionType>uncheckedCast(options));
}
public static native int requestIdleCallback(DomGlobal.RequestIdleCallbackCallbackFn callback);
public static native double setImmediate(DomGlobal.SetImmediateCallbackFn callback,Object... callbackParams);
@JsOverlay
public static final double setInterval(DomGlobal.SetIntervalCallbackFn callback,double delay,Object... callbackParams){
return setInterval(Js.<DomGlobal.SetIntervalCallbackUnionType>uncheckedCast(callback),delay,callbackParams);
}
@JsOverlay
public static final double setInterval(DomGlobal.SetIntervalCallbackFn callback){
return setInterval(Js.<DomGlobal.SetIntervalCallbackUnionType>uncheckedCast(callback));
}
public static native double setInterval(DomGlobal.SetIntervalCallbackUnionType callback,double delay,Object... callbackParams);
public static native double setInterval(DomGlobal.SetIntervalCallbackUnionType callback);
@JsOverlay
public static final double setInterval(String callback,double delay,Object... callbackParams){
return setInterval(Js.<DomGlobal.SetIntervalCallbackUnionType>uncheckedCast(callback),delay,callbackParams);
}
@JsOverlay
public static final double setInterval(String callback){
return setInterval(Js.<DomGlobal.SetIntervalCallbackUnionType>uncheckedCast(callback));
}
@JsOverlay
public static final double setInterval(TrustedScript callback,double delay,Object... callbackParams){
return setInterval(Js.<DomGlobal.SetIntervalCallbackUnionType>uncheckedCast(callback),delay,callbackParams);
}
@JsOverlay
public static final double setInterval(TrustedScript callback){
return setInterval(Js.<DomGlobal.SetIntervalCallbackUnionType>uncheckedCast(callback));
}
@JsOverlay
public static final double setTimeout(DomGlobal.SetTimeoutCallbackFn callback,double delay,Object... callbackParams){
return setTimeout(Js.<DomGlobal.SetTimeoutCallbackUnionType>uncheckedCast(callback),delay,callbackParams);
}
@JsOverlay
public static final double setTimeout(DomGlobal.SetTimeoutCallbackFn callback){
return setTimeout(Js.<DomGlobal.SetTimeoutCallbackUnionType>uncheckedCast(callback));
}
public static native double setTimeout(DomGlobal.SetTimeoutCallbackUnionType callback,double delay,Object... callbackParams);
public static native double setTimeout(DomGlobal.SetTimeoutCallbackUnionType callback);
@JsOverlay
public static final double setTimeout(String callback,double delay,Object... callbackParams){
return setTimeout(Js.<DomGlobal.SetTimeoutCallbackUnionType>uncheckedCast(callback),delay,callbackParams);
}
@JsOverlay
public static final double setTimeout(String callback){
return setTimeout(Js.<DomGlobal.SetTimeoutCallbackUnionType>uncheckedCast(callback));
}
@JsOverlay
public static final double setTimeout(TrustedScript callback,double delay,Object... callbackParams){
return setTimeout(Js.<DomGlobal.SetTimeoutCallbackUnionType>uncheckedCast(callback),delay,callbackParams);
}
@JsOverlay
public static final double setTimeout(TrustedScript callback){
return setTimeout(Js.<DomGlobal.SetTimeoutCallbackUnionType>uncheckedCast(callback));
}
public static native Object structuredClone(Object value,StructuredSerializeOptions options);
public static native Object structuredClone(Object value);
}
