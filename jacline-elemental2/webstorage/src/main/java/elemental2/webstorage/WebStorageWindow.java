package elemental2.webstorage;
import jsinterop.base.Js;
import elemental2.webstorage.Storage;
import elemental2.dom.Window;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
@JsType(isNative = true,name = "Window",namespace = JsPackage.GLOBAL)
public class WebStorageWindow extends Window{
@JsOverlay
public static WebStorageWindow of(Window o){
return Js.cast(o);
}
public Storage localStorage;
public Storage sessionStorage;
}
