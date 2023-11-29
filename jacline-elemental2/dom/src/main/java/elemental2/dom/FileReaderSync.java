package elemental2.dom;
import java.lang.String;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import elemental2.dom.Blob;
import elemental2.core.ArrayBuffer;
@JsType(isNative = true,namespace = JsPackage.GLOBAL)
public class FileReaderSync{
public native ArrayBuffer readAsArrayBuffer(Blob blob);
public native String readAsBinaryString(Blob blob);
public native String readAsDataURL(Blob blob);
public native String readAsText(Blob blob,String encoding);
public native String readAsText(Blob blob);
}
