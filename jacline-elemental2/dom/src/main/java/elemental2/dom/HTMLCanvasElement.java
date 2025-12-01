package elemental2.dom;
import org.jspecify.annotations.Nullable;
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
@Nullable Object onInvoke(Blob p0);
}
public int height;
public int width;
public native MediaStream captureStream();
public native MediaStream captureStream(double framerate);
public native @Nullable JsObject getContext(String contextId,@Nullable JsObject args);
@JsOverlay
public final @Nullable JsObject getContext(String contextId,@Nullable Object args){
return getContext(contextId,Js.<@Nullable JsObject>uncheckedCast(args));
}
public native @Nullable JsObject getContext(String contextId);
public native @Nullable Object toBlob(HTMLCanvasElement.ToBlobCallbackFn callback,String type,@Nullable Object... var_args);
public native @Nullable Object toBlob(HTMLCanvasElement.ToBlobCallbackFn callback);
public native String toDataURL();
public native String toDataURL(String type,@Nullable Object... var_args);
public native OffscreenCanvas transferControlToOffscreen();
}
