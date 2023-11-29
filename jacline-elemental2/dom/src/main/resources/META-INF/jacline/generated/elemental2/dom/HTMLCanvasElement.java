package elemental2.dom;
import elemental2.dom.OffscreenCanvas;
import elemental2.dom.Blob;
import jsinterop.base.Js;
import jsinterop.annotations.JsFunction;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.MediaStream;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class HTMLCanvasElement extends HTMLElement{
@JsFunction
public interface ToBlobCallbackFn{
Object onInvoke(Blob p0);
}
public int height;
public int width;
public native MediaStream captureStream();
public native MediaStream captureStream(double framerate);
public native JsObject getContext(String contextId,JsObject args);
@JsOverlay
public final JsObject getContext(String contextId,Object args){
return getContext(contextId,Js.<JsObject>uncheckedCast(args));
}
public native JsObject getContext(String contextId);
public native Object toBlob(HTMLCanvasElement.ToBlobCallbackFn callback,String type,Object... var_args);
public native Object toBlob(HTMLCanvasElement.ToBlobCallbackFn callback);
public native String toDataURL();
public native String toDataURL(String type,Object... var_args);
public native OffscreenCanvas transferControlToOffscreen();
}
