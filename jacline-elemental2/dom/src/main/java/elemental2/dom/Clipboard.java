package elemental2.dom;
import java.lang.Void;
import jsinterop.base.Js;
import jsinterop.annotations.JsOverlay;
import elemental2.dom.ClipboardItem;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.promise.Promise;
import elemental2.core.JsArray;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class Clipboard{
public native Promise<JsArray<ClipboardItem>> read();
public native Promise<String> readText();
@JsOverlay
public final Promise<Void> write(ClipboardItem[] data){
return write(Js.<JsArray<ClipboardItem>>uncheckedCast(data));
}
public native Promise<Void> write(JsArray<ClipboardItem> data);
public native Promise<Void> writeText(String text);
}
