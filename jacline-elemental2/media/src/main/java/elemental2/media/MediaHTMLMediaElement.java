package elemental2.media;
import jsinterop.base.Js;
import elemental2.media.MediaKeys;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.HTMLMediaElement;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
@JsType(isNative = true,name = "HTMLMediaElement",namespace = JsPackage.GLOBAL)
public class MediaHTMLMediaElement extends HTMLMediaElement{
@JsOverlay
public static MediaHTMLMediaElement of(HTMLMediaElement o){
return Js.cast(o);
}
public MediaKeys mediaKeys;
public native Promise setMediaKeys(MediaKeys mediaKeys);
}
