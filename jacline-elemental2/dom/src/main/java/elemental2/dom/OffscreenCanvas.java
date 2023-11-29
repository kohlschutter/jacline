package elemental2.dom;
import elemental2.dom.Event;
import elemental2.dom.Blob;
import elemental2.promise.Promise;
import jsinterop.base.JsPropertyMap;
import elemental2.dom.ImageBitmap;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsProperty;
import elemental2.dom.EventListener;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import java.lang.Object;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.core.JsObject;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class OffscreenCanvas implements EventTarget{
@JsType(isNative = true,name = "?",namespace = JsPackage.GLOBAL)
public interface ConvertToBlobOptionsType{
@JsOverlay
static OffscreenCanvas.ConvertToBlobOptionsType create(){
return Js.uncheckedCast(JsPropertyMap.of());
}
@JsProperty
double getQuality();
@JsProperty
String getType();
@JsProperty
void setQuality(double quality);
@JsProperty
void setType(String type);
}
public int height;
public int width;
public OffscreenCanvas(double width,double height){}
public native void addEventListener(String type,EventListener listener,EventTarget.AddEventListenerOptionsUnionType options);
public native void addEventListener(String type,EventListener listener);
public native Promise<Blob> convertToBlob();
public native Promise<Blob> convertToBlob(OffscreenCanvas.ConvertToBlobOptionsType options);
public native boolean dispatchEvent(Event evt);
public native JsObject getContext(String contextId,JsObject options);
@JsOverlay
public final JsObject getContext(String contextId,Object options){
return getContext(contextId,Js.<JsObject>uncheckedCast(options));
}
public native JsObject getContext(String contextId);
public native void removeEventListener(String type,EventListener listener,EventTarget.RemoveEventListenerOptionsUnionType options);
public native void removeEventListener(String type,EventListener listener);
public native ImageBitmap transferToImageBitmap();
}
